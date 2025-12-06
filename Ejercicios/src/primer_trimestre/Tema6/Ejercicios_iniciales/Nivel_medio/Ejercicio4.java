package primer_trimestre.Tema6.Ejercicios_iniciales.Nivel_medio;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime de que número quieres conocer sus múltipos: ");
        int numero = sc.nextInt();
        System.out.println("¿Cuántos multiplos quieres ver?");
        int cantidadmultiplos = sc.nextInt();
        System.out.println("Introduce el valor límite de los múltiplos: ");
        int limite = sc.nextInt();
        multiplos(numero, cantidadmultiplos, limite);
    }

    private static void multiplos(int numero, int cantidadmultiplos, int limite) {
        int multiplos = 0;
        for (int i = 1; i < cantidadmultiplos; i++) {
            multiplos = numero * i;
            if (multiplos >= limite) {
                System.out.println("El limite de multiplos es " + limite + ", ha sido excedido.");
                break;
            } else {
                System.out.println("Los múltiplos de " + numero + " son: " + multiplos);
            }
        }
    }
}
