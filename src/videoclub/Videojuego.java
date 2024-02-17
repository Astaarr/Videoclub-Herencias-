package videoclub;

public class Videojuego extends Videoclub{

	int cod_PEGI;
	String plataforma;
	
	public Videojuego(int cod_PEGI, String plataforma, String titulo, int precioAlquilar, boolean alquilado) {
		super(titulo, precioAlquilar, alquilado);
		this.cod_PEGI = cod_PEGI;
		this.plataforma = plataforma;
	}

	public int getCod_PEGI() {
		return cod_PEGI;
	}

	public void setCod_PEGI(int cod_PEGI) {
		this.cod_PEGI = cod_PEGI;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
}
