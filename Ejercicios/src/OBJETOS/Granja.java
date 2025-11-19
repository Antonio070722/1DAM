package OBJETOS;

import Utilidades.Utils;

public class Granja {

    private String direccion;
    public int hectareas;
    private String tipologia;
    private Animal animales;

    public Granja(String tipologia, int hectareas, String direccion) {
        this.tipologia = tipologia;
        this.hectareas = hectareas;
        this.direccion = direccion;
    }

    public Granja() {

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getHectareas() {
        return hectareas;
    }

    public void setHectareas(int hectareas) {
        this.hectareas = hectareas;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public void inicializarAnimales(){
        String nombre= Utils.pedirCadenaUsuario("Dame nombre para el animal: ");
        String tipo = Utils.pedirCadenaUsuario("Dame tipo de animal: ");
        int edad = Utils.pedirNumeroUsuario("Dame la edad del animal: ");
        animales = new Animal (edad, tipo, nombre);
    }

    public void verAnimales(){
        System.out.println(animales.toString());
    }

    @Override
    public String toString() {
        return "Granja{" +
                "direccion='" + direccion + '\'' +
                ", hectareas=" + hectareas +
                ", tipologia='" + tipologia + '\'' +
                ", animales=" + animales +
                '}';
    }

    public void setearDatos() {
        int velocidad = Utils.pedirNumeroUsuario("Dame la velocidad del animal: ");
        int peso = Utils.pedirNumeroUsuario("Dame el peso del animal: ");

        animales.setPeso(peso);
        animales.setValocidad(velocidad);
    }
}
