
public class Principal {

	public static void main(String[] args) {
		Persona p1 = new Persona("Pepito","Grillo","123456789");
		Persona p2 = new Persona("Juanita","Campanilla","567");
		Cuenta c1 = new Cuenta("6156713613",1000.50,p1);
		Cuenta c2 = new Cuenta("6253562566",3567.98,p2);
		System.out.println(c1);
		System.out.println(c2);
		c1.transaccion(1500, "Reintegro");
		c1.transaccion(2387, "Ingreso");
		c2.transaccion(1500, "Reintegro");
		c2.transaccion(5000, "Ingreso");
	}

}
