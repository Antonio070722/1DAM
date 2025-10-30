package Tema6.Ejercicios_iniciales.Nivel_alto;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main() {
        int numero = 0;
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i <999999999; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número " + i + ": ");
            numero = sc.nextInt();
            if (numero == 0){
                mayormenor(mayor, menor);
                break;
            }
            if (numero > mayor){
                mayor = numero;
            }
            if (numero < menor){
                menor = numero;
            }
        }
    }

    private static void mayormenor(int mayor, int menor){
        System.out.println("El número mas grande es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
