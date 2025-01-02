
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
        arma(aArma);
        Jugador alquimista = new Jugador(100,aArma[0] , 100, 100, "Cazador", true);
        Enemigo[] aEnemigo = new Enemigo[5];
        enemigo(aEnemigo);
        
        
        encuentro.ronda (aEnemigo[0],alquimista);
        
        

                
        
        
  

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
    
    
    private static Arma[] arma(Arma[] aArma) {
        Random random = new Random();
        aArma[0] = new Arma("Espada", random.nextInt(12,22) );
        aArma[1] = new Arma("Porra", random.nextInt(2,12));
        aArma[2] = new Arma("Lanza_Pistola", random.nextInt(22,32));
        return aArma;
    }

}
