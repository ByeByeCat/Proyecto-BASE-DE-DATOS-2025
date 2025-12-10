package MODELO;

public class encargo {
    private int numPedido;
    private String fechaEncargo;
    private String fechaProbEntrega;
    private String estadoPedido;
    private String medidaPersonal;
    private double abono;
    private double valorTotal;
    private int idCliente;

    public encargo() {}

    public encargo(int numPedido, String fechaEncargo, String fechaProbEntrega,
                   String estadoPedido, String medidaPersonal,
                   double abono, double valorTotal, int idCliente) {
        this.numPedido = numPedido;
        this.fechaEncargo = fechaEncargo;
        this.fechaProbEntrega = fechaProbEntrega;
        this.estadoPedido = estadoPedido;
        this.medidaPersonal = medidaPersonal;
        this.abono = abono;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }

    public String getFechaEncargo() {
        return fechaEncargo;
    }

    public void setFechaEncargo(String fechaEncargo) {
        this.fechaEncargo = fechaEncargo;
    }

    public String getFechaProbEntrega() {
        return fechaProbEntrega;
    }

    public void setFechaProbEntrega(String fechaProbEntrega) {
        this.fechaProbEntrega = fechaProbEntrega;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public String getMedidaPersonal() {
        return medidaPersonal;
    }

    public void setMedidaPersonal(String medidaPersonal) {
        this.medidaPersonal = medidaPersonal;
    }

    public double getAbono() {
        return abono;
    }

    public void setAbono(double abono) {
        this.abono = abono;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Encargo{" +
                "numPedido=" + numPedido +
                ", fechaEncargo='" + fechaEncargo + '\'' +
                ", fechaProbEntrega='" + fechaProbEntrega + '\'' +
                ", estadoPedido='" + estadoPedido + '\'' +
                ", medidaPersonal='" + medidaPersonal + '\'' +
                ", abono=" + abono +
                ", valorTotal=" + valorTotal +
                ", idCliente=" + idCliente +
                '}';
    }
}
