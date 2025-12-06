package primer_trimestre.Tema5.Nivel_alto_tema5;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nota: ");
        int nota = sc.nextInt();
        notaTexto(nota);
    }

    private static void notaTexto(int nota) {
        switch (nota) {
            case 0:
            case 1:
            case 2:
                System.out.println("Deficiente");
                break;
            case 3:
            case 4:
                System.out.println("Insuficiente");
                break;
            case 5:
                System.out.println("Suficiente");
                break;
            case 6:
                System.out.println("Bien");
                break;
            case 7:
                case 8:
                    System.out.println("Notable");
                    break;
            case 9:
            case 10:
                System.out.println("Sobresaliente");
                break;
        }
    }
}
