package primer_trimestre;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import primer_trimestre.OBJETOS.Granja;
import primer_trimestre.Utilidades.Utils;

public class Principal {
//    public static void main (String[] args) {
//        int puntosExtra = 10;
//
//        int numeroAleatorio = Utils.pedirNumeroAleatorio(54,56);
//        System.out.println("Numero Aleatorio MAIN: " + numeroAleatorio);
//    }

//    public static void main (String [] args) {
//        Utils.pedirNumero();
//    }
    public static void main (String [] args){
        Granja granja1 = new Granja();
        granja1.inicializarAnimales();
        granja1.verAnimales();
        granja1.setearDatos();
        granja1.verAnimales();

        int[] array=new int[10];

        Granja[] numeroGranjas =new Granja[50];

        for (int i = 0; i < numeroGranjas.length; i++) {
            numeroGranjas[i].setHectareas(Utils.pedirNumeroAleatorio(20,150));
        }

//
//        Persona persona1 = new Persona("Curro", 38, 174, "8989898989A");
//        persona1.decirEdad();
//
//
//        Persona persona2 = new Persona("Marcos", 18, 170, "8787878787X");
//        persona2.decirEdad();
//        System.out.println(persona2);
//        System.out.println(persona2.hashCode());
//        System.out.println(persona2.getClass());
//
//        Persona persona3 = new Persona("Adrian", 19, 180, "5454545454H");
//        persona3.decirHolas();
//
//        System.out.println(persona2.equals(persona3));



//        TresEnRaya.inicializarTablero();

//      Utils.numeroAleatorio();
//      pedirnotas();
//        String opcion = solicitarCompra();
//        int descuento = aplicarDescuento(opcion);
//        int cantidad = preguntarCantidad(opcion);


    }
//
//
//    private static void pedirnotas(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introduce la primera nota");
//        float nota1 = sc.nextFloat();
//        System.out.println("Introduce la segunda nota");
//        float nota2 = sc.nextFloat();
//        System.out.println("Introduce la tercera nota");
//        float nota3 = sc.nextFloat();
//
//        float notaMedia = calcularnotamedia(nota1,nota2,nota3);
//
//        decidirAprobado(notaMedia);
//
//    }
//    private static float calcularnotamedia(float nota1, float nota2, float nota3) {
//
//        float notaMedia = 0;
//        notaMedia = Math.round((nota1 + nota2 + nota3) / 3);
//        System.out.println("Nota media: " + notaMedia);
//        return notaMedia;
//    }
//    private static void decidirAprobado(float notaMedia){
//        if (notaMedia>= 5){
//            if (notaMedia >= 7 && notaMedia <9){
//                System.out.println("Enhorabuena tienes un notable");
//            } else if (notaMedia >= 9) {
//                System.out.println("Tienes sobresaliente!!");
//            } else {
//            System.out.println("Has aprobado, Enhorabuena!");
//            }
//        }else {
//            System.out.println("Has suspendido");
//        }
    //        switch ( (int) notaMedia){
    //            case 0,1,2,3,4:
    //                System.out.println("Muy suspenso");
    //                break;
    //            case 5,6,7,8,9,10:
    //                System.out.println("Muy bien aprobado");
    //                break;
    //            default:
    //                System.out.println("Nota incorrecta. Debe ser como máximo 10");
    //        }
    //    }

//    private static String solicitarCompra(){
//        String opcion = "";
//        System.out.println("Buenas, por favor, introduzca el tipo " +
//                "de ropa que va a comprar:\n\t1.Jerseys\n\t2.Calzado\n\t3.Complementos");
//        Utils.pedirCadenaUsuarioSinTextoInicial();
//        return opcion;
//    }
//    private static int aplicarDescuento(int opcion){
//        switch (opcion){
//            case "Jerseys","1":
//                break;
//            case "Calzado","2":
//                break;
//            case "Complementos","3":
//                break;
//            default:
//                System.out.println("No hay descuento para esta sección");
//        }
//
//        return opcion;
//    }
//    private static int preguntarCantidad(String opcion){
//        Utils.pedirNumeroUsuario("Introduzca la cantidad de " + opcion + " que desea comprar");
//    }
}