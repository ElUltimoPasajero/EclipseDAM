import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		System.out.print("Escriba un número en decimal:");
		Scanner sc = new Scanner(System.in);
		//Binario
		String cadena="";
		int num=sc.nextInt();
		int numBin=num;
		int digito;
		do {
			digito=numBin % 2;
			cadena=digito+cadena;
			numBin=(int)(numBin/2);
		} while (numBin>=2);
		cadena=numBin+cadena;
		System.out.println("El número "+num+" en binario es "+cadena);
		//Octal
		cadena="";
		numBin=num;
		do {
			digito=numBin % 8;
			cadena=digito+cadena;
			numBin=(int)(numBin/8);
		} while (numBin>=8);
		cadena=numBin+cadena;
		System.out.println("El número "+num+" en octal es "+cadena);
		//Hexadecimal
		cadena="";
		numBin=num;
		String digitoHex="";
		do {
			digito=numBin % 16;
			switch (digito) {
			case 0,1,2,3,4,5,6,7,8,9: digitoHex=""+digito;break;
			case 10:digitoHex="A"; break;
			case 11:digitoHex="B"; break;
			case 12:digitoHex="C"; break;
			case 13:digitoHex="D"; break;
			case 14:digitoHex="E"; break;
			case 15:digitoHex="F";
			}
			cadena=digitoHex+cadena;
			numBin=(int)(numBin/16);
		} while (numBin>=16);
		cadena=numBin+cadena;
		System.out.println("El número "+num+" en hexadecimal es "+cadena);
		sc.close();
	}

}
