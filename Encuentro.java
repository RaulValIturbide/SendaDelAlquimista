/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sendadelalquimista;

/**
 *
 * @author baske
 */
public class Encuentro {

    private Enemigo enemigo;
    private Jugador jugador;
    private boolean finEncuentro;

    public Encuentro(Enemigo enemigo, Jugador jugador, boolean finEncuentro) {
        this.enemigo = enemigo;
        this.jugador = jugador;
        this.finEncuentro = finEncuentro;
    }

}

