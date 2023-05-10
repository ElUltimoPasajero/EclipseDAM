import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		int mayor=0,menor=0,num,contador=0, suma=0;
		System.out.print("Número de veces:");
		Scanner sc = new Scanner(System.in);
		String numTxt = sc.nextLine();
 		int veces = Integer.parseInt(numTxt);		
 		for (int i = 1; i <= veces; i++) {
 			System.out.print("Introduzca el número "+i+": ");
			numTxt = sc.nextLine();
			num=Integer.parseInt(numTxt);
			if (i==1) {
				mayor=num;
				menor=num;
			}
			if (num>mayor)
				mayor=num;
			if (num<menor)
				menor=num;
			if (num%2==0) {
				contador++;
				suma+=num;
			}
		}
 		System.out.println("El mayor de todos es "+mayor);
 		System.out.println("El menor de todos es "+menor);
 		System.out.println("La media de los pares es "+suma/contador);
 		sc.close();
	}

}
