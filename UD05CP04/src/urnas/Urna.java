package urnas;

import java.util.Random;

public class Urna {

	// Nº de bolas blancas y negras
	protected int negras, blancas;
	static private Random r = new Random();

	/**
	 * Constructor con un número inicial de bolas blancas y negras
	 * 
	 * @param b
	 * @param n
	 */
	public Urna(int b, int n) {
		negras = n;
		blancas = b;
	}

	/**
	 * Introducir una bola blanca
	 */
	public void ponerBlanca() {
		++blancas;
	}

	/**
	 * Introducir una bola negra
	 */
	public void ponerNegra() {
		++negras;
	}

	/**
	 * Extraer una bola y saber su color
	 * 
	 * @return Bola
	 */
	public ColorBola bola() {
		ColorBola color;
		int aleatorio = r.nextInt(blancas + negras) + 1;
		if (aleatorio <= blancas) {
			--blancas;
			color = ColorBola.BLANCA;
		} else {
			--negras;
			color = ColorBola.NEGRA;
		}
		return color;
	}

	/**
	 * Número total de bolas en la urna
	 * 
	 * @return
	 */
	public int totalBolas() {
		return blancas + negras;
	}

	/**
	 * Cadena con el nº de bolas blancas y negras
	 * 
	 * @return
	 */
	public String toString() {
		return "[" + blancas + " blanca" + (blancas == 1 ? "" : "s") + ", " + negras + " negra"
				+ (negras == 1 ? "]" : "s]");
	}
}
