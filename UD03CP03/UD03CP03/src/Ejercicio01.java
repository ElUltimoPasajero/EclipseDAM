import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		System.out.print("Rango (de 1 a ...):");
		Scanner sc = new Scanner(System.in);
		String texto=sc.nextLine();
		int rango=Integer.parseInt(texto);
		System.out.print("Número de intentos:");
		texto=sc.nextLine();
		int intentos = Integer.parseInt(texto);
		Random r = new Random();
		int numAadivinar=r.nextInt(rango)+1;
		int contador=1;
		int num=0;
		do {
			System.out.print("nº"+contador+" - Introduce un número:");
			texto=sc.nextLine();
			num=Integer.parseInt(texto);
			if(num==numAadivinar) 
				System.out.println("Eres un crack!!!");
			else {
				if(num<numAadivinar)
					System.out.println("El número es mayor");
				else
					System.out.println("El número es menor");
			}
			contador=contador+1;
		} while((contador<=intentos) && (num!=numAadivinar));
		if (contador>intentos)
			System.out.print("El número era el "+numAadivinar);
		sc.close();

	}

}
