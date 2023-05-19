import java.util.TreeSet;

public class TestTenis {

	public static int calculaNumRondas(int numJug) {
		int num = 0;
		while (numJug > 1) {
			num++;
			numJug /= 2;
		}
		return num;
	}

	public static void main(String[] args) {
		Torneo miTorneo;
		TorneoATP miTorneoATP;
		TreeSet<Jugador> participantes = new TreeSet<>();
		boolean primeraRonda = true;
		try {
			// TORNEO
			Jugador j1 = new Jugador("Novak Djokovic", 7160);
			Jugador j2 = new Jugador("Carlos Alcaraz", 6780);
			Jugador j3 = new Jugador("Stefanos Tsitsipas", 5770);
			Jugador j4 = new Jugador("Casper Ruud", 5255);
			Jugador j5 = new Jugador("Daniil Medvedev", 5150);
			Jugador j6 = new Jugador("Andrey Rublev", 3470);
			Jugador j7 = new Jugador("Felix Auger-Aliassime", 3450);
			Jugador j8 = new Jugador("Jannik Sinner", 3345);
			Jugador j9 = new Jugador("Holger Rune", 3335);
			Jugador j10 = new Jugador("Taylor Fritz", 3065);
			Jugador j11 = new Jugador("Frances Tiafoe", 2870);
			Jugador j12 = new Jugador("Karen Khachanov", 2855);
			Jugador j13 = new Jugador("Hubert Hurkacz", 2750);
			Jugador j14 = new Jugador("Cameron Norrie", 2735);
			Jugador j15 = new Jugador("Rafael Nadal", 2715);
			Jugador j16 = new Jugador("Alexander Zverev", 2410);
			participantes.add(j1);
			participantes.add(j2);
			participantes.add(j3);
			participantes.add(j4);
			participantes.add(j5);
			participantes.add(j6);
			participantes.add(j7);
			participantes.add(j8);
			participantes.add(j9);
			participantes.add(j10);
			participantes.add(j11);
			participantes.add(j12);
			participantes.add(j13);
			participantes.add(j14);
			participantes.add(j15);
			participantes.add(j16);
			int numRondas = calculaNumRondas(participantes.size());
			miTorneo = new Torneo(participantes);
			System.out.println("TORNEO DE TENIS INTERNACIONAL");
			System.out.println("=============================");
			System.out.println(miTorneo);
			while (numRondas > 0) {
				if (primeraRonda) {
					miTorneo.formarPrimeraRonda();
					primeraRonda = false;
					System.out.println("JUGADORES EN COMPETICION\n" + miTorneo.enCompeticion());
				} else
					miTorneo.formarRonda();
				System.out.println(((numRondas > 1) ? "PARTIDOS\n" : "FINAL\n") + miTorneo.partidos());
				miTorneo.jugarRonda();
				System.out.println(
						"RESULTADO DE" + ((numRondas > 1) ? " LOS PARTIDOS\n" : " LA FINAL\n") + miTorneo.partidos());
				System.out.println(((numRondas > 1) ? "SIGUEN EN COMPETICION:\n" + miTorneo.enCompeticion()
						: "CAMPEON: \n" + miTorneo.enCompeticion().toUpperCase()));
				numRondas--;
			}

			// TORNEO ATP
			participantes.add(j1);
			participantes.add(j2);
			participantes.add(j3);
			participantes.add(j4);
			participantes.add(j5);
			participantes.add(j6);
			participantes.add(j7);
			participantes.add(j8);
			participantes.add(j9);
			participantes.add(j10);
			participantes.add(j11);
			participantes.add(j12);
			participantes.add(j13);
			participantes.add(j14);
			participantes.add(j15);
			participantes.add(j16);
			numRondas = calculaNumRondas(participantes.size());
			primeraRonda = true;
			miTorneoATP = new TorneoATP(participantes);
			System.out.println();
			System.out.println("TORNEO DE TENIS ATP");
			System.out.println("===================");
			System.out.println(miTorneoATP);
			while (numRondas > 0) {
				if (primeraRonda) {
					miTorneoATP.formarPrimeraRonda();
					primeraRonda = false;
					System.out.println("JUGADORES EN COMPETICION\n" + miTorneoATP.enCompeticion());
				} else
					miTorneoATP.formarRonda();
				System.out.println(((numRondas > 1) ? "PARTIDOS\n" : "FINAL\n") + miTorneoATP.partidos());
				miTorneoATP.jugarRonda();
				System.out.println("RESULTADO DE" + ((numRondas > 1) ? " LOS PARTIDOS\n" : " LA FINAL\n")
						+ miTorneoATP.partidos());
				System.out.println(((numRondas > 1) ? "SIGUEN EN COMPETICION:\n" + miTorneoATP.enCompeticion()
						: "CAMPEON ATP: \n" + miTorneoATP.enCompeticion().toUpperCase()));
				numRondas--;
			}
		} catch (TorneoException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
