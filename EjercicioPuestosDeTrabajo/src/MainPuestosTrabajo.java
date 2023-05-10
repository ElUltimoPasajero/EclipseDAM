
public class MainPuestosTrabajo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PuestoTrabajo oficinista = new PuestoTrabajo("uyt2","Administrar oficina",17000);
		PuestoTrabajo mecanico = new PuestoTrabajo("ewrt2","Arreglar coches y motos",18000);
		PuestoTrabajo albañil = new PuestoTrabajo("uwer5","Tecnico de Construccion",20000);
		PuestoTrabajo encofrador = new PuestoTrabajo("324f","Tambien tecnico de construccion",23000);
     
	    Empleado empleado1 = new Empleado("32455h", "Antonio", "Martinez", "Calle Angosta", "29006", "Malaga",	oficinista);
	    Empleado empleado2 = new Empleado("345435435h", "Jose", "Gamez", "Calle Arco", "29006", "Malaga",	albañil);
	    Empleado empleado3 = new Empleado("23432432g", "Jose Luis", "Pallares", "Calle Huerta Del Obispo", "29007", "Malaga", mecanico);
	    
		
	    Administrativo administrativo1= new Administrativo("123213213g","Salvador", "Ramirez", "Calle Serna", "290056",	"Malaga", encofrador, 20);
	    Consultor consultor1 =new Consultor ("21321321f", "Maria", "Hermoso", "Calle Huerta Del Obispo", "29007","Malaga",oficinista, "Jefe");
	    
	   System.out.println(empleado1.toString());
	   System.out.println(empleado2.toString());
	   System.out.println(empleado3.toString());  
	   System.out.println(consultor1.toString());
	   System.out.println(administrativo1.toString());
     
    		   
       
	
	}

}
