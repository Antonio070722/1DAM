package primer_trimestre.Repaso_Examenes.Objetos;

import java.util.Random;

public class Jugador {
    Random random = new Random();
    public String nombre;
    public int canastas;
    public int probabilidad_acierto;
    public int canastasFalladas;

    public Jugador(String nombre, int canastas, int probabilidad_acierto, int canastasFalladas) {
        this.nombre = nombre;
        this.canastas = canastas;
        this.probabilidad_acierto = random.nextInt(81)+20;
        this.canastasFalladas = canastasFalladas;
    }

    public Jugador(String nombre){
        this.nombre = nombre;
        this.probabilidad_acierto = random.nextInt(81)+20;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCanastas() {
        return canastas;
    }

    public void setCanastas(int canastas) {
        this.canastas = canastas;
    }

    public void anotarCanastas() {
        this.canastas++;
    }

    public int getProbabilidad_acierto() {
        return probabilidad_acierto;
    }

//    public void setProbabilidad_acierto(int probabilidad_acierto) {
//        this.probabilidad_acierto = probabilidad_acierto;
//    }

    public int getCanastasFalladas() {
        return canastasFalladas;
    }

    public void setCanastasFalladas(int canastasFalladas) {
        this.canastasFalladas = canastasFalladas;
    }

    public void falloCanasta(){
        this.canastasFalladas--;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                ", nombre='" + nombre + '\'' +
                ", canastas=" + canastas +
                ", probabilidad_acierto=" + probabilidad_acierto +
                ", canastasFalladas=" + canastasFalladas +
                '}';
    }
}
