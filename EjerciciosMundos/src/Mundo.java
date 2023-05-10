class Mundo {
    private String nombre;
    private float diametro;
    private boolean habitable;

    public Mundo() {
        nombre = "";
        diametro = 0;
        habitable = false;
    }

    public Mundo(String n, float d, boolean h) {
        nombre = n;
        diametro = d;
        habitable = h;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setDiametro(float d) {
        diametro = d;
    }

    public void setHabitable(boolean h) {
        habitable = h;
    }

    public String getNombre() {
        return nombre;
    }

    public float getDiametro() {
        return diametro;
    }

    public boolean isHabitable() {
        return habitable;
    }
}