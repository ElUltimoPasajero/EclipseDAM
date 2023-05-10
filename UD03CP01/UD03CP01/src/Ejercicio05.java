
public class Ejercicio05 {

	public static void main(String[] args) {
		System.out.println("1 es primo");
		int contador=1;
		int veces;
		for (int i = 2; i <= 100; i++) {
			veces=0;
			for (int j=2; j<i; j++) {
				if (i%j == 0)
					veces++;
			}
			if (veces==0) {
				System.out.println(i+" es primo");
				contador++;
			} 
			
			//else {
			//	System.out.println(i+" NO es primo");
			// }
		}
		
		System.out.println("Hay "+contador+" números primos desde el 1 al 100");

	}

}
