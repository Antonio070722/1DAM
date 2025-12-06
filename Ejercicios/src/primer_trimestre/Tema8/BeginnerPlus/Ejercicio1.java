package primer_trimestre.Tema8.BeginnerPlus;

import primer_trimestre.Utilidades.Utils;

public class Ejercicio1 {
//    Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre -100 y
//100. Debes conseguir que todos los números pares del array cambien de signo, los positivos
//    deben pasar a negativos y viceversa. Debes realizar el ejercicio mediante un método que
//    admita el array como argumento y realice la acción pedida. Cabecera del método 'public static
//    void cambiaSignoEnValores(int array[])'

    static void main(String[] args) {
        int[] array = new int[15];
        inicializarla(array);
        cambiaSignoEnValores(array);
    }

    private static void cambiaSignoEnValores(int[] array) {
        int numAux=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0){
                System.out.println("Num antes del cambio de signo: "+array[i]);
                numAux=array[i];
                array[i]-=numAux;
                array[i]-=numAux;
                System.out.println("Num despues: "+array[i]);
            }else {
                System.out.println("Num antes del cambio de signo: "+array[i]);
                numAux=array[i];
                array[i]-=numAux;
                array[i]-=numAux;
                System.out.println("Num despues: "+array[i]);
            }
        }
    }

    private static void inicializarla(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]= Utils.pedirNumeroAleatorio(-100,100);
        }
    }

}
