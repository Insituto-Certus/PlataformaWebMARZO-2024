package pe.edu.certus.resource;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import jakarta.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/api")
public class ServicioAppConfig extends ResourceConfig{
 public ServicioAppConfig() {
	 packages("pe.edu.certus.resource");
	 
 }
	
}
