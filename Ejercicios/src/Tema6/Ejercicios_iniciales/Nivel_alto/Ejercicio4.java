package Tema6.Ejercicios_iniciales.Nivel_alto;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main() {
        int numero = 0;
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i <999999999; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número " + i + ": ");
            numero = sc.nextInt();
            if (numero == 0){
                positivonegativo(positivos, negativos);
                break;
            }
            if (numero < 0){
                negativos++;
            }
            if (numero > 0){
                positivos++;
            }
        }
    }

    private static void positivonegativo(int positivos, int negativos) {
        System.out.println("Total de positivos: " + positivos);
        System.out.println("Total de negativos: " + negativos);
    }

}
