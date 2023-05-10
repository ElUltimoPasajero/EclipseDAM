
public class Sedan extends Car {
	private int length;

	public Sedan(int speed, double regularPrice, String color, int length) {
		super(speed, regularPrice, color);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Sedan [length=" + length + ", " + super.toString() + "]";
	}

	@Override
	public double getSalePrice() {
		double porcentaje;
		if (length>20)
			porcentaje=0.95;
		else
			porcentaje=0.9;
		return super.getSalePrice()*porcentaje;
	}
	
}
