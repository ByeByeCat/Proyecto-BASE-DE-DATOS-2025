// Proveedor.java
package org.example.modelo;

public class Proveedor {
    private long nitProveedor;
    private String nomProveedor;
    private String dirProveedor;
    private String telProveedor;
    private String nomContacto;
    private String productProveedor;

    public Proveedor() {}

    public Proveedor(long nitProveedor, String nomProveedor, String dirProveedor, String telProveedor, String nomContacto, String productProveedor) {
        this.nitProveedor = nitProveedor;
        this.nomProveedor = nomProveedor;
        this.dirProveedor = dirProveedor;
        this.telProveedor = telProveedor;
        this.nomContacto = nomContacto;
        this.productProveedor = productProveedor;
    }

    public Proveedor(long nitProveedor, String nomProveedor) {
        this.nitProveedor = nitProveedor;
        this.nomProveedor = nomProveedor;
    }

    public long getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(long nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getNomProveedor() {
        return nomProveedor;
    }

    public void setNomProveedor(String nomProveedor) {
        this.nomProveedor = nomProveedor;
    }

    public String getDirProveedor() {
        return dirProveedor;
    }

    public void setDirProveedor(String dirProveedor) {
        this.dirProveedor = dirProveedor;
    }

    public String getTelProveedor() {
        return telProveedor;
    }

    public void setTelProveedor(String telProveedor) {
        this.telProveedor = telProveedor;
    }

    public String getNomContacto() {
        return nomContacto;
    }

    public void setNomContacto(String nomContacto) {
        this.nomContacto = nomContacto;
    }

    public String getProductProveedor() {
        return productProveedor;
    }

    public void setProductProveedor(String productProveedor) {
        this.productProveedor = productProveedor;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nitProveedor=" + nitProveedor +
                ", nomProveedor='" + nomProveedor + '\'' +
                ", dirProveedor='" + dirProveedor + '\'' +
                ", telProveedor='" + telProveedor + '\'' +
                ", nomContacto='" + nomContacto + '\'' +
                ", productProveedor='" + productProveedor + '\'' +
                '}';
    }
}
