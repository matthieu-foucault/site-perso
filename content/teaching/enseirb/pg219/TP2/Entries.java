package fr.enseirb.rest.phonebook;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

@Path("/entries")
public class Entries {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getEntries() {
		Client client = new Client();
		WebResource resource = client
				.resource("http://mafoucault.rmorpheus.enseirb.fr/query/test/phoneBook");
		
		String response = resource.accept(MediaType.APPLICATION_JSON).get(String.class);
		
		return response;
	}
}