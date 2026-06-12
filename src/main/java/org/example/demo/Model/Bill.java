package org.example.demo.Model;

import java.util.Date;
import java.util.LinkedList;

public class Bill {

    private LinkedList<BillDetail> detalles;
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
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.numeroFactura = numeroFactura;
        this.fechaEmision = new Date();
        this.estado = Status.PENDIENTE_ENTREGA;
        this.subTotal = 0;
        this.total = 0;
        this.iva = iva;



    }

}
