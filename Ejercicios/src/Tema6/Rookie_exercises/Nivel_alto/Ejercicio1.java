package Tema6.Rookie_exercises.Nivel_alto;

import java.util.Scanner;

public class Ejercicio1 {
    //1.- Desarrolla un programa que sume los dígitos de un número entero.
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número para sacar la suma de sus dígitos: ");
        int numero=sc.nextInt();
        sacarDigitos(numero);
    }
    private static void sacarDigitos(int numero) {
        int resto=0;
        int totalresto=0;
        while(numero>0){
            resto=numero%10;
            numero=numero/10;
            System.out.println("Resto: "+resto);
            totalresto = totalresto+resto;
        }
        System.out.println(" ");
        System.out.println("Total: "+totalresto);
    }
}
