package Tienda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda {
    //Clase Tienda:
    //• Atributos:
    //• List<Producto> inventario
    List<Producto> inventario = new ArrayList<Producto>();
    //• List<Compra> historialCompras
    List<Compra> historialCompras = new ArrayList<Compra>();
    //• Métodos principales:
    //• void añadirProducto(Producto p)
    public void addProducto(Producto p) {
        inventario.add(p);
    }
    //• void eliminarProducto(String codigo)
    public void eliminarProducto(String codigo) {
        Producto pro = null;
        for(Producto producto : this.inventario) {
            if (producto.getCodigo().equals(codigo)) {
                pro = producto;
            }
        }
        this.inventario.remove(pro);
    }
    public void actualizarProducto(String codigo, double nuevoPrecio, int nuevoStock) {
        for(Producto producto : this.inventario) {
            if (producto.getCodigo().equals(codigo)) {
                producto.setPrecio(nuevoPrecio);
                producto.setStock(nuevoStock);
            }
        }
    }


    //• Buscar el producto por código.• Verificar que el stock sea suficiente; si no, lanzar
    //StockInsuficienteException.
    //• Actualizar el stock y registrar la compra.
    public void realizarCompra(String codigo, int cantidad) {
        for(Producto producto : this.inventario) {
            if (producto.getCodigo().equals(codigo)) {
                if(producto.getStock() >= cantidad) {
                    producto.descontarStock(cantidad);
                    Compra compra = new Compra(LocalDate.now(), producto, cantidad,     (producto.getPrecio()*cantidad));
                    this.historialCompras.add(compra);
                } else {
                    throw new StockInsuficienteException("No hay suficiente stock.");
                }
            }
        }
    }

    public static void mostrarInventario() {
    }
    public void mostrarHistorialCompras() {
        System.out.println(historialCompras.toString());

    }
}
