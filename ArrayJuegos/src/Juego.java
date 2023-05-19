
public class Juego {

	String titulo;
	String genero;
	String plataforma;
	int añoLanzamiento;

	public Juego(String titulo, String genero, String plataforma, int añoLanzamiento) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.plataforma = plataforma;
		this.añoLanzamiento = añoLanzamiento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getAñoLanzamiento() {
		return añoLanzamiento;
	}

	public void setAñoLanzamiento(int añoLanzamiento) {
		this.añoLanzamiento = añoLanzamiento;
	}

	@Override
	public boolean equals(Object obj) {
		
		Juego otro = (Juego) obj;
		
		if(this.getTitulo()==(otro.getTitulo())&&
				this.getGenero()==(otro.getGenero())&&
						this.getPlataforma()==(otro.getPlataforma())&&
								this.getAñoLanzamiento()==(otro.getAñoLanzamiento())){
			
			return true;
			
		}else {
			return false;
		}
		
		
	}

}
