package Clases;
//LOS COMENTARIOS
public class Cliente {

    public String nombre;
    private double saldo;
    private int numeroCuenta;
    public static int numeroTotalClientes=0;
    public static int numeroMaxClientes=10;

    Cliente(){

    }

    public Cliente(String nombre, int numeroCuenta){
        this.nombre=nombre;
        this.saldo=0;
        this.numeroCuenta=numeroCuenta;
    }

    public Cliente(String nombre, double saldo, int numeroCuenta){
        this.nombre=nombre;
        this.saldo=saldo;
        this.numeroCuenta=numeroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", saldo=" + saldo +
                ", numeroCuenta=" + numeroCuenta +
                '}';
    }

    /**
     * método para ingresar saldo en la cuenta de un cliente
     * @param nuevoSaldo cantidad a ingresar
     */
    public void ingresarSaldo(String nuevoSaldo){
        this.saldo+=saldo;
        System.out.println("Su saldo ha sido actualizado con éxito. Nuevo saldo "+this.saldo);
    }

    /**
     * Método para retirar dinero de la cuenta del usuario
     * @param retiradaDinero cantidad a retirar
     */
    public void sacarDinero(double retiradaDinero){
        this.saldo-=retiradaDinero;
        System.out.println("Su saldo ha sido actualizado con éxito. Nuevo saldo "+this.saldo);
    }

    public void mostrarNumeroCuenta(){
        System.out.println("Su número de cuenta es: "+this.numeroCuenta);
    }
}
