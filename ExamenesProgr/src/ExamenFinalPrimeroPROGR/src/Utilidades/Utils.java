package Utilidades;

import java.util.Random;
import java.util.Scanner;

public class Utils {

    public static int pedirNumeroUsuario(String textoInicial){
        Scanner sc = new Scanner(System.in);
        System.out.print(textoInicial);
        //System.out.println(textoInicial); textoInicial: "Introduce un numero"
        int numero = sc.nextInt();
        return numero;
    }

//    public static int pedirNumeroAleatorio(int minimo, int maximo){
//        int numeroAleatorio = 0;
//
//        System.out.println(Math.round(Math.random()*50));
//
//        System.out.println("Numero aleatorio UTILS: " + numeroAleatorio);
//        System.out.println();
//        return numeroAleatorio;
//    }
    public static int numeroAleatorio(int min, int max){
            int aleatorio = (int)(Math.random() * (max - min + 1)) + min;
            return aleatorio;
    }

    /**
     * Metodo para solicitar una frase/cadena al usuario al usuario
     * @param cadenaInicial texto que va a salir en pantalla al usuario
     * @return la cadena introducida por el usuario
     */

    public static String pedirCadenaUsuario(String cadenaInicial){
        String cadenaUsuario = "";
        System.out.print(cadenaInicial);

        Scanner sc = new Scanner(System.in);

        cadenaUsuario = sc.nextLine();
        return cadenaUsuario;
    }

    public static String pedirCadenaUsuarioSinTextoInicial(){
        String cadenaUsuario = "";

        Scanner sc = new Scanner(System.in);

        cadenaUsuario = sc.nextLine();
        return cadenaUsuario;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    public static boolean esPrimoSinFor(int numero, int divisor){
        if (numero < 2){
            return false;
        }
        if (divisor > Math.sqrt(numero)){
            return true;
        }
        if (numero % divisor == 0){
            return false;
        }
        return esPrimoSinFor(numero, divisor+1);
    }

    public static void intercambioValores(int valor1, int valor2){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la primera variable");
        int var1 = sc.nextInt();
        System.out.println("Introduce la segunda variable");
        int var2 = sc.nextInt();
        System.out.println("Las variables introducidad antes del intercambio son las siguientes: " + var1 + ", " + var2 + ".");
        var1 = var1 + var2;
        var2 = var1 - var2;
        var1= var1 - var2;
        System.out.println("Las variables intercambiadas son: ");
        System.out.println("Primera variable introducida: " + var1 + ".");
        System.out.println("Segunda variable introducida: " + var2 + ".");
    }

    public static void hipoteca(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Euribor: ");
        float Euribor = sc.nextFloat();

        System.out.println("Introduce el Diferencial:");
        float Diferencial = sc.nextFloat();

        System.out.println("Introduce el Capital:");
        float Capital = sc.nextFloat();

        System.out.println("Introduce el numero de plazos mensuales para pagar la hipoteca");
        int Plazo = sc.nextInt();

        //Interés anual
        float interesAnual = Euribor + Diferencial;

        //Interés mensual
        float interesmen = interesAnual / (12*100); //Se divide entre 100 para pasar a decimal

        //Fórmula
        double numerador = interesmen * Math.pow(1 + interesmen, Plazo);
        double denominador = Math.pow(1 + interesmen, Plazo) - 1;
        double cuotaMen = Capital * (numerador/denominador);

        //Resultado
        System.out.println("La cuota mensual es de " + cuotaMen);
    }

    public static int encontrarMayor(int num1, int num2, int num3, int num4, int num5) {
        int mayor = num1;

        if (num2 > mayor) mayor = num2;
        if (num3 > mayor) mayor = num3;
        if (num4 > mayor) mayor = num4;
        if (num5 > mayor) mayor = num5;

        return mayor;
    }

    /**
     *
     * @param numero
     * @return
     */
    public static int NumFactorial(int numero) {
        int factorial = 1;

        for(int i = 1; i <= numero ; i++){
            System.out.println("Factorial: " + i + " multiplicado por: " + i);
            factorial = factorial * i;
        }
        System.out.println("El resultado final es: " + factorial);
        return factorial;
    }

    /**
     *
     * @param numeroFactorial
     * @return
     */
    public static int factorialRecursivo(int numeroFactorial){
        int factorial = 1;

        if (numeroFactorial == 1){
            factorial = 1;
        } else {
            factorial = numeroFactorial * factorialRecursivo(numeroFactorial - 1);
        }

        return factorial;
    }

    /**
     * Método para que muestre un numero de digitos de la serie Fiboracci introducidos por el usuario
     */
    public static void mostrarSerieFibonacci(){

        int nElementos = pedirNumeroUsuario("Dame un numero " + "de elementos de la serie de Fibonacci");
        int a = 1;
        int b = 1;
        int anterior = 0;
        int posterior = 1;
        System.out.println("Elementos Fibonacci: ");

        for (int i = 0; i < nElementos; i++){
//            int sumaElementos = a + b;
//            a = b;
//            b = sumaElementos;
//
//            System.out.println("\t" + sumaElementos);
            int resultado = anterior + posterior;
            anterior = posterior;
            posterior = resultado;
            System.out.println("\t" + resultado);
        }
    }
    public static int mostrarSerieFiboracciRecursivamente(int elemento){
        if (elemento == 0) {
            return 0;
        } else if (elemento == 1) {
            return 1;
        } else {
            int result = mostrarSerieFiboracciRecursivamente(elemento-1) + mostrarSerieFiboracciRecursivamente(elemento-2);
            return result;
        }
    }
    public static void arraybasicoexplicado(){
        // Declarar e inicializar un array con valores fijos
        int[] numeros = {1, 2, 3, 4, 5};
        //    También se puede declarar un array de distintas formas:
        //    - Con tamaño fijo (sin valores aún): int[] numeros = new int[5];
        //      → Esto crea un array con 5 posiciones (todas con valor 0 por defecto).
        //    - Asignando valores más tarde, por ejemplo:
        //         int[] numeros = new int[3];
        //         numeros[0] = 10;
        //         numeros[1] = 20;
        //         numeros[2] = 30;
        //    - O directamente con valores como en este ejemplo.

        // 2️⃣ Mostrar los valores usando un bucle for
        System.out.println("Contenido del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }
    }

    public static int pedirNumeroAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt(maximo - minimo + 1) + minimo; // Genera un número entre 'minimo' y 'maximo'
    }

    public static void mostrarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor array["+i+"] ="+array[i]);
        }
    }
}
