
public class Administrativo extends Empleado {

	private int antiguedad;

	public Administrativo(String dni, String nombre, String apellidos, String domicilio, String codigoPostal,
			String ciudad, PuestoTrabajo puestoTrabajo, int antiguedad) {
		super(dni, nombre, apellidos, domicilio, codigoPostal, ciudad, puestoTrabajo);
		this.antiguedad = antiguedad;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String getAtributos() {
		// TODO Auto-generated method stub
		return super.getAtributos();
	}

	@Override
	public String toString() {
		return "Administrativo [antiguedad=" + antiguedad + ", getAntiguedad()=" + getAntiguedad() + "]"+super.toString();
	}

	

	
	
	
	
}
