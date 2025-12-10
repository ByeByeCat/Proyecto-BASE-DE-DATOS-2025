package org.example.modelo;

public class Cliente {

    private int idCliente;
    private String documento;
    private String nombreCliente;
    private String telContactoCliente;

    public Cliente() {}

    public Cliente(int idCliente, String documento, String nombreCliente, String telContactoCliente) {
        this.idCliente = idCliente;
        this.documento = documento;
        this.nombreCliente = nombreCliente;
        this.telContactoCliente = telContactoCliente;
    }

    public int getIdCliente() { return idCliente; }
    public void setIdCliente(int idCliente) { this.idCliente = idCliente; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public String getTelContactoCliente() { return telContactoCliente; }
    public void setTelContactoCliente(String telContactoCliente) { this.telContactoCliente = telContactoCliente; }

    @Override
    public String toString() {
        return "Cliente{idCliente=" + idCliente +
                ", documento='" + documento + '\'' +
                ", nombre='" + nombreCliente + '\'' +
                ", tel='" + telContactoCliente + "'}";
    }
}

