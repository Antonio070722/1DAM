package primer_trimestre.Tema6.Rookie_exercises.Nivel_medio;

import java.util.Scanner;

public class Ejercicio5 {
    //5º.- Calcula el factorial de un número dado por el usuario. Debes usar sólo el bucle while.
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del que quieres saber su factorial: ");
        int numero=sc.nextInt();
        factorial(numero);
    }
    public static void factorial(int numero) {
        //Factorial de n=5 --> 1*2*3*4*5 o 5*4*3*2*1
        int factorial=1;
        int n=numero;
        while(n>0){
            factorial=factorial*n;
            n--;
        }
        System.out.println("Factorial: "+factorial);
    }
}
