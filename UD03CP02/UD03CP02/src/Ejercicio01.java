import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		System.out.print("Introduce un valor para la base:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for(int espacios=1; espacios<=n-i; espacios++) {
				System.out.print(" ");
			}
			for(int asteriscos=1; asteriscos<=i; asteriscos++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		sc.close();
	}

}
