package org.example.modelo;

public class Seutilizanen {

    private int idPrenda;
    private int codMateriaPrima;
    private int cantUsada;

    public Seutilizanen() {}

    public Seutilizanen(int idPrenda, int codMateriaPrima, int cantUsada) {
        this.idPrenda = idPrenda;
        this.codMateriaPrima = codMateriaPrima;
        this.cantUsada = cantUsada;
    }

    public int getIdPrenda() { return idPrenda; }
    public void setIdPrenda(int idPrenda) { this.idPrenda = idPrenda; }

    public int getCodMateriaPrima() { return codMateriaPrima; }
    public void setCodMateriaPrima(int codMateriaPrima) { this.codMateriaPrima = codMateriaPrima; }

    public int getCantUsada() { return cantUsada; }
    public void setCantUsada(int cantUsada) { this.cantUsada = cantUsada; }

    @Override
    public String toString() {
        return "SeUtilizaEn{prenda=" + idPrenda + ", mat=" + codMateriaPrima + "}";
    }
}

