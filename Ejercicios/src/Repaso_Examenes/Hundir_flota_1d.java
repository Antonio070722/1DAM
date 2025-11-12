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
        mostrarTablero(tablero);

    }

    private static void ataque(String[] tablero) {
        int posicionAtacar = 0;
        do{
            posicionAtacar = Utils.pedirNumeroAleatorio(1, tablero.length-1);
            System.out.println("Posición Atacar: "+posicionAtacar);
            if (tablero[posicionAtacar].equals("A")){
                System.out.println("AGUA");
            }

            if (tablero[posicionAtacar].equals("B")){
                System.out.println("BOOOOOM!!! BARCO");
                tablero[posicionAtacar]="X";
            }
        }
        while(!hundido(tablero, posicionAtacar));


    }

    private static boolean hundido(String[] tablero, int posicionAtacar) {
        boolean hundido = false;
        for (int i = 0; i < tablero.length; i++) {

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
