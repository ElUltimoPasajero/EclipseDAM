
public class Math2 {
	public static double max(double[] v) {
		double maximo=v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i]>maximo) {
				maximo=v[i];
			}
		}
		return maximo;
	}
	
	public static double min(double[] v) {
		double minimo=v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i]<minimo) {
				minimo=v[i];
			}
		}
		return minimo;
	}
	
	public static double sum(double[] v) {
		double suma=0;
		for (int i = 0; i < v.length; i++) {
			suma+=v[i];
		}
		return suma;
	}
	
	public static double mediaAritmetica(double[] v) {
		return sum(v)/v.length;
	}
	
	public static double mediaGeometrica(double[] v) {
		double producto=1;
		for (int i = 0; i < v.length; i++) {
			producto*=v[i];
		}
		return Math.pow(producto, 1.0/v.length);
	}
}
