package hamy.test.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import hamy.mdgen.config.XAIDestinations;
import hamy.mdgen.config.XAIDestinationsFactory;
import hamy.test.model.Request;

@Path("test")
public class TestResource {
	
	/*@GET
	@Produces({MediaType.APPLICATION_JSON})
	public Request getRequest() {
		System.out.println("GET");
		EnhancedRequest r = new EnhancedRequest();
		r.setId("8888");
		r.setAdditionalValue("Blah Blah Blah");
		return r;
	}*/
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public XAIDestinations get() {
		XAIDestinations dest = XAIDestinationsFactory.loadConfig();
		System.out.println("Returning config ...");
		return dest;
	}
	
	@POST
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Request setRequest(Request r) {
		System.out.println("POST. id: " + r.getId());
		return r;
	}
}
