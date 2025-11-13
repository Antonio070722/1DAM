package Repaso_Examenes;

import Utilidades.Utils;

public class Hundir_flota_1d {
    static void main(String[] args) {
        int fila = 8;
        String[] tablero = new String[fila];
        System.out.println("\n******** HUNDIR LA FLOTA ********\n");
        incializarTablero(tablero);
        mostrarTablero(tablero);
        ponerBarco(tablero);
        mostrarTablero(tablero);
        ataque(tablero);
//        mostrarTablero(tablero);

    }

    /**
     * En este método, se genera un número aleatorio en el rango de valores de la array del tablero, el número se valida
     * en otro método, de forma que no se puede repetir, si el número generado coincide con que es barco (B) se imprime
     * en pantalla y la letra B se sustituye por una X, en el caso contrario, si es agua (A), se mostrará; cuando haya
     * tres X (debido a que le único tamaño de barcos es de tres posiciones), el programa termina mostrando un mensaje
     * de barco hundido y el número de intentos de la máquina.
     * @param tablero
     */
    private static void ataque(String[] tablero) {
        int posicionAtacar = 0;
        int intentos = 0;
        int[] repetidos = new int[tablero.length];
        int contadorNumsUsados=0;
        do{
            do {
                posicionAtacar = Utils.pedirNumeroAleatorio(1, tablero.length-1);
            }while (esRepetido(posicionAtacar, repetidos, contadorNumsUsados));
            repetidos[contadorNumsUsados] = posicionAtacar;
            contadorNumsUsados++;

            System.out.println("Posición Atacar: "+posicionAtacar);
            if (tablero[posicionAtacar].equals("A")){
                System.out.println("AGUA");
                mostrarTablero(tablero);
            }

            if (tablero[posicionAtacar].equals("B")){
                System.out.println("BOOOOOM!!! BARCO");
                tablero[posicionAtacar]="X";
                mostrarTablero(tablero);
            }
            intentos++;
        }
        while(!hundido(tablero)&&intentos<5);

        if (hundido(tablero)){
            System.out.println("\n\nBARCO HUNDIDO!!!!!, gana la máquina");
            System.out.println("Intentos: "+intentos);
        }else{
            System.out.println("\n\nHAS GANADO!!!, la máquina se ha quedado sin intentos");
            System.out.println("Intentos: "+intentos);
        }
    }

    /**
     * Este método lo he creado para validar el número generado por la máquina para intentar dar al barco
     * @param posicionAtacar este es el número generado por la máquina
     * @param repetidos en esta arrays van siendo almacenados los números creados por la máquina para compararlos
     * @param contadorNumsUsados Este es un contador para almacenar en cada hueco el número generado de forma
     *                           sucesiva en la array
     * @return
     */
    private static boolean esRepetido(int posicionAtacar, int[] repetidos, int contadorNumsUsados) {
        for (int i = 0; i < repetidos.length; i++) {
            if (repetidos[i] == posicionAtacar) {
                return true;
            }
        }
        return false;
    }

    /**
     * Este es el método en el que se comprueba si hay 3 X, es decir tres aciertos a barcos, lo que implica que termina
     * el programa.
     * @param tablero Valor que se contiene en cada valor de la Array tablero, el bucle for recorre cada uno de estos
     *                y, si es X se suma al contador, que cuando sea 3 el total de hundidos devuelve true.
     * @return
     */
    private static boolean hundido(String[] tablero) {
        boolean hundido = false;
        int totalHundidos=0;
        for (int i = 0; i < tablero.length; i++) {
            if(tablero[i].equals("X")){
                totalHundidos++;
            }
        }
        if (totalHundidos==3){
            return hundido =true;
        }
        return hundido =false;
    }


    private static void ponerBarco(String[] tablero) {
        int tamBarco = 3;
        int posicionInicial = Utils.pedirNumeroUsuario("\nDame la posición del barco de "+tamBarco+" posiciones.");

        while(!posicionCorrecta(posicionInicial, tamBarco, tablero)){
            posicionInicial = Utils.pedirNumeroUsuario("\nDame la posición del barco de "+tamBarco+" posiciones.");
        }

        for (int i = posicionInicial-1; i < tamBarco+posicionInicial-1; i++) {
            tablero[i]="B";
        }
    }

    private static boolean posicionCorrecta(int posicionInicial, int tamBarco, String[] tablero) {
        boolean esCorrecta= false;
        if ((posicionInicial-1) + tamBarco > tablero.length){
            System.out.println("Fuera de límites");
            esCorrecta=false;
        }
        return esCorrecta=true;
    }


    private static void mostrarTablero(String[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(tablero[i]+" ");
        }
    }

    private static void incializarTablero(String[] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            tablero[i]= "A";
        }
    }
}
