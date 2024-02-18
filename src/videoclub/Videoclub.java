package videoclub;

public class Videoclub {
	// Creamos las variables
	String titulo;
	int precioAlquilar;
	boolean alquilado;

	// Creamos el constructor
	public Videoclub(String titulo, int precioAlquilar, boolean alquilado) {
		this.titulo = titulo;
		this.precioAlquilar = precioAlquilar;
		this.alquilado = alquilado;
	}

	// Generamos los Getters and Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrecioAlquilar() {
		return precioAlquilar;
	}

	public void setPrecioAlquilar(int precioAlquilar) {
		this.precioAlquilar = precioAlquilar;
	}

	public boolean isAlquilado() {
		return alquilado;
	}

	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}

	public boolean alquilar() {
		if (!alquilado) {
			alquilado = true;
			return true;
		}
		return false;
	}

	public boolean devolver() {
		if (alquilado) {
			alquilado = false;
			return true;
		}
		return false;
	}

}
