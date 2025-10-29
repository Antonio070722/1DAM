import Utilidades.Utils;

public class ArraysPruebas {
    static void main() {
        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.pedirNumeroAleatorio(1,10);//CREAR METODO EN UTILS PARA QUE DE UN NUMERO ALEATORIO ENTRE LOS NUMEROS QUE SE PONGAN AL LLAMAR AL METODO
        }
        Utils.mostrarArray(array);
        for (int i = 0; i < array.length; i++) {
            if (array[0] > array[1]){
                
            }

        }
    }


}
