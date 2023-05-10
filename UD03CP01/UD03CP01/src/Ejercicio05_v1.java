
public class Ejercicio05_v1 {

	public static void main(String[] args) {
		System.out.println("1 es primo");
		int contador=1;
		boolean esPrimo;
		int num;
		
		for (int i = 2; i <= 100; i++) {
			num=2;
			esPrimo=true;
			while ((num<i)&&(esPrimo)){
				if (i%num == 0)
					esPrimo=false;
				num++;
			} 
				
			if (esPrimo) {
				System.out.println(i+" es primo");
				contador++;
			} 

		}
		
		System.out.println("Hay "+contador+" números primos desde el 1 al 100");


	}

}
