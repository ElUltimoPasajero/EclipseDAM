package Practica02ud06.Main;

import Practica02ud06.Garaje.Garaje;
import Practica02ud06.Vehiculos.*;

public class Practica02ud06 {

	public static void main(String[] args) {
		Garaje g = new Garaje(80, 10);
		g.introducirVehiculo(new Moto(3, "BMW", 1200, Color.AZUL, 500));
		g.introducirVehiculo(new Moto(2, "Suzuki", 2200, Color.BLANCO, 250));
		g.introducirVehiculo(new Coche(5, "Ford", 21000, Color.NEGRO, 5, true));
		g.introducirVehiculo(new Coche(5, "Seat", 41000, Color.GRIS, 5, true));
		System.out.println(g);
		System.out.println("Kilometraje medio: "+g.kilometrajeMedio());
		System.out.println("Precio cambio ruedas: "+g.precioTotal());
		System.out.println("Hay "+g.totalVehiculos()+" vehículos en el garaje");
		g.retirarVehiculo(new Moto(2, "Suzuki", 2200, Color.BLANCO, 250));
		System.out.println(g);
		System.out.println("Kilometraje medio: "+g.kilometrajeMedio());
		System.out.println("Precio cambio ruedas: "+g.precioTotal());
		System.out.println("Hay "+g.totalVehiculos()+" vehículos en el garaje");
	}

}
