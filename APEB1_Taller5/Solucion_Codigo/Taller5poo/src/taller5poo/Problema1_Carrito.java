/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5poo;

/**
 *
 * @author jdavi
 */
public class Problema1_Carrito {

    private Problema1_Producto productoEnCarrito;
    private double porcentajeDescuento = 0.10;

    public void agregarProducto(Problema1_Producto productoTienda, int cantidad) {
        if (productoTienda == null) {
            System.out.println("Error: El producto no existe en la tienda.");
        } else if (productoTienda.getCantidad() < cantidad) {
            System.out.println("Error: No hay suficiente cantidad disponible de " + productoTienda.getNombreProducto() + ".");
            System.out.println("Stock actual: " + productoTienda.getCantidad());

        } else {
            this.productoEnCarrito = new Problema1_Producto(productoTienda.getNombreProducto(), productoTienda.getPrecio(), cantidad);
            System.out.println("¡" + cantidad + " unidades de " + productoTienda.getNombreProducto() + " agregadas al carrito!");
        }
    }

    public double calcularTotal() {
        if (productoEnCarrito == null) {
            return 0.0;
        }
        double total = productoEnCarrito.getPrecio() * productoEnCarrito.getCantidad();

        if (total > 1000) {
            double descuento = total * porcentajeDescuento;
            total = total - descuento;
            System.out.println("¡Se ha aplicado un descuento promocional del " + (porcentajeDescuento * 100) + "%!");
        }

        return total;
    }

    public void realizarPago(double montoPagado, Problema1_Producto productoTienda) {
        if (productoEnCarrito == null) {
            System.out.println("El carrito está vacío. No hay nada que pagar.");
            return;
        }

        double totalAPagar = calcularTotal();

        if (montoPagado >= totalAPagar) {
            System.out.println("¡Pago exitoso! Muchas gracias por su compra.");

            int nuevoStock = productoTienda.getCantidad() - productoEnCarrito.getCantidad();
            productoTienda.setCantidad(nuevoStock);

            this.productoEnCarrito = null;
        } else {
            double faltante = totalAPagar - montoPagado;
            System.out.printf("Monto insuficiente. Falta un total de: $%.2f%n", faltante);
        }
    }

    public void mostrarDetalleCompra() {
        if (productoEnCarrito == null) {
            System.out.println("El carrito de compras está vacío.");
        } else {
            System.out.println("\n--- DETALLE DE LA COMPRA ---");
            System.out.println("Producto: " + productoEnCarrito.getNombreProducto());
            System.out.println("Cantidad: " + productoEnCarrito.getCantidad());
            System.out.println("Precio Unitario: $" + productoEnCarrito.getPrecio());
            System.out.println("----------------------------");
        }
    }
}
