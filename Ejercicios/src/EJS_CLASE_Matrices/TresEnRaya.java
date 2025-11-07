package EJS_CLASE_Matrices;

import Utilidades.Utils;
import jdk.jshell.execution.Util;

public class TresEnRaya {

    public static void inicializarTablero(){
        int nFilas=3;
        int nColum=3;
        boolean ganador = false;
        //variable para ver el turno
        //0-> turno máquina
        //1-> turno humano
        int turno = Utils.numeroAleatorio(0,1);

        //El 0 son las fichas de la máquina y el 1 las del usuario
        int[][]matriz= new int[nFilas][nColum];
        inicializarMatriz(matriz);

        while (!ganador) {
            ponerFicha(matriz, turno);
            verTablero(matriz, turno);
            ganador=comprobarGanador(matriz);
            if (ganador){
                System.out.println("Hay ganador!!");
            }else {
                turno = cambioTurno(turno);
            }
        }
    }

    private static int cambioTurno(int turno) {
        if (turno==0){
            turno=1;
        }else turno=0;

        return turno;
    }

    private static void inicializarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]=2;
            }
        }
    }

    private static boolean comprobarGanador(int[][] matriz) {
        //Compruebo las filas de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if(matriz[i][j]==0 || matriz[i][j]==1){
                    return true;
                }else return false;
            }
        }

        //Compruebo las columnas de la matriz
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if(matriz[i][j]==0 || matriz[i][j]==1){
                    return true;
                }else return false;
            }
        }

        return  false;
    }

    private static void verTablero(int[][] matriz, int turno) {
        System.out.print("Es el turno de: ");
        if (turno==0){
            System.out.println("Maquina");
        }else{
            System.out.println("Humano");
        }
        System.out.println("\n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }

    /**
     * Metodo para poner la ficha en el tablero según el turno que sea.
     * @param matriz Las fichas 0 son maquina y 1 son el usuario.
     * @param turno Turno para maquina igual a 0, para usuario 1.
     */
    private static void ponerFicha(int[][] matriz, int turno) {
        int fila=0, columna =0;
        boolean casillaValida=false;

        if(turno==0){
            do {
                fila = Utils.pedirNumeroAleatorio(0, 2);
                columna = Utils.pedirNumeroAleatorio(0, 2);
                casillaValida=comprobarCasillaValida(matriz, fila, columna);
                if (casillaValida) {
                    matriz[fila][columna] = 0;
                    break;
                }
            }while(!casillaValida);
            //Le toca a la máquina
        } else {
            do {
                //Le toca al usuario
                System.out.println("En qué casilla quieres poner la ficha.");
                fila = Utils.pedirNumeroUsuario("Dame la i:");
                columna = Utils.pedirNumeroUsuario("Dame la j: ");
                casillaValida=comprobarCasillaValida(matriz, fila, columna);
                matriz[fila][columna] = 1;
                if (casillaValida){
                    matriz[fila][columna]=1;
                }else {
                    System.out.println("Casilla invalida, piensa otra.");
                }
            }while (!casillaValida);
        }
    }

    private static boolean comprobarCasillaValida(int[][] matriz, int fila, int columna) {
        if (matriz[fila][columna]==2){
            return true;}
        else {return false;}
    }
}
