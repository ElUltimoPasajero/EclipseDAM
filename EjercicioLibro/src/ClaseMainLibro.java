
public class ClaseMainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Libro libro1= new Libro("12345g","La guerra","Pepe Martinez", 990);
	Libro libro2= new Libro("12345h","La Luna","Pepa Marquez", 270);
	Libro libro3= new Libro("12345j","El Coche","Antonio Beltran", 450);
	
    System.out.println(libro1.toString());
    System.out.println(libro2.toString());
    System.out.println(libro3.toString());
	
	if (libro1.getNumPaginas()>libro2.getNumPaginas()&&libro1.getNumPaginas()>libro3.getNumPaginas()) {
		
		System.out.println("El libro "+ libro1.getTitulo() +" tiene mas paginas ");
	}
		
		if (libro2.getNumPaginas()>libro1.getNumPaginas()&&libro2.getNumPaginas()>libro3.getNumPaginas()) {
			
			System.out.println("El libro "+ libro2.getTitulo() +" tiene mas paginas ");
		
		}else
			
	if(libro3.getNumPaginas()>libro1.getNumPaginas()&&libro3.getNumPaginas()>libro2.getNumPaginas()) {
		
		System.out.println("El libro "+ libro3.getTitulo() +" tiene mas paginas ");
		
		
	
		
	}
	
	
	
	

	}
	
    

}
