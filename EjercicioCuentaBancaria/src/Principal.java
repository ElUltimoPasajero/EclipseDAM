
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona a = new Persona ("Antonio","Palote",654675874);
		Persona b = new Persona ("Maria","Martinez",675568);

		
		Cuenta x =new Cuenta(123456,3.400,a);
		Cuenta y =new Cuenta(1234876,2400,b);


	 System.out.println(a.toString());
	 System.out.println(b.toString());
		
	 x.transaccion(2000, "Ingreso");
	 y.transaccion(20000, "Reintegro");
     x.transaccion(30, "Reintegro");
     y.transaccion(300, "Ingreso");
	 
     a.comprobarTelefono(a.getTelefono());
     b.comprobarTelefono(b.getTelefono());
	 
	}
     
	}

