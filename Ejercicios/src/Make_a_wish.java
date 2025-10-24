import java.util.Scanner;

public class Make_a_wish {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int deseo = 6;
        System.out.println("Introduce un número del 1 al 10, si aciertas puedes pedir un deseo:");
        deseo = sc.nextInt();
        /**
         * Primero he echo un if para detectar si el numero introducido es invalido
         * si lo es, pasa al else-if el cual analiza si el numero coincide con el del deseo, si no te informa que has fallado.
         */
        if (deseo<1||deseo>10){
            System.out.println("Introduce un numero valido");
        } else if (deseo == 6) {
            System.out.println("ENHORABUENA, pide und deseo!!!");
        } else  {
            System.out.println("Has fallado :(");
        }
    }
}
