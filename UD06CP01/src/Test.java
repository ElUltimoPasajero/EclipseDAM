
public class Test {

	public static void main(String[] args) {
		System.out.println("contador: "+Persona.getContadorPersonas()); 
		Persona p1 = new Persona("Juan");
		System.out.println(p1);
		System.out.println("contador: "+Persona.getContadorPersonas()); 
		Persona p2 = new Persona("Karla");
		System.out.println(p2);
		System.out.println("contador: "+Persona.getContadorPersonas()); 
		Persona p3 = new Persona("Carlos");
		System.out.println(p3);
		System.out.println("contador: "+Persona.getContadorPersonas()); 
		System.out.println(p1.getContadorPersonas());
	}

}
