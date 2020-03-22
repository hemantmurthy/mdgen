package hamy.test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import hamy.test.model.Request;

public class TestAPI {
	public static void main(String[] args) {
		Client c = ClientBuilder.newClient();
		WebTarget target = c.target("http://localhost:7001/mdgen/testrs/test");
		Builder builder = target.request(MediaType.APPLICATION_JSON);
		
		Request r = new Request();
		r.setId("AAAA");
		r.addProp("xxx");
		r.addProp("yyy");
		Response res = builder.post(Entity.json(r));
		System.out.println("Status: " + res.getStatus() + ", Response: " + res.readEntity(String.class));
	}
}
