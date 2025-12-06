package primer_trimestre.Tema6.Ejercicios_iniciales.Nivel_medio;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuantos números quieres introducir para saber cual es el mayor y cual el menor?");
        int cantidadnums = sc.nextInt();
        decirmayor(cantidadnums);
        //decirmenor(cantidadnums);
    }
    private static void decirmayor(int cantidadnumeros){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número; ");
        int numero = sc.nextInt();
        int mayor = numero;
        int menor = numero;
        for (int i = 2; i <= cantidadnumeros; i++) {
            System.out.println("Introduce el numero " + i + ": ");
            numero = sc.nextInt();
            if (numero > mayor){
                mayor = numero;
            }
            if (numero <menor) {
                menor = numero;
            }
        }
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
