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
    private Alquimia[] aAlquimia;
    private int mana;
    private int oro;
    private String nombre;
    private boolean vivo;
    private boolean accion;//Ser� true cuando el jugador pueda seguir realizando acciones y false cuando pase a ser el turno enemigo

    public Jugador(int vida, Arma arma, Alquimia[] aAlquimia, int mana, int oro, String nombre, boolean vivo, boolean accion) {
        this.vida = vida;
        this.arma = arma;
        this.aAlquimia = aAlquimia;
        this.mana = mana;
        this.oro = oro;
        this.nombre = nombre;
        this.vivo = vivo;
        this.accion = accion;
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



    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public Alquimia[] getaAlquimia() {
        return aAlquimia;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setaAlquimia(Alquimia[] aAlquimia) {
        this.aAlquimia = aAlquimia;
    }

    public boolean getAccion() {
        return accion;
    }

    public void setAccion(boolean accion) {
        this.accion = accion;
    }
    //metodo que ejecuta la muerte del jugador

    public void muerte() {
        this.vivo = false;
    }
    //Este metodo determina la accion a false, haciendo que se deba acabar el turno
    public boolean terminarAccion() {
        accion = false;
        return accion;
    }
    //Vuelve a colocar la accion en true
    public void regenerarAccionJugador(){
        accion = true;
    }



}
