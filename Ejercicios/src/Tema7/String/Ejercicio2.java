package Tema7.String;

import Utilidades.Utils;

public class Ejercicio2 {
//    2.- Desde "main" lee una cadena de caracteres (String) del usuario, con Scanner o
//    JOptionPane. Envía la cadena de caracteres a un método que cuente y muestre en consola
//    cuántas vocales y consonantes hay en el texto. En la cadena de caracteres no debe haber
//    vocales con tilde o 'ñ'.
    static void main() {
        String cadenaCaracteres = Utils.pedirCadenaUsuario("Introduce una frase o palabra: ");
        contarVocalesYConsonantes(cadenaCaracteres);
    }

    private static void contarVocalesYConsonantes(String cadenaCaracteres) {
        int vocalesTotales=0;
        int consonantesTotales=0;
        String cadena = cadenaCaracteres.toLowerCase();
        for (int i = cadenaCaracteres.length()-1; i >= 0; i--) {
            char caracter = cadena.charAt(i);
            //si es letra:
            if (Character.isLetter(caracter)){
                if (caracter == 'a' || caracter == 'e' ||caracter == 'i' || caracter == 'o' || caracter == 'u'){
                    vocalesTotales++;
                }else {
                    consonantesTotales++;
                }
            }
        }
        System.out.println("Las vocales totales son: " + vocalesTotales);
        System.out.println("Las consonantes totales son: " + consonantesTotales);
    }
}
