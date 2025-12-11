package primer_trimestre.pet_shop;

public class Pájaros extends Animales{
    public String color;
    public TIPO_LORO tipoLoro;
    public static final double precioPajaro=10;

    public Pájaros(SEXO sexo, int edad, String EAN, String color, TIPO_LORO tipoLoro) {
        super(sexo, edad, EAN);
        this.color=color;
        this.tipoLoro=tipoLoro;
    }

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
                ", sexo=" + sexo +
                ", edad=" + edad +
                ", EAN='" + EAN + '\'' +
                '}';
    }
}
