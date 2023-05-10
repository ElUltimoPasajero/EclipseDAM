import java.util.Scanner;

public class ArrayProducto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

        String producto[]=new String[4];
		
		System.out.println("Introduzca los nombres del producto");
		
		for (int i = 0; i < producto.length; i++) {
			
			
			System.out.println("introduzca el nombre del producto: " + (i+1));
			
			producto[i]=sc.nextLine();
			

	
	if(producto[i].length()>5) { 
		
		System.out.println("Este producto tiene mas de 5 caracteres");
		
		
	}
	
		}
		for (int i = 0; i < producto.length; i++) {
			
			System.out.println("Ha introducido los siguientes productos :" +producto[i]);
			
		}
		
	}
	
}

