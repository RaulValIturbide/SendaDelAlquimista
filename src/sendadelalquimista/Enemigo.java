package sendadelalquimista;

/**
 *
 * @author baske
 */
public class Enemigo {
    //Atributos de un enemigo
    private int vida;
    private int ataque;
    private int mana;
    private int oro;
    private String nombre;
    private boolean vivo;
    private boolean accion;
    
    private static int contadorEnemigo;

    public Enemigo(int vida, int ataque, int mana, int oro, String nombre, boolean vivo, boolean accion) {
        this.vida = vida;
        this.ataque = ataque;
        this.mana = mana;
        this.oro = oro;
        this.nombre = nombre;
        this.vivo = vivo;
        this.accion = accion;
        contadorEnemigo++;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public void muerte() {
        this.vivo = false;
    }

    public boolean getAccion() {
        return accion;
    }
    public void setAccion(boolean accion){
        this.accion = accion;
    }
     public void regenerarAccionEnemigo(){
        accion = true;
    }
    
}
