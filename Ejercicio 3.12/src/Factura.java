public class Factura {
    private String numero;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numero, String descripcion, int cantidad, double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = (cantidad > 0)? cantidad : 0;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = (precio > 0.0) ? precio : 0.0;
    }

    public double obtenerMontoFactura(){
        return cantidad * precio;
    }

    @Override
    public String toString() {
        return "Numero de pieza: " + numero + "\n"
                + "Descripcion: " + descripcion + "\n"
                + "Cantidad: " + cantidad + "\n"
                + String.format("Precio por articulo: $", precio)
                + String.format("Monto de factura: $", obtenerMontoFactura());
    }

}
