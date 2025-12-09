package Pokemon;

import Utilidades.Utils;

public class EntrenadorPokemon {
    public String nombre="";
    public int numeroPokemonsCapturados;
    public int getNumeroPokemonsVistos;

    public PokemonImpl[] pokemonsCapturados = new PokemonImpl[Pokemon.numeroPokemons];

    public int numeroPokeballs=3;
    public TIPOPokeballs tipoPokeballs;
    public Pokeball[] pokeballs = new Pokeball[numeroPokeballs];

    public EntrenadorPokemon()

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroPokemonsCapturados() {
        return numeroPokemonsCapturados;
    }

    public void setNumeroPokemonsCapturados(int numeroPokemonsCapturados) {
        this.numeroPokemonsCapturados = numeroPokemonsCapturados;
    }

    public int getGetNumeroPokemonsVistos() {
        return getNumeroPokemonsVistos;
    }

    public void setGetNumeroPokemonsVistos(int getNumeroPokemonsVistos) {
        this.getNumeroPokemonsVistos = getNumeroPokemonsVistos;
    }

    public PokemonImpl[] getPokemonsCapturados() {
        return pokemonsCapturados;
    }

    public void setPokemonsCapturados(PokemonImpl[] pokemonsCapturados) {
        this.pokemonsCapturados = pokemonsCapturados;
    }

    public int getNumeroPokeballs() {
        return numeroPokeballs;
    }

    public void setNumeroPokeballs(int numeroPokeballs) {
        this.numeroPokeballs = numeroPokeballs;
    }

    public TIPOPokeballs getTipoPokeballs() {
        return tipoPokeballs;
    }

    public void setTipoPokeballs(TIPOPokeballs tipoPokeballs) {
        this.tipoPokeballs = tipoPokeballs;
    }

    public Pokeball[] getPokeballs() {
        return pokeballs;
    }

    public void setPokeballs(Pokeball[] pokeballs) {
        this.pokeballs = pokeballs;
    }

    public boolean capturaPokemon(){
        //Tengo pokeballs
        //Capturo pokemon?
        //Actualizo pokedex
        if (getNumeroPokeballs()>0){
            if(pokeballs[primeraDisponible].probabilidadCaptura < Utils.pedirNumeroAleatorio(1,100)){
                System.out.println("Congrats! Pokemon capturado");
                return true;
            }else return false;

            this.numeroPokeballs=this.numeroPokeballs-1;

        }else {
            System.out.println("No tengo pokeballs, tengo que comprar en pueblo paleta");
            return false;
        }
    }

}
