package Pokemon;

import Utilidades.Utils;
import jdk.jshell.execution.Util;

public class Pokeball {
    public TIPOPokeballs tipo;
    public int probabilidadCaptura=0;

    public Pokeball(){
        int numeroAzar= Utils.pedirNumeroAleatorio(1,3);
        switch(numeroAzar){
            case 1:
                this.tipo=TIPOPokeballs.BASICA;
                this.probabilidadCaptura=20;
                break;
            case 2:
                this.tipo=TIPOPokeballs.SUPER;
                this.probabilidadCaptura=50;
                break;
            case 3:
                this.tipo=TIPOPokeballs.ULTRA;
                this.probabilidadCaptura=80;
                break;
            default:
                this.tipo=TIPOPokeballs.BASICA;
        }
    }
}
