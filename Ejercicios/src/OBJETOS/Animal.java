package OBJETOS;

public class Animal {

    private String nombre;
    private String tipo;
    public int peso;
    private int edad;
    public int valocidad;

    public Animal(int edad, String tipo, String nombre) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getValocidad() {
        return valocidad;
    }

    public void setValocidad(int valocidad) {
        this.valocidad = valocidad;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", peso=" + peso +
                ", edad=" + edad +
                ", valocidad=" + valocidad +
                '}';
    }
}
