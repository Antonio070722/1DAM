package primer_trimestre.Repaso_Examenes.Matrices;

import java.util.Random;
import java.util.Scanner;

public class otroTryMatriz {
    /**
     * Inicializa una matriz de 5x5
     * elementos con valores al azar entre 0 y 100. Muéstrala en la consola. Ahora pide al usuario las coordenadas de
     * las esquinas superior izquierda e inferior derecha de un “rectángulo” (submatriz). Calcula la suma de todos los
     * elementos dentro de la submatriz.
     */
    static void main(String[] args) {
        int[][] matriz = new int[5][5];
        inicializarMatriz(matriz);
        sumaMatriz(matriz);
    }

    private static void sumaMatriz(int[][] matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la fila superior");
        int filaSup= sc.nextInt()-1;
        System.out.println("Introduce la columna superior");
        int columSup= sc.nextInt()-1;
        System.out.println("Introduce la fila inferior");
        int filaInf= sc.nextInt()-1;
        System.out.println("Introduce la columna inferior");
        int columInf= sc.nextInt()-1;

        int suma=0;

        for (int i = filaSup; i < filaInf; i++) {
            for (int j = columSup; j < columInf; j++) {
                suma+=matriz[i][j];
            }
        }
        System.out.println("\nLa suma de la submatriz es: "+suma);
    }

    private static void inicializarMatriz(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= random.nextInt(101);
                System.out.print(" | "+matriz[i][j]+" | ");
            }
            System.out.println("\n");
        }
    }
}
