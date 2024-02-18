package videoclub;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Pelicula> pelicula = new LinkedList<Pelicula>();
		pelicula.add(new Pelicula("Aventura",2003,"Peter Jackson","El Señor de los Anillos: El Retorno del Rey",4,true));
		pelicula.add(new Pelicula("Drama",1997,"James Cameron","Titanic",3,false));
		pelicula.add(new Pelicula("Acción",2012,"Sam Mendes","Skyfall",3,false));

		LinkedList<Videojuego> videojuego = new LinkedList<Videojuego>();
		videojuego.add(new Videojuego(18,"PS4","Call Of Duty Black Ops III",5,true));
		videojuego.add(new Videojuego(3,"3DS","Super Mario Bros",4,false));
		videojuego.add(new Videojuego(3,"WII","Just Dance 2016",4,true));
		
		
		// Imprimimos por pantalla las dos listas
		System.out.println("Lista de productos del Videoclub:");
		
		System.out.println("");
		
		// Lista Peliculas
		
		for (Pelicula peli:pelicula) {
			System.out.println("Película");
			System.out.println("Título: " +peli.getTitulo());
			System.out.println("Género: " +peli.getGenero());
			System.out.println("Año: " +peli.getAño());
			System.out.println("Director: " +peli.getDirector());
			System.out.println("Precio Alquiler: " +peli.getPrecioAlquilar()+"€");
			if (peli.alquilado == true){
				System.out.println("¿Está alquilada? Si");
			}else {
				System.out.println("¿Está alquilada? No");
			}
			System.out.println("");
		}
		
		// Lista Videojuegos
		
		for (Videojuego juego:videojuego) {
			System.out.println("Videojuego");
			System.out.println("Título: "+juego.getTitulo());
			System.out.println("Código PEGI: "+juego.getCod_PEGI());
			System.out.println("Plataforma: "+juego.getPlataforma());
			System.out.println("Precio Alquiler: "+juego.getPrecioAlquilar()+"€");
			if (juego.alquilado == true){
				System.out.println("¿Está alquilada? Si");
			}else {
				System.out.println("¿Está alquilada? No");
			}
			System.out.println("");
		}

		
		// Alquilar EL Señor de los Anillos
		System.out.println("Intentamos alquilar la película El Señor de los Anillos: El Retorno del Rey");
        int resultadoAlquiler = alquiler(pelicula, "El Señor de los Anillos: El Retorno del Rey");
        if (resultadoAlquiler == 1) {
            System.out.println("El alquiler se ha realizado con éxito");
        } else {
        	System.out.println("El alquiler no es posible porque la película ya está alquilada");
        }
        
        
        // Alquilar Titanic
		System.out.println("Intentamos alquilar la película Titanic");
		int resultadoAlquilerTitanic = alquiler(pelicula, "Titanic");
        if (resultadoAlquilerTitanic == 1) {
            System.out.println("El alquiler se ha realizado con éxito");
        } else {
        	 System.out.println("El alquiler no es posible porque la película ya está alquilada");	
        }
        
        
        // Devolver Skyfall
		System.out.println("Intentamos devolver la película Skyfall");
		int resultadoDevolucionSkyfall = devolucionPelicula(pelicula, videojuego, "Skyfall");
        if (resultadoDevolucionSkyfall == 1) {
            System.out.println("La devolución se ha realizado con éxito");
        } else {
            System.out.println("La devolución no es posible porque la película no ha sido alquilada");
        }
        
        
        // Devolver Call Of Duty
        System.out.println("Intentamos devolver el videojuego Call Of Duty: Black Ops III");
        int resultadoDevolucionCallOfDuty = devolucionVideojuego(videojuego, "Call Of Duty: Black Ops III");
        if (resultadoDevolucionCallOfDuty == 1) {
            System.out.println("La devolución se ha realizado con éxito");
        } else {
            System.out.println("La devolución no es posible porque el videojuego no ha sido alquilado");	
        }        
        
        
        // Alquilar Super Mario Bros
        System.out.println("Intentamos alquilar el videojuego Super Mario Bros");
        
        
        // Devolver Just Dance
		System.out.println("Intentamos devolver el videojuego Just Dance 2016");
		int resultadoDevolucionJustDance = devolucionVideojuego(videojuego, "Just Dance 2016");
        if (resultadoDevolucionJustDance == 1) {
            System.out.println("La devolución se ha realizado con éxito");
        } else {
            System.out.println("La devolución no es posible porque el videojuego no ha sido alquilado");
        }
		// Imprimimos por pantalla las dos listas
		System.out.println("Lista de productos del Videoclub:");
		
		System.out.println("");
		
		// Lista Peliculas
		
		for (Pelicula peli:pelicula) {
			System.out.println("Película");
			System.out.println("Título: " +peli.getTitulo());
			System.out.println("Género: " +peli.getGenero());
			System.out.println("Año: " +peli.getAño());
			System.out.println("Director: " +peli.getDirector());
			System.out.println("Precio Alquiler: " +peli.getPrecioAlquilar()+"€");
			if (peli.alquilado == true){
				System.out.println("¿Está alquilada? Si");
			}else {
				System.out.println("¿Está alquilada? No");
			}
			System.out.println("");
		}
		
		// Lista Videojuegos
		
		for (Videojuego juego:videojuego) {
			System.out.println("Videojuego");
			System.out.println("Título: "+juego.getTitulo());
			System.out.println("Código PEGI: "+juego.getCod_PEGI());
			System.out.println("Plataforma: "+juego.getPlataforma());
			System.out.println("Precio Alquiler: "+juego.getPrecioAlquilar()+"€");
			if (juego.alquilado == true){
				System.out.println("¿Está alquilada? Si");
			}else {
				System.out.println("¿Está alquilada? No");
			}
			System.out.println("");
		}
	}
		public static int alquiler(LinkedList<Pelicula> pelicula, String titulo) {
		    for (Pelicula peli : pelicula) {
		        if (peli.getTitulo().equals(titulo)) {
		            if (!peli.isAlquilado()) {
		                peli.alquilar();
		                return 1; // Operación realizada con éxito
		            } else {
		                return 0; // El producto ya está alquilado
		            }
		        }
		    }
		    return 0; // Producto no encontrado
	}
		public static int devolucionPelicula(LinkedList<Pelicula> pelicula,LinkedList<Videojuego> videojuego, String titulo) {
		    for (Pelicula peli : pelicula) {
		        if (peli.getTitulo().equals(titulo)) {
		            if (peli.isAlquilado()) {
		                peli.devolver();
		                return 1; // Operación realizada con éxito
		            } else {
		                return 0; // El producto no está alquilado
		            }
		        }
		    }
		    return 0;
		}// Producto no encontrado
		    public static int devolucionVideojuego(LinkedList<Videojuego> videojuegos, String titulo) {
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
				return 0;
		    
		}
		

}
