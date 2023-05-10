
public class TestHerencia {

	public static void main(String[] args) {
	
		ProductoFresco huevo = new ProductoFresco("19-06-1987",13213321,"19-02-1987","España");// TODO Auto-generated method stub
        ProductoRefrigerado lechuga = new ProductoRefrigerado("12-03-1997",2342344,4234234);
        ProductoCongelado helado = new ProductoCongelado("16-04-1994",23112332,-15);
		
		
       System.out.println(huevo.toString());
       System.out.println(lechuga.toString());
       System.out.println(helado.toString());
        
	}

}
