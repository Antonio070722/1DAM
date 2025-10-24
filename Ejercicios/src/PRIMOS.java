import java.util.Scanner;

public class PRIMOS {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer numero: ");
        int numinicio = sc.nextInt();
        System.out.print("Introduce el segundo numero: ");
        int numfin = sc.nextInt();
        System.out.println("Numeros primos entre " + numinicio + " e " + numfin + " :");
        for (int i = numinicio; i <= numfin; i++) {
            if (esprimobro(i)){
                System.out.print(i + " ");
            }
        }
    }
    private static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    private static boolean esPrimo2(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        } return  true;
    }

    private static boolean esprimobro (int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i<= Math.sqrt(numero); i++){
            if (numero % i == 0){
                return false;
            }
        }return  true;
    }
}
