package Tema8.Matrices;

import Utilidades.Utils;

public class Ejercicio1 {
//    Realiza un programa que cree un array bidimensional,
//    una matriz, de 5 filas x 5 columnas

    static void main(String[] args) {
        int[][] matriz = new int[5][5];
        inicializarMatriz(matriz);
        valoresAleatorios(matriz);
        mostrarMatriz(matriz);
//        comprobarDiagonal(matriz);
//        esDiagonalSuperior(matriz);
//        esDispersa(matriz);
        arrayConValoresDeMatriz(matriz);
    }

    private static void arrayConValoresDeMatriz(int[][] matriz) {
        int[] arrayMatriz = new int[matriz.length * matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                arrayMatriz[i]=matriz[i][j];
            }
        }

    }

    private static void esDispersa(int[][] matriz){
        int filasconceros=0;
        for (int i = 0; i < matriz.length; i++) {
            int ceros=0;

            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j]==0){
                    ceros++;
                    filasconceros++;
                }
            }
            if (ceros>=1){
                System.out.println("Hay al menos un cero en la fila ["+(i+1)+"] nº total: "+ceros);
            } else if (ceros<1){
                System.out.println("No hay ningún cero en la fila ["+(i+1)+"]");
            }
        }
        if (filasconceros==5){
            System.out.println("La matríz es dispersa");
        } else {
            System.out.println("La matríz no es dispersa al " +
                    "no haber al menos un cero en todas las filas de la matriz");
        }

    }

    private static boolean esDiagonalSuperior(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Posicion comprobada. "+i+", "+j);
                if (matriz[i][j]!=0){
                    System.out.println("Valor diferente a 0 en "+ i +", "+ j);
                    return false;
                }
            }
        }
        System.out.println("Todas las posiciones por debajo de la diagonal son 0, por " +
                "lo tanto es diagonal superior");
        return true;
    }

    private static void comprobarDiagonal(int[][] matriz) {
        boolean esDiagonal=true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    if(matriz[i][j]==0){
                        esDiagonal=false;
                        break;
                    }
                } else {
                    if (matriz[i][j]!=0){
                        esDiagonal=false;
                        break;
                    }
                }
            }
            if (!esDiagonal){
                break;
            }
        }

        if (esDiagonal){
            System.out.println("Es diagonal!");
        } else {
            System.out.println("No es diagonal!");
        }

    }

    private static void mostrarMatriz(int[][] matriz) {
        int positivos =0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
                if (matriz[i][j] >= 0){
                    positivos++;
                }
            }
            System.out.println();
        }
        if (positivos==25){
            System.out.println("La matríz es positiva");
        }else {
            System.out.println("\nLa matriz no es completamente positiva");
        }
    }

    private static void valoresAleatorios(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= Utils.pedirNumeroAleatorio(0,10);
            }
        }
    }

    public static void inicializarMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= 0;
            }
        }
    }
}