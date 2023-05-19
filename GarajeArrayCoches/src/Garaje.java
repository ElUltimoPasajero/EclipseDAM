import java.util.Iterator;

public class Garaje {

	private Vehiculo[] plazas;

	private int contadorVehiculos;

	public Garaje(int capacidad) {

		plazas = new Vehiculo[capacidad];
		this.contadorVehiculos = 0;

	}

	public boolean estaLleno() {

		if (contadorVehiculos == plazas.length) {

			return true;

		} else {
			return false;
		}

	}

	public boolean estaVacio() {

		if (contadorVehiculos == 0) {

			return true;
		} else {

			return false;
		}

	}

	public void introducirCoche(Vehiculo vehiculo) {

		if (!estaLleno()) {

			plazas[contadorVehiculos] = vehiculo;
			contadorVehiculos++;

			System.out.println("Ha introducido un vehiculo marca " + vehiculo.getMarca() + ", modelo "
					+ vehiculo.getModelo() + " y con matricula numero " + vehiculo.getMatricula());
			System.out.println(imprimirCochera(plazas));
		} else {

			System.out.println("No hay plazas libres en este Garaje");
		}

	}

	public void sacarCoche(Vehiculo vehiculo) {
		System.out.println("posicion 1");

		boolean encontrado = false;
		int i = 0;
		
		System.out.println("contadorVehiculos: " + contadorVehiculos);

		while (!encontrado && i < contadorVehiculos) {
			System.out.println(i);
			if (plazas[i] != null && plazas[i].equals(vehiculo)) { // IMPORTANTE - Comprobacion de que la plza null no
																	// la compara con el objeto

				encontrado = true;
			} else {

				i++;

			}

		}
		
		System.out.println("posicion 2");


		if (encontrado) {

			for (int j = i; j < contadorVehiculos - 1; j++) { // IMPORTANTE- Al encontrar el objeto que se busca,
																// movemos los objetos del array a la izquierda con el
																// -1
				plazas[j] = plazas[j + 1];

			}
			plazas[contadorVehiculos - 1] = null;

			contadorVehiculos--;

			System.out.println("El vehiculo ha sido sacado del garaje");
			System.out.println(imprimirCochera(plazas));

		} else {

			System.out.println("Vehiculo no encontrado");
		}

	}

	public void comprobarPLazasLibres() {
		System.out.println(imprimirCochera(plazas));
		int plazasLibres = 0;

		for (int i = 0; i < plazas.length; i++) {

			if (plazas[i] == null) {
				plazasLibres++;
			}

		}

		System.out.println("En este Garaje hay " + plazasLibres + " plazas libres");
		System.out.println(imprimirCochera(plazas));

	}

	private String imprimirCochera(Vehiculo[] plazas) {
		String str = "";
		for (int i = 0; i < plazas.length; i++) {
			if (plazas[i] == null) {
				str += "-";
			} else {
				str += plazas[i].toString();
			}
		}
		return str;
	}

}
