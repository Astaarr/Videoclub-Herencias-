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
	
	
	public int alquiler() {
        if (!alquilado) {
            alquilado = true;
            return 1; // Operación exitosa
        } else {
            return 0; // Operación fallida, objeto ya alquilado
        }
    }
	
	 public int devolucion() {
	        if (alquilado) {
	            alquilado = false;
	            return 1; // Operación exitosa
	        } else {
	            return 0; // Operación fallida, objeto no alquilado
	        }
	    }
	
	 public void mostrarDatos(String tipo, String datos) {
	        if (tipo.equals("videojuego")) {
	            System.out.println("Videojuego: " + datos);
	        } else if (tipo.equals("película")) {
	            System.out.println("Película: " + datos);
	        }
	    }
	

	
	
	// Creamos los método
	
	
	/*
	 * 	void alquiler() {
		if (alquilado == false) {
			System.out.println("Has alquilado la peli");
			alquilado = true;
		}else {
			System.out.println("La peli ya está alquilada, no puedes volver a alquilarla");
		}
	}
	 */
	
	
	/*
	 * 	void devolucion() {
		if (alquilado == true) {
			System.out.println("Has devuelto");
			alquilado = false;
		}else {
			System.out.println("No tienes nada que devolver");
		}
	}
	
	 */


}
