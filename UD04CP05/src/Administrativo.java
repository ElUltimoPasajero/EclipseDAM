
public class Administrativo extends Empleado {
	private int antiguedad;

	public Administrativo(String dni, String nombre, String apellidos, String domicilio, String codigoPostal,
			String ciudad, PuestoTrabajo puesto, int antiguedad) {
		super(dni, nombre, apellidos, domicilio, codigoPostal, ciudad, puesto);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Administrativo [antiguedad=" + antiguedad + ", " + super.toString() + "]";
	}

	@Override
	public void getAtributos() {
		System.out.print("Administrativo [antiguedad=" + antiguedad);
		super.getAtributos();
	}
	
}
