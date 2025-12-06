package primer_trimestre.Tema6.Ejercicios_iniciales.Nivel_inicial;

import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos números quieres que se sumen si son mayores a 10?");
        int numapedir = sc.nextInt();
        sumamayoresdiez(numapedir);
    }

    private static void sumamayoresdiez(int numapedir) {
        Scanner sc = new Scanner(System.in);
        int numsumados = 0;
        for (int i = 0; i < numapedir; i++) {
            System.out.println("Introduce un número: ");
            int num = sc.nextInt();
            if (num < 10){
            } else {
                numsumados= numsumados + num;
            }
        }
        System.out.println("La suma de los números mayores a 10 es " + numsumados);
    }

}
