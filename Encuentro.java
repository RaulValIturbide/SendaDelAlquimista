
package sendadelalquimista;

/**
 *
 * @author baske
 */
public class Encuentro {

    private Enemigo enemigo;
    private Jugador jugador;
    private Menu menu;
    private boolean finEncuentro;
    
    /**
     * Metodo para ejecutar un ataque
     * @param enemigo el enemigo al que se enfrenta el jugador
     * @param jugador el propio jugador
     */
    public void ataque(Enemigo enemigo, Jugador jugador){
        enemigo.setVida(enemigo.getVida()- jugador.getArma().getAtaque());
        
    }
    
    /**
     * Metodo que efectua la decision del jugador entre Ataque/Habilidad
     * @param usuario el numero que el jugador elegirá
     * @param jugador el propio jugador
     * @param enemigo el enemigo al que se esta enfrentando
     */
    public void ejecucionJugador(int usuario,Jugador jugador, Enemigo enemigo) {
        switch (usuario) {

            case 1:
                System.out.println("El ataque de " + jugador.getNombre() + "es de:" + jugador.getArma().getAtaque());
                System.out.println("La vida de " + enemigo.getNombre() + " es de " + enemigo.getVida());
                ataque(enemigo, jugador);
                System.out.println("El ataque de " + jugador.getNombre() + " deja a " + enemigo.getNombre() + " a " + enemigo.getVida());
                break;
            case 2:
                System.out.println("Aun no dispones de habilidades");
                break;

        }
    }
    
    
    /**
     * El bucle que deberá ejecutarse
     * @param enemigo El enemigo al que se esta enfrentando el jugador
     * @param jugador  El propio jugador
     */
    public void ronda (Enemigo enemigo,Jugador jugador){     
        Menu.comienzoDeRonda(enemigo, jugador);
        do{
        Menu.eleccionSkill();
        ejecucionJugador(Menu.eleccionJugador(),jugador,enemigo);
        }while(enemigo.getVida()>0);
         
    }

  
    
    


}

