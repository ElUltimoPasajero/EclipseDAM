package es.miweb.www;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mundo miMundo = new Mundo();
		Mundo miMundo2 = new Mundo("Tierra",35000,true);
		
		System.out.println("Datos de miMundo");
		System.out.print("Nombre:"+miMundo.getNombre());
		System.out.print(" Diametro:"+miMundo.getDiametro());
		System.out.println(" Habitable:"+(miMundo.isHabitable()?"SI":"NO"));

		System.out.println("\nDatos de miMundo2");
		System.out.print("Nombre:"+miMundo2.getNombre());
		System.out.print(" Diametro:"+miMundo2.getDiametro());
		System.out.println(" Habitable:"+(miMundo2.isHabitable()?"SI":"NO"));
	}

}
