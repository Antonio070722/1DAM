package primer_trimestre.OBJETOS.Cuenta;

public class CuentaCorriente extends CuentaBase{

    public TIPO_CUENTA tipo;

    public CuentaCorriente(int numeroCuenta, Usuario usuario, double saldo){
        super.numeroCuenta=numeroCuenta;
        super.usuario=usuario;
        super.saldo=saldo;
        this.tipo=TIPO_CUENTA.CUENTA_CORRIENTE;
    }

    @Override
    public void verSaldo() {
        super.verSaldo();
    }

    @Override
    public boolean agregarSaldo() {
        return super.agregarSaldo(100);
    }

    @Override
    public boolean vincularCuenta() {
        return super.vincularCuenta();
    }
}
