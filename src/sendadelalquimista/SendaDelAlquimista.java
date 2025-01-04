package sendadelalquimista;

import java.util.Random;

/**
 * El objetivo del juego es crear un mapa general donde el jugador vaya
 * recorriendo su propio camino con diferentes tipos de encuentros aleatorios
 * hasta llegar al final consiguiendo diferentes objetos y mejoras por el camino
 *
 * @author baske
 */
public class SendaDelAlquimista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Encuentro encuentro = new Encuentro();
        Arma[] aArma = new Arma[3];
        Enemigo[] aEnemigo = new Enemigo[5];
        Alquimia[] aAlquimia = new Alquimia[2];
        arma(aArma);
        enemigo(aEnemigo);
        alquimia(aAlquimia);
        Jugador alquimista = new Jugador(100, aArma[0], aAlquimia, 100, 100, "Cazador", true,true);

        encuentro.ronda(aEnemigo[0], alquimista, aAlquimia);

    }

    /**
     * Un metodo que genera los enemigos que apareceran en el juego creado aqui
     * para una mayor limpieza del programa
     *
     * @param aEnemigo El objeto que se desea crear, en este caso los enemigos.
     * @return Devuelve el array con los objetos enemigo ya creados.
     */
    private static Enemigo[] enemigo(Enemigo[] aEnemigo) {
        aEnemigo[0] = new Enemigo(100, 10, 10, 10, "Goblin", true,true);
        aEnemigo[1] = new Enemigo(100, 10, 10, 10, "Ogro", true,true);
        aEnemigo[2] = new Enemigo(100, 10, 10, 10, "Orco", true,true);
        aEnemigo[3] = new Enemigo(100, 10, 10, 10, "Explorador", true,true);
        aEnemigo[4] = new Enemigo(100, 10, 10, 10, "Esqueleto", true,true);
        return aEnemigo;
    }

    /**
     * Metodo para inicializar todas las Armas del juego
     *
     * @param aArma
     * @return
     */
    private static Arma[] arma(Arma[] aArma) {
        Random random = new Random();
        aArma[0] = new Arma("Espada", 50);
        aArma[1] = new Arma("Porra", 20);
        aArma[2] = new Arma("Lanza_Pistola", 60);
        return aArma;
    }
     /**
     * Metodo para crear las pociones de alquimia
     *
     * @param aAlquimia
     * @return
     */
    public static Alquimia[] alquimia(Alquimia[] aAlquimia) {
        aAlquimia[0] = new Alquimia("Verisaterum", 10,true,false);
        aAlquimia[1] = new Alquimia("Forte", 24,false,false);
        return aAlquimia;
    }
 



}
