package primer_trimestre.Tema6;

import java.util.Scanner;

public class luckyNumber {


public static void main( String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un numero");

    int numeroUsuario = sc.nextInt();



    numeroDeLaSuerte(numeroUsuario);

}

    private static void numeroDeLaSuerte(int numeroUsuario) {
    //Creamos las variables que tendrán los numeros de la suerte y sin suerte, para despues compararlos y saber si
        // el numero es de la suerte o no
        int numeroSuerte = 0;
        int numeroSinSuerte = 0;
        //Miertras el númeroUsuario sea mayor que 0 el bucle se va a realizar si no, termina el bucle
        while (numeroUsuario > 0) {
            //Creamos la variable dígito que es igual al resto del numeroUsuario entre 10 para saber el digito y
            // poder analizarlo si es suerte o no
            int digito = numeroUsuario %10;

            if (digito == 3 || digito == 7 ||digito == 8 ||digito == 9) {
                numeroSuerte ++;
            } else {
                numeroSinSuerte ++;
            }
            //Le quitamos el digito analizado y cogemos el siguiente dividiendolo entre 10 para quitar el 0
            numeroUsuario = (numeroUsuario -digito) /10;

        }

        if (numeroSuerte > numeroSinSuerte){
            System.out.println("El número es de la suerte");
        } else if (numeroSuerte < numeroSinSuerte) {
            System.out.println("El número no es de la suerte");
        } else {
            System.out.println("Empate");
        }
    }

}