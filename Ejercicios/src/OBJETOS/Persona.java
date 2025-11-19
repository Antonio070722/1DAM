package OBJETOS;

import org.w3c.dom.ls.LSOutput;

public class Persona {

    public int edad;
    private String nombre;
    public int altura;
    private String dni;



    /**
     * Constructor parametrizado de la clase Persona()
     * @param nombre nombre de la persona
     * @param edad Edad de la persona
     * @param altura altura que tiene
     * @param dni y su dni (PRIVADO)
     */

    public Persona(String nombre, int edad, int altura, String dni){
        this.edad= edad;
        this.nombre=nombre;
        this.altura=altura;
        this.dni=dni;
    }

    /**
     * Contructor para inicializar a una Persona solo con el nombre
     * @param nombre nombre de la persona
     */
    public Persona(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre=nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Persona(){
        System.out.println("Constructor invokado");
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void decirHolas(){
        System.out.println("HOLA "+this.nombre);
    }

    public void decirEdad(){
        System.out.println("Soy "+this.nombre+" y tengo "+this.edad);
    }

    @Override
    public String toString(){
        return "Nombre: "+this.nombre+"Edad: "+this.edad+"Altura: "+this.altura;
    }

}
