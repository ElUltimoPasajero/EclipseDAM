
public class Producto {
	private String fechaCad;
	private String lote;
	
	public Producto(String fechaCad, String lote) {
		super();
		this.fechaCad = fechaCad;
		this.lote = lote;
	}

	public String getFechaCad() {
		return fechaCad;
	}

	public void setFechaCad(String fechaCad) {
		this.fechaCad = fechaCad;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	@Override
	public String toString() {
		return "Producto [fechaCad=" + fechaCad + ", lote=" + lote + "]";
	}
		
}
