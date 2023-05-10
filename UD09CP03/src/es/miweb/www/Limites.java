package es.miweb.www;

public class Limites extends Exception{
	public Limites(String cadena){
		super("Limite superado: "+cadena);
	}
}
