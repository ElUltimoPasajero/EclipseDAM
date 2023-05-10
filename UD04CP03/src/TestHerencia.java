
public class TestHerencia {

	public static void main(String[] args) {
		Producto prod1 = new Producto("01/02/23","ha2673");
		ProductoFresco prod2 = new ProductoFresco("06/03/23","yd7778","01/01/23","Malta");
		ProductoRefrigerado prod3 = new ProductoRefrigerado("11/06/23","jh5659","HGTY");
		ProductoCongelado prod4 = new ProductoCongelado("20/07/23","fd2426","-10");
		System.out.println(prod1);
		System.out.println(prod2);
		System.out.println(prod3);
		System.out.println(prod4);
	}

}
