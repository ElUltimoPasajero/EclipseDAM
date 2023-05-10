
public class ProductoCongelado extends Producto {
	private String tempCong;

	public ProductoCongelado(String fechaCad, String lote, String tempCong) {
		super(fechaCad, lote);
		this.tempCong = tempCong;
	}

	public String getTempCong() {
		return tempCong;
	}

	public void setTempCong(String tempCong) {
		this.tempCong = tempCong;
	}

	@Override
	public String toString() {
		return "ProductoCongelado [tempCong=" + tempCong + ", " + super.toString() + "]";
	}
	
	
}
