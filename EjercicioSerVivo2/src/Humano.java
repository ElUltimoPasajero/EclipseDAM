
public class Humano extends SerVivo {
	
	private String nombre;

	public Humano(byte edad, String nombre) {
		super(edad);
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean  equals(Humano otro) {
		
		if((this.getEdad()==(otro.getEdad())&&(this.nombre)==(otro.getNombre()))) {
			
			return true;
			
		}else {
			
			return false;
		}
		
	}

public SerVivo mayor(Humano otro) {
	
	if((this.nombre.length())>(otro.nombre.length())&&(this.getEdad()>(otro.getEdad()))) {
		
		return this;
	}else {
		
		return otro;
	}
		
		
		
		
	}

public String toString() {
	
	return super.toString()+" Nombre:"+ nombre;
	
}
	
}
	

