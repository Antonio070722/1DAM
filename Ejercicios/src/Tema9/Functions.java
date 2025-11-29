package Tema9;

import Utilidades.Utils;

public class Functions {
    /**
     Crea una biblioteca de funciones matemáticas que contenga las siguientes funciones.
     Recuerda que puedes usarlas entre sí si es necesario.

     - isCapicua: Devuelve true si el número pasado como parámetro es capicúa y
        false en caso contrario.

     - isPrime: Devuelve true si el número que se pasa como parámetro es primo y
        false en caso contrario.

     - digits: Cuenta el número de dígitos de un entero.

     - flip: Voltea un número.

     - digitN: Devuelve el dígito que está en la posición n de un entero.
        Comienza contando por 0 y de izquierda a derecha.

     - digitPosition: Da la posición de la primera ocurrencia de un
        dígito dentro de un entero. Si no se encuentra, devuelve -1.

     - removeByBehind: Elimina n dígitos por detrás (por la derecha).

     - pasteByBack: Añade un dígito a un número por detrás.

     - numberSnippet: Toma las posiciones de inicio y fin como parámetros
        dentro de un número y devuelve el fragmento correspondiente.

     - numbersTogether: Junta dos números para formar uno.
     Después de diseñar las funciones anteriores en el proyecto,
        haz una aplicación Java que recoja cada una de las funciones
        que hacen las funciones a través de una entrada de parámetros
        introducida por el usuario.
     */

    static void main(String[] args) {
        //isCapicua();
        //isPrime(7);
        //digits(122222);
        //flip(1234);
        //digitN(3256);
        digitPosition();
    }

    private static void digitPosition() {
        int num = Utils.pedirNumeroUsuario("Digite el número completo: ");
        int digitoBuscar = Utils.pedirNumeroUsuario("Digite el número a buscar la posición de su primera ocurrencia: ");
        int posicion=0;
        int digito=0;
        int aux=num;
        int cantDigitos=0;

        int resto=0;
        int invertido=0;
        //Invertimos el número
        while (num > 0) {
            resto=num%10;
            num=num/10;
            invertido=invertido*10+resto;
        }
        //Con el número invertimos comprobamos de derecha a izquierda si el número buscado está y muestra la posicion
        while(invertido>0){
            resto=invertido%10;
            invertido=invertido/10;
            if(resto==digitoBuscar){
                System.out.println("Numero encontrado en la posicion "+(cantDigitos+1));
            }
            cantDigitos++;
        }

    }

    private static void digitN(int num) {
        System.out.println("Número: " + num);
        int cantDigitos = 0;
        int digito = 0;
        int aux = num;

        int resto=0;
        int invertido=0;
        //Método para invertir el número y que se muestren los dígitos de izquierda a derecha
        while (num > 0) {
            resto=num%10;
            num=num/10;
            invertido=invertido*10+resto;
        }
        //Contar número de dígitos
        while(aux>0){
            aux=aux/10;
            cantDigitos += 1;
        }
        int posicion=0;
        //Método para extraer cada dígito previamente invertido y mostrarlo por pantalla enumerado
        while (posicion < cantDigitos) {
            digito=invertido%10;
            invertido /= 10;
            System.out.println("Numero posición ["  +(posicion+1)+ "]: " + digito);
            posicion++;
        }
    }

    private static void flip(int num) {
        int resto=0;
        int invertido=0;
        while (num > 0) {
            resto=num%10;
            num=num/10;
            invertido=invertido*10+resto;
        }
        System.out.println("El número invertido es: " + invertido);
    }

    private static void digits(int num) {
        int numDigitos=0;
        while (num > 0) {
            num /= 10;
            numDigitos++;
        }
        System.out.println("El número tiene "+numDigitos+" digitos");
    }

    private static boolean isCapicua() {
        int numOriginal = Utils.pedirNumeroUsuario("Dame un número para comprobar si es Capicúa: ");
        int num=numOriginal;
        int resto=0;
        int numCambiado=0;
        while(num>0){
            resto=num%10;
            num=num/10;
            numCambiado=numCambiado*10+resto;
        }

        if(numCambiado==numOriginal){
            System.out.println("\nEl número es capicúa");
            return true;
        } else {
            System.out.println("\nEl número no es capicúa");
            return false;
        }
    }

    private static boolean isPrime(int num){
        if (num<=1) return false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num%i==0) {
                System.out.println("No es primo");
                return false;
            }
        }
        System.out.println("Es primo");
        return true;
    }

}
