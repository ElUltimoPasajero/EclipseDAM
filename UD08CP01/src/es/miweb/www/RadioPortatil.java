package es.miweb.www;

public class RadioPortatil implements Radio{

	private String sintonia;
	
	@Override
	public void escucharSintonia(String sintonia) {
		this.sintonia = sintonia;
		System.out.println("Escuchando " + this.sintonia);
	}

}
