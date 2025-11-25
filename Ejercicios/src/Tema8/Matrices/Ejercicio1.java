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
        comprobarDiagonal(matriz);
    }

    private static void comprobarDiagonal(int[][] matriz) {
        boolean esDiagonal=false;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {

                }
            }
        }
        if (esDiagonal){
            System.out.println("Es diagonal!!");
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
                matriz[i][j]= Utils.pedirNumeroAleatorio(-10,10);
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