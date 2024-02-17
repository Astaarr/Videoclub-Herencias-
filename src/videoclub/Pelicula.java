package videoclub;

public class Pelicula extends Videoclub {
	
	String genero;
	int año;
	String director;
	
	public Pelicula(String genero, int año, String director, String titulo, int precioAlquilar, boolean alquilado) {
		super(titulo,precioAlquilar,alquilado);
		this.genero = genero;
		this.año = año;
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
}
