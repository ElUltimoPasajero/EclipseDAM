import java.util.Random;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Random r = new Random();
		int arma = r.nextInt(3) + 1;
		int puntosJugador = 0;
		int puntosOrdenador = 0;
		String texto = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("---------------------------------------------------");
			System.out.print("Elige tu arma: 1.-Piedra 2.-Papel 3.-Tijeras: ");
			texto = sc.nextLine();
			int armaJugador = Integer.parseInt(texto);
			if (arma == armaJugador) {
				System.out.println("EMPATE");
			} else {
				if (arma == 1) {
					if (armaJugador == 3) {
						puntosOrdenador = puntosOrdenador + 1;
						System.out.println("Piedra aplasta a tijeras");
					} else {
						if (armaJugador == 2) {
							puntosJugador = puntosJugador + 1;
							System.out.println("El papel envuelve a la piedra");
						}
					}
				}
			}

			if (arma == 2) {
				if (armaJugador == 1) {
					puntosOrdenador = puntosOrdenador + 1;
					System.out.println("El papel envuelve a la piedra");
				} else {
					if (armaJugador == 3) {
						puntosJugador = puntosJugador + 1;
						System.out.println("Las tijeras cortan el papel");
					}
				}
			}
			if (arma == 3) {
				if (armaJugador == 2) {
					puntosOrdenador = puntosOrdenador + 1;
					System.out.println("Las tijeras cortan el papel");
				} else {
					if (armaJugador == 1) {
						puntosJugador = puntosJugador + 1;
						System.out.println("Piedra aplasta a tijeras");
					}
				}
			}
			System.out.println("Arma jugador:" + armaJugador + " - Arma ordenador:" + arma);
			System.out.println("Puntos Jugador: " + puntosJugador + " - Puntos ordenador: " + puntosOrdenador);
			arma = r.nextInt(3) + 1;
		} while ((puntosJugador < 3) && (puntosOrdenador < 3));
		System.out.println("======================================================");
		if (puntosJugador == 3) {
			System.out.println("Ganaste!!");
		} else {
			System.out.println("Gana el ordenador");
		}
		sc.close();

	}

}
