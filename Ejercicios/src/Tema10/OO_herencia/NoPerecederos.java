package Tema10.OO_herencia;

public class NoPerecederos extends Productos {
    public NoPerecederos(String codigo, String nombre, String precio){
        super(codigo, nombre, precio);
    }

    public String toString(){
        return super.toString()+"No perecedero";
    }

}
