package sendadelalquimista;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author baske
 */
public class Encuentro {

    Scanner teclado = new Scanner(System.in);
    Random random = new Random();
    private Enemigo enemigo;
    private Jugador jugador;
    private Menu menu;
    private Alquimia[] alquimia;
    private boolean finEncuentro;

    /**
     * Metodo para ejecutar un ataque
     *
     * @param atacante ser� 1 para cuando ataque el jugador y 2 para cuando lo
     * haga el enemigo
     * @param enemigo el enemigo al que se enfrenta el jugador
     * @param jugador el propio jugador
     */
    public void ataque(Enemigo enemigo, Jugador jugador, int atacante) {
        int ataque;
        switch (atacante) {
            case 1:
                ataque = jugador.getArma().getAtaque();
                enemigo.setVida(enemigo.getVida() - ataque);
                if (enemigo.getVida() <= 0) {
                    enemigo.muerte();
                }
                break;
            case 2:
                ataque = enemigo.getAtaque();
                jugador.setVida(jugador.getVida() - ataque);
                if (jugador.getVida()<=0){
                    jugador.muerte();
                }
                break;

        }
    }

    /**
     * Metodo que efectua la decision del jugador entre Ataque/Habilidad
     *
     * @param usuario el numero que el jugador elegir�
     * @param jugador el propio jugador
     * @param enemigo el enemigo al que se esta enfrentando
     */
    public void ejecucionJugador(int usuario, Jugador jugador, Enemigo enemigo, Alquimia[] alquimia, boolean accion) {
        switch (usuario) {

            case 1:
                System.out.println("El ataque de " + jugador.getNombre() + "es de:" + jugador.getArma().getAtaque());
                System.out.println("La vida de " + enemigo.getNombre() + " es de " + enemigo.getVida());
                ataque(enemigo, jugador, 1);
                System.out.println("El ataque de " + jugador.getNombre() + " deja a " + enemigo.getNombre() + " a " + enemigo.getVida());
                accion = jugador.terminarAccion();
                break;
            case 2:
                System.out.println("Que pocion deseas crear?:\n1-Verisaterum\n2-Forte");
                int eleccion = Menu.eleccionJugador(1, 2);

                if (alquimia[eleccion - 1].getUsado()) {
                    System.out.println("Ya has usado esta poci�n");
                } else {
                    System.out.println("Pocion " + alquimia[eleccion - 1].getNombre() + " se est� usando");
                    jugador.getArma().setAtaque(jugador.getArma().getAtaque() + alquimia[eleccion - 1].getAddAtaque());
                    alquimia[eleccion - 1].usarPocion();
                    System.out.println("El ataque del arma es ahora de: " + jugador.getArma().getAtaque());
                }

                break;

        }
    }

    public void ejecucionIa(Jugador jugador, Enemigo enemigo) {
        System.out.println("El ataque de " + enemigo.getNombre() + " es de:" + enemigo.getAtaque());
        System.out.println("La vida de " + jugador.getNombre() + " es de " + jugador.getVida());
        ataque(enemigo, jugador, 2);
        System.out.println("El ataque de " + enemigo.getNombre() + " deja a " + jugador.getNombre() + " a " + jugador.getVida());

    }

    /**
     * El bucle que deber� ejecutarse en cada combate hasta que el jugador o el
     * enemigo quede a >=0 de vida
     *
     * @param enemigo El enemigo al que se esta enfrentando el jugador
     * @param jugador El propio jugador
     */
    public void ronda(Enemigo enemigo, Jugador jugador, Alquimia[] alquimia) {
        Menu.comienzoDeRonda(enemigo, jugador);
        do {
            do {
                Menu.eleccionSkill();

                ejecucionJugador(Menu.eleccionJugador(1, 2), jugador, enemigo, alquimia, jugador.getAccion());
                Menu.lineaEnBlanco();
                Menu.continuarCombate();
            } while (jugador.getAccion() == true);
            jugador.regenerarAccionJugador();
            Menu.lineaEnBlanco();
            if (enemigo.getVivo()) {
                ejecucionIa(jugador, enemigo);
                enemigo.regenerarAccionEnemigo();
            }
        } while (enemigo.getVivo() && jugador.getVivo());

    }

}


