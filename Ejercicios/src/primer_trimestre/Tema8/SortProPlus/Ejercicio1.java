package primer_trimestre.Tema8.SortProPlus;

import primer_trimestre.Utilidades.Utils;

public class Ejercicio1 {

    /**
     * 1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y
     * 1.000. Una vez que lo hayas conseguido debes realizar implementar el algoritmo de ordenación
     * llamado "Burbuja", con el objetivo de ordenar el array completamente. Puedes consultar el
     * siguiente enlace http://lwh.free.fr/pages/algo/tri/tri_bulle_es.html
     */

    public static void main(String[] args) {
        int tamano = 20; // número de elementos, puedes cambiarlo
        int[] datos = new int[tamano];

        // Llenar el array con valores aleatorios entre 0 y 1000
        for (int i = 0; i < datos.length; i++) {
            datos[i] = Utils.pedirNumeroAleatorio(0, 1000);
        }

        // Ordenar
        int[] ordenado = bubbleSort(datos);

        // Imprimir resultado
        for (int num : ordenado) {
            System.out.print(num + " ");
        }
    }

    public static int[] bubbleSort(int[] vector) {
        boolean permutation = true;
        int iteracion = 0;

        while (permutation) {
            permutation = false;
            iteracion++;

            for (int actual = 0; actual < vector.length - iteracion; actual++) {
                if (vector[actual] > vector[actual + 1]) {
                    // Intercambiamos los dos elementos
                    int temp = vector[actual];
                    vector[actual] = vector[actual + 1];
                    vector[actual + 1] = temp;

                    permutation = true;
                }
            }
        }
        return vector;
    }


}


