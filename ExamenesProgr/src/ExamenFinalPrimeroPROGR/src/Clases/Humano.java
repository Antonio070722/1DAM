package Clases;

public class Humano {

    public int ptosVida=0;
    public int golpe=70;
    public boolean estaVivo=true;
    public int id;

    public Humano(){

    }

    public Humano(int puntosVida){
        this.ptosVida=puntosVida;
    }

    public Humano(int id, int puntosVida){
        this.id=id;
        this.ptosVida=puntosVida;
    }

    public int getPtosVida() {
        return ptosVida;
    }

    public void setPtosVida(int ptosVida) {
        this.ptosVida = ptosVida;
    }

    public int getGolpe() {
        return golpe;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Humano{" +
                "ptosVida=" + ptosVida +
                ", golpe=" + golpe +
                ", estaVivo=" + estaVivo +
                ", id=" + id +
                '}';
    }

    public void recibirDanyo(int danyo){
        this.ptosVida=this.ptosVida-danyo;
    }

}
