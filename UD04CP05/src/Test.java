
public class Test {

	public static void main(String[] args) {
		PuestoTrabajo p1 = new PuestoTrabajo("01","Programador Junior",15000);
		PuestoTrabajo p2 = new PuestoTrabajo("02","Programador Senior",25000);
		
		Empleado e1 = new Empleado("13423443", "Pepito", "Grillo", "Larios,1", "29001","M�laga",p1);
		Administrativo a1 = new Administrativo("78346783", "Pepita", "P�rez", "Larios,10", "29001","M�laga",p2,20);
		Consultor c1 = new Consultor("92378273", "Luisa", "Hern�ndez", "Larios,56", "29001","M�laga",p2,"Jefe de proyecto");
		
		e1.getAtributos();
		a1.getAtributos();
		c1.getAtributos();
	}

}
