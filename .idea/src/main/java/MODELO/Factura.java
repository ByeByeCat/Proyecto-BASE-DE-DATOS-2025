package org.example.modelo;

import java.sql.Date;

public class Factura {

    private int idFactura;
    private Date fechaFactura;
    private int numPedido;
    private int idCliente;
    private double totalFactura;

    public Factura() {}

    public Factura(int idFactura, Date fechaFactura, int numPedido, int idCliente, double totalFactura) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.numPedido = numPedido;
        this.idCliente = idCliente;
        this.totalFactura = totalFactura;
    }

    public int getIdFactura() { return idFactura; }
    public void setIdFactura(int idFactura) { this.idFactura = idFactura; }

    public Date getFechaFactura() { return fechaFactura; }
    public void setFechaFactura(Date fechaFactura) { this.fechaFactura = fechaFactura; }

    public int getNumPedido() { return numPedido; }
    public void setNumPedido(int numPedido) { this.numPedido = numPedido; }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public double getTotalFactura() { return totalFactura; }
    public void setTotalFactura(double totalFactura) { this.totalFactura = totalFactura; }

    @Override
    public String toString() {
        return "Factura{idFactura=" + idFactura + ", numPedido=" + numPedido +
                ", total=" + totalFactura + "}";
    }
}

