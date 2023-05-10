package es.miweb.www;

public class MovilCamara extends TelefonoMovil implements Camara{

	private int resolucion;

	public MovilCamara(String numero, String marca, String modelo, String operador) {
		super(numero, marca, modelo, operador);
		this.resolucion = 0;
	}
	
	@Override
	public void sacarFoto(int resolucion) {
		this.resolucion = resolucion;
		System.out.println("Sacando foto con resolucion " + this.resolucion);
	}
}
