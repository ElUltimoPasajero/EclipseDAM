package es.miweb.www;

public abstract class Telefono {

	private String numero;
	
	public Telefono(String numero){
		this.numero=numero;
	}
	
	public void llamar(int destino){
		System.out.println("LLamando a " + destino);
	}
	
}
