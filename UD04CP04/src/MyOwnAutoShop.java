
public class MyOwnAutoShop {

	public static void main(String[] args) {
		Car c1 = new Car(200,20000,"Verde");
		Truck c2 = new Truck(150,200000,"Azul",3000);
		Ford c3 = new Ford(250,30000,"Rojo",2020,500);
		Sedan c4 = new Sedan(240,34000,"Blanco",25);
		System.out.println(c1);
		System.out.println(c1.getSalePrice());
		System.out.println(c2);
		System.out.println(c2.getSalePrice());
		System.out.println(c3);
		System.out.println(c3.getSalePrice());
		System.out.println(c4);
		System.out.println(c4.getSalePrice());
	
	}

}
