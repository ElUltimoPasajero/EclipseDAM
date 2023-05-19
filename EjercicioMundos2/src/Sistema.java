import java.util.Scanner;

public class Sistema {
    private static final int TAMANIO_ARRAY = 10; 

    public static void main(String[] args) {
    	
        Mundo[] mundos = new Mundo[TAMANIO_ARRAY]; 

        Scanner scanner = new Scanner(System.in); 
        
        
        for (int i = 0; i < TAMANIO_ARRAY; i++) {
            mundos[0] = new Mundo("Atari2600",3132f,true);
            mundos[1] = new Mundo("Lynx",4324f,false);
            mundos[2] = new Mundo("Famicom",4656f,true);
            mundos[3] = new Mundo("Saturn",12321f,false);
            mundos[4] = new Mundo("MegaDrive",678878f,true);
            mundos[5] = new Mundo("N64",12332f,true);
            mundos[6] = new Mundo("Neptune",768f,false);
            mundos[7] = new Mundo("MasterSystem",4355f,true);
            mundos[8] = new Mundo("Nasa",3123f,true);
            mundos[9] = new Mundo("PSX",4442f,false);
            
        }


        for (int i = 0; i < TAMANIO_ARRAY; i++) {
        
            System.out.println("Ingrese el diámetro en Km del mundo " + mundos[i].getNombre() + ": ");
            float diametro = scanner.nextFloat();
            mundos[i].setDiametro(diametro);
        }


        boolean encontrado = false;
        int i = 0;
        while (i < TAMANIO_ARRAY && !encontrado) {
            try {
                if (mundos[i].getDiametro() < 20) {
                    throw new DiametroMenorExcepcion("El diámetro del planeta es INFERIOR a 20 Km");
                } else if (mundos[i].getDiametro() > 100) {
                    throw new DiametroMayorExcepcion("El diámetro del planeta es SUPERIOR a 100 Km");
              
                } else {
                    System.out.println("El diámetro del planeta es: " + mundos[i].getDiametro() + " Km");
                }
            } catch (DiametroMenorExcepcion e) {
                System.out.println(e.getMessage());
            } catch (DiametroMayorExcepcion e) {
                System.out.println(e.getMessage());
        
            }
            i++;
        }

        scanner.close(); 

    }
}