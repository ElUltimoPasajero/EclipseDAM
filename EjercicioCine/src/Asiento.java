
public class Asiento {
	
	private char letra;
	private int fila;
	private Espectador espectador;
	
	public Asiento(char letra, int fila) {
	    super();
		this.letra = letra;
		this.fila = fila;
		
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public Espectador getEspectador() {
		return espectador;
	}

	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
	

}
