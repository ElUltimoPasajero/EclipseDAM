import java.util.Scanner;

public class ExcepcionDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int dividendo;
            int divisor;
            int resultado=0;
           while(resultado==0){
        	   
           }
            System.out.println("Ingrese el primer número");
            dividendo = sc.nextInt();


            System.out.println("Ingrese el segundo número");
            divisor = sc.nextInt();
            if (divisor == 1) {
            	throw new NoDivisibleEntreUnoException();
            }

           resultado = dividendo / divisor;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

   