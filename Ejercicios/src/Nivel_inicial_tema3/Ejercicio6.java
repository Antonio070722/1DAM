package Nivel_inicial_tema3;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Euribor: ");
        float Euribor = sc.nextFloat();

        System.out.println("Introduce el Diferencial:");
        float Diferencial = sc.nextFloat();

        System.out.println("Introduce el Capital:");
        float Capital = sc.nextFloat();

        System.out.println("Introduce el numero de plazos mensuales para pagar la hipoteca");
        int Plazo = sc.nextInt();

        //Interés anual
        float interesAnual = Euribor + Diferencial;

        //Interés mensual
        float interesmen = interesAnual / (12*100); //Se divide entre 100 para pasar a decimal

        //Fórmula
        double numerador = interesmen * Math.pow(1 + interesmen, Plazo);
        double denominador = Math.pow(1 + interesmen, Plazo) - 1;
        double cuotaMen = Capital * (numerador/denominador);

        //Resultado
        System.out.println("La cuota mensual es de " + cuotaMen);

    }
}
