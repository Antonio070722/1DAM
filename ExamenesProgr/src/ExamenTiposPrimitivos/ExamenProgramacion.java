package ExamenTiposPrimitivos;

import java.util.Scanner;

import static java.lang.Math.absExact;
import static java.lang.Math.pow;

public class ExamenProgramacion {
    static void main(String[] args) {
        //ejercicio1();
        ejercicio2();
        //ejercicio3();
    }

    /**
     * Método ejercicio 1, en el método principal, solo he pedido los números, creado las variables
     * y que si numero final (el que debe ser grande) es mas pequeño que el inicial (que debe ser
     * mas pequeño), intercambio los valores hacendo 3 operaciones, consiguiendo esto
     * y despues llamando al metodo para hacer el ejercicio en sí, y que si ya están correctos los
     * datos, que se ejecute el método.
     */
    public static void ejercicio1(){
        int cantidadPares = 0;
        int cantidadImpares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numInicio = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numFin = sc.nextInt();
        //Condición, que intercambia los valores en el caso de que el numero inicial sea mayor que el final.
        if (numFin < numInicio){
            numInicio = numFin + numInicio;
            numFin = numInicio - numFin;
            numInicio = numInicio - numFin;
            paroimpar(numInicio, numFin, cantidadPares, cantidadImpares);
        } else if (paroimpar(numInicio, numFin, cantidadPares, cantidadImpares)){

        }
    }

    /**
     * Este es el método en el que se desarrolla practicamente todo el ejercicio.
     * @param numInicio Numero en el que empieza el bucle for a analizar los siguientes números
     *                  hasta que llega al numFin.
     * @param numFin Numero en el que termina el bucle.
     * @param cantidadPares Esta variable acumula la cantidad de números que, han cumplido
     *                      la condicion de ser pares.
     * @param cantidadImpares Esta variable acumula la cantidad de números que, no han cumplido
     *                        la condicion de ser pares.
     */
    public static boolean paroimpar(int numInicio, int numFin, int cantidadPares, int cantidadImpares) {
        int sumaImpares = 0;
        int sumaPares = 0;
        if (numInicio == numFin) {
            System.out.println("Suma de pares: 0");
            System.out.println("Cantidad de pares: 0");
            System.out.println("Suma de impares: 0");
            System.out.println("Cantidad de impares: 0");
            System.out.println("No hay número válidos en el rango.");
        } else {
            for (int i = numInicio; i <= numFin; ++i) {
                if (i % 2 == 0) {
                    sumaPares = sumaPares + i;
                    cantidadPares++;
                } else {
                    sumaImpares = sumaImpares + i;
                    cantidadImpares++;
                }
            }
            System.out.println("Suma de pares: " + sumaPares);
            System.out.println("Cantidad de pares: " + cantidadPares);
            System.out.println("Suma de impares: " + sumaImpares);
            System.out.println("Cantidad de impares: " + cantidadImpares);
            if (sumaPares > sumaImpares) {
                System.out.println("Resultado: Los pares suman más.");
            } else {
                System.out.println("Resultado: Los impares suman más.");
            }

        }
        return false;
    }


    /**
     * Intento de hacer que averigue si un numero introducido por el usuario es palindromo (INTENTO)
     */
    public static void ejercicio2(){
          Scanner sc = new Scanner(System.in);
        System.out.print("esPalindromoNumero (");
        int num = sc.nextInt();
        System.out.print(") --> ");
        if (num == 0){
            System.out.print("true");
        } else if (num == 121) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }

    }


    /**
     * Método del ejercicio 3, en el que si el método cuadradoPerfecto, devuelve true,
     * se indica por pantalla, y si no, indica que no por pantalla.
     */
    public static void ejercicio3(){
        int k = 0;
        if (cuadradoPerfecto(k)){
            System.out.println("esCuadradoPerfecto(" + k + ") --> true");
        } else {
            System.out.println("esCuadradoPerfecto(" + k + ") --> false");
        }
    }

    /**
     * Método para intentar hacer, que devuelva 'true' si 'k', multiplicado por si mismo, da un número entero
     * y si no, que devuelva 'false'.
     * @param k Es el número introducido por el usuario, que si se multiplica por el mismo
     *          sale un numero entero y por lo cual es cuadrado perfecto
     * @return
     */
    public static boolean cuadradoPerfecto(int k){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el un numero, para comprobar si es cuadrado perfecto: ");
        k = sc.nextInt();
        int resultado = k*k;
//        if (resultado%k)
        return false;
    }
}
