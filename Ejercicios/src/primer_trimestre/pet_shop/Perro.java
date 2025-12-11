package primer_trimestre.pet_shop;

public class Perro extends Mascotas{
    public String color;
    public String raza;
    public TIPO_PELO_PERRO tipoPeloPerro;
    public double peligree;
    public static final double PRECIO_SIN_PELIGREE=100;
    public static final double PRECIO_CON_PELIGREE=200;

    public Perro(String color,  String raza, TIPO_PELO_PERRO tipoPeloPerro, double pedigree, int CHIP) {
        super(CHIP);
        this.color = color;
        this.raza = raza;
        this.tipoPeloPerro = tipoPeloPerro;
        this.peligree=pedigree;
    }

    public Perro(String color,  String raza, TIPO_PELO_PERRO tipoPeloPerro, double pedigree, int CHIP, String nombreMascota) {
        super(nombreMascota, CHIP);
        this.color = color;
        this.raza = raza;
        this.tipoPeloPerro = tipoPeloPerro;
        this.peligree=pedigree;
    }

    public Perro(String color,  String raza, TIPO_PELO_PERRO tipoPeloPerro, double pedigree, int CHIP, String nombreMascota, String nombreDueno, String apellidoDueno, String DNI) {
        super(nombreMascota, CHIP, nombreDueno, apellidoDueno, DNI);
        this.color = color;
        this.raza = raza;
        this.tipoPeloPerro = tipoPeloPerro;
        this.peligree=pedigree;
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

    public void getPedigree(double pedigree) {
        this.peligree = pedigree;
    }

    public void setPedigree(double pedigree) {
        this.peligree = pedigree;
    }

    @Override
    public String toString() {
        return "Perros{" +
                "color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", tipoPeloPerro=" + tipoPeloPerro +
                ", pedigree='" + peligree + '\'' +
                '}';
    }
}
