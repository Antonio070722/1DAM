package Nivel_inicial_tema3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca los tres número para hacer la media, primer número:");
        int num1 = sc.nextInt();
        System.out.println("Itroduzca el segundo:");
        int num2 = sc.nextInt();
        System.out.println("Introduzca el tercero:");
        int num3 = sc.nextInt();
        int suma = num1 + num2 + num3;
        int media = suma / 3;

        System.out.println("La media es: " + media);
    }
}
