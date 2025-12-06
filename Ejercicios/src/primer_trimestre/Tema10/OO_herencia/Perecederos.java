package primer_trimestre.Tema10.OO_herencia;

public class Perecederos extends Productos {
    public String fecha_Caducidad;
    public Perecederos(String codigo, String nombre, String precio, String fecha_Caducidad) {
        super(codigo, nombre, precio);
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public String getFecha_Caducidad() {
        return fecha_Caducidad;
    }

    public void setFecha_Caducidad(String fecha_Caducidad) {
        this.fecha_Caducidad = fecha_Caducidad;
    }

    public String toString(){
        return super.toString()+", fecha de caducidad: "+fecha_Caducidad;
    }

}
