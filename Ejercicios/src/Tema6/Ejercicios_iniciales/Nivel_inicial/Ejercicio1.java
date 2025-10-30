package Tema6.Ejercicios_iniciales.Nivel_inicial;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        System.out.println("Bienvenido, en este prorgama debes introducir 4 valores: ");
        pediryverificar();
    }

    private static void pediryverificar() {
        int numsumados=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {

            System.out.println("Introduce un número: ");
            int num = sc.nextInt();
            if (num < 10){
            } else {
                numsumados= numsumados + num;
            }
        }
        System.out.println("La suma de los número mayores a 10 es " + numsumados);
    }

}
