import java.util.Objects;

public class Jugador implements Comparable<Jugador> {
    private String nombre;
    private int puntuacion;

    public Jugador(String nombre, int puntuacion) {
        this.nombre = nombre;
        if (puntuacion < 0) {
            throw new IllegalArgumentException("La puntuación debe ser positiva");
        }
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nombre.toLowerCase(), jugador.nombre.toLowerCase()) && puntuacion == jugador.puntuacion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase(), puntuacion);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }

    @Override
    public int compareTo(Jugador o) {
        int compare = Integer.compare(o.getPuntuacion(), this.getPuntuacion());
        if (compare == 0) {
            return this.getNombre().compareToIgnoreCase(o.getNombre());
        }
        return compare;
    }
}