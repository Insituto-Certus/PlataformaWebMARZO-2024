package certus.edu.pe.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import certus.edu.pe.modelo.Pelicula;

public interface PeliculaRepositorio extends CrudRepository<Pelicula, Integer> {

	
	@Query(value = "SELECT a FROM Pelicula a WHERE a.nombre =?1")
	public List<Pelicula> buscarPeliculasPorNombre(String nombre);
}
