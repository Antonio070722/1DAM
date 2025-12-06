package primer_trimestre.Tema7.String;

import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra o frase");
        String frase = sc.nextLine();
        invertirCadenaDeCaracteres(frase);
    }

    private static void invertirCadenaDeCaracteres(String frase) {
        String frasealreves = "";
        for (int i = frase.length()-1; i >=0 ; i--) {
            frasealreves = frasealreves+frase.charAt(i);
        }
        System.out.println("La frase al principio: "+frase);
        System.out.println("La frase tras la ejecución del programa "+frasealreves);
    }
}
