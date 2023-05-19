
public class TestColeccion {

	public static void main(String[] args) {
		
		Coleccion coleccion = new Coleccion(4);
		
		Juego juego = new Juego("Pac Man","Arcade","Atari",1986);
		Juego juego2 = new Juego("Alex Kidd","Plataformas","Master System",1990);
		Juego juego3= new Juego("Sonic","Plataformas","Mega Drive",1991);
		Juego juego4 = new Juego("Sega Rally","Conduccion","Sega Saturn",1995);
		
		coleccion.agregarJuego(juego4);
		coleccion.agregarJuego(juego4);
		coleccion.agregarJuego(juego);
		coleccion.agregarJuego(juego2);
		coleccion.agregarJuego(juego3);

        coleccion.comprobarJuego();

	}

}
