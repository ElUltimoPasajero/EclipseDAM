package Practica02ud06.Vehiculos;

public class Vehiculo {
	private int numRuedas;
	private String marca;
	private double kilometraje;
	private Color color;
	
	public Vehiculo(int numRuedas, String marca, double kilometraje, Color color) {
		super();
		this.numRuedas = numRuedas;
		this.marca = marca;
		this.kilometraje = kilometraje;
		this.color = color;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [numRuedas=" + numRuedas + ", marca=" + marca + ", kilometraje=" + kilometraje + ", color="
				+ color + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Vehiculo v = (Vehiculo) obj;
		/*if ((this.numRuedas==v.numRuedas)&&
				(this.marca.equals(v.marca))&&
				(this.kilometraje==v.kilometraje)&&
				(this.color==v.color))
			return true;
		else
			return false;*/
		
		return ((this.numRuedas==v.numRuedas)&&
				(this.marca.equals(v.marca))&&
				(this.kilometraje==v.kilometraje)&&
				(this.color==v.color));
	}
	
	
}
