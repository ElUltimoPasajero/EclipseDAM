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
			System.out.println(mes + " tiene 31 días");
			break;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
			System.out.println(mes + " tiene 30 días");
			break;
		case "febrero":
			System.out.println(mes + " tiene 28 ó 29 días");
			break;
		default:
			System.out.println(mes + " no es un mes válido");
		}
		sc.close();
	}

}
