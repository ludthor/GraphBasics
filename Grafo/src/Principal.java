
public class Principal {

    public static void main(String[] args) {

        int tam = 5;

        //Creamos el grafo nuevo
        Grafo miGrafo = new Grafo(tam);

        //A�adimos personas de prueba
        for (int i = 0; i < tam; i++) {

            String nombre = "Persona" + i;
            String documento = "009900" + i;
            int edad = (int) Math.floor(Math.random() * 30 + 18);

            Persona p = new Persona(i, nombre, documento, edad);

            miGrafo.agregarNodo(p);

        }

        //Crear caminos
        miGrafo.agregarCamino(miGrafo.personas.get(0), miGrafo.personas.get(1));
        miGrafo.agregarCamino(miGrafo.personas.get(1), miGrafo.personas.get(2));
        miGrafo.agregarCamino(miGrafo.personas.get(1), miGrafo.personas.get(3));
        miGrafo.agregarCamino(miGrafo.personas.get(1), miGrafo.personas.get(4));
        miGrafo.agregarCamino(miGrafo.personas.get(4), miGrafo.personas.get(2));
        miGrafo.agregarCamino(miGrafo.personas.get(4), miGrafo.personas.get(3));

        miGrafo.imprimirLista();
        System.out.println("################################");
        miGrafo.imprimirMatrizAd();

        //Prueba de visita de los vecinos de un nodo
        miGrafo.visitarVecinos(miGrafo.personas.get(4));


    }

}
