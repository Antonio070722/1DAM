package Tema6.Rookie_exercises.Nivel_medio;

public class Ejercicio3 {
//    Crea un ejercicio que imprima en pantalla todas las tablas de multiplicar desde el 1 hasta
//    el 15. Debes utilizar únicamente bucles de tipo "do...while".
    public static void main(String[] args) {
        int inicio = 1;
        int finnums = 10;
        int fintablas = 15;
        int i=1;
        do {
            System.out.println("Tabla del " + inicio+ ": ");
            do {
                System.out.println(inicio + " * " + i + " = " + inicio * i);
                i++;
            } while (i <= finnums);
            System.out.println(" ");
            i=0;
            inicio++;
        }while (inicio <= fintablas);
    }
}
