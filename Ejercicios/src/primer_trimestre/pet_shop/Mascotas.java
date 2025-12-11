package primer_trimestre.pet_shop;

public class Mascotas extends Animales{
    int CHIP;
    String nombreMascota;
    String nombreDueno;
    String apellidoDueno;
    String DNI;

    public Mascotas(int CHIP){
        this.CHIP=CHIP;
    }

    public Mascotas(String nombreMascota, int CHIP){
        this.nombreMascota=nombreMascota;
        this.CHIP=CHIP;
    }

    public Mascotas(String nombreMascota, int CHIP, String nombreDueno, String apellidoDueno, String DNI){
        this.nombreMascota=nombreMascota;
        this.CHIP=CHIP;
        this.nombreDueno=nombreDueno;
        this.apellidoDueno=apellidoDueno;
        this.DNI=DNI;
    }

    public int getCHIP() {
        return CHIP;
    }

    public void setCHIP(int CHIP) {
        this.CHIP = CHIP;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getNombreDueno() {
        return nombreDueno;
    }

    public void setNombreDueno(String nombreDueno) {
        this.nombreDueno = nombreDueno;
    }

    public String getApellidoDueno() {
        return apellidoDueno;
    }

    public void setApellidoDueno(String apellidoDueno) {
        this.apellidoDueno = apellidoDueno;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "CHIP=" + CHIP +
                ", nombreMascota='" + nombreMascota + '\'' +
                ", nombreDueno='" + nombreDueno + '\'' +
                ", apellidoDueno='" + apellidoDueno + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}
