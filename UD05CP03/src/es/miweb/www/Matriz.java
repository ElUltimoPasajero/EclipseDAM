package es.miweb.www;

public class Matriz {
	public static final int DEF_SIZE=5;
	
	private int[][] matriz;

	public Matriz(int size){
		matriz = new int[size][size];
	}
	
	public Matriz(){
		this(DEF_SIZE);
	}
	
	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	/**
	 * Inicializar la matriz
	 * @param vector datos iniciales
	 */
	public void asignarDatos(int[] vector){
		//Compruebo que la longitud es compatible
		if (Math.sqrt(vector.length) == matriz.length){
			//�ndice para recorrer el array de entrada
			int indice = 0;
			for (int i=0; i<this.matriz.length; i++){
				for (int j=0; j<this.matriz.length; j++){
					//Asignar a la posici�n de la matriz
					matriz[i][j] = vector[indice++];
				}
			}
		}else{
			System.out.println("No compatible");
		}
	}
	
	public void suma(Matriz m){
		//Compruebo que la longitud es compatible
		if (m.matriz.length == this.matriz.length){
			for (int i=0; i<this.matriz.length; i++){
				System.out.print("( ");
				for (int j=0; j<this.matriz.length; j++){
					//Sumar a la posici´n de la matriz
					System.out.print(matriz[i][j]+m.getMatriz()[i][j]+" ");
				}
				System.out.println(")");
			}
		}else{
			System.out.println("No compatible");
		}
	}
	
	private int[] getFila(int f){
		int[] fila = new int[this.matriz.length];
		for (int i=0; i<this.matriz.length; i++){
			fila[i]=getMatriz()[f][i];
		}
		return fila;
	}
	
	private int[] getColumna(int c){
		int[] columna = new int[this.matriz.length];
		for (int i=0; i<this.matriz.length; i++){
			columna[i]=getMatriz()[i][c];
		}
		return columna;
	}
	
	private int multiplica(int[] v1, int[] v2){
		int resultado=0;
		for (int i=0; i<v1.length; i++){
			resultado+=v1[i]*v2[i];
		}
		return resultado;
	}
	
	public void producto(Matriz m){
		//Compruebo que la longitud es compatible
		if (m.matriz.length == this.matriz.length){
			for (int i=0; i<this.matriz.length; i++){
				System.out.print("( ");
				for (int j=0; j<this.matriz.length; j++){
					//Multiplico fila por columna para obtener el valor a almacenar en esa fila y columna
					System.out.print(multiplica(this.getFila(i),m.getColumna(j))+" ");
				}

				System.out.println(")");
			}

			System.out.println();
		}else{
			System.out.println("No compatible");
		}
	}
	
	public void mostrar(){
		String tmp = "";
		for (int i=0; i<matriz.length; i++){		
			tmp+="( ";
			for (int j=0; j<matriz.length; j++){
				tmp += matriz[i][j] + " ";
			}
			tmp += ")\n";
		}
		System.out.print(tmp);
		System.out.println();

	}
}
