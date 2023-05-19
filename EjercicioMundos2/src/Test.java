class Test {
    public static void main(String[] args) {
        Mundo mundo1 = new Mundo();
        Mundo mundo2 = new Mundo("Marte", 6786.4f, false);

        System.out.println("Mundo 1 - Nombre: " + mundo1.getNombre() + ", Diámetro: " + mundo1.getDiametro() + " Km, Habitable: " + mundo1.isHabitable());
        System.out.println("Mundo 2 - Nombre: " + mundo2.getNombre() + ", Diámetro: " + mundo2.getDiametro() + " Km, Habitable: " + mundo2.isHabitable());
    }
}