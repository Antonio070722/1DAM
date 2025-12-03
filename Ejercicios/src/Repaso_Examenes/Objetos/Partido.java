package Repaso_Examenes.Objetos;

import java.util.Arrays;

public class Partido {

    Jugador[] equipo1 =new Jugador[5];
    Jugador[] equipo2 =new Jugador[5];

    public Partido() {
        for (int i = 0; i < equipo1.length; i++) {
            equipo1[i]=new Jugador("Jugador1_"+(i+1));
            equipo2[i]=new Jugador("Jugador2_"+(i+1));
        }
    }

    public Jugador[] getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Jugador[] equipo1) {
        this.equipo1 = equipo1;
    }

    public Jugador[] getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Jugador[] equipo2) {
        this.equipo2 = equipo2;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "equipo1=" + Arrays.toString(equipo1) +
                ", equipo2=" + Arrays.toString(equipo2) +
                '}';
    }
}
