package es.miweb.www;

public class Mundo {
	private String nombre;
	private float diametro;
	private boolean habitable;
	
	public Mundo(){
		nombre="";
		diametro=0;
		habitable=false;
	}
	
	public Mundo(String n,float d,boolean h){
		nombre=n;
		diametro=d;
		habitable=h;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getDiametro() {
		return diametro;
	}

	public void setDiametro(float diametro) {
		this.diametro = diametro;
	}

	public boolean isHabitable() {
		return habitable;
	}

	public void setHabitable(boolean habitable) {
		this.habitable = habitable;
	}
	
}
