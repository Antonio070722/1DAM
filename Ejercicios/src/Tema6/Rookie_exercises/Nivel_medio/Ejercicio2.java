package Tema6.Rookie_exercises.Nivel_medio;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero desde el que se dirán los primos");
        int inicio = sc.nextInt();
        System.out.println("Introduce el limite hasta el que se dirán los números primos");
        int limite = sc.nextInt();
        paresEntre(inicio, limite);
    }

    public static void paresEntre(int inicio, int limite) {
        int i = inicio;
        while (i <= limite) {
            if (i < 2) {
                System.out.println(i + " no es primo");
                i++;
                continue;
            }
            boolean esPrimo = true;
            int divisor = 2;
            while (divisor <= Math.sqrt(i)) {
                if (i % divisor == 0) {
                    esPrimo = false;
                    break;
                }
                divisor++;
            }
            if (esPrimo) {
                System.out.println(i + " es primo");
            } else {
                System.out.println(i + " no es primo");
            }
            i++;
        }
    }
}
