package hamy.mdgen.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hamy.mdgen.config.JMSDestinationsFactory;
import hamy.mdgen.config.JMSDestinationsFactory.JMSDestinations;
import hamy.mdgen.config.XAIDestinationsFactory;
import hamy.mdgen.config.XAIDestinationsFactory.XAIDestinations;

@Path("/config")
public class ConfigResource {
	@GET
	@Path("/jms_destinations")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getJMSDestinations() {
		JMSDestinations jd = JMSDestinationsFactory.loadConfig();
		if(jd != null)
		return Response
				.status(Response.Status.OK)
				.entity(jd).build();
		
		else return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
	}

	@GET
	@Path("/xai_destinations")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getXAIDestinations() {
		XAIDestinations xd = null;
		try {
		xd = XAIDestinationsFactory.loadConfig();
		} catch(Exception e) {
			e.printStackTrace();
			Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
		
		if(xd != null)
		return Response
				.status(Response.Status.OK)
				.entity(xd).build();
		
		else return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
	}
}
