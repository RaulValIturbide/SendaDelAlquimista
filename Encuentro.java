package sendadelalquimista;

/**
 *
 * @author baske
 */
public class Encuentro {

    private Enemigo enemigo;
    private Jugador jugador;
    private Menu menu;
    private Alquimia[] alquimia;
    private boolean finEncuentro;

    /**
     * Metodo para ejecutar un ataque
     *
     * @param enemigo el enemigo al que se enfrenta el jugador
     * @param jugador el propio jugador
     */
    public void ataque(Enemigo enemigo, Jugador jugador) {
        int ataque = jugador.getArma().getAtaque();
        enemigo.setVida(enemigo.getVida() - ataque);

    }

    /**
     * Metodo que efectua la decision del jugador entre Ataque/Habilidad
     *
     * @param usuario el numero que el jugador elegirá
     * @param jugador el propio jugador
     * @param enemigo el enemigo al que se esta enfrentando
     */
    public void ejecucionJugador(int usuario, Jugador jugador, Enemigo enemigo, Alquimia[] alquimia) {
        switch (usuario) {

            case 1:
                System.out.println("El ataque de " + jugador.getNombre() + "es de:" + jugador.getArma().getAtaque());
                System.out.println("La vida de " + enemigo.getNombre() + " es de " + enemigo.getVida());
                ataque(enemigo, jugador);
                System.out.println("El ataque de " + jugador.getNombre() + " deja a " + enemigo.getNombre() + " a " + enemigo.getVida());
                break;
            case 2:
                System.out.println("Que pocion deseas crear?:\n1-Verisaterum\n2-Forte");
                int eleccion = Menu.eleccionJugador(1, 2);
                switch (eleccion) {
                    case 1:
                        if (alquimia[eleccion - 1].getUsado()) {
                            System.out.println("Ya has usado esta poción");
                        } else {
                            System.out.println("Pocion " + alquimia[eleccion - 1].getNombre() + " se está usando");
                            jugador.getArma().setAtaque(jugador.getArma().getAtaque() + alquimia[eleccion - 1].getAddAtaque());
                            alquimia[eleccion - 1].usarPocion();
                            System.out.println("El ataque del arma es ahora de: " + jugador.getArma().getAtaque());
                        }
                        break;
                    case 2:
                        if (alquimia[eleccion - 1].getUsado()) {
                            System.out.println("Ya has usado esta poción");
                        } else {
                            System.out.println("Pocion " + alquimia[eleccion - 1].getNombre() + " se está usando");
                            jugador.getArma().setAtaque(jugador.getArma().getAtaque() + alquimia[eleccion - 1].getAddAtaque());
                            alquimia[eleccion - 1].usarPocion();
                            System.out.println("El ataque del arma es ahora de: " + jugador.getArma().getAtaque());
                        }
                        break;

                }

                break;

        }
    }

    /**
     * El bucle que deberá ejecutarse en cada combate hasta que el jugador o el enemigo quede a >=0 de vida
     *
     * @param enemigo El enemigo al que se esta enfrentando el jugador
     * @param jugador El propio jugador
     */
    public void ronda(Enemigo enemigo, Jugador jugador,Alquimia[] alquimia) {
        Menu.comienzoDeRonda(enemigo, jugador);
        do {
            Menu.eleccionSkill();
            ejecucionJugador(Menu.eleccionJugador(1, 2), jugador, enemigo,alquimia);
        } while (enemigo.getVida() > 0);

    }

}


    
    




