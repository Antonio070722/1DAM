package primer_trimestre.Tema5.Nivel_alto_tema5;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido!!");
        System.out.println("1.\tCáculo de la hipotenusa de un triángulo.");
        System.out.println("2.\tCáculo de la superficie de una circunferencia.");
        System.out.println("3.\tCáculo del perímetro de una circunferencia.");
        System.out.println("4.\tCáculo del área de un rectángulo..");
        System.out.println("5.\tCáculo del área de un triángulo.");
        System.out.println();
        System.out.print("Introduce el número correspondiente a la operación que desea realizar: ");
        int op = sc.nextInt();
        if (op == 1) {
            System.out.println("Has seleccionado el calculo de la hipotenusa de un triángulo, introduce los catetos: ");
            System.out.println("Cateto 'a': ");
            double catetoa = sc.nextDouble();
            System.out.println("Cateto 'b': ");
            double catetob = sc.nextDouble();
            hipotenusa(catetoa, catetob);
        } else if (op == 2) {
            System.out.println("Has seleccionado el calculo de la superficie de una circunferencia, introduce el radio de la circunferencia: ");
            double radioArea = sc.nextDouble();
            circunferencia(radioArea);
        } else if (op == 3) {
            System.out.println("Has seleccionado el calculo del perímetro de una circunferencia, introduce el radio de la circunferencia:");
            double radioPerim = sc.nextDouble();
            perimetroCircunferencia(radioPerim);
        } else if (op == 4) {
            System.out.println("Has seleccionado el calculo del área de un rectangulo, introduce primero la base: ");
            double base = sc.nextDouble();
            System.out.println("Ahora, introduce la altura: ");
            double altura = sc.nextDouble();
            areaRectangulo(base, altura);
        } else if (op == 5) {
            System.out.println("Has seleccionado el calculo del área de un triangulo, introduce primero la base: ");
            double base = sc.nextDouble();
            System.out.println("Ahora, introduce la altura: ");
            double altura = sc.nextDouble();
            areaTriangulo(base, altura);
        } else {
            System.out.println("Introduce un número válido.");
            main();
        }
    }
    private static void hipotenusa(double catetoa, double catetob) {
        //Formula: h2 = a2 + b2 --> h2 = catetoa elevado a 2 + catetob elevado a 2 --> h2 = raiz cuadrada del
        //resultado de sumar el resultado de las potenccias de los catetos
        double resultcatetoa = Math.pow(catetoa, 2);
        double resultcatetob = Math.pow(catetob, 2);
        double h2 = resultcatetoa + resultcatetob;
        double resultado = Math.sqrt(h2);

        System.out.println("La hipotenusa de ese triangulo es " + resultado);
    }
    private static void circunferencia(double radioArea) {
        //Formula: A (area) = pi (3.1416) * r2
        double potenciaradio = Math.pow(radioArea, 2);
        double resultado = 3.1416 * potenciaradio;
        System.out.println("La circunferencia es " + resultado + " cm³");
    }
    private static  void perimetroCircunferencia(double radioPerim) {
        //Formula: P = 2 * pi(3.1416) * radio
        double resultado = 2 * 3.1416 * radioPerim;
        System.out.println("El perímetro es " + resultado);
    }
    private static  void areaRectangulo(double base, double altura) {
        //Formula --> A = base * altura
        double areaRectangulo = base*altura;
        System.out.println("El área del rectangulo es " + areaRectangulo);
    }
    private static void areaTriangulo(double base, double altura) {
        double basePorAltura = base*altura;
        double resultado = basePorAltura/2;
        System.out.println("El área del triangulo es " + resultado);
    }
}
