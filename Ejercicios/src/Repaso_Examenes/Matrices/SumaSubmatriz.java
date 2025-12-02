package Repaso_Examenes.Matrices;

import java.util.Random;
import java.util.Scanner;

public class SumaSubmatriz {
    public  static void main(String[] args) {

        int [] [] matriz = new int[5][5];

        inicializarMatriz(matriz);
        sumaSubmatriz(matriz);
    }

    private static void sumaSubmatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);

        System.out.print (" Introduce la fila superior ");
        int filaSuperior = sc.nextInt() -1;
        System.out.print (" Introduce la columna superior ");
        int columnaSuperior = sc.nextInt() -1;
        System.out.print (" Introduce la fila inferior ");
        int filaInferior = sc.nextInt() -1;
        System.out.print (" Introduce la columna inferior ");
        int columnaInferior = sc.nextInt() -1;

        int suma = 0;

        for (int i = filaSuperior; i <= filaInferior; i++) {
            for (int j = columnaSuperior; j <= columnaInferior; j++) {
                suma += matriz[i][j];
            }
        }
        System.out.println("\n La suma de la submatriz es: " + suma);
    }

    private static void inicializarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = generarNumerosAleatorios(0,100);

                System.out.print(" | " +  matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }


    private static int generarNumerosAleatorios(int min, int max){
        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }
}