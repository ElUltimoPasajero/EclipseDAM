import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número de alumnos:");
		int num=Integer.parseInt(sc.nextLine());
		double[] notas = new double[num];
		int suma=0;
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Introduce la nota del alumno: "+(i+1));
			notas[i]=Double.parseDouble(sc.nextLine());
			suma+=notas[i];
		}
		int media = suma/num;
		System.out.println("Nota media del curso:"+media);
		for (int i = 0; i < notas.length; i++) {
			if (notas[i]>media)
				System.out.println("El alumno "+(i+1)+" tiene una nota superior a la media:"+notas[i]);
		}
		sc.close();
	}

}
