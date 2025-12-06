package primer_trimestre.Tema6.Ejercicios_iniciales.Nivel_alto;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main() {
        int suma = 0;
        int numero = 0;
        int cantidadintroducida = 0;
        for (int i = 0; i <999999999; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el número " + i + ": ");
            numero = sc.nextInt();
            if (numero == 0){
                sumaymedia(suma, cantidadintroducida);
                break;
            }
            suma = suma + numero;
            cantidadintroducida++;
        }
    }

    private static void sumaymedia(int suma, int cantidanums){
        System.out.println("La suma de todos los valores es " + suma);
        System.out.println("La media es: " + suma/cantidanums);
    }
}
