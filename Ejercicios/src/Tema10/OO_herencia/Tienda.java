package Tema10.OO_herencia;

import Utilidades.Utils;

public class Tienda {
    static void main(String[] args) {
        Productos[] arrayProductos =new Productos[4];
//        Productos producto1 = new Productos("A1", "Producto1", "5.25");
//        Productos producto2 = new Productos("A2", "Producto2", "5.25");
//        Productos producto3 = new Productos("A3", "Producto3", "5.25");
//        Productos producto4 = new Productos("A4", "Producto4", "5.25");
//        Perecederos productoPerecedero = new Perecederos("codigo", "nombre", "precio", "caducidad");

//        arrayProductos[0]= producto1;
//        arrayProductos[1]= producto2;
//        arrayProductos[2]= producto3;
//        arrayProductos[3]= producto4;

        for (int i = 0; i < arrayProductos.length; i++) {
            System.out.println("Añada los datos correspondientes a los productos (producto"+(i+1)+"): ");
            String codigo= Utils.pedirCadenaUsuario("Código: ");
            String nombre= Utils.pedirCadenaUsuario("Nombre: ");
            String precio= Utils.pedirCadenaUsuario("Precio: ");
            String TieneCaducidad= Utils.pedirCadenaUsuario("Es un producto perecedero?: ");
            if (TieneCaducidad.equals("Si")) {
                String caducidad = Utils.pedirCadenaUsuario("Introduce la fecha de caducidad");
                arrayProductos[i] = new Perecederos(codigo, nombre, precio, caducidad);
            }else arrayProductos[i] = new Productos(codigo, nombre, precio);

            arrayProductos[i].setCodigo(codigo);
            arrayProductos[i].setNombre(nombre);
            arrayProductos[i].setPrecio(precio);

            System.out.println("\nDatos actualizados");

            System.out.println("Nombre: "+arrayProductos[i].getNombre()+"\n"+"Código: "+arrayProductos[i].getCodigo()+"\n"+"Precio: "+arrayProductos[i].getPrecio());
            if(TieneCaducidad.equals("Si")){
                System.out.println("Caducidad: "+((Perecederos) arrayProductos[i]).getFecha_Caducidad());
            }
        }

    }
}
