package OBJETOS.Cuenta;

public abstract class  CuentaBase implements Cuenta{

    protected double saldo;
    protected int numeroCuenta;
    public Usuario usuario;

    CuentaBase(){

    }

    protected CuentaBase(Usuario usuario, double saldo){
        this.usuario=usuario;
        this.saldo=saldo;
        this.numeroCuenta=0;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void verSaldo() {

    }

    @Override
    public boolean agregarSaldo(double saldo) {
        return false;
    }

    public abstract boolean agregarSaldo();

    @Override
    public boolean vincularCuenta() {
        return false;
    }
}
