package es.miweb.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sistema {

	final static int TAMANHO = 10;

	public static void main(String[] args) {
		Mundo[] mundos = new Mundo[TAMANHO];
		BufferedReader valor = new BufferedReader(new InputStreamReader(System.in));
		boolean volver;

		for (int i = 0; i < 10; i++) {
			mundos[i] = new Mundo();
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("Diametro[" + i + "]:");
			do {
				volver=false;
				try {
					mundos[i].setDiametro(Float.parseFloat(valor.readLine()));
				} catch (IOException ex) {
					System.out.println("No es un numero. Intentelo de nuevo:");
					volver = true;
				} catch (NumberFormatException ex) {
					System.out.println("No es un numero. Intentelo de nuevo:");
					volver = true;
				}
			} while (volver);
		}

		int i = 0;
		try {
			while (mundos[i].getDiametro() <= 100) {
				if (mundos[i].getDiametro() < 20) {
					throw new DiametroPequenoException(
							"El diametro del mundo [" + i + "] " + mundos[i].getNombre() + " es menor de 20Km");
				}
				i++;
			}
			if (i < 10) {
				throw new DiametroGrandeException("Valor no permitido: Diametro mayor de 100Km");
			}
		} catch (DiametroGrandeException ex) {
			System.out.println("HA OCURRIDO UNA EXCEPCION: El diametro del mundo [" + i + "] " + mundos[i].getNombre()
					+ " es mayor de 100Km");
		} catch (DiametroPequenoException ex) {
			System.out.println("HA OCURRIDO UNA EXCEPCION: El diametro del mundo [" + i + "] " + mundos[i].getNombre()
					+ " es menor de 20Km");
		} catch (Exception ex) {
			System.out.println("HA OCURRIDO UNA EXCEPCION");
		}

	}

}
