package Tema5.Nivel_alto_tema5;

import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce le importe de la compra: ");
        int importeCompra = sc.nextInt();
        System.out.println("Introduce la cantidad con la que paga el cliente: ");
        int cantidadRecibida = sc.nextInt();
        int cambio = cantidadRecibida - importeCompra;
        System.out.println("Cambio a devolver: " + cambio);

    }
}
