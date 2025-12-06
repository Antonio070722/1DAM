package primer_trimestre.pet_shop;

public class Perros {
    String color;
    String raza;
    TIPO_PELO_PERRO tipoPeloPerro;

    public Perros(String color,  String raza, TIPO_PELO_PERRO tipoPeloPerro) {
        this.color = color;
        this.raza = raza;
        this.tipoPeloPerro = tipoPeloPerro;
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

    public TIPO_PELO_PERRO getTipoPeloPerro() {
        return tipoPeloPerro;
    }

    public void setTipoPeloPerro(TIPO_PELO_PERRO tipoPeloPerro) {
        this.tipoPeloPerro = tipoPeloPerro;
    }

    @Override
    public String toString() {
        return "Perros{" +
                "color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", tipoPeloPerro=" + tipoPeloPerro +
                '}';
    }
}
