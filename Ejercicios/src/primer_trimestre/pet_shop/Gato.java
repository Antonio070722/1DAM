package primer_trimestre.pet_shop;

public class Gato extends Mascotas{
    public String color;
    public String raza;
    public TIPO_PELO_GATO tipoPeloGato;
    public static final double precio_gato=50;


    public Gato(String color, String raza, TIPO_PELO_GATO tipoPeloGato, int CHIP) {
        super(CHIP);
        this.color = color;
        this.raza = raza;
        this.tipoPeloGato = tipoPeloGato;
    }

    public Gato(String color, String raza, TIPO_PELO_GATO tipoPeloGato, int CHIP, String nombreMascota) {
        super(nombreMascota, CHIP);
        this.color = color;
        this.raza = raza;
        this.tipoPeloGato = tipoPeloGato;
    }

    public Gato(String color, String raza, TIPO_PELO_GATO tipoPeloGato, int CHIP, String nombreMascota, String nombreDueno, String apellidoDueno, String DNI) {
        super(nombreMascota, CHIP, nombreDueno, apellidoDueno, DNI);
        this.color = color;
        this.raza = raza;
        this.tipoPeloGato = tipoPeloGato;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public TIPO_PELO_GATO getTipoPeloGato() {
        return tipoPeloGato;
    }

    public void setTipoPeloGato(TIPO_PELO_GATO tipoPeloGato) {
        this.tipoPeloGato = tipoPeloGato;
    }

    @Override
    public String toString() {
        return "Gatos{" +
                "color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", tipoPeloGato=" + tipoPeloGato +
                '}';
    }
}
