import java.util.Scanner;

public class Tienda {
	
	public static void main (String[]args) {
		
		double ventas[]= new double[5];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Ingrese las 5 ventas del mes : ");
		for (int i = 0; i < ventas.length; i++) {
			
			System.out.println("Venta "+ (i+1));
			ventas[i]= sc.nextDouble();
		
		
		}	
		int index=1;
		int k=0;
		int total=0;
		while (k<5) {
			
			if(ventas[k]>=2000) {
				
				System.out.println("La venta numero "+ index +" es mayor a 2000 y su precio ha sido "+ ventas[k]);
				
				total++;
				index++;
				
				
			}
			k++;
			
		}
		
		System.out.println("Las ventas por encima de 2000 fueron un total de " +total );
		
	
	
	}
	
	
	

}


