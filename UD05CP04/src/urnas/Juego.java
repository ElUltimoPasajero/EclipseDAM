package urnas;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int b, n = 0;
		System.out.print("Nº bolas blancas? ");
		b = sc.nextInt();
		System.out.print("Nº bolas negras? ");
		n = sc.nextInt();

		// Introducir las bolas blancas y negras en el constructor
		Urna u = new Urna(b, n);

		// Mientras quede más de una bola
		while (u.totalBolas() > 1) {
			// Extraer dos bolas
			if (u.bola() == u.bola()) {
				// Si son del mismo color: introducir bola blanca
				u.ponerBlanca();
				System.out.print(" - Añado una bola blanca - ");
			} else {
				// Si son de distinto color: introducir bola negra
				u.ponerNegra();
				System.out.print(" - Añado una bola negra - ");
			}
			System.out.println("La urna tiene " + u);
		}
		// Mostrar la última bola
		System.out.print("La última bola es de color ");
		System.out.println(u.bola());
		sc.close();

	}
}
