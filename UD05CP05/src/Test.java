
public class Test {

	public static void main(String[] args) {
		Electrodomestico[] e = new Electrodomestico[10];
		e[0] = new Electrodomestico(120, "verde", 'a', 20);
		e[1] = new Electrodomestico(220, "azul", 'b', 30);
		e[2] = new Electrodomestico(100, "negro", 'c', 40);
		e[3] = new Lavadora();
		e[4] = new Lavadora(250, 40);
		e[5] = new Lavadora(550, "blanco", 'c', 50, 20);
		e[6] = new Television();
		e[7] = new Television(800, 15);
		e[8] = new Television(950, "negro", 'a', 10, 55, true);
		e[9] = new Television(700, 9);
		
		double precioElec=0;
		double precioLav=0;
		double precioTV=0;
		
		for (int i = 0; i < e.length; i++) {
			precioElec += e[i].precioFinal();
			if (e[i] instanceof Lavadora)
				precioLav += ((Lavadora)e[i]).precioFinal();
			else if (e[i] instanceof Television)
				precioTV += ((Television)e[i]).precioFinal();
			System.out.println(e[i]);
		}
		
		System.out.println("Electrodomésticos - Total: "+precioElec+" €");
		System.out.println("Lavadoras- Total: "+precioLav+" €");
		System.out.println("Televisiones - Total: "+precioTV+" €");

	}

}
