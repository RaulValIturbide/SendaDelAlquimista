/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sendadelalquimista;

/**
 * Crearemos distintas clases con distintos puntos de vida y ataque de base que
 * puedan portar diferentes tipos de items excluyentes entre si ej:un espadon
 * será propio de una clase y solo de esa clase excluyendo a las demás
 *
 * @author baske
 */
public class Jugador {

    private int vida;
    private Arma arma;
    private int ataque;
    private int mana;
    private int oro;
    private String nombre;
    private boolean vivo;

    public Jugador(int vida, Arma arma, int mana, int oro, String nombre, boolean vivo) {
        this.vida = vida;
        this.arma = arma;
        this.mana = mana;
        this.oro = oro;
        this.nombre = nombre;
        this.vivo = vivo;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }


    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getOro() {
        return oro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean getVivo() {
        return vivo;
    }

    //metodo que ejecuta la muerte del jugador
    public void matar() {
        this.vivo = false;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

  

}
