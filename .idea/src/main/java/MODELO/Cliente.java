package MODELO;

public class Cliente {
    private int idCliente;
    private String nombreCliente;
    private String telContactoCliente;

    public Cliente(int idCliente, String nombreCliente, String telContactoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.telContactoCliente = telContactoCliente;
    }

    public Cliente() {}

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelContactoCliente() {
        return telContactoCliente;
    }

    public void setTelContactoCliente(String telContactoCliente) {
        this.telContactoCliente = telContactoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombreCliente + '\'' +
                ", telefono='" + telContactoCliente + '\'' +
                '}';
    }

}
