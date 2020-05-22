package hamy.test.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("json")
public class JSONResource extends BaseResource {
	
	@GET
	@Path("simple")
	@Produces(MediaType.APPLICATION_JSON)
	public SimpleObject getSimpleObject() {
		System.out.println("GET json/simple");
		return super.getSimpleObject();
	}
	
	@GET
	@Path("simple-property")
	@Produces(MediaType.APPLICATION_JSON)
	public SimplePropertyObject getSimplePropertyObject() {
		System.out.println("GET json/simple-property");
		return super.getSimplePropertyObject();
	}

	@GET
	@Path("compound")
	@Produces(MediaType.APPLICATION_JSON)
	public CompoundObject getCompundObject() {
		System.out.println("GET json/compound");
		return super.getCompundObject();
	}
	
	@GET
	@Path("compound-property")
	@Produces(MediaType.APPLICATION_JSON)
	public CompoundPropertyObject getCompundPropertyObject() {
		System.out.println("GET json/compound-property");
		return super.getCompundPropertyObject();
	}
}
