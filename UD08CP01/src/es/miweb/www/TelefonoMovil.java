package es.miweb.www;

public class TelefonoMovil extends TelefonoFijo{
	
	private String operador;

	public TelefonoMovil(String numero, String marca, String modelo, String operador) {
		super(numero,marca, modelo);
		this.operador = operador;
	}

	@Override
	public void llamar(int destino) {
		System.out.println("LLamando a " + destino + " con el operador " + this.operador);
	}

}
