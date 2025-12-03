package Repaso_Examenes.Arrays;

import java.util.Random;

public class AnotherTry {
    /**
     * Inicializa un array de 10 elementos con
     * valores enteros al azar entre 0 y 20. A continuación realiza todas las sumas posibles entre dos elementos e
     * imprime en la consola el array, la suma máxima y los dos elementos que has sumado. Recuerda que para sumar
     * todas las parejas de elementos posibles puedes usar un bucle que visite todos los elementos del array, una vez
     * que estés visitando cada elemento puedes lanzar dos bucles más: uno que visite los elementos anteriores y otro
     * que visite los elementos posteriores a aquel en el que te encuentras.
     */

    static void main(String[] args) {
        int[] arrayExam = new int[10];
        inicializarArray(arrayExam);
        sumasArray(arrayExam);
    }

    private static void sumasArray(int[] arrayExam) {
        int sumaMaxima=0;
        int valor1=0;
        int valor2=0;
        int suma=0;
        for (int i = 0; i < arrayExam.length; i++) {
            for (int j = i+1; j < arrayExam.length; j++) {
                suma=arrayExam[i]+arrayExam[j];
                if (suma>sumaMaxima){
                    sumaMaxima=suma;
                    valor1=arrayExam[i];
                    valor2=arrayExam[j];
                }
            }
        }
        System.out.println("La suma máxima es "+sumaMaxima+" entre el número "+valor1+" y "+valor2);
    }

    private static void inicializarArray(int[] array) {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=rd.nextInt(21);
            System.out.println(array[i]);
        }
    }
}
