
package sendadelalquimista;

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
        Jugador alquimista = new Jugador(100, 10, 100, 100, "Cazador", true);
        Enemigo[] aEnemigo = new Enemigo[5];
        enemigo(aEnemigo);
        
        
        
     

    }

    /**
     * Un metodo que genera los enemigos que apareceran en el juego creado aqui
     * para una mayor limpieza del programa
     *
     * @param aEnemigo El objeto que se desea crear, en este caso los enemigos.
     * @return Devuelve el array con los objetos enemigo ya creados.
     */
    private static Enemigo[] enemigo(Enemigo[] aEnemigo) {
        aEnemigo[0] = new Enemigo(100, 10, 10, 10, "Goblin", true);
        aEnemigo[1] = new Enemigo(100, 10, 10, 10, "Ogro", true);
        aEnemigo[2] = new Enemigo(100, 10, 10, 10, "Orco", true);
        aEnemigo[3] = new Enemigo(100, 10, 10, 10, "Explorador", true);
        aEnemigo[4] = new Enemigo(100, 10, 10, 10, "Esqueleto", true);
        return aEnemigo;
    }

}
