// Colegio.java
package org.example.modelo;

public class Colegio {
    private int idColegio;
    private String nombreColegio;
    private String direccion;

    public Colegio() {}

    public Colegio(int idColegio, String nombreColegio, String direccion) {
        this.idColegio = idColegio;
        this.nombreColegio = nombreColegio;
        this.direccion = direccion;
    }

    public Colegio(String nombreColegio, String direccion) {
        this.nombreColegio = nombreColegio;
        this.direccion = direccion;
    }

    public int getIdColegio() {
        return idColegio;
    }

    public void setIdColegio(int idColegio) {
        this.idColegio = idColegio;
    }

    public String getNombreColegio() {
        return nombreColegio;
    }

    public void setNombreColegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Colegio{" +
                "idColegio=" + idColegio +
                ", nombreColegio='" + nombreColegio + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
