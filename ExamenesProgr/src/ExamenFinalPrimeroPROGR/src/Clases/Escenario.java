package Clases;

import java.util.Arrays;
import java.util.Random;

public class Escenario {

    public static int numAlien=5;
    public static int numHumano=5;

    public Alien []arrayAlien= new Alien[numAlien];
    public Humano [] arrayHumano=new Humano[numHumano];

    public Escenario(){

    }

    @Override
    public String toString() {
        return "Escenario{" +
                "arrayAlien=" + Arrays.toString(arrayAlien) +
                ", arrayHumano=" + Arrays.toString(arrayHumano) +
                '}';
    }

    /**
     *
     */
    public void generarJugadores(){
        for (int i = 0; i < arrayAlien.length; i++) {
            arrayAlien[i]=new Alien(i, 100);
        }
        for (int i = 0; i < arrayHumano.length; i++) {
            arrayHumano[i]=new Humano(i, 100);
        }
    }

    /**
     * Método para ver todos los aliens del array
     */
    public void verAliens(){
        for (int i = 0; i < arrayAlien.length; i++) {
            System.out.print(arrayAlien[i].toString());
        }
    }



    /**
     * Método para ver todos los humanos del array
     */
    public void verHumanos(){
        for (int i = 0; i < arrayHumano.length; i++) {
            System.out.print(arrayHumano[i].toString());
        }
    }

    /**
     * Método para devolver el primer alien que esté vivo para atizarle hostia
     * @return
     */
    public Alien devolverPrimerAlienVivo(){
        for (int i = 0; i < arrayAlien.length; i++) {
            if (arrayAlien[i].estaVivo){
                return arrayAlien[i];
            }
        }
        return null;
    }

    public Humano devolverPrimerHumanoVivo(){
        for (int i = 0; i < arrayHumano.length; i++) {
            if (arrayHumano[i].estaVivo){
                return arrayHumano[i];
            }
        }
        return null;
    }
    
}
