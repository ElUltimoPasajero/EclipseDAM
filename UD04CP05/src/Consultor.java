
public class Consultor extends Empleado {
	private String categoria;

	public Consultor(String dni, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad,
			PuestoTrabajo puesto, String categoria) {
		super(dni, nombre, apellidos, domicilio, codigoPostal, ciudad, puesto);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Consultor [categoria=" + categoria + ", " + super.toString() + "]";
	}

	@Override
	public void getAtributos() {
		System.out.print("Consultor [categoria=" + categoria);
		super.getAtributos();
	}
	
}
