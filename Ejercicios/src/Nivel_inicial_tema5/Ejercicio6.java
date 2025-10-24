package Nivel_inicial_tema5;

import java.util.Scanner;

public class Ejercicio6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Determinar numero par o impar.");
        System.out.println("Introduce el primer número:");
        int numero = sc.nextInt();

        parimpar(numero);
    }
    private static void parimpar(int numero){
        if(numero % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
}
