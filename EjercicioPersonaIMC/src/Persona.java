import java.util.Random;

public class Persona {
	
	private String nombre;
	private String dni;
	private int edad;
	private Sexo sexo;
	private double peso;
	private double altura;
	
	

	public Persona(String nombre,  int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		generaDNI();
		this.edad = edad;
		comprobarSEXO(sexo);
		this.peso = peso;
		this.altura = altura;
	}
	

	public Persona(String nombre, int edad, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.altura=1.60;
		this.peso=80;
		comprobarSEXO(sexo);
		generaDNI();
	}


	public Persona() {
		this.nombre = "Sin nombre";
		this.edad = 0;
		this.sexo = Sexo.MUJER;
		generaDNI();
		this.peso = 50;
		this.altura = 1.50;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public void setSexo(char sexo) {
		comprobarSEXO(sexo);
	}




	public void setPeso(double peso) {
		this.peso = peso;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public int CalcularIMC() {
		
		if((peso/(Math.pow(altura,2))<18.50)){
			
			System.out.println("Estas por debajo de tu peso ideal");
			
			return -1;
		}else if(((peso/(Math.pow(altura,2))>=18.50) && ((peso/(Math.pow(altura,2))<25)))){
			
			
			System.out.println("Estas en tu peso ideal");
			
			return 0;
			
		}else if(((peso/(Math.pow(altura,2))<30) && ((peso/(Math.pow(altura,2))>=25)))) {
			
			
			System.out.println("Tienes sobrepeso");
			
			return 1;
			
		}else if (peso/(Math.pow(altura,2))>=30){
			
			System.out.println("Tienes obesidad");
			
		}
		return 3;
		
	}
	
	public boolean esMayorDeEdad() {
		
		if(edad>=18) {
			return true;
			
			}else {
				
				return false;
				
			}
				
		}
		
	private void comprobarSEXO(char sexo) {
		
		if(sexo=='M') 
			this.sexo=Sexo.MUJER;
			else
				this.sexo=Sexo.HOMBRE;
		
			}
	
   private void generaDNI() {
	
	Random rand = new Random();
     int numeroDNI = rand.nextInt(100000000);
    int resto = numeroDNI % 23;
    String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
    char letraDNI = letras.charAt(resto);
    this.dni=""+numeroDNI+letraDNI;
		
		
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}
	
	







//private void generaDNI() {
	//String letras="TRWAGMYFPDXBNJZSQVHLCKE";
	//Random r = new Random();
	//int numero = r.nextInt(100000000); // 00234567
	//int resto = numero % 23;
	//String elDni = ""+numero;
	//while (elDni.length()<8) {
	//	elDni="0"+elDni;
//	}
	//this.dni = elDni+letras.charAt(resto);
//}
	

