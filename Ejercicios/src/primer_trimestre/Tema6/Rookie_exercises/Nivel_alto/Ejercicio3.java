package primer_trimestre.Tema6.Rookie_exercises.Nivel_alto;

import java.util.Scanner;

public class Ejercicio3 {
    //3.- Desarrolla un programa que encuentre y muestre los números perfectos en un rango
    //dado.
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime desde qué número quieres que se muestre los perfectos: ");
        int inicio = sc.nextInt();
        System.out.println("Dime hasta qué número quieres que se muestren los perfectos comprendidos: ");
        int fin = sc.nextInt();
        for (int a = inicio; a <= fin ; a++) {
            esPerfectoONo(a);
        }


    }

    private static void esPerfectoONo(int limite) {
        int sumadivisores=0;
        for (int i = 1; i <= limite; i++) {
            if (limite%i == 0) {
                //System.out.println(i);
                sumadivisores=sumadivisores+i;
            } else {
            }
        }
        sumadivisores=sumadivisores-limite;
        //System.out.println(" ");
        //System.out.println(sumadivisores);
        if (sumadivisores==limite){
            System.out.println("Es perfecto");
        } else {
            System.out.println("No es perfecto");
        }
    }
}
