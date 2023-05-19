
public class TestGaraje {

	public static void main(String[] args) {

		Garaje garajeArmengual = new Garaje(5);

		Vehiculo coche = new Vehiculo("Honda", "Prelude", 24234234, "O");
		Vehiculo coche1 = new Vehiculo("Honda", "Civic", 678878, "X");
		Vehiculo coche2 = new Vehiculo("Mitsubishi", "Eclipse", 358568, "W");
		Vehiculo coche3 = new Vehiculo("Honda", "Concerto", 890780, "T");
		Vehiculo coche4 = new Vehiculo("Pepito", "Concerto", 890780, "P");
		Vehiculo coche5 = new Vehiculo("Juanito", "Concerto", 890780, "J");
		Vehiculo coche6 = new Vehiculo("Menganito", "Concerto", 890780, "M");

		garajeArmengual.introducirCoche(coche3);
		garajeArmengual.introducirCoche(coche2);
		garajeArmengual.introducirCoche(coche1);
		garajeArmengual.introducirCoche(coche4);
		garajeArmengual.introducirCoche(coche5);
		garajeArmengual.introducirCoche(coche6);


		garajeArmengual.sacarCoche(coche3);
		garajeArmengual.sacarCoche(coche);
		garajeArmengual.comprobarPLazasLibres();
		

	}

}
