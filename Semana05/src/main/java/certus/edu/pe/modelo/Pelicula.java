package certus.edu.pe.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/*
@Data
@EqualsAndHashCode(callSuper=false)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
*/

@Entity
@Table(name= "pelicula")
@NamedQueries({
	@NamedQuery(name = "Pelicula.findAll", query = "SELECT p FROM Pelicula p")
	,@NamedQuery(name = "Pelicula.findByIdPelicula", query="SELECT p FROM Pelicula p WHERE p.idPelicula = :idPelicula")
	, @NamedQuery(name = "Pelicula.findByNombre", query = "SELECT p FROM Pelicula p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Pelicula.findByDuracion", query = "SELECT p FROM Pelicula p WHERE p.duracion = :duracion")
    , @NamedQuery(name = "Pelicula.findByClasificacion", query = "SELECT p FROM Pelicula p WHERE p.clasificacion = :clasificacion")
    , @NamedQuery(name = "Pelicula.findByIdioma", query = "SELECT p FROM Pelicula p WHERE p.idioma = :idioma")
    , @NamedQuery(name = "Pelicula.findByGenero", query = "SELECT p FROM Pelicula p WHERE p.genero = :genero")
    , @NamedQuery(name = "Pelicula.findByFormato", query = "SELECT p FROM Pelicula p WHERE p.formato = :formato")
    , @NamedQuery(name = "Pelicula.findBySinopsis", query = "SELECT p FROM Pelicula p WHERE p.sinopsis = :sinopsis")})
	
	

public class Pelicula implements Serializable {
		
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Basic(optional = false)// representa que este campo es obligatorio en base de datos
		@Column(name = "idPelicula")
		private Integer idPelicula;
		
		@Basic(optional = false)
		@Column(name = "nombre")
		private String nombre;
		
		
		@Column(name= "duracion")
		private String duracion;
		
		@Column(name = "clasificacion")
		private String clasificacion;
		
		@Column(name="idioma")
		private String idioma;
		
		@Column(name = "genero")
		private String genero;
		
		@Column(name = "formato")
			private String formato;
		
		@Column(name = "sinopsis")
			private String sinopsis;
		
			
	
		public Pelicula() {
	    	
	    }
		
	    public Pelicula (Integer idPelicula, String nombre) {
	    	
	    	this.idPelicula = idPelicula;
	    	this.nombre= nombre;
	    }

		public Integer getIdPelicula() {
			return idPelicula;
		}

		public void setIdPelicula(Integer idPelicula) {
			this.idPelicula = idPelicula;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDuracion() {
			return duracion;
		}

		public void setDuracion(String duracion) {
			this.duracion = duracion;
		}

		public String getClasificacion() {
			return clasificacion;
		}

		public void setClasificacion(String clasificacion) {
			this.clasificacion = clasificacion;
		}

		public String getIdioma() {
			return idioma;
		}

		public void setIdioma(String idioma) {
			this.idioma = idioma;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getFormato() {
			return formato;
		}

		public void setFormato(String formato) {
			this.formato = formato;
		}

		public String getSinopsis() {
			return sinopsis;
		}

		public void setSinopsis(String sinopsis) {
			this.sinopsis = sinopsis;
		}

		public Pelicula(String nombre, String duracion, String clasificacion, String idioma, String genero, String formato,
				String sinopsis) {
			super();
			this.nombre = nombre;
			this.duracion = duracion;
			this.clasificacion = clasificacion;
			this.idioma = idioma;
			this.genero = genero;
			this.formato = formato;
			this.sinopsis = sinopsis;
		}

		@Override
		public String toString() {
			return "Pelicula [idPelicula=" + idPelicula + ", nombre=" + nombre + ", duracion=" + duracion
					+ ", clasificacion=" + clasificacion + ", idioma=" + idioma + ", genero=" + genero + ", formato="
					+ formato + ", sinopsis=" + sinopsis + "]";
		}
	    
	    
	    
	}

