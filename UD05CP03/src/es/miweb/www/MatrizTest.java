package es.miweb.www;

public class MatrizTest {
	
	public static void main(String[] args) {
		Matriz m = new Matriz(3);
		Matriz n = new Matriz(3);
		
		int[] vector = {3, 2, 1, 1, 2, 3, 2, 3, 1};
		m.asignarDatos(vector);
		
		int[] vector2 = {1, 1, 2, 2, 1, 1, 1, 2, 1};
		n.asignarDatos(vector2);
		
		System.out.println("Matriz 1");
		m.mostrar();
		System.out.println("Matriz 2");
		n.mostrar();
		System.out.println("Producto");
		m.producto(n);
		System.out.println("Suma");
		m.suma(n);
	}

}
