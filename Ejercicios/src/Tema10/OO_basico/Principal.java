package Tema10.OO_basico;

import Utilidades.Utils;

import java.util.Arrays;

public class Principal {
    /**
     * Realiza en Java un programa para gestionar los siguientes datos de tres personas: Nombre,
     *  Apellidos, DNI, dirección, teléfono. El programa deberá mostrar un menú al usuario.
     *  En el menú existirán las opciones de:
     *  0- Salir
     *  1- Introducir datos de persona
     *  2- Ver las personas introducidas, con todos sus datos.
     *
     *  Debes crear la clase "Persona". A continuación crearás los constructores habituales, getters,
     *  setters y método toString().
     *
     *  En la clase principal (en la que estará el menú) debes crear un array de 3 personas que debes
     *  ir rellenando poco a poco, con datos introducidos por el usuario.
     */

    static void main(String[] args) {
        Persona[] personas = new Persona[3];

        Persona persona1 = new Persona("", "", "99999999A", 999999999);
        Persona persona2 = new Persona("", "", "99999999A", 999999999);
        Persona persona3 = new Persona("", "", "99999999A", 999999999);

        personas[0] = persona1;
        personas[1] = persona2;
        personas[2] = persona3;

        int op= 0;
        do {
            System.out.println("0-\tSalir\n1-\tIntroducir datos de persona\n2-\tVer las personas introducidas, con todos sus datos");
            op= Utils.pedirNumeroUsuario("Introduce la opción que desea realizar: ");
            switch (op) {
                case 0:
                    break;
                case 1:
                    int personaSelect = Utils.pedirNumeroUsuario("Introduce le número de persona que desea modificar(1, 2 o 3): ");
                    if (personaSelect >= 1 && personaSelect <= 3) {
                        Persona personaSeleccionada = personas[personaSelect - 1];

                        String nombre = Utils.pedirCadenaUsuario("Introduce el nombre: ");
                        String apellido = Utils.pedirCadenaUsuario("Introduce el apellido: ");
                        String DNI = Utils.pedirCadenaUsuario("Introduce el DNI: ");
                        int telefono = Utils.pedirNumeroUsuario("Introduce el telefono: ");

                        personaSeleccionada.setNombre(nombre);
                        personaSeleccionada.setApellido(apellido);
                        personaSeleccionada.setDNI(DNI);
                        personaSeleccionada.setTelefono(telefono);

                        System.out.println("Datos actualizados correctamente!");
                    }
                    break;
                case 2:
                    System.out.println(Arrays.toString(personas));
                    break;
            }
        }while(op != 0);

    }

}
