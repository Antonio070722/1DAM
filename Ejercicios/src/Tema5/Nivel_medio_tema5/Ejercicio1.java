package Tema5.Nivel_medio_tema5;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
     int categNegativos = 0;
     int categBajos = 0;
     int categMedios = 0;
     int categGrandes = 0;
     for (int i = 0; i <= 5; i++){
         System.out.println("Introduce el número para clasificar: ");
         int num = sc.nextInt();
         if (num < 0){
             categNegativos = num + categNegativos;
         } else if (num >= 0 && num <= 25) {
             categBajos = num + categBajos;
         } else if (num >= 26 && num <= 250) {
             categMedios = num + categMedios;
         } else if (num > 250) {
             categGrandes =  num + categGrandes;
         }
     }
        System.out.println("El total de la suma de los números negativos introducido es : " + categNegativos);
        System.out.println("El total de la suma de los números bajos introducidos es : " + categBajos);
        System.out.println("El total de la suma de los números medios introducidos es : " + categMedios);
        System.out.println("El total de la suma de los número grandes introducidos es : " + categGrandes);
    }
}
