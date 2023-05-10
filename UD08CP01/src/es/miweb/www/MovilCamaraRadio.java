package es.miweb.www;

public class MovilCamaraRadio extends TelefonoMovil implements Radio, Camara{

	private String sintonia;
	private int resolucion;
	
	public MovilCamaraRadio(String numero, String marca, String modelo, String operador) {
		super(numero, marca, modelo, operador);
		this.sintonia = "";
		this.resolucion = 0;
	}

	public void sacarFoto(int resolucion) {
		this.resolucion = resolucion;
		System.out.println("Sacando foto con resolucion " + this.resolucion);
	}

	public void escucharSintonia(String sintonia) {
		this.sintonia = sintonia;
		System.out.println("Escuchando " + this.sintonia);
	}
}
