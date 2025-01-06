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
    /**
     * Un metodo para dar la información de cada una de las pociones si es que se conocen y si no
     * aparecerás ocultas tras interrogantes
     * @param alquimia la alquimia especifica, es decir, un objeto alquimia concreto
     * @param contador sistema para crear una numeración de las alquimias existentes
     */
    public static void infoAlquimia(Alquimia alquimia, int contador) {

        if (alquimia.enPosesion) {
            System.out.format("""
                                  %d
                                  Nombre:%s
                                  Habilidad:Aumenta el daño del arma en %d puntos más
                                  """, contador, alquimia.getNombre(), alquimia.getAddAtaque());
            System.out.println("");
        } else {
            System.out.format("""
                                  %d 
                                  Nombre:??? ?????
                                  Habilidad:??? ???? ???
                                  """, contador);
            System.out.println("");
        }

    }
    /**
     * Un libro para implementar cuando el jugador se encuentre fuera del combate que le permita ver las alquimias
     * que conoce y las que no
     * @param alquimia el array con las alquimias creadas
     */
    public static void libroDeAlquimia(Alquimia[] alquimia) {
        for (int i = 0; i < alquimia.length; i++) {
            infoAlquimia(alquimia[i],i+1);

        }

    }



}
