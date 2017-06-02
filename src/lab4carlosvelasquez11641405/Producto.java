package lab4carlosvelasquez11641405;

class Producto {
    private String nombre;
    private String categoria;
    private float precio;
    private float descuento;

    public Producto(String nombre, String categoria, float precio, float descuento) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
