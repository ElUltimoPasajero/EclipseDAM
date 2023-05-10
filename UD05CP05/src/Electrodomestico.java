
public class Electrodomestico {
	private double precioBase;
	private Color color;
	private Consumo consumo;
	private double peso;

	public Electrodomestico(double precioBase, String color, char consumo, double peso) {
		super();
		this.precioBase = precioBase;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumo);
		this.peso = peso;
	}

	public Electrodomestico(double precioBase, double peso) {
		/*
		 * super(); this.precioBase = precioBase; this.peso = peso; this.color =
		 * Color.blanco; this.consumo = Consumo.F;
		 */
		this(precioBase, "blanco", 'F', peso);
	}

	public Electrodomestico() {
		this(100, "blanco", 'F', 5);
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Consumo getConsumo() {
		return consumo;
	}

	public void setConsumo(Consumo consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	private void comprobarConsumoEnergetico(char letra) {
		String x = ("" + letra).toUpperCase();
		switch (x.charAt(0)) {
		case 'A':
			this.consumo = Consumo.A;
			break;
		case 'B':
			this.consumo = Consumo.B;
			break;
		case 'C':
			this.consumo = Consumo.C;
			break;
		case 'D':
			this.consumo = Consumo.D;
			break;
		case 'E':
			this.consumo = Consumo.E;
			break;
		default:
			this.consumo = Consumo.F;
		}
	}

	private void comprobarColor(String color) {
		switch (color.toLowerCase()) {
		case "negro":
			this.color = Color.negro;
			break;
		case "rojo":
			this.color = Color.rojo;
			break;
		case "azul":
			this.color = Color.azul;
			break;
		case "gris":
			this.color = Color.gris;
			break;
		default:
			this.color = Color.blanco;
		}
	}

	public double precioFinal() {
		double precio = precioBase;
		switch (consumo) {
		case A:
			precio = precio + 100;
			break;
		case B:
			precio = precio + 100;
			break;
		case C:
			precio = precio + 100;
			break;
		case D:
			precio = precio + 100;
			break;
		case E:
			precio = precio + 100;
			break;
		case F:
			precio = precio + 100;
		}
		if ((peso > 0) && (peso <= 19)) {
			precio += 10;
		} else if ((peso >= 20) && (peso < 50)) {
			precio += 50;
		} else if ((peso >= 50) && (peso < 80)) {
			precio += 80;
		} else {
			precio += 100;
		}
		return precio;
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}

	
}
