package Tema5;

import java.util.Scanner;

public class Cine {
    /**
     * Make a program that calculates the price of movie tickets based on the number of people and the day of the week. Hecho
     * The base price of a ticket is 8 euros. On Wednesday (spectator's day), the base price is 5 euros. Hecho
     * Thursdays are the couple's day, so admission for two costs 11 euros. With the Student card you get a 10% discount. Hecho
     *
     *
     * ----Sales ticketsmart----
     * Nº tickets→ 4
     * Day of the week-> Tuesday
     * Student Card-> no
     * TOTAL-> 32€
     */
    /**
     * He inicializado las variables con el static fuera de los métodos y del main para poder usarlas en cualquier método
     */
    static int tickets = 0;
    static String dia = "dia";
    static String tarjeta = "Si/No";
    static int total = 0;

    /**
     * Llamo a los métodos en el main
     */
    public static void main(String[] args) {
        pedirDatos();
        calcularTotal();
    }

    /**
     * Primero de todo le pido los datos al usuario (Nº tickets, Día de la semana y si tiene tarjeta estudiante)
     */
    public static void pedirDatos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\t--Venta de tickets--");
        System.out.print("Nº de tickets --> ");
        tickets = sc.nextInt();
        sc.nextLine();
        System.out.print("Dia de la semana --> ");
        dia = sc.nextLine();
        System.out.print("Tarjeta estudiante (Si/No) --> ");
        tarjeta = sc.nextLine();
    }
    /**
     *Calculo del precio para cada dia, para miercoles y jueves la promocion correspondiente, para el resto precio normal
     */
    public static void calcularTotal() {
        if (dia.equals("Miércoles")) { //Precio a 5 euros por ser Miércoles
            System.out.println("El miércoles es el 'Día del Espectador', precio base 5 euros: ");
            total = (tickets * 5);
        } else if (dia.equals("Jueves")){ //Precio de 2x11 euros por ser Jueves
            System.out.println("El jueves es el 'Dia de Pareja', 2 tickets por 11 euros");
            int parejas = tickets / 2;
            int sinPareja = tickets % 2;
            total = (parejas * 11) + (sinPareja * 8);
        } else if (dia.equals("Lunes")){ //Precio normal para el resto de días de la semana
            total = (tickets * 8);
        } else if (dia.equals("Martes")){
            total = (tickets * 8);
        } else if (dia.equals("Viernes")){
            total = (tickets * 8);
        } else if (dia.equals("Sábado")){
            total = (tickets * 8);
        } else if (dia.equals("Domingo")){
            total = (tickets * 8);
        } else{ //En el caso de no introucir un día valido mostrar un aviso por pantalla
            System.out.println("Introduce un día valido (Ojo a la ortografía): Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo");
        }
        /**
         * Calculo en el caso de tener tarjeta estudiante.
         */
        if (tarjeta.equals("Si")){
            double Descuento = (total * 0.10);
            double totalConDescuento = (total - Descuento);
            System.out.println("Precio total = " + totalConDescuento);
        } else if (tarjeta.equals("No")){
            System.out.println("Precio total = " + total);
        } else {
            System.out.println("Introduce Si o No, dependiendo si tienes o no tarjeta estudiante");
        }
    }
}
