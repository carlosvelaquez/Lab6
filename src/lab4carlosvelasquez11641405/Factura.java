package lab4carlosvelasquez11641405;

import java.util.ArrayList;

public class Factura {
    private Cliente cliente;
    private String nombre;
    private int edadCliente;
    private ArrayList<Producto> productos = new ArrayList();
    private float total = 0;

    public Factura(Cliente c) {
        this.cliente = c;
        this.nombre = cliente.getNombre();
        this.edadCliente = cliente.getEdad();
        this.productos = cliente.getProductos();
        this.total = 0;
        
        for (Producto p : productos) {
            total += (p.getPrecio() - (p.getDescuento()*p.getPrecio()));
        }
    }
    
    public String generarFactura(){
        String f = ("SUPERMERCADO BITS AND BYTES\n"
                + "-    -   -   -   -   -   -   -   -   -\n"
                + "Nombre del Cliente: " + nombre + "\n"
                + "Edad del Cliente: " + edadCliente + "\n\n"
                + "\nProductos comprados:\n | Nombre | Categoría | Precio | Descuento |\n\n");
        
        for (Producto p : productos) {
            f += (" | " + p.getNombre() + " | " + p.getCategoria() + " | " + p.getPrecio() + " | " + p.getDescuento() + " | \n"); 
        }
        
        f += "\n\nTotal a Pagar: " + total + "\n¡Gracias por comprar en Bits and Bytes!";
        
        return f;
    }
    
    public float getTotal(){
        return total;
    }
    
    
    
}
