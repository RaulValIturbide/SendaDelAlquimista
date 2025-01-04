package sendadelalquimista;

/**
 *
 * @author baske
 */
public class Arma {

    private String nombre;
    private int ataque;

    public Arma(String nombre, int ataque) {
        this.ataque = ataque;
        this.nombre = nombre;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;

    }

    public int getAtaque() {
        return ataque;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
