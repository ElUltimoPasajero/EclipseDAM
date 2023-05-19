import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Torneo {

    protected Set<Jugador> jugadores;
    protected List<Partido> partidos;
    private boolean finalizado;

    public Torneo(Set<Jugador> jugadores) throws TorneoException {
        if (jugadores.size() < 2) {
            throw new TorneoException("No se puede crear un torneo con menos de 2 jugadores");
        }
        if (!esPotenciaDe2(jugadores.size())) {
            throw new TorneoException("El número de jugadores debe ser una potencia de 2");
        }
        this.jugadores = new HashSet<>(jugadores);
        this.partidos = new ArrayList<>();
        this.finalizado = false;
    }

    public void formarPrimeraRonda() throws TorneoException {
        if (partidos.size() != 0) {
            throw new TorneoException("Ya se ha empezado el torneo");
        }
        List<Jugador> jugadoresAleatorios = new ArrayList<>(jugadores);
        Collections.shuffle(jugadoresAleatorios);
        for (int i = 0; i < jugadoresAleatorios.size() - 1; i += 2) {
            Partido partido = new Partido(jugadoresAleatorios.get(i), jugadoresAleatorios.get(i + 1));
            partidos.add(partido);
        }
    }
    private boolean esPotenciaDe2(int n) {
        if (n == 0) {
            return false;
        }
        while (n != 1) {
            if (n % 2 != 0) {
                return false;
            }
            n /= 2;
        }
        return true;
    }
    private int getMayorPuntuacion() {
        int mayorPuntuacion = Integer.MIN_VALUE;
        for (Jugador jugador : jugadores) {
            int puntuacion = jugador.getPuntuacion();
            if (puntuacion > mayorPuntuacion) {
                mayorPuntuacion = puntuacion;
            }
        }
        return mayorPuntuacion;
    }

    private int getMenorPuntuacion() {
        int menorPuntuacion = Integer.MAX_VALUE;
        for (Jugador jugador : jugadores) {
            int puntuacion = jugador.getPuntuacion();
            if (puntuacion < menorPuntuacion) {
                menorPuntuacion = puntuacion;
            }
        }
        return menorPuntuacion;
    }
    private void actualizarJugadores() {
        for (Partido partido : partidos) {
            if (partido.getGanador() == null) {
                continue;
            }
            Jugador ganador = partido.getGanador();
            Jugador perdedor = partido.getPerdedor();
            jugadores.remove(perdedor);
            ganador.getPuntuacion();
            jugadores.add(ganador);
        }
    }

    public void jugarRonda() throws TorneoException {
        if (partidos.size() == 0) {
            throw new TorneoException("No se ha formado la ronda");
        }
        for (Partido partido : partidos) {
            partido.jugar();
        }
        actualizarJugadores();
        partidos.clear();
    }

    public void formarRonda() throws TorneoException {
        if (partidos.size() != 0) {
            throw new TorneoException("Todavía no se ha jugado la ronda actual");
        }
        List<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        Collections.sort(jugadoresOrdenados);
        for (int i = 0; i < jugadoresOrdenados.size() / 2; i++) {
            Partido partido = new Partido(jugadoresOrdenados.get(i), jugadoresOrdenados.get(jugadoresOrdenados.size() - i - 1));
            partidos.add(partido);
        }
    }

    public String enCompeticion() {
        List<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        Collections.sort(jugadoresOrdenados);
        StringBuilder sb = new StringBuilder();
        for (Jugador jugador : jugadoresOrdenados) {
            sb.append(jugador.getNombre()).append("\n");
        }
        return sb.toString();
    }

    public String partidos() {
        if (partidos.size() == 0) {
            return "No hay partidos por jugar";
        }
        StringBuilder sb = new StringBuilder();
        for (Partido partido : partidos) {
            sb.append(partido).append("\n");
        }
        return sb.toString();
    }

    public boolean rondaJugada() {
        return jugadores.size() == partidos.size();
    }

    public boolean torneoFinalizado() {
        return finalizado;
    }

    public Jugador vencedor() throws TorneoException {
    	if (!finalizado) {
    	throw new TorneoException("El torneo no ha finalizado aún");
    	}
    	if (jugadores.size() != 1) {
    	throw new TorneoException("No se puede determinar el vencedor del torneo");
    	}
    	finalizado = true;
    	return jugadores.iterator().next();
    	}
}