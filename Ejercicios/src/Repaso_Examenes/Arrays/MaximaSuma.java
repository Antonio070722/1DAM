package Repaso_Examenes.Arrays;

import java.util.Random;

public class MaximaSuma {
    /**
     * Inicializa un array de 10 elementos con
     * valores enteros al azar entre 0 y 20. A continuación realiza todas las sumas posibles entre dos elementos e
     * imprime en la consola el array, la suma máxima y los dos elementos que has sumado. Recuerda que para sumar
     * todas las parejas de elementos posibles puedes usar un bucle que visite todos los elementos del array, una vez
     * que estés visitando cada elemento puedes lanzar dos bucles más: uno que visite los elementos anteriores y otro
     * que visite los elementos posteriores a aquel en el que te encuentras.
     */
    static void main(String[] args) {
        int[] maximaSuma = new int[10];
        inicializarMaxSuma(maximaSuma);
        sumaEntreNums(maximaSuma);
    }

    private static void sumaEntreNums(int[] maximaSuma) {
        for (int i = 1; i < maximaSuma.length; i++) {
            for (int j = 0; j < maximaSuma.length; j++) {
                int suma = maximaSuma[i] + maximaSuma[j];
                System.out.println(suma);
            }
            for (int j = 2; j < maximaSuma.length; j++) {

            }
        }
    }

    private static void inicializarMaxSuma(int [] maximaSuma) {
        Random random = new Random();
        for (int i = 0; i < maximaSuma.length; i++) {
            maximaSuma[i] = random.nextInt(21);
        }
    }
}
