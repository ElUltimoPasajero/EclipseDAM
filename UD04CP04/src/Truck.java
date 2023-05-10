
public class Truck extends Car {
	private int weight;

	public Truck(int speed, double regularPrice, String color, int weight) {
		super(speed, regularPrice, color);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", " + super.toString() + "]";
	}

	@Override
	public double getSalePrice() {
		double porcentaje;
		if (weight>2000)
			porcentaje=0.9;
		else
			porcentaje=0.8;
		return super.getSalePrice()*porcentaje;
	}
	
	
	
}
