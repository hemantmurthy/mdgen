package hamy.mdgen.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import hamy.mdgen.api.generator.base.Generator;
import hamy.mdgen.api.generator.base.GeneratorError;
import hamy.mdgen.api.generator.base.GeneratorInput;
import hamy.mdgen.api.generator.base.GeneratorList;
import hamy.mdgen.api.generator.base.GeneratorOutput;
import hamy.mdgen.api.generator.base.GeneratorRegistrar;
import hamy.mdgen.api.generator.base.GeneratorStatus;
import hamy.mdgen.api.generator.imd.IMDViaJMSGenerator;
import hamy.mdgen.api.generator.imd.IMDViaJMSGeneratorInput;
import hamy.mdgen.api.generator.imd.IMDViaXAIGenerator;
import hamy.mdgen.api.generator.imd.IMDViaXAIGeneratorInput;
import hamy.mdgen.api.generator.nem12.NEM12AseXMLGenerator;
import hamy.mdgen.api.generator.nem12.NEM12CSVGenerator;

@Path("/generator")
public class GeneratorResource {
	private static Logger log = Logger.getLogger(GeneratorResource.class);
	
	@POST
	@Path("/xai")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneratorOutput createXAIGenerator(IMDViaXAIGeneratorInput input) {
		IMDViaXAIGenerator generator = new IMDViaXAIGenerator(input, 10);
		
		GeneratorOutput output = new GeneratorOutput();
		output.setInput(input);

		String id = GeneratorRegistrar.add(generator);
		log.info("XAI Generator created. ID: " + id + ", XAI Server: " + input.getServer());

		try {
			generator.processAsynchronously();
			output.setId(id);
		} catch(Exception e) {
			GeneratorRegistrar.remove(id);
		}
		
		return output;
	}
	
	@POST
	@Path("/jms")
	@Produces(MediaType.APPLICATION_JSON)
	public Response createJMSGenerator(IMDViaJMSGeneratorInput input) {
		IMDViaJMSGenerator generator = null;
		try {
			generator = new IMDViaJMSGenerator(input);
		} catch(Exception e) {
			GeneratorError error = new GeneratorError();
			error.setErrorMessage(e.getMessage());
			error.setInput(input);
			return Response.status(Response.Status.OK).entity(error).build();
		}
		
		GeneratorOutput output = new GeneratorOutput();
		output.setInput(input);

		String id = GeneratorRegistrar.add(generator);
		log.info("JMS Generator created. ID: " + id + ", JMS Server: " + input.getServer());

		try {
			generator.processAsynchronously();
			output.setId(id);
		} catch(Exception e) {
			GeneratorRegistrar.remove(id);
		}
		
		return Response
				.status(Response.Status.OK)
				.entity(output).build();
	}
	
	@POST
	@Path("/nem12csv")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneratorOutput createNEM12CSVGenerator(GeneratorInput input) {
		NEM12CSVGenerator generator = new NEM12CSVGenerator(input);
		GeneratorOutput output = new GeneratorOutput();
		output.setInput(input);

		String id = GeneratorRegistrar.add(generator);
		log.info("NEM12 CSV Generator created. ID: " + id);

		try {
			generator.processAsynchronously();
			output.setId(id);
		} catch(Exception e) {
			GeneratorRegistrar.remove(id);
		}
		
		return output;
	}
	
	@POST
	@Path("/nem12asexml")
	@Produces(MediaType.APPLICATION_JSON)
	public GeneratorOutput createNEM12ASEXMLGenerator(GeneratorInput input) {
		NEM12AseXMLGenerator generator = new NEM12AseXMLGenerator(input);
		GeneratorOutput output = new GeneratorOutput();
		output.setInput(input);

		String id = GeneratorRegistrar.add(generator);
		log.info("NEM12 aseXML Generator created. ID: " + id);

		try {
			generator.processAsynchronously();
			output.setId(id);
		} catch(Exception e) {
			GeneratorRegistrar.remove(id);
		}
		
		return output;
	}
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
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
	@Produces(MediaType.APPLICATION_JSON)
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
		
		if(g instanceof NEM12CSVGenerator) {
			gs.setGeneratedData(((NEM12CSVGenerator) g).getNEM12CSV());
		}
		
		if(g instanceof NEM12AseXMLGenerator) {
			gs.setGeneratedData(((NEM12AseXMLGenerator) g).getAseXML());
		}

		if("COMPLETED".equals(stat) || "ERROR".equals(stat) || "VALIDATION_ERROR".equals(stat)) {
			GeneratorRegistrar.remove(id);
		}
		
		return gs;
	}
	
}
