package hamy.test.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("xml")
public class XMLResource extends BaseResource {
	
	@GET
	@Path("simple")
	@Produces(MediaType.APPLICATION_XML)
	public SimpleObject getSimpleObject() {
		System.out.println("GET xml/simple");
		return super.getSimpleObject();
	}
	
	@GET
	@Path("simple-property")
	@Produces(MediaType.APPLICATION_XML)
	public SimplePropertyObject getSimplePropertyObject() {
		System.out.println("GET xml/simple-property");
		return super.getSimplePropertyObject();
	}

	@GET
	@Path("compound")
	@Produces(MediaType.APPLICATION_XML)
	public CompoundObject getCompundObject() {
		System.out.println("GET xml/compound");
		return super.getCompundObject();
	}
	
	@GET
	@Path("compound-property")
	@Produces(MediaType.APPLICATION_XML)
	public CompoundPropertyObject getCompundPropertyObject() {
		System.out.println("GET xml/compound-property");
		return super.getCompundPropertyObject();
	}
}
