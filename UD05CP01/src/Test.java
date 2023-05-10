import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el nombre:");
		String nombre = sc.nextLine();
		System.out.print("Introduce la edad:");
		int edad = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el sexo (H,M):");
		char sexo = sc.nextLine().charAt(0);
		System.out.print("Introduce el peso:");
		double peso = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la altura:");
		double altura = Double.parseDouble(sc.nextLine());
		
		Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
		System.out.print("Introduce el nombre:");
		nombre = sc.nextLine();
		System.out.print("Introduce la edad:");
		edad = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el sexo (H,M):");
		sexo = sc.nextLine().charAt(0);
		Persona p2 = new Persona(nombre,edad,sexo);
		System.out.print("Introduce el peso:");
		peso = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la altura:");
		altura = Double.parseDouble(sc.nextLine());
		p2.setPeso(peso);
		p2.setAltura(altura);
		System.out.print("Introduce el nombre:");
		nombre = sc.nextLine();
		System.out.print("Introduce la edad:");
		edad = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el sexo (H,M):");
		sexo = sc.nextLine().charAt(0);
		System.out.print("Introduce el peso:");
		peso = Double.parseDouble(sc.nextLine());
		System.out.print("Introduce la altura:");
		altura = Double.parseDouble(sc.nextLine());
		Persona p3 = new Persona();
		p3.setNombre(nombre);
		p3.setEdad(edad);
		p3.setSexo(sexo);
		p3.setPeso(peso);
		p3.setAltura(altura);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		sc.close();
	}

}
