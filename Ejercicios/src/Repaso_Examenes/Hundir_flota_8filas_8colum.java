package Repaso_Examenes;

import Utilidades.Utils;

public class Hundir_flota_8filas_8colum {
    static void main(String[] args) {
        int filas=9;
        int columnas=9;
        int estadoFila=1;
        int grande = 2;
        int mediano = 4;
        int pequeño = 2;
        String[][] tablero=new String[columnas][filas];
        System.out.println("----HUNDIR FLOTA----");
        inicializarTablero8x8(tablero);
        mostrarTablero(tablero);
        tamañoBarco(tablero, estadoFila, grande, mediano, pequeño);

    }

    private static void tamañoBarco(String[][] tablero, int estadoFila, int grande, int mediano, int pequeño) {
        String[] letras = {"A","B","C","D","E","F","G","H"};
        String tamañoBarco=" ";
        System.out.println("Tamaños de barcos disponibles: \n- Grande: 5 espacios. Saldo: "+grande+".\n- Mediano: 3 espacios. Saldo "+mediano+".\n- Pequeño: 1 espacio. Saldo: "+pequeño+".");

        for (int i = estadoFila; i < tablero.length; i++) {
            tamañoBarco=Utils.pedirCadenaUsuario("Introduce el tamaño del barco (Fila "+letras[i-1] +"): ");
            switch (tamañoBarco){
                case "Grande":
                    if (grande == 0){
                        System.out.println("No quedan barcos grandes.");
                        tamañoBarco(tablero, i, grande, mediano, pequeño);
                    }
                    ponerBarcos(tablero, 4, i);
                    grande--;
                    break;
                case "Mediano":
                    if (mediano==0){
                        System.out.println("No quedan barcos medianos.");
                        tamañoBarco(tablero, i, grande, mediano, pequeño);
                    }
                    ponerBarcos(tablero, 3, i);
                    mediano--;
                    break;
                case "Pequeño":
                    if (pequeño==0){
                        System.out.println("No quedan barcos pequeños.");
                        tamañoBarco(tablero, i, grande, mediano, pequeño);
                    }
                    ponerBarcos(tablero, 1, i);
                    pequeño--;
                    break;
                case "":
                    break;
                default:
                    System.out.println("Introduce correctamente el tamaño, si no quieres poner nada en una fila, pulsa enter.");
                    tamañoBarco(tablero, i, grande, mediano, pequeño);
            }
            System.out.println("Tamaños de barcos disponibles: \n- Grande: 5 espacios. Saldo: "+grande+".\n- Mediano: 3 espacios. Saldo "+mediano+".\n- Pequeño: 1 espacio. Saldo: "+pequeño+".");
            mostrarTablero(tablero);
        }
    }

    private static void ponerBarcos(String[][] tablero, int tamano, int i) {

        boolean valida = false;
        int coordenada = 0;
        do{
            coordenada=Utils.pedirNumeroUsuario("Introduce la posición numérica para poner el barco: ");
             if (coordenada+tamano-1 >= tablero.length){
                 System.out.println("Coordenada incorrecta");
             }else valida = true;

        }while (!valida);


        for (int j = coordenada; j <= tamano+coordenada; j++) {
            tablero[i][j] ="B";
        }
    }

    private static void mostrarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]+"\t\t");
            }
            System.out.println("\n");
        }
    }

    private static void inicializarTablero8x8(String[][] tablero) {
        //i = columnas
        //j = filas
        String[] letras = {"A","B","C","D","E","F","G","H"};
        //inicializar coordinadas verticales (números)
        for (int i = 0; i < tablero.length; i++) {
            tablero[0][i]= String.valueOf(i);
        }
        //inicializar coordenadas en horizontal (letras)
        for (int i = 1; i < tablero.length; i++) {
            tablero[i][0]=letras[i-1];
        }
        //inicializar tabla
        for (int i = 1; i < tablero.length; i++) {
            for (int j = 1; j < tablero.length; j++) {
                tablero[i][j]="A";
            }
        }
    }
}
