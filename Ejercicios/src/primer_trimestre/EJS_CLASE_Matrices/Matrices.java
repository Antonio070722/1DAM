package primer_trimestre.EJS_CLASE_Matrices;

import primer_trimestre.Utilidades.Utils;

public class Matrices {
    public void main(String[] args) {
        int nColum=5;
        int nFilas=5;

        String []modulos={"PROGR","BBDD", "ED", "LM", "SOST"};
        String []alumnos={"Ana", "Curro", "Marta", "Rafa", "Antonio"};
        int []array=new int[5];
        int [][]matriz= new int[nFilas][nColum];
        inicializarMatriz(matriz);
        mostrarMartiz(matriz);
    }

    /**
     * Método para inicializar una matriz dada
     * @param matriz matriz a inicializar
     */
    private static void inicializarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j]= Utils.numeroAleatorio(1,5);
            }
        }
    }

    private static void mostrarMartiz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[0].length; j++) {
                //System.out.println("Matriz [" + i+"][" + j + "]: "+matriz[i][j]);
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }

    }
}
