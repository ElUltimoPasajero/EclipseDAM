import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		System.out.print("Escribe un año:");
		Scanner sc = new Scanner(System.in);
		int anho=sc.nextInt();
		boolean esBisiesto=false;
		if (anho%100==0) {
			if (anho%400==0) {
				esBisiesto=true;
			}
		} else {
			if (anho%4==0) {
				esBisiesto=true;
			}
		}
		
/*		if ((anho%100==0)&&(anho%400==0)) {
			esBisiesto=true;
		} else if ((anho%100!=0)&&(anho%4==0)) {
			esBisiesto=true;
		}
*/
/*		
		if (((anho%100==0)&&(anho%400==0)) || ((anho%100!=0)&&(anho%4==0))) {
			esBisiesto=true;
		}
*/
//		esBisiesto=(((anho%100==0)&&(anho%400==0)) || ((anho%100!=0)&&(anho%4==0)));
		
		if(esBisiesto) {
			System.out.println("El año "+anho+" es bisiesto");
		} else {
			System.out.println("El año "+anho+" no es bisiesto");
		}
	
		sc.close();
	}

}
