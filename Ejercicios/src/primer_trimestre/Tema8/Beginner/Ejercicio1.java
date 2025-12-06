package primer_trimestre.Tema8.Beginner;

import primer_trimestre.Utilidades.Utils;

public class Ejercicio1 {
//    1º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
//    Debes mostrar el array en pantalla y obtener la suma, la media, el menor y el mayor de todos
//    los números que aparecen en el array.
    static void main(String[] args) {
    int[] arrayNumsAleat = new int[5];
    inicializarArray(arrayNumsAleat);
    }
    public static void inicializarArray(int[] array){
        int suma=0;
        int mayor=0;
        int menor=0;
        int numanterior=0;
        for (int i = 0; i < array.length; i++) {
            array[i]= Utils.numeroAleatorio(0, 100);
            System.out.println(array[i]);
            suma+=array[i];
            if (array[i] >numanterior){
                mayor=array[i];
            }
            if (array[i]<numanterior){
                menor=array[i];
            }
            numanterior=array[i];
        }
        int media = suma/ array.length;
        System.out.println("La suma de todos los números del array: "+suma);
        System.out.println("Media de los números: "+media);
        System.out.println("El número menor de todos es: "+menor);
        System.out.println("El número mayor de todos es: "+mayor);
    }
}
