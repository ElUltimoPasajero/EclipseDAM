
class Mundo {
    private String nombre;
    private float diametro;
    private boolean habitable;

    public Mundo() {
        this.nombre = "";
        this.diametro = 0;
        this.habitable = false;
    }

    public Mundo(String nombre, float diametro, boolean habitable) {
        this.nombre = nombre;
        this.diametro = diametro;
        this.habitable = habitable;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public float getDiametro() {
        return this.diametro;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    public boolean isHabitable() {
        return this.habitable;
    }
}