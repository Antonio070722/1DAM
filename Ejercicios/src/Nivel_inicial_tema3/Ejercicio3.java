package Nivel_inicial_tema3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo número:");
        int num2 = sc.nextInt();

        System.out.println("Introduce el tercer número:");
        int num3 = sc.nextInt();

        int total = num1 + num2 + num3;
        System.out.println("La suma de los tres números es: " + total);
    }
}
