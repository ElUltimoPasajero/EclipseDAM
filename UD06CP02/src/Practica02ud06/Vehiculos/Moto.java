package Practica02ud06.Vehiculos;

public class Moto extends Vehiculo {
	private double cilindrada;

	public Moto(int numRuedas, String marca, double kilometraje, Color color, double cilindrada) {
		super(numRuedas, marca, kilometraje, color);
		this.cilindrada = cilindrada;
	}

	public double getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", " + super.toString() + "]";
	}
	
	
}
