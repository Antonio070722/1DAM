package primer_trimestre.pet_shop;

public class Ratas_cebo_serpientes extends Animales{
    public double peso;
    public double tamaño;
    public static final double  precioRata=2;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Ratas_cebo_serpientes{" +
                "peso=" + peso +
                ", tamaño=" + tamaño +
                '}';
    }
}
