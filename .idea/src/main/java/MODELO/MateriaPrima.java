// MateriaPrima.java
package org.example.modelo;

public class MateriaPrima {
    private int codMateriaPrima;
    private String tipo;
    private String desMateriaPrima;
    private String unidadMedida;
    private int stockMateriaPrima;

    public MateriaPrima() {}

    public MateriaPrima(int codMateriaPrima, String tipo, String desMateriaPrima, String unidadMedida, int stockMateriaPrima) {
        this.codMateriaPrima = codMateriaPrima;
        this.tipo = tipo;
        this.desMateriaPrima = desMateriaPrima;
        this.unidadMedida = unidadMedida;
        this.stockMateriaPrima = stockMateriaPrima;
    }

    public MateriaPrima(String tipo, String desMateriaPrima, String unidadMedida, int stockMateriaPrima) {
        this.tipo = tipo;
        this.desMateriaPrima = desMateriaPrima;
        this.unidadMedida = unidadMedida;
        this.stockMateriaPrima = stockMateriaPrima;
    }

    public int getCodMateriaPrima() {
        return codMateriaPrima;
    }

    public void setCodMateriaPrima(int codMateriaPrima) {
        this.codMateriaPrima = codMateriaPrima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDesMateriaPrima() {
        return desMateriaPrima;
    }

    public void setDesMateriaPrima(String desMateriaPrima) {
        this.desMateriaPrima = desMateriaPrima;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public int getStockMateriaPrima() {
        return stockMateriaPrima;
    }

    public void setStockMateriaPrima(int stockMateriaPrima) {
        this.stockMateriaPrima = stockMateriaPrima;
    }

    @Override
    public String toString() {
        return "MateriaPrima{" +
                "codMateriaPrima=" + codMateriaPrima +
                ", tipo='" + tipo + '\'' +
                ", desMateriaPrima='" + desMateriaPrima + '\'' +
                ", unidadMedida='" + unidadMedida + '\'' +
                ", stockMateriaPrima=" + stockMateriaPrima +
                '}';
    }
}
