package primer_trimestre.Nivel_inicial_tema3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero entero");
        int numentero = sc.nextInt();
        System.out.println("El numero introducido es el " + numentero);
        System.out.println("Ingresa un numero flotante");
        float numfloat = sc.nextFloat();
        System.out.println("El numero introducido es el " + numfloat);
        System.out.println("Ingresa un numero de tipo doble");
        double numdouble = sc.nextDouble();
        System.out.println("El numero introducido es el " + numdouble);

        System.out.println();
    }
}