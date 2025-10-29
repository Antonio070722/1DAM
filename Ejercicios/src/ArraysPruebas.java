import Utilidades.Utils;

public class ArraysPruebas {
    static void main() {
        int array[] = new int[10];
        int arrayOrdenado[] = new int[array.length];
        boolean estaOrdenado=true;
        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.pedirNumeroAleatorio(1,10);//CREAR METODO EN UTILS PARA QUE DE UN NUMERO ALEATORIO ENTRE LOS NUMEROS QUE SE PONGAN AL LLAMAR AL METODO
        }

        Utils.mostrarArray(array);

        while (estaOrdenado) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i+1]) {
                    int aux = array[i];
                    array[i] = array[i+1];
                    array[i+1] = aux;
                    estaOrdenado = false;
                }
            }
        }
    }


}
