package Tema8.Beginner;

import Utilidades.Utils;

public class Ejercicio4 {
    /**
     * 4º.- Realiza un ejercicio que inicialice un array de 150 elementos enteros al azar entre 0 y 100.
     * A continuación pedirás al usuario un valor y buscarás dicho valor en el array. Si lo encuentras,
     * debes indicar al usuario la posición del array en que se encuentra. En caso de que no
     * encuentres el valor buscado, debes indicárselo también al usuario.
     */
    static void main(String[] args) {
        int[] busca = new int[150];
        iniciararray(busca);
        buscarnum(busca);
    }

    private static void buscarnum(int[] busca) {
        int numBuscar=Utils.pedirNumeroUsuario("Introduce el número a buscar");
        boolean encotrado=false;
        int posicion=0;
        for (int i = 0; i < busca.length; i++) {
            if (busca[i] == numBuscar){
                posicion=i;
                encotrado=true;
                break;
            }
        }
        if (encotrado){
            System.out.println("El número ha sido encontrado en la posición: "+posicion);
        }else{
            System.out.println("El número no ha sido encontrado");
        }
    }

    public static void iniciararray(int[] busca) {
        for (int i = 1; i < busca.length; i++) {
            busca[i]= Utils.numeroAleatorio(0, 100);
        }
    }

}
