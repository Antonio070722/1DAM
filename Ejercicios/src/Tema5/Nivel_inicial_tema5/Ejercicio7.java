package Tema5.Nivel_inicial_tema5;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introuce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introuce el segundo numero");
        int num2 = sc.nextInt();

        parOimpar(num1, num2);
    }
    public static void parOimpar(int num1, int num2) {
        if (num1 %2 == 0 && num2 %2 == 0)
        {
            System.out.println("Ambos son pares.");
        } else if (num1 %2 != 0 && num2 %2 == 0){
            System.out.println("Solo el segundo numero es par.");
        } else if (num2 %2 != 0 && num1 %2 == 0){
            System.out.println("Solo el primer numero es par.");
        }
    }
}
