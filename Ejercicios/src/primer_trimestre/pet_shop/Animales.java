package primer_trimestre.pet_shop;

public class Animales {
    public SEXO sexo;
    public int edad;
    public String EAN;

    public Animales(SEXO sexo, int edad, String EAN){
        this.sexo=sexo;
        this.edad=edad;
        this.EAN=EAN;
    }

    public SEXO getSexo() {
        return sexo;
    }

    public void setSexo(SEXO sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad<0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
        if (edad > 36500){
            throw new IllegalArgumentException("Edad no válida: "+edad+" días.");
        }
        this.edad = edad;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }

    @Override
    public String toString() {
        return "Animales{" +
                "sexo=" + sexo +
                ", edad=" + edad +
                ", EAN='" + EAN + '\'' +
                '}';
    }



}
