package es.miweb.www;

public class MovilRadio extends TelefonoMovil implements Radio{

	private String sintonia;

	public MovilRadio(String numero, String marca, String modelo, String operador) {
		super(numero, marca, modelo, operador);
		this.sintonia = "";
	}
	
	@Override
	public void escucharSintonia(String sintonia) {
		this.sintonia = sintonia;
		System.out.println("Escuchando " + this.sintonia);
	}
}
