package Repaso_Examenes;

import Utilidades.Utils;

public class ARRAYS_loteria {
    static void main(String[] args) {
        int nElementos=6;
        int [] numeroSorteo = new int[nElementos];
        int [] numerosUsuario = new int[numeroSorteo.length];
        int contadorAciertos=0;

        inicializarNumeroSorteo(numeroSorteo);
        Utils.mostrarArray(numeroSorteo);
        pedirNumerosUsuario(numerosUsuario);
        Utils.mostrarArray(numerosUsuario);
        contadorAciertos= comprobarResultados(numerosUsuario, numeroSorteo);
        System.out.println("nº aciertos: "+contadorAciertos);
        calcularPremio(contadorAciertos);
    }

    private static void calcularPremio(int contadorAciertos) {
        switch (contadorAciertos){
            case 0:
                System.out.println("Nothing");
                break;
            case 1,2,3,4:
                System.out.println("Reintegro");
                break;
            case 5:
                System.out.println("80% del premio");
            case 6:
                System.out.println("El gordo");
        }
    }

    private static void pedirNumerosUsuario(int[] arrayUsuario) {
        int numeroUsuario = 0;
        for (int i = 0; i < arrayUsuario.length; i++) {
            //Inicializamos cada hueco del array con un número aleatorio del 1 al 100

            do {
                numeroUsuario = Utils.pedirNumeroUsuario("Dame el número de tu lotería: ");
            } while (estaRepetido(arrayUsuario, numeroUsuario));

            arrayUsuario[i]=numeroUsuario;
        }
    }

    private static int comprobarResultados(int[] numerosUsuario, int[] numeroSorteo) {
        int aciertosUsuario=0;
        for (int i = 0; i < numeroSorteo.length; i++) {
            for (int j = 0; j < numerosUsuario.length; j++) {
                if(numeroSorteo[i]==numerosUsuario[j]){
                    aciertosUsuario++;
                }
            }

        }
        return aciertosUsuario;
    }

    private static void inicializarNumeroSorteo(int[] numeroSorteo) {
        int numeroLoteria=0;
        for (int i = 0; i < numeroSorteo.length; i++) {
            //Inicializamos cada hueco del array con un número aleatorio del 1 al 100

            do {
                numeroLoteria = Utils.pedirNumeroAleatorio(1, 100);
            } while (estaRepetido(numeroSorteo, numeroLoteria));

            numeroSorteo[i]=numeroLoteria;
        }
    }

    private static boolean estaRepetido(int[] numeroSorteo, int numeroLoteria) {
        boolean repetido=false;
        for (int i = 0; i < numeroSorteo.length; i++) {
            if (numeroSorteo[i]==numeroLoteria){
                //Si entra es que está repetido
                repetido =true;
                break;
            }

        }
        return repetido;
    }
}
