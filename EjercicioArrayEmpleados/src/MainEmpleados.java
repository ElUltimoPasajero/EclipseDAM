
public class MainEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado array[]= new Empleado[2]; 
		
		array [0]=new Empleado("Pepe",30,"Peon");
		array [1]=new Empleado("Paco",34,"Pintor");
		
		
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println(array[i].toString());
			
		}
	}

}
