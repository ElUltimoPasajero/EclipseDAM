
public class Producto {
	
	private String fechaCaducidad;
	private int numeroLote;
	
	public Producto(String fechaCaducidad, int numeroLote) {
		super();
		this.fechaCaducidad = fechaCaducidad;
		this.numeroLote = numeroLote;
	}
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public int getNumeroLote() {
		return numeroLote;
	}
	public void setNumeroLote(int numeroLote) {
		this.numeroLote = numeroLote;
	}
	@Override
	public String toString() {
		return " [fechaCaducidad=" + fechaCaducidad + ", numeroLote=" + numeroLote + "]";
	}
	
	
	

}
