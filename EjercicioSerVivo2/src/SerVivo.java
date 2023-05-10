
public class SerVivo {

private byte edad;

public SerVivo(byte edad) {
	super();
	this.edad = edad;
}

public byte getEdad() {
	return edad;
}

public void setEdad(byte edad) {
	this.edad = edad;
}


public boolean equals(SerVivo otro) {
	
	if((this.getEdad())==(otro.getEdad())) {
		
		
		return true;
			
	}else {
		return false;
		
	}
		

}

public SerVivo mayor(SerVivo otro) {
	
	if((this.getEdad())>(otro.getEdad())) {
		
		return this;
		
	}else {
		return otro;
		
	}	
		
		}

public String toString() {
	
	return "Edad:"+edad;
}

}		
	

