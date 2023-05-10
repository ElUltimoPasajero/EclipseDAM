package es.miweb.www;

public class ExcepcionDeDivisionPorCero extends Exception{

	private static final long serialVersionUID = 1L;

	public ExcepcionDeDivisionPorCero(){
		super("Division por cero");
	}
}
