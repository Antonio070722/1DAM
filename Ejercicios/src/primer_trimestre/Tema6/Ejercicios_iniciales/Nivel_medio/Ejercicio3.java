package primer_trimestre.Tema6.Ejercicios_iniciales.Nivel_medio;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime de que número quieres conocer sus múltipos: ");
        int numero = sc.nextInt();
        System.out.println("¿Cuántos multiplos quieres ver?");
        int limite = sc.nextInt();
        multiplos(numero, limite);
    }

    private static void multiplos(int numero, int limite) {
        int multiplos = 0;
        for (int i = 1; i < limite; i++) {
            multiplos = numero * i;
            if (multiplos >= 100) {
                System.out.println("El limite de multiplos es 100, ha sido excedido.");
                break;
            } else {
                System.out.println("Los múltiplos de " + numero + " son: " + multiplos);
            }
        }
    }
}
