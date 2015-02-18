package com.webserv.rest.first;


import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/getID")
@RequestScoped
public class FirstRESTService {

	@GET
	@Path("/{id:[0-9][0-9]*}")
	@Produces("text/xml")
	public String lookupMemberById(@PathParam("id") long id) {
		return "Result: " + id;
	}
}
