package org.example.modelo;

public class Detallencargo {

    private int numPedido;
    private int idPrenda;
    private int cantidad;
    private double precioUnitario;

    public Detallencargo() {}

    public Detallencargo(int numPedido, int idPrenda, int cantidad, double precioUnitario) {
        this.numPedido = numPedido;
        this.idPrenda = idPrenda;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getNumPedido() { return numPedido; }
    public void setNumPedido(int numPedido) { this.numPedido = numPedido; }

    public int getIdPrenda() { return idPrenda; }
    public void setIdPrenda(int idPrenda) { this.idPrenda = idPrenda; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    @Override
    public String toString() {
        return "DetalleEncargo{pedido=" + numPedido + ", prenda=" + idPrenda + "}";
    }
}

