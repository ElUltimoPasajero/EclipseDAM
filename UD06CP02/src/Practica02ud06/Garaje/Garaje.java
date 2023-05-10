package Practica02ud06.Garaje;

import java.util.Iterator;

import Practica02ud06.Vehiculos.Coche;
import Practica02ud06.Vehiculos.Moto;
import Practica02ud06.Vehiculos.Vehiculo;

public class Garaje {
	private double precioRueda;
	private Vehiculo[] parking;

	public Garaje(double precioRueda, int capacidad) {
		super();
		this.precioRueda = precioRueda;
		parking = new Vehiculo[capacidad];
	}

	public double getPrecioRueda() {
		return precioRueda;
	}

	public void setPrecioRueda(double precioRueda) {
		this.precioRueda = precioRueda;
	}

	public Vehiculo[] getParking() {
		return parking;
	}

	public void setParking(Vehiculo[] parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "Garaje [precioRueda=" + precioRueda +"\nVehiculos:\n"+vehiculos()+ "]";
	}
	
	private String vehiculos() {
		String cadena="";
		for (int i = 0; i < parking.length; i++) {
			if (parking[i]!=null) {
				if (parking[i] instanceof Coche)
					cadena+=((Coche)parking[i]).toString()+"\n";
				else if (parking[i] instanceof Moto)
					cadena+=((Moto)parking[i]).toString()+"\n";
			}
		}
		return cadena;
	}
	
	public void introducirVehiculo(Vehiculo v) {
		int indice=0;
		while ((indice<parking.length)&&(parking[indice]!=null)){
			indice++;
		}
		if (indice==parking.length) 
			System.out.println("No hay aparcamientos libres");
		else {
			parking[indice]=v;
			System.out.println("Vehículo aparcado en el aparcamiento "+indice);
		}
	}
	
	public void retirarVehiculo(Vehiculo v) {
		int indice=0;
		boolean encontrado=false;
		while (!encontrado && indice<parking.length) {
			if (parking[indice].equals(v)) {
				encontrado=true;
				System.out.println("Vehiculo "+v+" retirado");
				parking[indice]=null;
			} else
				indice++;
		}
	}
	
	public int totalVehiculos() {
		int total=0;
		for (int i = 0; i < parking.length; i++) {
			if (parking[i]!=null)
				total++;
		}
		return total;
	}
	
	public double precioTotal() {
		double precio=0;
		for (int i = 0; i < parking.length; i++) {
			if (parking[i]!=null) {
				precio+=precioRueda*parking[i].getNumRuedas(); 
			}
		}
		return precio;
	}
	
	public double kilometrajeMedio() {
		double kilometros=0;
		for (int i = 0; i < parking.length; i++) {
			if (parking[i]!=null) {
				kilometros+=parking[i].getKilometraje(); 
			}
		}
		return kilometros/totalVehiculos();
	}
	
}	
