package fr.enseirb.rest.phonebook;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/helloWorld")
public class MyHelloServlet {

	@GET
	// Cette methode traitera les requetes GET
	@Produces("text/plain")
	// et renverra des resultats de type text/plain
	// La recuperation des parametres de la requete se fait
	// grace a l'annotation QueryParam
	public String getClichedMessage(@QueryParam("name") String name) {
		return "Hello " + name + " !";
	}

	@POST
	// Cette methode traitera les requetes POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces("text/plain")
	public String postStuff(@FormParam("name") String name) {
		return "Hello (with post) " + name + "!";
	}
}