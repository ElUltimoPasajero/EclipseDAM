
public class ProductoRefrigerado extends Producto {
	private String codigo;

	public ProductoRefrigerado(String fechaCad, String lote, String codigo) {
		super(fechaCad, lote);
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "ProductoRefrigerado [codigo=" + codigo + ", " + super.toString() + "]";
	}
	
	
}
