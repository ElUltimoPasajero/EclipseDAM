
public class Sedan extends Car{
	
	private int lenght;


	public Sedan(int speed, double regularPrice, String color, int lenght) {
		super(speed, regularPrice, color);
		this.lenght = lenght;
	}

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	@Override
	public double GetSalePrice() {
		
		
		if (lenght>20) {
			
			return getRegularPrice()*5/100;
			
		}else { 
			
			
			return getRegularPrice()*10/100;
			
			
			
			
		}
		
		
		
		
		
		
	}

	@Override
	public String toString() {
		return "Sedan [lenght=" + lenght + ", SalePrice=" + GetSalePrice() + ", Speed=" + getSpeed()
				+ ", RegularPrice=" + getRegularPrice() + ", Color=" + getColor() + "]";
	}
	
	
	
	

	
	}

	

	

