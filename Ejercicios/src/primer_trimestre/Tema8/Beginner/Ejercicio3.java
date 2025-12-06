package primer_trimestre.Tema8.Beginner;

import primer_trimestre.Utilidades.Utils;

public class Ejercicio3 {
//    3º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
//    Después de su inicialización debéis imprimir el array en orden inverso.

    static void main(String[] args) {
        int[] arrayNumsAleat = new int[15];
        inicializarArra(arrayNumsAleat);
        invertirArray(arrayNumsAleat);
}

    private static void invertirArray(int[] arrayNumsAleat) {
        int[] arrayInvertida=new int[arrayNumsAleat.length];
        System.out.print("Array invertida: ");
        for (int i = arrayNumsAleat.length-1; i > 0; i--) {
            arrayInvertida[i]=arrayNumsAleat[i];
            System.out.print(arrayInvertida[i]+ " ");
        }
    }

    private static void inicializarArra(int[] arrayNumsAleat) {
        System.out.print("Array sin invertir: ");
        for (int i = 1; i < arrayNumsAleat.length; i++) {
            arrayNumsAleat[i]= Utils.numeroAleatorio(0, 100);
            System.out.print(arrayNumsAleat[i] + " ");
        }
    }
}
