package Tema9;

import Utilidades.Utils;
import jdk.jshell.execution.Util;

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
        System.out.println("\t1.\tIsCapicua\n\t2.\tIsPrime\n\t3.\tDigits\n\t4.\tFlip\n\t5.\tDigitN\n\t6.\tDigitPosition\n\t7.\tRemoveByBehind\n\t8.\tPasteByBack\n\t9.\tNumberSnippet\n\t10.\tNumbersTogether");
        int op=Utils.pedirNumeroUsuario("\nIntroduce la operación a realizar: ");
        switch (op) {
            case 1:
                isCapicua();
                break;
            case 2:
                int primo=Utils.pedirNumeroUsuario("Introduce el número a comprobar si es o no primo: ");
                isPrime(primo);
                break;
            case 3:
                int digitos=Utils.pedirNumeroUsuario("Introduce un número para saber cuantos digitos tiene: ");
                digits(digitos);
                break;
            case 4:
                int invert=Utils.pedirNumeroUsuario("Introduce un número a invertir: ");
                flip(invert);
                break;
            case 5:
                int num=Utils.pedirNumeroUsuario("Introduce un número para extraer sus dígitos: ");
                digitN(num);
                break;
            case 6:
                digitPosition();
                break;
            case 7:
                removeByBehind();
                break;
            case 8:
                pasteByBack();
                break;
            case 9:
                numberSnippet();
                break;
            case 10:
                numbersTogether();
                break;
            default:
                System.out.println("Introduce una opción válida");
                break;
        }
    }

    private static void numbersTogether() {
        int num1=Utils.pedirNumeroUsuario("Introduce el primer numero: ");
        int num2=Utils.pedirNumeroUsuario("Introduce el segundo numero(Dígitos máximos 4): ");
        int numFinal=num1;
        int aux=num2;
        int numDigitos=0;
        while(aux>0){
            aux/=10;
            numDigitos++;
        }
        switch(numDigitos){
            case 1:
                numFinal=numFinal*10+num2;
                System.out.println("Números juntos: "+ numFinal);
                break;
            case 2:
                numFinal=numFinal*100+num2;
                System.out.println("Números juntos: "+ numFinal);
                break;
            case 3:
                numFinal=numFinal*1000+num2;
                System.out.println("Números juntos: "+ numFinal);
                break;
            case 4:
                numFinal=numFinal*10000+num2;
                System.out.println("Números juntos: "+ numFinal);
                break;
                default:
                    System.out.println("Error");
                    break;
        }
    }

    private static void numberSnippet() {
        int num=Utils.pedirNumeroUsuario("Introduce el número completo: ");
        int posInicial=Utils.pedirNumeroUsuario("Introduce la posición inicial: ");
        int posFinal=Utils.pedirNumeroUsuario("Introduce la posición final: ");
        int aux=num;
        int contador=0;
        //Contar el número de dígitos para usarlo en el proceso de validación
        while(aux>0){
            aux/=10;
            contador++;
        }
        //Validación
        if (posFinal>contador || posInicial>posFinal || posInicial<=0){
            System.out.println("Introduce datos válidos");
        }else {
            //Si entra en else, significa que los valores son correctos
            //Quitamos la parte de la izquierda
            int parte=num;
            int vecesIzq=contador-posFinal;
            for (int i = 0; i < vecesIzq; i++) {
                parte/=10;
            }
            //Eliminamos dígitos de la derecha
            int vecesDer=posInicial-1;
            int pot=1;
            for (int i = 0; i < vecesDer; i++) {
                pot *=10;
            }
            parte=parte%pot;

            System.out.println("Parte solicitada: "+parte);
        }
    }

    private static void pasteByBack() {
        int num= Utils.pedirNumeroUsuario("Introduce un número: ");
        int add=Utils.pedirNumeroUsuario("Introduce el dígito a añadir al final: ");
        int aux=add;
        int cantidadDig=0;
        while(aux>0){
            aux/=10;
            cantidadDig++;
        }
        if (cantidadDig>1){
            System.out.println("Solo puedes añadir un dígito cada vez.");
        }else {
            num = num * 10 + add;
            System.out.println("Número con el dígito añadido: " + num);
        }
        System.out.println("1.\t Añadir otro número.");
        System.out.println("2.\t Salir");
        int ac=Utils.pedirNumeroUsuario("Que deseas hacer ahora?: ");

        switch (ac){
            case 1:
                pasteByBack();
            break;
            case 2:
                break;
        }
    }

    private static void removeByBehind() {
        int num=Utils.pedirNumeroUsuario("Introduce el número completo: ");
        int digitosElim=Utils.pedirNumeroUsuario("Introduce el número de dígitos a eliminar del número completo: ");
        int aux=num;
        int resto=0;
        int cantDigitos=0;
        while(aux>0){
            resto=aux%10;
            aux=aux/10;
            cantDigitos++;
        }
        if (digitosElim>cantDigitos){
            System.out.println("Introduce una cantidad válida de digitos a eliminar.");
        }else {
            for (int i = 0; i < digitosElim; i++) {
                num /= 10;
            }
            System.out.println("Digitos eliminados, número final: "+num);
        }
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
