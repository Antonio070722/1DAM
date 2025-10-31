package Tema6.Rookie_exercises.Nivel_medio;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para determinar si es primo o no");
        int numero = sc.nextInt();
        if (esPrimo(numero, 2)){
            System.out.println("Es primo.");
        } else System.out.println("No es primo.");
    }

    public static boolean esPrimo(int numero, int i){
        if (numero < 2){
            return false;
        }
        if (i > Math.sqrt(numero)){
            return true;
        }
        if (numero % i == 0){
                return false;
        }
        return esPrimo(numero, i+1);
    }
}
