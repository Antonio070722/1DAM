package Tema6.Ejercicios_iniciales.Nivel_inicial;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres que se comprueben si son positivos o negativos?");
        int numapedir = sc.nextInt();
        comprobarnums(numapedir);
    }

    private static void comprobarnums(int numapedir) {
        Scanner sc = new Scanner(System.in);
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i < numapedir; i++) {
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();
            if (num < 0){
                negativos++;
            } else{
                positivos++;
            }
        }
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
    }
}
