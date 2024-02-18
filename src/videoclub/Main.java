package videoclub;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creamos la lista de objetos del Videoclub
		
		// Lista pelicula
		LinkedList<Pelicula> pelicula = new LinkedList<Pelicula>();
		pelicula.add(new Pelicula("Aventura", 2003, "Peter Jackson", "El Señor de los Anillos: El Retorno del Rey", 4,true));
		pelicula.add(new Pelicula("Drama", 1997, "James Cameron", "Titanic", 3, false));
		pelicula.add(new Pelicula("Acción", 2012, "Sam Mendes", "Skyfall", 3, false));

		// Lista videojuego
		LinkedList<Videojuego> videojuego = new LinkedList<Videojuego>();
		videojuego.add(new Videojuego(18, "PS4", "Call Of Duty: Black Ops III", 5, true));
		videojuego.add(new Videojuego(3, "3DS", "Super Mario Bros", 4, false));
		videojuego.add(new Videojuego(3, "WII", "Just Dance 2016", 4, true));

		// Imprimimos por pantalla las dos listas

		mostrarDatos(pelicula, videojuego);

		// Alquilar EL Señor de los Anillos
		System.out.println("Intentamos alquilar la película El Señor de los Anillos: El Retorno del Rey");
		int resultadoAlquiler = alquiler(pelicula, videojuego, "El Señor de los Anillos: El Retorno del Rey");
		if (resultadoAlquiler == 1) {
			System.out.println("El alquiler se ha realizado con éxito");
		} else {
			System.out.println("El alquiler no es posible porque la película ya está alquilada");
		}
		System.out.println("");
		
		// Alquilar Titanic
		System.out.println("Intentamos alquilar la película Titanic");
		int resultadoAlquilerTitanic = alquiler(pelicula, videojuego, "Titanic");
		if (resultadoAlquilerTitanic == 1) {
			System.out.println("El alquiler se ha realizado con éxito");
		} else {
			System.out.println("El alquiler no es posible porque la película ya está alquilada");
		}
		System.out.println("");
		
		// Devolver Skyfall
		System.out.println("Intentamos devolver la película Skyfall");
		int resultadoDevolucionSkyfall = devolucion(pelicula, videojuego, "Skyfall");
		if (resultadoDevolucionSkyfall == 1) {
			System.out.println("La devolución se ha realizado con éxito");
		} else {
			System.out.println("La devolución no es posible porque la película no ha sido alquilada");
		}
		System.out.println("");
		
		// Devolver Call Of Duty
		System.out.println("Intentamos devolver el videojuego Call Of Duty: Black Ops III");
		int resultadoDevolucionCallOfDuty = devolucion(pelicula, videojuego, "Call Of Duty: Black Ops III");
		if (resultadoDevolucionCallOfDuty == 1) {
			System.out.println("La devolución se ha realizado con éxito");
		} else {
			System.out.println("La devolución no es posible porque el videojuego no ha sido alquilado");
		}
		System.out.println("");
		
		// Alquilar Super Mario Bros
		System.out.println("Intentamos alquilar el videojuego Super Mario Bros");
		int resultadoAlquilerSuperMarioBros = alquiler(pelicula, videojuego, "Super Mario Bros");
		if (resultadoAlquilerSuperMarioBros == 1) {
			System.out.println("El alquiler se ha realizado con éxito");
		} else {
			System.out.println("El alquiler no es posible porque el videojuego ya está alquilado");
		}
		System.out.println("");
		
		// Devolver Just Dance
		System.out.println("Intentamos devolver el videojuego Just Dance 2016");
		int resultadoDevolucionJustDance = devolucion(pelicula, videojuego, "Just Dance 2016");
		if (resultadoDevolucionJustDance == 1) {
			System.out.println("La devolución se ha realizado con éxito");
		} else {
			System.out.println("La devolución no es posible porque el videojuego no ha sido alquilado");
		}
		
		System.out.println("");
		
		// Imprimimos por pantalla las dos listas

		mostrarDatos(pelicula, videojuego);
	}

	/**
	 * 
	 * @param peliculas
	 * @param videojuegos
	 * @param titulo
	 * @return si la pelicula o el videjuego, esta alquilada o no
	 */
	public static int alquiler(LinkedList<Pelicula> peliculas, LinkedList<Videojuego> videojuegos, String titulo) {
		// Busca en la lista de películas
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getTitulo().equals(titulo)) {
				if (!pelicula.isAlquilado()) {
					pelicula.alquilar();
					return 1; // Operación realizada con éxito
				} else {
					return 0; // El producto ya está alquilado
				}
			}
		}

		for (Videojuego videojuego : videojuegos) {
			if (videojuego.getTitulo().equals(titulo)) {
				if (!videojuego.isAlquilado()) {
					videojuego.alquilar();
					return 1; // Operación realizada con éxito
				} else {
					return 0; // El producto ya está alquilado
				}
			}
		}

		return -1; // Producto no encontrado
	}

	/**
	 * 
	 * @param peliculas
	 * @param videojuegos
	 * @param titulo
	 * @return Devuelve si la pelicula o videojuego puede devolverse o no, comprobando si esta alquilada o no
	 */
	public static int devolucion(LinkedList<Pelicula> peliculas, LinkedList<Videojuego> videojuegos, String titulo) {
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getTitulo().equals(titulo)) {
				if (pelicula.isAlquilado()) {
					pelicula.devolver();
					return 1; // Operación realizada con éxito
				} else {
					return 0; // La película no está alquilada
				}
			}
		}

		for (Videojuego videojuego : videojuegos) {
			if (videojuego.getTitulo().equals(titulo)) {
				if (videojuego.isAlquilado()) {
					videojuego.devolver();
					return 1; // Operación realizada con éxito
				} else {
					return 0; // El videojuego no está alquilado
				}
			}
		}

		return -1; // Producto no encontrado
	}
	
	/**
	 * 
	 * @param peliculas
	 * @param videojuegos
	 * Imprime por pantalla las dos listas, tanto de pelicula o de videojuego
	 */
	public static void mostrarDatos(LinkedList<Pelicula> peliculas, LinkedList<Videojuego> videojuegos) {
	    System.out.println("Lista de productos del Videoclub:");
	    System.out.println("");

	    // Mostrar datos de las películas
	    for (Pelicula pelicula : peliculas) {
	        System.out.println("Película:");
	        System.out.println("Título: " + pelicula.getTitulo());
	        System.out.println("Género: " + pelicula.getGenero());
	        System.out.println("Año: " + pelicula.getAño());
	        System.out.println("Director: " + pelicula.getDirector());
	        System.out.println("Precio Alquiler: " + pelicula.getPrecioAlquilar() + "€");
	        if (pelicula.isAlquilado()) {
	            System.out.println("¿Está alquilada? Si");
	        } else {
	            System.out.println("¿Está alquilada? No");
	        }
	        System.out.println("");
	    }

	    // Mostrar datos de los videojuegos
	    for (Videojuego videojuego : videojuegos) {
	        System.out.println("Videojuego:");
	        System.out.println("Título: " + videojuego.getTitulo());
	        System.out.println("Código PEGI: " + videojuego.getCod_PEGI());
	        System.out.println("Plataforma: " + videojuego.getPlataforma());
	        System.out.println("Precio Alquiler: " + videojuego.getPrecioAlquilar() + "€");
	        if (videojuego.isAlquilado()) {
	            System.out.println("¿Está alquilado? Si");
	        } else {
	            System.out.println("¿Está alquilado? No");
	        }
	        System.out.println("");
	    }
	}

}
