package Repaso_Examenes;

public class Hundir_flota_8filas_8colum {
    static void main(String[] args) {
        int filas=9;
        int columnas=9;
        String[][] tablero=new String[columnas][filas];
        System.out.println("----HUNDIR FLOTA----");
        inicializarTablero8x8(tablero);
        mostrarTablero(tablero);
    }

    private static void mostrarTablero(String[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                System.out.print(tablero[i][j]+"\t");
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
