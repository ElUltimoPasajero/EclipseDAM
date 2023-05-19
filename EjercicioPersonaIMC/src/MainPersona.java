import java.util.Scanner;


public class MainPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce un nombre:");
		Scanner sc=new Scanner(System.in);

		String nombre= sc.nextLine();
		System.out.println("Introduce la edad:");
		int edad=Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el sexo: H o M ");
		char sexo=sc.nextLine().charAt(0);
		System.out.println("Introduce el peso:");
		double peso = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la altura");
		double altura=Double.parseDouble(sc.nextLine());
		
		
		Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
		System.out.println("Introduce el nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduce la edad:");
		edad = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce el sexo : H o M ");
		sexo = sc.nextLine().charAt(0);
		Persona persona2 = new Persona(nombre,edad,sexo);
		System.out.println("Introduce el peso:");
		peso = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la altura:");
		altura = Double.parseDouble(sc.nextLine());
		persona2.setPeso(peso);
		persona2.setAltura(altura);
		System.out.println("Introduce el nombre:");
		nombre = sc.nextLine();
		System.out.println("Introduce la edad:");
		edad = Integer.parseInt(sc.nextLine());
		System.out.print("Introduce el sexo (H,M):");
		sexo = sc.nextLine().charAt(0);
		System.out.println("Introduce el peso:");
		peso = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce la altura:");
		altura = Double.parseDouble(sc.nextLine());
		Persona persona3 = new Persona();
		persona3.setNombre(nombre);
		persona3.setEdad(edad);
		persona3.setSexo(sexo);
		persona3.setPeso(peso);
		persona3.setAltura(altura);
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		sc.close();
		
		persona1.CalcularIMC();
		persona2.CalcularIMC();
		persona3.CalcularIMC();
		
	  

	}

}
