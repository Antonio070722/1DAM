import java.util.Scanner;

public class EjercicioSumaPrimos {
    /**
     *
     * Sumar los n numeros primos que haya entre dos números que elija el usuario
     *
     * Usuario: 3 y el 11 la suma de todos los primos
     * consola: los primos son: 3, 5, 7, 11
     *          la suma total es 26
     *
     * Si el usuario mete un primo superior al segundo mostrar alerta y volver a preguntar
     *
     * usuario: 11 y 3
     * consola: error. no puedo calculas. vuelva a introducir los primos
     * recuerde: el primo mas pequeño primero
     * consola: dime los primos para sumarlos
     * 3
     * 7
     * Los primos son: .......
     */
    static int numinicio = 0;
    static int numfin = 0;
    public static void main(String[] args){
        pedirNums();
        validarNums();
    }
    /**
     * Este metodo es el que se encarga de pedir al usuario que introduzca el primer y último numero entre los que
     * quiere saber los números primos
     */
    public static void pedirNums(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número (El menor número primero)");
        numinicio = sc.nextInt();
        System.out.println("Introduce el segundo número");
        numfin = sc.nextInt();
    }

    /**
     * En este método, valido que los números introducidos sean correctos, es decir, que no sean los dos iguales
     * o el primero mayor que el segundo
     */
    private static void validarNums() {
        if (numinicio == numfin){
            System.out.println("Pero como pones los dos iguales, anda ponmelos bien, el menor primero y el mayor segundo");
        }
        if (numinicio > numfin){
            System.out.println("\033[91mERROR" + ".El primer número tiene que ser menor que el segundo, intentelo de nuevo.");
            pedirNums();
            validarNums();
            ParesEntreNum();
        }else{
            ParesEntreNum();
        }
    }

    /**
     * Aquí hago el bucle, mientras el primer número sea menor que el segundo, que
     */
    private static void ParesEntreNum(){
        for (int i = numinicio; i <= numfin; i++ ){
            int numero = i;
             if (numero % 2 == 0){
                System.out.print(i + " ");
             }
        }
    }

//    private static boolean PrimosEntreNum(){
//
//    }
}
