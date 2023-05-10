
public class Cuenta {
	private String numeroCuenta;
	private double saldo;
	private Persona propietario;
	
	public Cuenta(String numeroCuenta, double saldo, Persona propietario) {
		super();
		this.numeroCuenta = numeroCuenta;
		setSaldo(saldo);
		this.propietario = propietario;
	}

	public Cuenta() {
		super();
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo>=0) {
			this.saldo = saldo;
		} else {
			this.saldo=0;
		}
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", propietario=" + propietario + "]";
	}
	
	public void transaccion(double cantidad, String tipoTransaccion) {
		if (tipoTransaccion.equals("Reintegro")) {
			if (cantidad>saldo) {
				System.out.println("Va a ser que no");
			} else {
				saldo-=cantidad;
				System.out.println("Ha realizado un reintegro de "+cantidad+" euros");
			}
		} else if (tipoTransaccion.equals("Ingreso")) {
			saldo+=cantidad;
			System.out.println("Ha realizado un ingreso de "+cantidad+" euros");
		}
		System.out.println("El nuevo saldo es "+saldo);
	}
}
