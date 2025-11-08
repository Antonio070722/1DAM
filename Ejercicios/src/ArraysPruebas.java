import Utilidades.Utils;

public class ArraysPruebas {
    static void main() {
        //primermetodoarray();
//        int numeroaevaluar = Utils.pedirNumeroUsuario("Introduce el numero de cuatro cifras para evaluar");
//        palindromoarray(numeroaevaluar);
    }
    public static void primermetodoarray(){
        int array[] = new int[10];
        int arrayOrdenado[] = new int[array.length];
        boolean estaOrdenado=true;
        for (int i = 0; i < array.length; i++) {
            array[i] = Utils.pedirNumeroAleatorio(1,10);
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
            for (int i = 0; i < array.length; i++) {
                if(array[i] > array[i+1]){
                    estaOrdenado = false;
                    break;
                }else estaOrdenado=true;
            }
        }
        System.out.println("El array ordenado");
        Utils.mostrarArray(array);
    }

    private static void palindromoarray(int numeroAEvaluar) {
        int numeroCifras = 4;
        int []arraysCifras = new int[numeroCifras];

        for (int i = 0; i < numeroCifras; i++) {
            arraysCifras[i] = numeroAEvaluar/(int) Math.pow(10, numeroCifras-i-1);
            numeroAEvaluar = numeroAEvaluar-arraysCifras[i]*(int)Math.pow(10, numeroCifras-i-1);
            System.out.println("Array["+i+"] = "+arraysCifras[i] + " nuevo número a evaluar " + numeroAEvaluar);
        }
        for (int i = 0; i < numeroCifras; i++) {
            if (arraysCifras[0]==arraysCifras[3]&&arraysCifras[1]==arraysCifras[2]){
                System.out.println("Es palíndromo");
            } else System.out.println("No es palíndromo");
        }
    }
}
