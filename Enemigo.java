/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sendadelalquimista;

/**
 *
 * @author baske
 */
public class Enemigo {
    private int vida;
    private int mana;
    private String nombre;
    private boolean vivo;
    
    public Enemigo(int vida, int mana , String nombre, boolean vivo){
        this.vida =vida;
        this.mana = mana;
        this.nombre = nombre;
        this.vivo = vivo;
    }
    
    public int getVida(){
        return vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public int getMana(){
        return mana;
    }
    public void setMana(int mana){
        this.mana = mana;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public boolean getVivo(){
        return vivo;
    }
    public void setVivo(boolean vivo){
        this.vivo = vivo;
    }
}
