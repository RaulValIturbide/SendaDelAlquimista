/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sendadelalquimista;
import java.util.Scanner;
/**
 *
 * @author baske
 */
public class Menu {
    static Scanner teclado = new Scanner(System.in);
    
    
    /**
     * Metodo para dar comienzo a la ronda estableciendo atacantes
     * @param enemigo el objeto enemigo al que se está enfrentando el jugador
     * @param jugador el propio jugador
     */
    public static void comienzoDeRonda(Enemigo enemigo, Jugador jugador){
        System.out.println("Comienza la ronda, " + jugador.getNombre() + " se enfrenta a " + enemigo.getNombre() );
        System.out.println(jugador.getNombre() + " ataca primero");
    }
    
    /**
     * Un simple void que le pide al jugador elegir 1 o 2
     */
    public static void eleccionSkill(){
        System.out.format("""
                          1-Atacar
                          2-Alquimia
                          """);
    
    }
    
    
    
    /**
     *
     * @return  Metodo que devuelve el int que de el usuario
     */
    public static int eleccionJugador(int menor, int mayor) {
        int variable;
        do {
            variable = teclado.nextInt();
            if (variable < menor || variable > mayor) {
                System.out.println("Elige uno de los numeros posibles");
            }
        } while (variable < menor || variable > mayor);

        return variable;

    }
    
}
