package primer_trimestre.Tema8.Beginner;

import primer_trimestre.Utilidades.Utils;

public class Ejercicio2 {
//    2º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre un límite
//    inferior y uno superior que debe especificar el usuario. Debes mostrar el array en pantalla para
//    comprobar el funcionamiento
    static void main(String[] args) {
        int minimo= Utils.pedirNumeroUsuario("Pasate el límite mínimo: ");
        int maximo=Utils.pedirNumeroUsuario("Y el maximo: ");
        int[] arraynums = new int[15];
        inicializaryejecutar(minimo, maximo, arraynums);
    }

    private static void inicializaryejecutar(int minimo, int maximo, int[] arraynums) {
        for (int i = 0; i < arraynums.length; i++) {
            arraynums[i]=Utils.pedirNumeroAleatorio(minimo, maximo);
            System.out.println(arraynums[i]);
        }
    }
}
