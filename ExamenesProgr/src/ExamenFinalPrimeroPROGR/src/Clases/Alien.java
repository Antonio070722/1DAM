package Clases;

public class Alien {
    /**
     * HACER QUE LOS PUNTOS DE VIDA (1-20) Y LOS GOLPES SEAN ALEATORIOS (80-100)
     * Y QUE SI GOLPEA CON EL ARMA (DE FORMA ALEATORIA REPARTIENDO A LOS HUMANOS) QUE QUITE
     * 20 DE VIDA
     * Y DE FORMA ALEATORIA QUE LOS ALIENS USEN ESCUDO, DE FORMA QUE SI ESTÁ ACTIVADO NO QUITE
     * PUNTOS DE VIDA (DENTRO DE RECIBIR DAÑO)
     */
    public int ptosVida=0;
    public int golpe=80;
    public boolean estaVivo=true;
    public int id;

    public Alien(){

    }
    public Alien(int id, int puntosVida){
        this.id=id;
        this.ptosVida=puntosVida;
    }


    public Alien(int puntosVida){
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
        return "Alien{" +
                "ptosVida=" + ptosVida +
                ", golpe=" + golpe +
                ", estaVivo=" + estaVivo +
                ", id=" + id +
                '}';
    }

    public void recibirDanyo(int danyo){
        this.ptosVida=this.ptosVida-danyo;
        if (this.ptosVida <= 0){
            estaVivo=false;
        }
    }

}
