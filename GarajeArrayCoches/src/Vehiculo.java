
public class Vehiculo {

	private String marca;
	private String modelo;
	private int matricula;
	private String simbolo;

	public Vehiculo(String marca, String modelo, int matricula, String simbolo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.simbolo = simbolo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getSimbolo() {
		return this.simbolo;
	}

	@Override
	public boolean equals(Object obj) {

		Vehiculo otro = (Vehiculo) obj;
		return (this.getMarca().equals(otro.getMarca()) && this.getModelo().equals(otro.getModelo())
				&& this.getMatricula() == (otro.getMatricula())) ? true : false;

		/*if (this.getMarca().equals(otro.getMarca()) && this.getModelo().equals(otro.getModelo())
				&& this.getMatricula() == (otro.getMatricula())) {

			return true;

		} else {

			return false;
		}*/

	}
	
	@Override
	public String toString() {
		return simbolo + " || ";
	}

}
