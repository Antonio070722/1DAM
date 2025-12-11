package primer_trimestre.pet_shop;

public class Pájaros extends Animales{
    public String color;
    public TIPO_LORO tipoLoro;
    public static final double precioPajaro=10;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TIPO_LORO getTipoLoro() {
        return tipoLoro;
    }

    public void setTipoLoro(TIPO_LORO tipoLoro) {
        this.tipoLoro = tipoLoro;
    }

    @Override
    public String toString() {
        return "Pájaros{" +
                "color='" + color + '\'' +
                ", tipoLoro=" + tipoLoro +
                '}';
    }
}
