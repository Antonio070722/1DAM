package Clases;
//LOS COMENTARIOS
/**
 * Contructor de la clase para iniciar un banco desde el
 * numero de la sucursal
 */
public class Banco {
    int sucursal;
    String direccion="";
    int telefono =0;
    private Cliente[] cliente = new Cliente[Cliente.numeroMaxClientes];
    private int contador=0;


    public Banco(int numeroSucursal){
        this.sucursal=numeroSucursal;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString(){
        return this.sucursal + " Ad: "+this.direccion + " Telf: "+this.telefono;
    }

    /**
     * Crear el cliente dado el numero de cuenta y el nombre
     * @param nombre
     * @param numeroCuenta
     */
    public void crearCliente(String nombre, int numeroCuenta){
        cliente[Cliente.numeroTotalClientes]=new Cliente();
        Cliente.numeroTotalClientes= Cliente.numeroTotalClientes+1;
    }

    /**
     * Ver cliente en un banco según ID
     * @param idCliente
     */
    public void verCliente(int idCliente) {

        System.out.println(cliente[idCliente].toString());
    }

    public void verSaldoCliente(int idCliente) {
        System.out.println("Saldo del cliente: "+cliente[idCliente].getSaldo());
    }

    public void verTodosCliente(int idCliente) {
        for (int i = 0; i < cliente.length; i++) {
            System.out.println(cliente[i].toString());
        }
    }
}
