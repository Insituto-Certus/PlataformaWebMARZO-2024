package pe.edu.certus.resource;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/users")
public class UserResource {

	List<Persona> users = new ArrayList<>();
	
	
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	public List<Persona> getUsers(){
		users.add(new Persona("Edwin", "Barrientos", 42));
		users.add(new Persona("Ignacio", "Liszt", 42));
		return users;

	}
	
	@POST
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public List<Persona> saveUser(Persona p){
		users.add(p);
		return users;
	}
	
}
