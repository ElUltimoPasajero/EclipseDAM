
public class Raices {
	
	private double a;
	private double b;
	private double c;
	
	
	public Raices(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}
	

private void obtenerRaices() {
	
	double x1=(-b+Math.sqrt(obtenerDiscriminante()))/(2*a);
	double x2=(-b-Math.sqrt(obtenerDiscriminante()))/(2*a);
	
	System.out.println("Solucion 1");
    System.out.println(x1);
	System.out.println("Solucion 2");
    System.out.println(x2);
	
}
 
private void obtenerRaiz() {
	
	double x=(-b)/(2*a);	
	
	System.out.println("Unica solucion");
	System.out.println(x);
}

private double obtenerDiscriminante() {
	
	return Math.pow(b, 2)-(4*a*c);
	
	
}

	private boolean tieneRaices() {
		
		return obtenerDiscriminante()>0;
		
		
		
	}
	private boolean tieneRaiz() {
		
		return obtenerDiscriminante()==0;
		
		
	}
	
	public void calcular() {
		
		if(tieneRaices()) {
			
			obtenerRaices();
		
		}else if (tieneRaiz()) {
				
				obtenerRaiz();
			}
		else {
			
			System.out.println("No tiene soluciones");
		}
		}
		
	
	
	
}

