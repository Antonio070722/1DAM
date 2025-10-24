package Nivel_inicial_tema5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        decirmayor();
    }
    private static void  decirmayor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ahora, introduzca el segundo");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("El número mayor es el " + num1);
        }else {
            System.out.println("El número mayor es el " + num2);
        }
    }
}
