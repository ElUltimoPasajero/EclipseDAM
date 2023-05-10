
public class Persona {
	private int idPersona;
	private String nombre;
	private static int contadorPersonas;
	
	public Persona(String nombre) {
		super();
		contadorPersonas++;
		this.idPersona = contadorPersonas;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorPersonas() {
		return contadorPersonas;
	}

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + "]";
	}
	
}
