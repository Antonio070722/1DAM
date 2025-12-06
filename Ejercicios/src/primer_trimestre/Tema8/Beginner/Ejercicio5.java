package primer_trimestre.Tema8.Beginner;

import static primer_trimestre.Tema8.Beginner.Ejercicio4.iniciararray;

public class Ejercicio5 {
    /**
     * 5º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
     * Debes obtener la suma de los números pares y los impares en variables separadas.
     */
    static void main(String[] args) {
        int[] array=new int[15];
        iniciararray(array);
        sumaParesImparesArray(array);
    }

    private static void sumaParesImparesArray(int[] array) {
        int pares=0;
        int impares=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]/2==0){
                pares+=array[i];
            } if(array[i]/2!=0) {
                impares+=array[i];
            }
        }
        System.out.println("Suma pares: "+pares);
        System.out.println("Suma impares: "+impares);
    }

}
