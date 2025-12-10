package org.example.modelo;

public class Prendavestir {

    private int idPrenda;
    private String estilo;

    public Prendavestir() {}

    public Prendavestir(int idPrenda, String estilo) {
        this.idPrenda = idPrenda;
        this.estilo = estilo;
    }

    public int getIdPrenda() { return idPrenda; }
    public void setIdPrenda(int idPrenda) { this.idPrenda = idPrenda; }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }

    @Override
    public String toString() {
        return "PrendaVestir{idPrenda=" + idPrenda + ", estilo='" + estilo + "'}";
    }
}

