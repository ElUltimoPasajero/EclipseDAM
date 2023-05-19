import java.util.Iterator;

public class Coleccion {

	Juego[] coleccion;

	public Coleccion(int cantidad) {

		coleccion = new Juego[cantidad];

	}

	public void agregarJuego(Juego juego) {
	    boolean repetido = false;

	    for (int i = 0; i < coleccion.length; i++) {
	        if (coleccion[i] != null && coleccion[i].equals(juego)) {
	            repetido = true;
	            break;
	        }
	    }

	    if (!repetido) {
	        for (int h = 0; h < coleccion.length; h++) {
	            if (coleccion[h] == null) {
	                coleccion[h] = juego;
	                break;
	            }
	        }

	        System.out.println("Ha añadido a su coleccion el siguiente juego " + juego.getTitulo() + " Genero: "
	                + juego.getGenero() + " Plataforma: " + juego.getPlataforma() + "Año de lanzamiento: "
	                + juego.getAñoLanzamiento());
	    } else {
	        System.out.println("El juego ya está en su colección. No se ha agregado.");
	    }
	}
	

	public void comprobarJuego() {

		int contadorJuegos = 0;

		for (int i = 0; i < coleccion.length; i++) {

			if (coleccion[i] != null) {

				Juego juego = coleccion[i];
				System.out.println("El juego " + juego.getTitulo() + " esta en tu coleccion!!");

			}

			

		}
		contadorJuegos++;

		System.out.println("Tienes " + contadorJuegos + " juegos en tu coleccion");

	}

}
