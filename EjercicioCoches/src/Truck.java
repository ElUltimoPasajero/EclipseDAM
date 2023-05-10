
public class Truck extends Car{
	
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



	public double GetSalePrice() {
		
		 if (weight > 2000) {
			
	            return getRegularPrice() * 0.9; 
	        } else {
				 System.out.println("nuevo Precio");

	            return getRegularPrice() * 0.8; 
	        }

		
		
	}



	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", GetSalePrice=" + GetSalePrice() + ", Speed=" + getSpeed()
				+ ", RegularPrice=" + getRegularPrice() + ", Color=" + getColor() + "]";
	}
	









}
