import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		System.out.print("Introduce un mes:");
		Scanner sc = new Scanner(System.in);
		String mes = sc.nextLine();
		String texto = mes.toLowerCase();
		switch (texto) {
		case "enero":
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":
			System.out.println(mes + " tiene 31 d�as");
			break;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			System.out.println(mes + " tiene 30 d�as");
			break;
		case "febrero":
			System.out.println(mes + " tiene 28 � 29 d�as");
			break;
		default:
			System.out.println(mes + " no es un mes v�lido");
		}
		sc.close();
	}

}
