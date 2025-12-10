package MODELO;

public class Prenda {
    private int idPrenda;
    private String diseñoPrenda;
    private String descPrenda;
    private String color;
    private boolean esProductoTerminado;
    private double precioVenta;
    private String sexo;
    private String talla;
    private String tipoTela;
    private int cantExistPrenda;
    private int idCliente;

    public Prenda() {}

    public Prenda(int idPrenda, String diseñoPrenda, String descPrenda, String color, boolean esProductoTerminado,
                  double precioVenta, String sexo, String talla, String tipoTela, int cantExistPrenda, int idCliente) {
        this.idPrenda = idPrenda;
        this.diseñoPrenda = diseñoPrenda;
        this.descPrenda = descPrenda;
        this.color = color;
        this.esProductoTerminado = esProductoTerminado;
        this.precioVenta = precioVenta;
        this.sexo = sexo;
        this.talla = talla;
        this.tipoTela = tipoTela;
        this.cantExistPrenda = cantExistPrenda;
        this.idCliente = idCliente;
    }

    public int getIdPrenda() {
        return idPrenda;
    }

    public void setIdPrenda(int idPrenda) {
        this.idPrenda = idPrenda;
    }

    public String getDiseñoPrenda() {
        return diseñoPrenda;
    }

    public void setDiseñoPrenda(String diseñoPrenda) {
        this.diseñoPrenda = diseñoPrenda;
    }

    public String getDescPrenda() {
        return descPrenda;
    }

    public void setDescPrenda(String descPrenda) {
        this.descPrenda = descPrenda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEsProductoTerminado() {
        return esProductoTerminado;
    }

    public void setEsProductoTerminado(boolean esProductoTerminado) {
        this.esProductoTerminado = esProductoTerminado;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public int getCantExistPrenda() {
        return cantExistPrenda;
    }

    public void setCantExistPrenda(int cantExistPrenda) {
        this.cantExistPrenda = cantExistPrenda;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "idPrenda=" + idPrenda +
                ", diseñoPrenda='" + diseñoPrenda + '\'' +
                ", descPrenda='" + descPrenda + '\'' +
                ", color='" + color + '\'' +
                ", esProductoTerminado=" + esProductoTerminado +
                ", precioVenta=" + precioVenta +
                ", sexo='" + sexo + '\'' +
                ", talla='" + talla + '\'' +
                ", tipoTela='" + tipoTela + '\'' +
                ", cantExistPrenda=" + cantExistPrenda +
                ", idCliente=" + idCliente +
                '}';
    }

}
