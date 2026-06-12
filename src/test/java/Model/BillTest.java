package org.example.demo.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BillTest {

    @Test
    void shouldAddBillDetailAndCalculateTotal() {
        Cliente cliente = new Cliente("clientetest1","don juan","3188937941",UserType.CLIENTE);
        Vendedor vendedor = new Vendedor("vendedortest1","pancho","73124432",UserType.VENDEDOR);
        String factura = "1234";
        float iva = 0.19f;
        Bill bill = new Bill(cliente,vendedor,factura,iva);

        BillDetail detail1 = new BillDetail();
        detail1.setCantidad(2);
        detail1.setPrecioUnitario(5000);
        detail1.setDescuento(0);
        detail1.setSubtotal(10000);

        BillDetail detail2 = new BillDetail();
        detail2.setCantidad(1);
        detail2.setPrecioUnitario(8000);
        detail2.setDescuento(1000);
        detail2.setSubtotal(7000);

        bill.addDetail(detail1);
        bill.addDetail(detail2);

            assertEquals((17000), bill.getSubTotal());
    }
}