

public class Asientos {
	
	public static void main (String[]args) {
		
	
		int asientos[][]= new int [8][8];
		int butacaOcupada=0;
		int butacaLibre=0;
		int filas=1;
		int butaca=1;
	    for (int fila = 0; fila < asientos.length; fila++) {
		
		for (int butacas = 0; butacas < asientos[fila].length; butacas++) {
			if(butaca%2==0) {
				
				
				System.out.println("El asiento numero "+butaca+ " esta libre");
				
				butacaLibre++;
			}else {
				
				System.out.println("El asiento numero " +butaca+ " esta ocupado");
				butacaOcupada++;
			}
			
		
			butaca++;
			System.out.println("Numero de butaca -->"+butaca);
		}
		
		filas++;
		System.out.println("NUMERO DE FILA <=====================================> "+filas);
		
	
			
		}
	    System.out.println("Esta sala tiene "+ butacaLibre+ " butacas libres");
	    System.out.println("Esta sala tiene "+ butacaOcupada+ " butacas ocuadas");
	}
}
				

