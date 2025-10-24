package Nivel_inicial_tema3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera variable");
        int var1 = sc.nextInt();
        System.out.println("Introduce la segunda variable");
        int var2 = sc.nextInt();
        System.out.println("Las variables introducidad antes del intercambio son las siguientes: " + var1 + ", " + var2 + ".");
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1= var1 - var2;
        System.out.println("Las variables intercambiadas son: ");
        System.out.println("Primera variable introducida: " + var1 + ".");
        System.out.println("Segunda variable introducida: " + var2 + ".");
    }
}
