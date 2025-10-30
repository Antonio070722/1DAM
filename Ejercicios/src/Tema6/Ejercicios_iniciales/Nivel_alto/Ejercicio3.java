package Tema6.Ejercicios_iniciales.Nivel_alto;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main() {
        int numero = 0;
        for (int i = 0; i <999999999; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número " + i + ": ");
            numero = sc.nextInt();
            if (numero == 0){
                break;
            }
            tablamulti(numero);
        }
    }

    private static void tablamulti(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "*" + i + "="  + numero*i);
        }
    }
}
