package OBJETOS.Cuenta;

public class Usuario {

    public String nombre;
    public String apellidos;
    public int telefono;
    public TIPO_CUENTA tipocuenta;
    private double saldo;

    private Usuario(){

    }

    public Usuario(String nombre, TIPO_CUENTA tipocuenta){
        this.nombre=nombre;
        this.tipocuenta=tipocuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public TIPO_CUENTA getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(TIPO_CUENTA tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\'' +
                ", tipocuenta=" + tipocuenta +
                ", saldo=" + saldo;
    }
}
