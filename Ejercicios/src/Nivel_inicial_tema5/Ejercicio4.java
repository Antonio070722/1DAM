package Nivel_inicial_tema5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introuzca el primer número");
        int num1 = sc.nextInt();
        System.out.println("Introuzca el segundo número");
        int num2 = sc.nextInt();
        System.out.println("Introuzca el tercer número");
        int num3 = sc.nextInt();
        System.out.println("Introuzca el cuarto número");
        int num4 = sc.nextInt();
        System.out.println("Introuzca el quinto número");
        int num5 = sc.nextInt();

        int menor = encontrarMenor(num1,num2,num3,num4,num5);

        mostrarResultado(menor);
    }

    /**
     * Metodo para encontrar el menor
     * @param num1
     * @param num2
     * @param num3
     * @param num4
     * @param num5
     * @return Devuelve el mayor numero a la variable mayor
     */
    private static int encontrarMenor(int num1, int num2, int num3, int num4, int num5) {
        int menor = num1;

        if (num2 < menor) menor = num2;
        if (num3 < menor) menor = num3;
        if (num4 < menor) menor = num4;
        if (num5 < menor) menor = num5;

        return menor;
    }
    /**
     * Método para mostrar el menor
     */
    private static void mostrarResultado(int menor){
        System.out.printf("El menor número de los cinco es el: " + menor);
    }
}
