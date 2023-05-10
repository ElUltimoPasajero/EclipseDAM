
public class Ford extends Car {
	
	private int year;
	private int manuFactureDiscount;
	
	

	public Ford(int speed, double regularPrice, String color, int year, int manuFactureDiscount) {
		super(speed, regularPrice, color);
		this.year = year;
		this.manuFactureDiscount = manuFactureDiscount;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getManuFactureDiscount() {
		return manuFactureDiscount;
	}

	public void setManuFactureDiscount() {
		this.manuFactureDiscount = manuFactureDiscount;
	}


	public double GetSalePrice() {
	
		return super.GetSalePrice()-manuFactureDiscount;
		
		
	}

	@Override
	public String toString() {
		return "Ford [year=" + year + ", manuFactureDiscount=" + manuFactureDiscount + ", SalePrice="
				+ GetSalePrice() + ", Speed=" + getSpeed() + ", RegularPrice=" + getRegularPrice()
				+ ", Color=" + getColor() + "]";
	}

	
}
