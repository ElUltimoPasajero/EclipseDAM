import java.util.Random;

public class Partido {
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador ganador;
    private boolean jugado;
    
    public Partido(Jugador jugador1, Jugador jugador2) {
        if (jugador1.equals(jugador2)) {
            throw new TorneoException("Los jugadores deben ser distintos");
        }
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.ganador = null;
        this.jugado = false;
    }
    
    public Jugador getJugador1() {
        return this.jugador1;
    }
    
    public Jugador getJugador2() {
        return this.jugador2;
    }
    
    public void jugar() {
        if (this.jugado) {
            return;
        }
        Random random = new Random();
        double probabilidadGanarJugador1 = (double)jugador1.getPuntuacion() / (jugador1.getPuntuacion() + jugador2.getPuntuacion());
        double resultado = random.nextDouble();
        if (resultado < probabilidadGanarJugador1) {
            this.ganador = jugador1;
        } else {
            this.ganador = jugador2;
        }
        this.jugado = true;
    }
    
    public Jugador getGanador() {
        if (!this.jugado) {
            jugar();
        }
        return this.ganador;
    }
    
    public Jugador getPerdedor() {
        if (!this.jugado) {
            jugar();
        }
        if (this.ganador.equals(jugador1)) {
            return jugador2;
        } else {
            return jugador1;
        }
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + jugador1.hashCode() + jugador2.hashCode();
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Partido other = (Partido) obj;
        return (this.jugador1.equals(other.jugador1) && this.jugador2.equals(other.jugador2))
                || (this.jugador1.equals(other.jugador2) && this.jugador2.equals(other.jugador1));
    }
    
    @Override
    public String toString() {
        if (!this.jugado) {
            return this.jugador1.getNombre() + " vs. " + this.jugador2.getNombre();
        } else {
            String ganadorNombre = this.ganador.getNombre().toUpperCase();
            String perdedorNombre = this.getPerdedor().getNombre();
            return this.jugador1.getNombre() + " vs. " + this.jugador2.getNombre() + " - " + ganadorNombre + " gana";
        }
    }
}