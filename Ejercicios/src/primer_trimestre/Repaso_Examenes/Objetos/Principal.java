package primer_trimestre.Repaso_Examenes.Objetos;

import java.util.Random;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) {
        Random random = new Random();
        int prob = 0;
        Partido partido = new Partido();
        System.out.println(partido);

        Jugador[] equipo1 = partido.getEquipo1();
        Jugador[] equipo2 = partido.getEquipo2();
        int rondas=3;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Equipo 1: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(equipo1[i]);
            System.out.println(equipo1[i].getProbabilidad_acierto());
            prob = random.nextInt(100);
            if (equipo1[i].getProbabilidad_acierto() > prob) {
                equipo1[i].anotarCanastas();
                System.out.println("Canasta!!");
            } else {
                equipo1[i].falloCanasta();
                System.out.println("Ha fallado!!");
            }
        }
        System.out.println("\n\nEquipo 2: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(equipo2[i]);
//            equipo1[i].getProbabilidad_acierto();
//            equipo1[i].setProbabilidad_acierto(random.nextInt(100));
            System.out.println(equipo2[i].getProbabilidad_acierto());
            prob = random.nextInt(100);
            if (equipo2[i].getProbabilidad_acierto() > prob) {
                equipo2[i].anotarCanastas();
                System.out.println("Canasta!!");
            } else {
                equipo2[i].falloCanasta();
                System.out.println("Ha fallado!!");
            }
        }
            System.out.println("Pulsa ENTER. Rondas restantes: "+rondas);
            rondas--;
            sc.nextLine();
        }while(rondas>=0);

        String masCanastas="";
        int masCanasta=0;

        String masCanastasEqu1="";
        int masCanastaEqu1=0;
        String masCanastasEqu2="";
        int masCanastaEqu2=0;
        for (int i = 1; i < 5; i++) {
            if (equipo1[i].getCanastas() > masCanastaEqu1){
                masCanastasEqu1=equipo1[i].getNombre();
                masCanastaEqu1=equipo1[i].canastas;
            }

            if (equipo1[i].getCanastas() > masCanasta){
                masCanastas=equipo1[i].getNombre();
                masCanasta=equipo1[i].canastas;
            }

            if (equipo2[i].getCanastas() > masCanastaEqu2){
                masCanastasEqu2=equipo2[i].getNombre();
                masCanastaEqu2=equipo2[i].canastas;
            }

            if (equipo2[i].getCanastas() > masCanasta){
                masCanastas=equipo2[i].getNombre();
                masCanasta=equipo2[i].canastas;
            }
        }
        System.out.println("Maximo puntuador equipo1: "+masCanastasEqu1);
        System.out.println("Máximo puntuador equipo2: "+masCanastasEqu2);
        System.out.println("Máximo puntuador del partido "+masCanastas+", con "+masCanasta+" puntos");
    }
}
