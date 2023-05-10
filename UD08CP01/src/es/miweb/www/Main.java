package es.miweb.www;

public class Main {

	public static void main(String[] args) {
		
		Telefono miMovil = new MovilCamaraRadio("678901234","MSE", "7712", "Movistar");
		((MovilCamaraRadio) miMovil).sacarFoto(100);
		((MovilCamaraRadio) miMovil).escucharSintonia("Los 40");
		miMovil.llamar(98416);
	}

}
