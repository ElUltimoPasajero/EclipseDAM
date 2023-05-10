import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		System.out.print("Escribe un número entre 1 y 1000:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int veces=0;
		if (num==1000) {
			System.out.print("M"); 
			num=num-1000;
		}
		if (num>=900 && num<1000) {
			System.out.print("CM");
			num=num-900;
		}
		if (num>=500 && num<900) {
			System.out.print("D");
			num=num-500;
			veces=(int)(num/100);
			for(int x=1; x<=veces;x++) {
				System.out.print("C");
				num=num-100;
			}
		}
		if (num>=400 && num<500) {
			System.out.print("CD");
			num=num-400;
		}
		if (num>=100 && num<400) {
			veces=(int)(num/100);
			for(int x=1; x<=veces; x++){
				System.out.print("C");
				num=num-100;
			}
		}
		if (num>=90 && num<100) {
			System.out.print("XC");
			num=num-90;
		}
		if (num>=50 && num<90) {
			System.out.print("L");
			num=num-50;
			veces=(int)(num/10);
			for(int x=1; x<=veces;x++) {
				System.out.print("X");
				num=num-10;
			}
		}
		if (num>=40 && num<50) {
			System.out.print("XL");
			num=num-40;
		}
		if (num>=10 && num<40) {
			veces=(int)(num/10);
			for(int x=1; x<=veces; x++) {
				System.out.print("X");
				num=num-10;
			}
		}
		if (num==9) {
			System.out.print("IX");
			num=num-9;
		}
		if (num>=5 && num<9) {
			System.out.print("V");
			num=num-5;
			veces=(int)(num);
			for(int x=1; x<=veces; x++) {
				System.out.print("I");
				num=num-1;
			}
		}
		if (num==4) {
			System.out.print("IV");
			num=num-4;
		}
		if (num>=1 && num<4) {
			veces=(int)(num);
			for(int x=1;x<=veces; x++) {
				System.out.print("I");
				num=num-1;
			}
		}
		System.out.println("");
	}

}
