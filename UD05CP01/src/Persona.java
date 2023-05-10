import java.util.Random;

public class Persona {
	private String nombre; 
	private int edad;
	private String dni;
	private Sexo sexo;
	private double peso;
	private double altura;
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		generaDNI();
		comprobarSexo(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	
	public Persona() {
		this.nombre = "Sin nombre";
		this.edad = 0;
		this.sexo = Sexo.Hombre;
		generaDNI();
		this.peso = 50;
		this.altura = 1.50;
	}

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		comprobarSexo(sexo);
		generaDNI();
		this.peso = 50;
		this.altura = 1.50;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setSexo(char sexo) {
		comprobarSexo(sexo);
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		String res= "Persona [nombre=" + nombre + ", edad=" + edad 
				+ ((edad>=18)?" Mayor de edad":" Menor de edad")+", dni=" 
				+ dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura;
		int imc = calcularIMC(); 
		if (imc==0) {
			res=res+", Está en el peso ideal";
		} else if (imc==-1) {
			res=res+", Está por debajo del peso ideal";
		} else {
			res=res+", Tiene sobrepeso";
		}
		return res+"]";
	}
	
	public int calcularIMC() {
		int resultado=0;
		double imc = peso/(altura*altura); //Math.pow(altura,2);
		if (imc<18.5)
			resultado=-1;
		else if ((imc>=18.5)&&(imc<25))
			resultado=0;
		else
			resultado=1;
		return resultado;
	}
	
	public boolean esMayorDeEdad() {
		boolean res;
		if (edad>=18)
			res=true;
		else
			res=false;
		return res;
		// return (edad>=18);
	}
	
	private void comprobarSexo(char sexo) {
		if (sexo=='M')
			this.sexo = Sexo.Mujer;
		else
			this.sexo = Sexo.Hombre;
	}
	
	private void generaDNI() {
		String letras="TRWAGMYFPDXBNJZSQVHLCKE";
		Random r = new Random();
		int numero = r.nextInt(100000000); // 00234567
		int resto = numero % 23;
		String elDni = ""+numero;
		while (elDni.length()<8) {
			elDni="0"+elDni;
		}
		this.dni = elDni+letras.charAt(resto);
	}
}
