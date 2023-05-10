
public class Persona {

	private String nombre;
	private String apellido;
	private int telefono;
	
	public Persona() {
		super();
	}

	public Persona(String nombre, String apellido, int telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + "]";
	}

	
	public  String comprobarTelefono(int telefono) {
		if(telefono>999999999||telefono<99999999) {
			
        System.out.println("Este numero no es valido, debe tener 9 cifras");			

		}else {
			
			
              System.out.println("Telefono Correcto");
              
	
	

	}
		return "telefono correcto";			

}
}
	
	
	

