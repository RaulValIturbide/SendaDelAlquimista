package sendadelalquimista;

public class Alquimia {

    private String nombre;
    private int addAtaque;
    private boolean enPosesion; //True si se posee y por lo tanto puede usarse
    private boolean usado;//True si se ha usado y por lo tanto, no se puede volver a usar

    public Alquimia(String nombre, int addAtaque, boolean enPosesion, boolean usado) {
        this.nombre = nombre;
        this.addAtaque = addAtaque;
        this.enPosesion = enPosesion;
        this.usado = usado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAddAtaque(int addAtaque) {
        this.addAtaque = addAtaque;
    }

    public void setEnPosesion(boolean enPosesion) {
        this.enPosesion = enPosesion;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAddAtaque() {
        return addAtaque;
    }

    public boolean getEnPosesion() {
        return enPosesion;
    }

    public boolean getUsado() {
        return usado;
    }
    public boolean usarPocion() {
        return this.usado = true;
    }
    public static int pocionesDisponibles(Alquimia[] aAlquimia) {
        int contador = 1;
        for (int i = 0; i < aAlquimia.length; i++) {
            if (aAlquimia[i].getEnPosesion()) {
                System.out.println(contador + "-" + aAlquimia[i].getNombre());
                
            }else{System.out.println(contador + "-??? ?????");}
            contador++;

        }
        return contador;
    }



}
