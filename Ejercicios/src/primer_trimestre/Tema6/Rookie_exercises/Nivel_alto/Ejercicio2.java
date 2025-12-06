package primer_trimestre.Tema6.Rookie_exercises.Nivel_alto;

import java.util.Scanner;

public class Ejercicio2 {
    // 2.- Escribe un programa que imprima los primeros n términos de la secuencia de Fibonacci.
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la cantidad de digitos que quieres saber de la serie fibonacci: ");
        int cantidadDigitos=sc.nextInt();
        if (cantidadDigitos==1) {
            System.out.println("0");
        } else if (cantidadDigitos==2) {
            System.out.println("0");
            System.out.println("1");
        } else{
            serieFibonacci(cantidadDigitos);
        }
    }

    private static void serieFibonacci(int cantidadDigitos) {
        int anterior=0;
        int posterior=1;

        for (int i = 0; i < cantidadDigitos; i++) {
            int resultado = anterior+posterior;
            anterior = posterior;
            posterior = resultado;
            System.out.println("\t Resultado: "+resultado);
        }
    }
}
