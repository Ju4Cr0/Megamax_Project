package org.example.demo.Model;
/**
 * Representa un detalle de una factura dentro del sistema
 * Almacena informacion de una linea de venta , incluyendo
 * la cantidad de productos , precio unitario , descuento y subtotal
 *
 * cada instancia de BillDetail corresponde a un producto
 * registrado dentro de una factura
 *
 * @author Juan Andres Ariza Lopez
 * @version 1.0
 * */
public class BillDetail {
    private String idDetalle;
    private float cantidad;
    private double descuento;
    private double precioUnitario;
    private double subtotal;
    private Product product;




    /**getters y setters de los metodos*/
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(String idDetalle) {
        this.idDetalle = idDetalle;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
