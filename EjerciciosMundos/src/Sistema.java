import java.util.Scanner;

public class Sistema {
    private static final int ArrayPlanetas = 3; 
    private Mundo[] mundos; 

    public Sistema() {
    	
        mundos = new Mundo[ArrayPlanetas]; 

   
            mundos[0] = new Mundo("Papa", 2034, true);
            mundos[1] = new Mundo("Frita", 2034, true);
            mundos[2] = new Mundo("Hyrule",2034,true);
         


        }
    

    public void actualizarDiametros() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < ArrayPlanetas; i++) {
            System.out.println("Ingrese el nuevo diámetro del planeta " + mundos[i].getNombre() + ":");
            float diametro = scanner.nextFloat();
            mundos[i].setDiametro(diametro);
        }

        scanner.close();
    }
  
    public void comprobarDiametros() {
        int i = 0;
        int planetasActualizados = 0;
        Scanner scanner = new Scanner(System.in);

        while (i < ArrayPlanetas && planetasActualizados < ArrayPlanetas) {
            try {
                if (mundos[i].getDiametro() < 20) {
                    throw new Exception("Excepción: Planeta con diámetro inferior a 20 km");
                }
                if (mundos[i].getDiametro() > 100) {
                    throw new Exception("Excepción: Planeta con diámetro superior a 100 km");
                }
                if (mundos[i].getDiametro() < 0) {
                    throw new Exception("Excepción: Valor de diámetro inválido. Por favor, ingrese un valor válido.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                i++;
                if (i < ArrayPlanetas && mundos[i].getDiametro() <= 100) {
                    System.out.println("Ingrese el diámetro del siguiente planeta " + mundos[i].getNombre() + ":");
                    float diametro = -1;
                    while (diametro < 0) {
                        try {
                            diametro = scanner.nextFloat();
                            if (diametro < 0) {
                                throw new Exception("Excepción: Valor de diámetro inválido. Por favor, ingrese un valor válido.");
                            }
                            mundos[i].setDiametro(diametro);
                            planetasActualizados++;
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                            scanner.nextLine();
                        }
                    }
                }
            }
        }

        scanner.close();
    }
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        sistema.actualizarDiametros();
        sistema.comprobarDiametros();
      
    }

}

