
public class Cuenta {

	private int numeroCuenta;
	private double saldo;
	private Persona Persona;
	public Cuenta() {
		super();
	}
	
	public Cuenta(int numeroCuenta, double saldo, Persona persona) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		Persona = persona;
		
	}
	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Persona getPersona() {
		return Persona;
	}
	public void setPersona(Persona persona) {
		Persona = persona;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", Persona=" + Persona + "]";
	}
	
	
	
	public double transaccion(double cantidad, String tipoTransaccion) {
		
		System.out.println("Buenos dias Sr/Sñra " + Persona.getNombre());
		
		
     if(tipoTransaccion=="Ingreso") {
			
			saldo+=cantidad;	
			
		System.out.println("Ha realizado un ingreso, su nuevo saldo es "+ saldo);
		
		
			
		} if(tipoTransaccion=="Reintegro") {
			if(cantidad>saldo) {
				
		System.out.println("La operacion no se puede realizar, no tiene suficiente saldo");
				
			}
			
			
        System.out.println("Ha realizado un Reintegro, su nuevo saldo es " + saldo);
		}
		
	
		if(saldo<=0) {
			
			System.out.println("La operacion no se puede realizar, no tiene suficiente saldo");
			
			
		}
		return saldo;
	}
}
		

