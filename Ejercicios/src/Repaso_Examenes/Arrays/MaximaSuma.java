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
        int suma = 0;
        int sumaMaxima = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < maximaSuma.length; i++) {
            for (int j = i+1; j < maximaSuma.length; j++) {
                suma = maximaSuma[i] + maximaSuma[j];
                if (suma > sumaMaxima){
                    sumaMaxima = suma;
                    a = maximaSuma[i];
                    b = maximaSuma[j];
                }
                System.out.println("Suma " + suma);
            }

        }
        System.out.println(" La suma de los dos elementos son " + a + " " + b + ". Y la suma máxima es: " + sumaMaxima);
    }

    private static void inicializarMaxSuma(int [] maximaSuma) {
        Random random = new Random();
        for (int i = 0; i < maximaSuma.length; i++) {
            maximaSuma[i] = random.nextInt(21);
            System.out.println(maximaSuma[i]);
        }
    }
}
