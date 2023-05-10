package tanques.main;

import tanques.model.PlantaLechera;

public class Principal {
	public static void main(String args[]) {
		int capacidades[] = { 25000, 10000, 10000, 5000, 5000 }; // Capacidad
																	// tanques
		PlantaLechera planta = new PlantaLechera(15, 5, capacidades);
		planta.mostrarTanques();
		planta.comprar(22500);
		planta.comprar(8000);
		planta.comprar(2000);
		planta.comprar(2500);
		planta.comprar(1000);
		planta.vender(23000);
		planta.vender(8000);
		planta.vender(2000);
		planta.trasvasar(2, 0, 500);
		planta.vender(2000);
		planta.vender(1000);
		planta.vender(500);
	}
}
