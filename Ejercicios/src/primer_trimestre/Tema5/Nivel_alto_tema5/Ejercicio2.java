package primer_trimestre.Tema5.Nivel_alto_tema5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a la calculadora avanzada!!");
        System.out.println("Operaciones realizables: ");
        System.out.println("1.\tRaices cuadradas");
        System.out.println("2.\tPotencias");
        System.out.println("3.\tMódulo de la división");
        System.out.print("Introduce el número correspondiente a la operación que deseas realizar: ");
        int op = sc.nextInt();
        if (op == 1) {
            System.out.print("Introduce un número para calcular su raiz cuadrada: ");
            int raiz = sc.nextInt();
            raicesCuadradas(raiz);
        } else if (op == 2) {
            System.out.println("Perfecto, introduce la base: ");
            int base = sc.nextInt();
            System.out.println("Ahora, introduce el exponente: ");
            int exponente = sc.nextInt();
            potencias(base, exponente);
        } else if (op == 3) {
            System.out.println("Vale, dime el dividendo primero: ");
            int dividendo = sc.nextInt();
            System.out.println("Ahora, el divisor: ");
            int divisor = sc.nextInt();
            moduloDivision(dividendo, divisor);
        }
    }

    private static void raicesCuadradas(int raiz) {
        double resultado = Math.sqrt(raiz);
        System.out.println("La raiz cuadrada de " + raiz + " es: " + resultado);
    }

    private static void potencias(int base, int exponente) {
        double resultado = Math.pow(base, exponente);
        System.out.println("La potencia de " + base + " con exponente " + exponente + " 2es: " + resultado);
    }

    private static void moduloDivision(int dividendo, int divisor) {
        int resultado = dividendo % divisor;
        System.out.println("El resto de dividir " + dividendo + " entre " + divisor + " es:  " + resultado);
    }
}
