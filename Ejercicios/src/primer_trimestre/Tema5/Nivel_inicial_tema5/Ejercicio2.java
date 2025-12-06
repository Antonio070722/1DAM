package primer_trimestre.Tema5.Nivel_inicial_tema5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        decirmenor();
    }
    private static void decirmenor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ahora, introduzca el segundo");
        int num2 = sc.nextInt();

        if (num1 < num2){
            System.out.println("El número menor es el " + num1);
        }else {
            System.out.println("El número menor es el " + num2);
        }
    }
}
