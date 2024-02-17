package videoclub;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Pelicula> pelicula = new ArrayList<Pelicula>();
		pelicula.add(new Pelicula("Aventura",2003,"Peter Jackson","El Señor de los Anillos: El Retorno del Rey",4,true));
		pelicula.add(new Pelicula("Drama",1997,"James Cameron","Titanic",3,false));
		pelicula.add(new Pelicula("Acción",2012,"Sam Mendes","Skyfall",3,false));

		List<Videojuego> videojuego = new ArrayList<Videojuego>();
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
			System.out.println("¿Está alquilada? " +peli.alquilado);
			System.out.println("");
		}
		
		// Lista Videojuegos
		
		for (Videojuego juego:videojuego) {
			System.out.println("Videojuego");
			System.out.println("Título: "+juego.getTitulo());
			System.out.println("Código PEGI: "+juego.getCod_PEGI());
			System.out.println("Plataforma: "+juego.getPlataforma());
			System.out.println("Precio Alquiler: "+juego.getPrecioAlquilar()+"€");
			System.out.println("¿Está alquilada?: "+juego.alquilado);
			System.out.println("");
		}
	
		System.out.println("Intenamos alquilar la película El Señor de los Anillos: El Retorno del Rey");
		
		System.out.println("Intentamos alquilar la película Titanic");
		
		System.out.println("Intentamos devolver la película Skyfall");
		
		System.out.println("Intentamos devolver el videojuego Call Of Duty: Black Ops III");
		
		System.out.println("Intentamos devolver el videojuego Just Dance 2016");
		
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
			System.out.println("¿Está alquilada? " +peli.alquilado);
			System.out.println("");
		}
		
		// Lista Videojuegos
		
		for (Videojuego juego:videojuego) {
			System.out.println("Videojuego");
			System.out.println("Título: "+juego.getTitulo());
			System.out.println("Código PEGI: "+juego.getCod_PEGI());
			System.out.println("Plataforma: "+juego.getPlataforma());
			System.out.println("Precio Alquiler: "+juego.getPrecioAlquilar()+"€");
			System.out.println("¿Está alquilada?: "+juego.alquilado);
			System.out.println("");
		}

	}

}
