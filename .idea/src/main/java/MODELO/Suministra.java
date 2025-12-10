package org.example.modelo;

public class Suministra {

    private String nitProveedor;
    private int codMateriaPrima;
    private int cantSuministrada;

    public Suministra() {}

    public Suministra(String nitProveedor, int codMateriaPrima, int cantSuministrada) {
        this.nitProveedor = nitProveedor;
        this.codMateriaPrima = codMateriaPrima;
        this.cantSuministrada = cantSuministrada;
    }

    public String getNitProveedor() { return nitProveedor; }
    public void setNitProveedor(String nitProveedor) { this.nitProveedor = nitProveedor; }

    public int getCodMateriaPrima() { return codMateriaPrima; }
    public void setCodMateriaPrima(int codMateriaPrima) { this.codMateriaPrima = codMateriaPrima; }

    public int getCantSuministrada() { return cantSuministrada; }
    public void setCantSuministrada(int cantSuministrada) { this.cantSuministrada = cantSuministrada; }

    @Override
    public String toString() {
        return "Suministra{nit='" + nitProveedor + "', codMat="
                + codMateriaPrima + ", cant=" + cantSuministrada + "}";
    }
}

