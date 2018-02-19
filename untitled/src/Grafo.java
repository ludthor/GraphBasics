import java.util.ArrayList;

public class Grafo {

    private final int VACIO = 0;
    private final int DIAGONAL = -1;
    private final int CONEXION = 1;
    public ArrayList<Persona> personas;
    private int tam;
    private int[][] matrizAd;

    public Grafo(int tam) {

        this.tam = tam;
        personas = new ArrayList<Persona>();
        matrizAd = new int[tam][tam];

        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {

                matrizAd[i][j] = VACIO;

            }
        }

    }

    public void agregarNodo(Persona p) {

        //Añadir a la lista de nodos
        personas.add(p);

        //Modificar la diagonal
        int indice = personas.indexOf(p);
        matrizAd[indice][indice] = DIAGONAL;

    }

    public void borrarNodo(Persona p) {

        int indice = personas.indexOf(p);

        //Borrar de la lista
        personas.remove(p);

        //Borrar de la matriz
        for (int i = 0; i < this.tam; i++) {
            matrizAd[indice][i] = VACIO;
        }
        for (int j = 0; j < this.tam; j++) {
            matrizAd[j][indice] = VACIO;
        }

    }

    public void agregarCamino(Persona p1, Persona p2) {

        int iUno = personas.indexOf(p1);
        int iDos = personas.indexOf(p2);

        matrizAd[iUno][iDos] = CONEXION;
        matrizAd[iDos][iUno] = CONEXION;

    }

    public void eliminarCamino(Persona p1, Persona p2) {

        int iUno = personas.indexOf(p1);
        int iDos = personas.indexOf(p2);

        matrizAd[iUno][iDos] = VACIO;
        matrizAd[iDos][iUno] = VACIO;

    }

    public void visitarVecinos(Persona p1) {

        int indice = personas.indexOf(p1);

        for (int i = 0; i < tam; i++) {

            if (matrizAd[indice][i] == 1) {
                System.out.println(personas.get(i).toString());
            }

            System.out.println("______________");

        }
    }


    public void imprimirLista() {

        for (Persona p : personas) {

            System.out.println(p.toString());

        }

    }

    public void imprimirMatrizAd() {

        for (int i = 0; i < this.tam; i++) {
            for (int j = 0; j < this.tam; j++) {
                System.out.print('|');
                System.out.print(matrizAd[i][j]);
                System.out.print('|');
            }
            System.out.println("");
        }

    }

}
