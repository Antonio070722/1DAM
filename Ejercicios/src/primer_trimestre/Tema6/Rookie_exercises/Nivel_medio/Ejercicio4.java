package primer_trimestre.Tema6.Rookie_exercises.Nivel_medio;

import java.util.Scanner;

public class Ejercicio4 {
//    Crea un programa que pida al usuario un número e imprima ese número en binario.
//    Tienes prohibido el uso del bucle "for".
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número para traducir a binario: ");
        int numero = sc.nextInt();
        traducirABinario(numero);
    }

    private static void traducirABinario(int numero) {
        //Para crear la variable y almacenar numeros binarios se usa String

//        El número binario sale de dividir el número entre dos, el resto, siempre será 1 o 0, el resultado de la division
//        se tiene que volver a dividir entre dos hasta que el resultado sea 0, el número traducido a binario sale al juntar
//        todos los restos.

        String binario = "";
        int n=numero;
        if (n==0)
            {
            binario="0";
            } else {
            while (n > 0) {
                binario = (n % 2) + binario; //almacenar el resto de dividir n entre dos en la varible binario inicializada con string
                n = n / 2; //dividimos n entre dos para que se vaya reduciendo el valor
            }
            System.out.println("Binario: " + binario);
        }
    }
}
