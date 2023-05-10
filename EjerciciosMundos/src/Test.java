class Test {
    public static void main(String[] args) {
        Mundo mundo1 = new Mundo();
        Mundo mundo2 = new Mundo("Hyrulw", 2456.7f, false); 

        System.out.println("Mundo1: ");
        System.out.println("Nombre: " + mundo1.getNombre());
        System.out.println("Diámetro: " + mundo1.getDiametro());
        System.out.println("Habitable: " + mundo1.isHabitable());

        System.out.println("Mundo2: ");
        System.out.println("Nombre: " + mundo2.getNombre());
        System.out.println("Diámetro: " + mundo2.getDiametro());
        System.out.println("Habitable: " + mundo2.isHabitable());
    }
}