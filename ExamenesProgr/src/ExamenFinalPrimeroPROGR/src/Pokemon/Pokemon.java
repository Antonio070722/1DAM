package Pokemon;

public class Pokemon implements InterfazPokemon{

    public static int numeroPokemons=151;

    //Atributos globales
    public int vidaActual =100;
    public int vidaMaxima =100;
    public String nombre ="";
    public int ataqueBasico =5;
    public int ataqueEspecial =20;
    public int defensa=50;
    public boolean vivo = true;

    //variable para comprobar si un pokemon está capturado
    //En caso de que no esté capturado, está libre
    public boolean capturado=false;

    private int numeroPokemon=0;

    public tipoPokemon tipo = tipoPokemon.FUEGO;

    /**
     * Constructor vacío
     */
    public Pokemon(int numeroPokemon){

    }

    /**
     * Contructor público para inicializar con un nombre de pokemon
     * @param nombre
     */

    public Pokemon(String nombre){
        this.nombre=nombre;
    }

    /**
     * Constructor para el nombre del pokemon y su vida máxima
     * @param nombre
     * @param vidaMaxima
     */
    public Pokemon(String nombre, int vidaMaxima){
        this.nombre=nombre;
        this.vidaMaxima=vidaMaxima;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaqueBasico() {
        return ataqueBasico;
    }

    public void setAtaqueBasico(int ataqueBasico) {
        this.ataqueBasico = ataqueBasico;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public tipoPokemon getTipo() {
        return tipo;
    }

    public void setTipo(tipoPokemon tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Soy: " +
                this.nombre+" tengo "+
                this.vidaActual+
                " y soy tipo " +
                this.tipo;
    }

    public void darGolpe(){
        System.out.println("Ataco: "+this.ataqueBasico);
    }

    public void darGolpeEspecial(){
        System.out.println("Ataco: "+this.ataqueEspecial);
    }

    public boolean estoyVivo(){
        if(vidaActual<= 0){
            this.vivo=false;
            return this.vivo;
        }
        return this.vivo;
    }

    @Override
    public void recibirGolpe(int Golpe) {
        this.vidaActual=this.vidaActual-Golpe;
    }

    @Override
    public void darGolpe(int Golpe) {

    }

    @Override
    public void realizarDefensa() {

    }

    public boolean estaCapturado(){
        return this.capturado;
    }

    public void setCapturado(){

    }

}
