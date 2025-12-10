package org.example.modelo;

public class Detallefactura {

    private int idFactura;
    private int idPrenda;
    private int cantidad;
    private double precioUnitario;

    public Detallefactura() {}

    public Detallefactura(int idFactura, int idPrenda, int cantidad, double precioUnitario) {
        this.idFactura = idFactura;
        this.idPrenda = idPrenda;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getIdFactura() { return idFactura; }
    public void setIdFactura(int idFactura) { this.idFactura = idFactura; }

    public int getIdPrenda() { return idPrenda; }
    public void setIdPrenda(int idPrenda) { this.idPrenda = idPrenda; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public double getPrecioUnitario() { return precioUnitario; }
    public void setPrecioUnitario(double precioUnitario) { this.precioUnitario = precioUnitario; }

    @Override
    public String toString() {
        return "DetalleFactura{idFactura=" + idFactura +
                ", idPrenda=" + idPrenda + ", cant=" + cantidad + "}";
    }
}

