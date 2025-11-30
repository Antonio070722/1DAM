package Tema10.OO_basico;

public class Persona {
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

    public String nombre;
    public String apellido;
    public String DNI;
    public int telefono;

    public Persona(String nombre, String apellido, String DNI, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Datos: " +
                "Nombre='" + nombre + '\'' +
                ", Apellido='" + apellido + '\'' +
                ", DNI='" + DNI + '\'' +
                ", Telefono=" + telefono +
                '}';
    }
}
