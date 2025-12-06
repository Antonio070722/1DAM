package primer_trimestre.Tema6.Rookie_exercises.Nivel_alto;

import java.util.Scanner;

public class Ejercicio4 {
//    4.- Haz un juego donde el programa elige un número aleatorio y el usuario debe adivinarlo
//    con pistas de "mayor" o "menor".
static void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("BIENVENIDO!! Intenta adivinar un número del 1 al 50, intentos: 20. Pistas: MAYOR O MENOR");
    System.out.println("El juego a comenzado!!");
    int numeroSecreto = (int)(Math.random()*50);
    for (int i = 0; i <= 20; i++) {
        int numusuario= sc.nextInt();
        if (numusuario==numeroSecreto){
            System.out.println("ENHORABUENA, HAS ACERTADOO!!!!");
            break;
        } else if (numusuario>numeroSecreto) {
            System.out.println("ES MENOOOR!!!!");
        } else  {
            System.out.println("ES MAYOOR!!!");
        }
    }
}
}
