

public class ProductoCongelado extends Producto {

	private int temperaturaCongelacion;

	public ProductoCongelado(String fechaCaducidad, int numeroLote, int temperaturaCongelacion) {
		super(fechaCaducidad, numeroLote);
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	public int getTemperaturaCongelacion() {
		return temperaturaCongelacion;
	}

	public void setTemperaturaCongelacion(int temperaturaCongelacion) {
		this.temperaturaCongelacion = temperaturaCongelacion;
	}

	@Override
	public String toString() {
		return "ProductoCongelado [temperaturaCongelacion=" + temperaturaCongelacion + "]"+super.toString();
	}
	
	
	
}


