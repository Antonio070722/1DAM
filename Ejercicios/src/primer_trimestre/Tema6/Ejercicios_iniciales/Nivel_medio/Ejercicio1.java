package primer_trimestre.Tema6.Ejercicios_iniciales.Nivel_medio;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("De cuantos números quieres hacer la media? ");
        int numsmedia = sc.nextInt();
        media(numsmedia);
    }

    private static void media(int numsmedia) {
        Scanner sc = new Scanner(System.in);
        int media = 0;
        int sumanums = 0;
        for (int i = 0; i < numsmedia; i++) {
            System.out.print("Introduce un número: ");
            int num = sc.nextInt();
            sumanums = sumanums + num;
        }
        media = sumanums / numsmedia;
        System.out.println("La media de los números introducidos es " + media);
    }
}
