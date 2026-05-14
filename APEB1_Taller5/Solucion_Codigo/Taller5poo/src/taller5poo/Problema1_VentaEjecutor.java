/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5poo;

/**
 *
 * @author jdavi
 */
public class Problema1_VentaEjecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Problema1_Producto productoTienda = new Problema1_Producto("Televisor", 1299.99, 5);

        Problema1_Carrito carrito = new Problema1_Carrito();

        carrito.agregarProducto(productoTienda, 1);
        carrito.mostrarDetalleCompra();
        carrito.realizarPago(1400.0, productoTienda);


        System.out.println("\nStock restante en la tienda de " + productoTienda.getNombreProducto() + ": " + productoTienda.getCantidad());
    }
}
