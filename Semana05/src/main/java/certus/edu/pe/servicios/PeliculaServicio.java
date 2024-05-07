package certus.edu.pe.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import certus.edu.pe.modelo.Pelicula;
import certus.edu.pe.repositorios.PeliculaRepositorio;



@Service
@Transactional
public class PeliculaServicio {

	@Autowired // Inyeccion de dependecia
	private PeliculaRepositorio repositorio;
	
	public PeliculaServicio() {
		
	}
	
	public List<Pelicula> buscarTodo(){
		return (List<Pelicula>) repositorio.findAll();
		
	}
	

	
	
}
