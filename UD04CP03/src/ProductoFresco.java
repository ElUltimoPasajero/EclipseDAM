
public class ProductoFresco extends Producto {
	private String fechaEnv;
	private String paisOrigen;
	
	public ProductoFresco(String fechaCad, String lote, String fechaEnv, String paisOrigen) {
		super(fechaCad, lote);
		this.fechaEnv = fechaEnv;
		this.paisOrigen = paisOrigen;
	}

	public String getFechaEnv() {
		return fechaEnv;
	}

	public void setFechaEnv(String fechaEnv) {
		this.fechaEnv = fechaEnv;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		return "ProductoFresco [fechaEnv=" + fechaEnv + ", paisOrigen=" + paisOrigen + ", "
				+ super.toString() + "]";
	}
	
	
}
