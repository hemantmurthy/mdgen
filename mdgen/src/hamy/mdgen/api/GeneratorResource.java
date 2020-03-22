package hamy.mdgen.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import hamy.mdgen.api.generator.Generator;
import hamy.mdgen.api.generator.GeneratorInput;
import hamy.mdgen.api.generator.GeneratorList;
import hamy.mdgen.api.generator.GeneratorOutput;
import hamy.mdgen.api.generator.GeneratorRegistrar;
import hamy.mdgen.api.generator.GeneratorStatus;
import hamy.mdgen.api.generator.IMDViaXAIGenerator;
import hamy.mdgen.api.generator.NEM12Generator;

@Path("/generator")
public class GeneratorResource {
	@POST
	@Path("/xai")
	@Produces("application/json")
	public GeneratorOutput createXaiGenerator(GeneratorInput input) {
		IMDViaXAIGenerator generator = new IMDViaXAIGenerator(input);
		
		GeneratorOutput output = new GeneratorOutput();
		output.setInput(input);

		String id = GeneratorRegistrar.add(generator);
		System.out.println("XAI Generator created. ID: " + id);

		try {
			generator.start(id);
			output.setId(id);
		} catch(Exception e) {
			GeneratorRegistrar.remove(id);
		}
		
		return output;
	}
	
	@POST
	@Path("/nem12")
	@Produces("application/json")
	public GeneratorOutput createNEM12Generator(GeneratorInput input) {
		NEM12Generator generator = new NEM12Generator(input);
		
		GeneratorOutput output = new GeneratorOutput();
		output.setInput(input);
		
		String id = GeneratorRegistrar.add(generator);
		System.out.println("XAI Generator created. ID: " + id);

		try {
			generator.start(id);
			output.setId(id);
		} catch(Exception e) {
			GeneratorRegistrar.remove(id);
		}
		
		return output;
	}
	
	@GET
	@Path("/")
	@Produces("application/json")
	public GeneratorList getStatuses() {		
		List<GeneratorList.GeneratorStatus> l = new ArrayList<>();
		Map<String, Generator> generators = GeneratorRegistrar.getAll();
		for(String id : generators.keySet()) {
			GeneratorList.GeneratorStatus gs = new GeneratorList.GeneratorStatus();
			gs.setId(id);
			gs.setStatus(generators.get(id).getStatus());
			l.add(gs);
		}
		
		GeneratorList gl = new GeneratorList();
		gl.setGenerators(l);
		return gl;
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public GeneratorStatus getStatus(@PathParam("id") String id) {
		GeneratorStatus gs = new GeneratorStatus();
		if(id == null || "".equals(id.trim())) {
			gs.setErrorMessage("Generator id missing");
			return gs;
		}
		
		Generator g = GeneratorRegistrar.get(id);
		if(g == null) {
			gs.setId(id);
			gs.setErrorMessage("Generator with id " + id + " not found");
			return gs;
		}
		
		String stat = g.getStatus();
		gs.setId(id);
		gs.setStatus(stat);
		gs.setNumberOfRecordsToProcess(g.getNumReadsToProcess());
		gs.setNumberOfRecordsProcessed(g.getNumReadsProcessed());
		gs.setErrorMessage(g.getErrorMessage());
		gs.setStartDateTime(null);

		if("COMPLETED".equals(stat) || "ERROR".equals(stat) || "VALIDATION_ERROR".equals(stat)) {
			GeneratorRegistrar.remove(id);
		}
		
		return gs;
	}
	
}
