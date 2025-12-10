package org.example.modelo;

public class Uniforme {

    private int idPrenda;
    private int idColegio;

    public Uniforme() {}

    public Uniforme(int idPrenda, int idColegio) {
        this.idPrenda = idPrenda;
        this.idColegio = idColegio;
    }

    public int getIdPrenda() { return idPrenda; }
    public void setIdPrenda(int idPrenda) { this.idPrenda = idPrenda; }

    public int getIdColegio() { return idColegio; }
    public void setIdColegio(int idColegio) { this.idColegio = idColegio; }

    @Override
    public String toString() {
        return "Uniforme{idPrenda=" + idPrenda + ", idColegio=" + idColegio + "}";
    }
}

