
public class Empleado {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private String domicilio;
	private String codigoPostal;
	private String ciudad;
	private PuestoTrabajo PuestoTrabajo;
	
	public Empleado(String dni, String nombre, String apellidos, String domicilio, String codigoPostal, String ciudad,
			PuestoTrabajo puestoTrabajo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domicilio = domicilio;
		this.codigoPostal = codigoPostal;
		this.ciudad = ciudad;
		PuestoTrabajo = puestoTrabajo;
		
		
		
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public PuestoTrabajo getPuestoTrabajo() {
		return PuestoTrabajo;
	}

	public void setPuestoTrabajo(PuestoTrabajo puestoTrabajo) {
		PuestoTrabajo = puestoTrabajo;
	}
	
	public String  getAtributos() {
		
		
		return PuestoTrabajo.getDescripcion();
		
		
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domicilio=" + domicilio
				+ ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad + ", PuestoTrabajo=" + PuestoTrabajo + "]";
	}

	
}
