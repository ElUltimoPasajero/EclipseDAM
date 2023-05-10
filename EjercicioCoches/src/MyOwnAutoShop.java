
public class MyOwnAutoShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Sedan imperial = new Sedan (120, 16000, "Rojo", 5);
		Ford scort= new Ford(120, 8000, "Azul", 1992,1500);
		Ford mustang= new Ford(320, 40000, "Negro", 1991,15000);
		Truck austin = new Truck (120,5000,"Amarillo",3000);
		
	
		System.out.println(austin.toString());
		System.out.println(scort.toString());
		System.out.println(mustang.toString());
		System.out.println(imperial.toString());
		
			
		
	}

}
