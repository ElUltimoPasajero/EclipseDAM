import javax.swing.text.StyledEditorKit.ForegroundAction;

public class PracticaArrays {

	public static void main(String[] args) {
		
		
		String saludos[]=new String[7];
		
		saludos[0]="Illo";
		saludos[1]="Que";
		saludos[3]="Pasa";
		saludos[4]="Compadre";
		saludos[5]="Vieo";
		saludos[6]="Ave";


		String illo = saludos[4];
		
		saludos[5]=null;    //Ponemos en null las posiciones 5 y 6 del Array
		saludos[6]=null;
		
		for (int i = 0; i < saludos.length; i++) {
			System.out.println(saludos[i]);
		}
		
		boolean encontrado = false;
		int i = 0;
		
		while((!encontrado)&&(i<saludos.length)){
			
			if((saludos[i]!=null)&&(saludos[i].equals("Compadre"))){
				
				System.out.println("La cadena Compadre se ha encontrado en la posicion " + i);
				
				encontrado=true;
				
			}
			i++;
			
		}
		
		//A partir de aqui Arrays Multidimensionales
		
		int[][] matriz= new int [4][]; 
		
		for (int j = 0; j < matriz.length; j++) {
			
			matriz[j]=new int [5];
			
			for (int j2 = 0; j2 < matriz[j].length; j2++) {
				
				matriz[j][j2]=j+j2;
				
				System.out.print(matriz[j][j2]+" ");
			}
			System.out.println();
			
		}
		
		
		int[][] saludasos= new int[5][5];
		

		
		for (int h = 0; h < saludasos.length; h++) {
		
			
			for (int h2 = 0; h2 < saludasos.length; h2++) {
				
				saludasos[h][h2]=h+h2;
				
				System.out.print(saludasos[h][h2]+ "");
				
				
			}
			System.out.println();
			

	}
	
	
	
		
		
		
		
		
		
	}
		
		
		
	}

	

	
	
	
	
	
	
	
	
	


