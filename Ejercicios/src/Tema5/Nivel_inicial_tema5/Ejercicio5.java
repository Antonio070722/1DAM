package Tema5.Nivel_inicial_tema5;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introuzca el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introuzca el segundo número");
        int num2 = sc.nextInt();
        System.out.println("Introuzca el tercer número");
        int num3 = sc.nextInt();
        System.out.println("Introuzca el cuarto número");
        int num4 = sc.nextInt();
        System.out.println("Introuzca el quinto número");
        int num5 = sc.nextInt();

        int mayor = encontrarMayor(num1,num2,num3,num4,num5);
        int menor = encontrarMenor(num1,num2,num3,num4,num5);

        mostrarResultadoMayor(mayor);
        mostrarResultadoMenor(menor);
    }
    private static int encontrarMayor(int num1, int num2, int num3, int num4, int num5) {
        int mayor = num1;

        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        if (num4 > mayor) mayor = num4;
        if (num5 > mayor) mayor = num5;

        return mayor;
    }
    private static int encontrarMenor(int num1, int num2, int num3, int num4, int num5) {
        int menor = num1;

        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        if (num4 < menor) menor = num4;
        if (num5 < menor) menor = num5;

        return menor;
    }
    private static void mostrarResultadoMayor(int mayor){
        System.out.println("El mayor número de los cinco es el: " + mayor);
    }
    private static void mostrarResultadoMenor(int menor){
        System.out.println("El menor es el: " + menor);
    }
}