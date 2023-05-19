import java.util.*;

public class TorneoATP extends Torneo {
    
    public TorneoATP(Set<Jugador> jugadores) throws TorneoException {
        super(jugadores);
    }
    
    @Override
    public void formarPrimeraRonda() throws TorneoException {
        if (partidos.size() != 0) {
            throw new TorneoException("Ya se ha empezado el torneo");
        }
        List<Jugador> jugadoresOrdenados = new ArrayList<>(jugadores);
        Collections.sort(jugadoresOrdenados);
        int mitadJugadores = jugadoresOrdenados.size() / 2;
        for (int i = 0; i < mitadJugadores; i++) {
            Partido partido = new Partido(jugadoresOrdenados.get(i), jugadoresOrdenados.get(jugadoresOrdenados.size() - i - 1));
            partidos.add(partido);
        }
    }
}