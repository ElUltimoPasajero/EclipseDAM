package calculadora;

public class Calculadora {
	
	 public static int suma(int a, int b) {
	        return a + b;
	    }

	    public static int resta(int b, int a) {
	        return b - a;
	    }

	    public static int multiplicacion(int a, int b) {
	        return a * b;
	    }

	    public static int division(int d, int e) {
	        if (e == 0) {
	            throw new IllegalArgumentException("No se puede dividir entre cero");
	        }
	        return d / e;
	    }
	}
