package OBJETOS.Cuenta;

import Utilidades.Utils;

public class Principal {
    static void main(String[] args) {

        Usuario usuario1 = new Usuario("Curro", TIPO_CUENTA.CUENTA_CORRIENTE);
        usuario1.setSaldo(200);

        Usuario usuario2 = new Usuario("Curro", TIPO_CUENTA.CUENTA_AHORRO);
        usuario2.setSaldo(200);

        System.out.println(usuario1);
        System.out.println(usuario2);


        CuentaCorriente cc = new CuentaCorriente(Utils.pedirNumeroAleatorio(1000000,10000000), usuario1, usuario1.getSaldo());

        cc.agregarSaldo(1000);
        System.out.println(cc.getUsuario() + " numero cuenta: "+cc.getNumeroCuenta());

        CuentaAhorro ca = new CuentaAhorro(Utils.pedirNumeroAleatorio(1000000,10000000), usuario2, usuario2.getSaldo());

        if (TIPO_CUENTA.CUENTA_AHORRO == cc.tipo){

        }
//
//        CuentaBase ca2 = new CuentaAhorro();

    }
}
