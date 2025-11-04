package Tema6.Rookie_exercises.Nivel_alto;

import java.util.Scanner;

public class Ejercicio3 {
    //3.- Desarrolla un programa que encuentre y muestre los números perfectos en un rango
    //dado.
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime de qué número quieres que muestre si es perfecto: ");
        int limite = sc.nextInt();
        numerosPerfectosHastaLimite(limite);
    }

    private static void numerosPerfectosHastaLimite(int limite) {
        int sumadivisores=0;
        for (int i = 1; i <= limite; i++) {
            if (limite%i == 0) {
                System.out.println(i);
                sumadivisores=sumadivisores+i;
            } else {
            }
        }
        sumadivisores=sumadivisores-limite;
        System.out.println(" ");
        System.out.println(sumadivisores);
        if (sumadivisores==limite){
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
}
