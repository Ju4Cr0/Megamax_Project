package org.example.demo.Model;

import java.util.Date;
import java.util.LinkedList;

public class Bill {

    private LinkedList<BillDetail> detalles = new LinkedList<>();
    private String idFactura;
    private Date fechaEmision;
    private Cliente cliente;
    private float iva;
    private Status estado;
    private String numeroFactura;
    private float subTotal;
    float total;
    Vendedor vendedor;

    public Bill(Cliente cliente , Vendedor vendedor , String numeroFactura ,float iva){
        this.idFactura =IdGenerator.generarId("Factura");
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.numeroFactura = numeroFactura;
        this.fechaEmision = new Date();
        this.estado = Status.PENDIENTE_ENTREGA;
        this.subTotal = 0;
        this.total = 0;
        this.iva = iva;

    }

    public void addDetail(BillDetail detail){
        detalles.add(detail);
        calcularTotal();
        subTotal += detail.getSubtotal();
        total = subTotal +(subTotal*iva);
    }

    
    public float calcularTotal() {
        total = subTotal + (subTotal * iva);
        return total;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public Status getEstado() {
        return estado;
    }

    public void setEstado(Status estado) {
        this.estado = estado;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public float getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(float subTotal) {
        this.subTotal = subTotal;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
}
