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
     * @param atacante será 1 para cuando ataque el jugador y 2 para cuando lo
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
                ataque = enemigo.getArma().getAtaque();
                jugador.setVida(jugador.getVida() - ataque);
                if (jugador.getVida() <= 0) {
                    jugador.muerte();
                }
                break;

        }
    }

    /**
     * Metodo que efectua la decision del jugador entre Ataque/Habilidad
     *
     * @param usuario el numero que el jugador elegirá
     * @param jugador el propio jugador
     * @param enemigo el enemigo al que se esta enfrentando
     * @param aAlquimia el array de alquimia donde se encuentran todos los
     * objetos
     * @param accion La capacidad del jugador/enemigo para seguir realizando
     * acciones en su turno(true = puede, false = cambio de turno)
     */
    public void ejecucionJugador(int usuario, Jugador jugador, Enemigo enemigo, Alquimia[] aAlquimia, boolean accion) {
        switch (usuario) {

            case 1:
                System.out.println("El ataque de " + jugador.getNombre() + "es de:" + jugador.getArma().getAtaque());
                System.out.println("La vida de " + enemigo.getNombre() + " es de " + enemigo.getVida());
                ataque(enemigo, jugador, 1);
                System.out.println("El ataque de " + jugador.getNombre() + " deja a " + enemigo.getNombre() + " a " + enemigo.getVida());
                accion = jugador.terminarAccion();
                break;
            case 2:
                System.out.println("Que alquímia deseas crear?:");
                int maxPocion = Alquimia.pocionesDisponibles(aAlquimia);//Listado de alquimias disponibles y ocultas
                
                
                
                int eleccion = Menu.eleccionJugador(1, maxPocion)-1;
                if (!aAlquimia[eleccion].getEnPosesion()){
                    System.out.println("Desconoces la creación de esa alquímia");
                }else if (aAlquimia[eleccion].getUsado()) {
                    System.out.println("Ya has usado esta alquímia");
                } else {
                    System.out.println("Alquimia " + aAlquimia[eleccion].getNombre() + " se está usando");
                    jugador.getArma().setAtaque(jugador.getArma().getAtaque() + aAlquimia[eleccion].getAddAtaque());
                    aAlquimia[eleccion].usarPocion();
                    System.out.println("El ataque del arma es ahora de: " + jugador.getArma().getAtaque());
                }

                break;

        }
    }

    public void ejecucionIa(Jugador jugador, Enemigo enemigo) {
        System.out.println("El ataque de " + enemigo.getNombre() + " es de:" + enemigo.getArma().getAtaque());
        System.out.println("La vida de " + jugador.getNombre() + " es de " + jugador.getVida());
        ataque(enemigo, jugador, 2);
        System.out.println("El ataque de " + enemigo.getNombre() + " deja a " + jugador.getNombre() + " a " + jugador.getVida());

    }

    /**
     * El bucle que deberá ejecutarse en cada combate hasta que el jugador o el
     * enemigo quede a >=0 de vida
     *
     * @param enemigo El enemigo al que se esta enfrentando el jugador
     * @param jugador El propio jugador
     */
    public void ronda(Enemigo enemigo, Jugador jugador, Alquimia[] alquimia) {
        Menu.comienzoDeRonda(enemigo, jugador);
        do {
            if (jugador.getVelocidad() > enemigo.getVelocidad()) {
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
            } else {
                
                ejecucionIa(jugador, enemigo);
                enemigo.regenerarAccionEnemigo();
                Menu.lineaEnBlanco();
                Menu.continuarCombate();
                Menu.eleccionSkill();

                ejecucionJugador(Menu.eleccionJugador(1, 2), jugador, enemigo, alquimia, jugador.getAccion());

            }
        } while (enemigo.getVivo() && jugador.getVivo());

    }



}
