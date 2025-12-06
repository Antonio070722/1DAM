package primer_trimestre.Tema7;

import java.util.Scanner;

public class WeatherForecast {
//    Haz un programa que muestre el pronóstico del tiempo en Córdoba.
//    Las temperaturas máximas y mínimas deben generarse dentro de los intervalos
//    absolutos máximos y mínimos medidos en la siguiente tabla,
//    así como la probabilidad entre soleado o nublado:
//
//                                  Primavera       Verano	    Otoño	    Invierno
//    Temperatura Máxima	        39º	            45º	        33º	        28º
//    Temperatura Mínima	        10º	            20º	        5º	        1º
//    Probabilidad: Soleado–Nublado	60%-40%	        90%-10%	    50%-50%	    40%-60%
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Spring");
        System.out.println("2. Summer");
        System.out.println("3. Autumn");
        System.out.println("4. Winter");
        System.out.print("Select the season(1-4): ");
        int season = sc.nextInt();
        System.out.println("Weather Forecast");
        System.out.println("------------------");
        switch (season) {
            case 1:
                primavera();
                break;
            case 2:
                verano();
                break;
            case 3:
                otoño();
                break;
            case 4:
                winter();
                break;
        }
    }

        public static void primavera () {
            int temperaturaminima = 10;
            int temperaturamaxima = 39;
            temperaturaminima = (int) (temperaturaminima + (Math.random() * (20 - temperaturaminima)));
            temperaturamaxima = (int) (temperaturamaxima + (Math.random() * (25 - temperaturamaxima)));
            System.out.println("Minimun Cº: " + temperaturaminima);
            System.out.println("Maximun Cº: " + temperaturamaxima);
            int probabilidad = (int)(Math.random()*100);
            if (probabilidad<=40){
                System.out.println("It's cloudy");
            } else if (probabilidad>40){
                System.out.println("It's sunny");
            }
        }
        public static void verano () {
            int temperaturaminima = 20;
            int temperaturamaxima = 45;
            temperaturaminima = (int) (temperaturaminima + (Math.random() * (30 - temperaturaminima)));
            temperaturamaxima = (int) (temperaturamaxima + (Math.random() * (35 - temperaturamaxima)));
            System.out.println("Minimun Cº: " + temperaturaminima);
            System.out.println("Maximun Cº: " + temperaturamaxima);
            //PROBANDO: que se genere un número, y si, por ejemplo es verano (probab: 20% nublado, 80% soleado durante la estación)
            //si el número es 20 o menor que ponga que está nublado y si el número generado es mayor a 20 que diga que está soleado.
            int probabilidad = (int)(Math.random()*100);
            if (probabilidad<=10){
                System.out.println("It's cloudy");
            } else if (probabilidad>10){
                System.out.println("It's sunny");
            }
        }
        public static void otoño () {
            int temperaturaminima = 5;
            int temperaturamaxima = 33;
            temperaturaminima= (int) (temperaturaminima+(Math.random()*(15-temperaturaminima)));
            temperaturamaxima=(int)(temperaturamaxima+(Math.random()*(25-temperaturamaxima)));
            System.out.println("Minimun Cº: "+temperaturaminima);
            System.out.println("Maximun Cº: "+temperaturamaxima);
            int probabilidad = (int)(Math.random()*100);
            if (probabilidad<=50){
                System.out.println("It's cloudy");
            } else if (probabilidad>50){
                System.out.println("It's sunny");
            }
        }
        public static void winter() {
            int temperaturaminima = 1;
            int temperaturamaxima = 28;
            temperaturaminima= (int) (temperaturaminima+(Math.random()*(13-temperaturaminima)));
            temperaturamaxima=(int)(temperaturamaxima+(Math.random()*(20-temperaturamaxima)));
            System.out.println("Minimun Cº: "+temperaturaminima);
            System.out.println("Maximun Cº: "+temperaturamaxima);
            int probabilidad = (int)(Math.random()*100);
            if (probabilidad<=60){
                System.out.println("It's cloudy");
            } else if (probabilidad>60){
                System.out.println("It's sunny");
            }
        }
    }

