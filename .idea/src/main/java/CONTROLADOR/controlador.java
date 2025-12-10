package org.example.controlador;

import org.example.modelo.*;
import javax.swing.*;

import static org.example.DAO.DAOcliente.tablaClienteID;
import static org.example.DAO.DAOcolegio.tablaColegioID;
import static org.example.DAO.DAOmateriaPrima.tablaMateriaPrimaID;
import static org.example.DAO.DAOproveedor.tablaProveedorID;
import static org.example.DAO.DAOsuministra.tablaSuministra;
import static org.example.DAO.DAOprenda.tablaPrendaID;
import static org.example.DAO.DAOuniforme.tablaUniformeID;
import static org.example.DAO.DAOprendavestir.tablaPrendaVestirID;
import static org.example.DAO.DAOseutilizanen.tablaSeUtilizaEn;
import static org.example.DAO.DAOencargo.tablaEncargoID;
import static org.example.DAO.DAODetalleEncargo.tablaDetalleEncargo;
import static org.example.DAO.DAOfactura.tablaFacturaID;
import static org.example.DAO.DAODetalleFactura.tablaDetalleFactura;
import static org.example.DAO.DAOusuario.tablaUsuarioID;

public class controlador {

    // ---------------------------------------
    // CLIENTE
    // ---------------------------------------

    public static void agregarCliente(int idCliente, String documento, String nombre, String telefono, JTable tabla){
        Cliente nuevo = new Cliente(idCliente, documento, nombre, telefono);
        org.example.DAO.DAOcliente.agregarCliente(nuevo);
        tablaClienteID(idCliente, tabla);
    }

    public static void actualizarCliente(int idCliente, String documento, String nombre, String telefono, JTable tabla){
        Cliente actualizado = new Cliente(idCliente, documento, nombre, telefono);
        org.example.DAO.DAOcliente.actualizarCliente(actualizado);
        tablaClienteID(idCliente, tabla);
    }

    public static void consultarCliente(int idCliente, JTable tabla){
        tablaClienteID(idCliente, tabla);
    }

    public static void eliminarCliente(int idCliente){
        org.example.DAO.DAOcliente.eliminarCliente(idCliente);
    }


    // ---------------------------------------
    // COLEGIO
    // ---------------------------------------

    public static void agregarColegio(int idColegio, String nombreColegio, String direccion, JTable tabla){
        Colegio nuevo = new Colegio(idColegio, nombreColegio, direccion);
        org.example.DAO.DAOcolegio.agregarColegio(nuevo);
        tablaColegioID(idColegio, tabla);
    }

    public static void actualizarColegio(int idColegio, String nombreColegio, String direccion, JTable tabla){
        Colegio actualizado = new Colegio(idColegio, nombreColegio, direccion);
        org.example.DAO.DAOcolegio.actualizarColegio(actualizado);
        tablaColegioID(idColegio, tabla);
    }

    public static void consultarColegio(int idColegio, JTable tabla){
        tablaColegioID(idColegio, tabla);
    }

    public static void eliminarColegio(int idColegio){
        org.example.DAO.DAOcolegio.eliminarColegio(idColegio);
    }


    // ---------------------------------------
    // MATERIA PRIMA
    // ---------------------------------------

    public static void agregarMateriaPrima(int codMat, String tipo, String descripcion, String unidad, int stock, JTable tabla){
        MateriaPrima mp = new MateriaPrima(codMat, tipo, descripcion, unidad, stock);
        org.example.DAO.DAOmateriaPrima.agregarMateriaPrima(mp);
        tablaMateriaPrimaID(codMat, tabla);
    }

    public static void actualizarMateriaPrima(int codMat, String tipo, String descripcion, String unidad, int stock, JTable tabla){
        MateriaPrima mp = new MateriaPrima(codMat, tipo, descripcion, unidad, stock);
        org.example.DAO.DAOmateriaPrima.actualizarMateriaPrima(mp);
        tablaMateriaPrimaID(codMat, tabla);
    }

    public static void consultarMateriaPrima(int codMat, JTable tabla){
        tablaMateriaPrimaID(codMat, tabla);
    }

    public static void eliminarMateriaPrima(int codMat){
        org.example.DAO.DAOmateriaPrima.eliminarMateriaPrima(codMat);
    }


    // ---------------------------------------
    // PROVEEDOR
    // ---------------------------------------

    public static void agregarProveedor(String nit, String nombre, String direccion, String tel, String contacto, String prod, JTable tabla){
        Proveedor nuevo = new Proveedor(nit, nombre, direccion, tel, contacto, prod);
        org.example.DAO.DAOproveedor.agregarProveedor(nuevo);
        tablaProveedorID(nit, tabla);
    }

    public static void actualizarProveedor(String nit, String nombre, String direccion, String tel, String contacto, String prod, JTable tabla){
        Proveedor actualizado = new Proveedor(nit, nombre, direccion, tel, contacto, prod);
        org.example.DAO.DAOproveedor.actualizarProveedor(actualizado);
        tablaProveedorID(nit, tabla);
    }

    public static void consultarProveedor(String nit, JTable tabla){
        tablaProveedorID(nit, tabla);
    }

    public static void eliminarProveedor(String nit){
        org.example.DAO.DAOproveedor.eliminarProveedor(nit);
    }


    // ---------------------------------------
    // SUMINISTRA
    // ---------------------------------------

    public static void agregarSuministra(String nitProveedor, int codMateria, int cant, JTable tabla){
        Suministra nuevo = new Suministra(nitProveedor, codMateria, cant);
        org.example.DAO.DAOsuministra.agregarSuministra(nuevo);
        tablaSuministra(nitProveedor, tabla);
    }

    public static void actualizarSuministra(String nitProveedor, int codMateria, int cant, JTable tabla){
        Suministra actualizado = new Suministra(nitProveedor, codMateria, cant);
        org.example.DAO.DAOsuministra.actualizarSuministra(actualizado);
        tablaSuministra(nitProveedor, tabla);
    }

    public static void consultarSuministra(String nitProveedor, JTable tabla){
        tablaSuministra(nitProveedor, tabla);
    }

    public static void eliminarSuministra(String nitProveedor, int codMateria){
        org.example.DAO.DAOsuministra.eliminarSuministra(nitProveedor, codMateria);
    }


    // ---------------------------------------
    // PRENDA
    // ---------------------------------------

    public static void agregarPrenda(int idPrenda, String diseno, String desc, String color, boolean esTerminado,
                                     double precio, String sexo, String talla, String tela, int existencia, JTable tabla){

        Prenda nueva = new Prenda(idPrenda, diseno, desc, color, esTerminado, precio, sexo, talla, tela, existencia);
        org.example.DAO.DAOprenda.agregarPrenda(nueva);
        tablaPrendaID(idPrenda, tabla);
    }

    public static void actualizarPrenda(int idPrenda, String diseno, String desc, String color, boolean esTerminado,
                                        double precio, String sexo, String talla, String tela, int existencia, JTable tabla){

        Prenda actualizada = new Prenda(idPrenda, diseno, desc, color, esTerminado, precio, sexo, talla, tela, existencia);
        org.example.DAO.DAOprenda.actualizarPrenda(actualizada);
        tablaPrendaID(idPrenda, tabla);
    }

    public static void consultarPrenda(int idPrenda, JTable tabla){
        tablaPrendaID(idPrenda, tabla);
    }

    public static void eliminarPrenda(int idPrenda){
        org.example.DAO.DAOprenda.eliminarPrenda(idPrenda);
    }


    // ---------------------------------------
    // PRENDAVESTIR
    // ---------------------------------------

    public static void agregarPrendaVestir(int idPrenda, String estilo, JTable tabla){
        Prendavestir nueva = new Prendavestir(idPrenda, estilo);
        org.example.DAO.DAOprendavestir.agregarPrendaVestir(nueva);
        tablaPrendaVestirID(idPrenda, tabla);
    }

    public static void actualizarPrendaVestir(int idPrenda, String estilo, JTable tabla){
        Prendavestir actualizada = new Prendavestir(idPrenda, estilo);
        org.example.DAO.DAOprendavestir.actualizarPrendaVestir(actualizada);
        tablaPrendaVestirID(idPrenda, tabla);
    }

    public static void consultarPrendaVestir(int idPrenda, JTable tabla){
        tablaPrendaVestirID(idPrenda, tabla);
    }

    public static void eliminarPrendaVestir(int idPrenda){
        org.example.DAO.DAOprendavestir.eliminarPrendaVestir(idPrenda);
    }


    // ---------------------------------------
    // UNIFORME
    // ---------------------------------------

    public static void agregarUniforme(int idPrenda, int idColegio, JTable tabla){
        Uniforme nuevo = new Uniforme(idPrenda, idColegio);
        org.example.DAO.DAOuniforme.agregarUniforme(nuevo);
        tablaUniformeID(idPrenda, tabla);
    }

    public static void actualizarUniforme(int idPrenda, int idColegio, JTable tabla){
        Uniforme actualizado = new Uniforme(idPrenda, idColegio);
        org.example.DAO.DAOuniforme.actualizarUniforme(actualizado);
        tablaUniformeID(idPrenda, tabla);
    }

    public static void consultarUniforme(int idPrenda, JTable tabla){
        tablaUniformeID(idPrenda, tabla);
    }

    public static void eliminarUniforme(int idPrenda){
        org.example.DAO.DAOuniforme.eliminarUniforme(idPrenda);
    }


    // ---------------------------------------
    // SE UTILIZA EN
    // ---------------------------------------

    public static void agregarSeUtilizaEn(int idPrenda, int codMat, int cant, JTable tabla){
        Seutilizanen nuevo = new Seutilizanen(idPrenda, codMat, cant);
        org.example.DAO.DAOseutilizanen.agregarSeUtilizaEn(nuevo);
        tablaSeUtilizaEn(idPrenda, tabla);
    }

    public static void actualizarSeUtilizaEn(int idPrenda, int codMat, int cant, JTable tabla){
        Seutilizanen actualizado = new Seutilizanen(idPrenda, codMat, cant);
        org.example.DAO.DAOseutilizanen.actualizarSeUtilizaEn(actualizado);
        tablaSeUtilizaEn(idPrenda, tabla);
    }

    public static void consultarSeUtilizaEn(int idPrenda, JTable tabla){
        tablaSeUtilizaEn(idPrenda, tabla);
    }

    public static void eliminarSeUtilizaEn(int idPrenda, int codMat){
        org.example.DAO.DAOseutilizanen.eliminarSeUtilizaEn(idPrenda, codMat);
    }


    // ---------------------------------------
    // ENCARGO
    // ---------------------------------------

    public static void agregarEncargo(int numPedido, java.sql.Date fecha, java.sql.Date fechaProb,
                                      String estado, String medidas, double abono, double total,
                                      int idCliente, JTable tabla){

        Encargo nuevo = new Encargo(numPedido, fecha, fechaProb, estado, medidas, abono, total, idCliente);
        org.example.DAO.DAOencargo.agregarEncargo(nuevo);
        tablaEncargoID(numPedido, tabla);
    }

    public static void actualizarEncargo(int numPedido, java.sql.Date fecha, java.sql.Date fechaProb,
                                         String estado, String medidas, double abono, double total,
                                         int idCliente, JTable tabla){

        Encargo actualizado = new Encargo(numPedido, fecha, fechaProb, estado, medidas, abono, total, idCliente);
        org.example.DAO.DAOencargo.actualizarEncargo(actualizado);
        tablaEncargoID(numPedido, tabla);
    }

    public static void consultarEncargo(int numPedido, JTable tabla){
        tablaEncargoID(numPedido, tabla);
    }

    public static void eliminarEncargo(int numPedido){
        org.example.DAO.DAOencargo.eliminarEncargo(numPedido);
    }


    // ---------------------------------------
    // DETALLE ENCARGO
    // ---------------------------------------

    public static void agregarDetalleEncargo(int numPedido, int idPrenda, int cantidad, double precio, JTable tabla){
        Detallencargo nuevo = new Detallencargo(numPedido, idPrenda, cantidad, precio);
        org.example.DAO.DAODetalleEncargo.agregarDetalleEncargo(nuevo);
        tablaDetalleEncargo(numPedido, tabla);
    }

    public static void actualizarDetalleEncargo(int numPedido, int idPrenda, int cantidad, double precio, JTable tabla){
        Detallencargo actualizado = new Detallencargo(numPedido, idPrenda, cantidad, precio);
        org.example.DAO.DAODetalleEncargo.actualizarDetalleEncargo(actualizado);
        tablaDetalleEncargo(numPedido, tabla);
    }

    public static void consultarDetalleEncargo(int numPedido, JTable tabla){
        tablaDetalleEncargo(numPedido, tabla);
    }

    public static void eliminarDetalleEncargo(int numPedido, int idPrenda){
        org.example.DAO.DAODetalleEncargo.eliminarDetalleEncargo(numPedido, idPrenda);
    }


    // ---------------------------------------
    // FACTURA
    // ---------------------------------------

    public static void agregarFactura(int idFactura, java.sql.Date fecha, int numPedido, int idCliente, double total, JTable tabla){
        Factura nueva = new Factura(idFactura, fecha, numPedido, idCliente, total);
        org.example.DAO.DAOfactura.agregarFactura(nueva);
        tablaFacturaID(idFactura, tabla);
    }

    public static void actualizarFactura(int idFactura, java.sql.Date fecha, int numPedido, int idCliente, double total, JTable tabla){
        Factura actualizada = new Factura(idFactura, fecha, numPedido, idCliente, total);
        org.example.DAO.DAOfactura.actualizarFactura(actualizada);
        tablaFacturaID(idFactura, tabla);
    }

    public static void consultarFactura(int idFactura, JTable tabla){
        tablaFacturaID(idFactura, tabla);
    }

    public static void eliminarFactura(int idFactura){
        org.example.DAO.DAOfactura.eliminarFactura(idFactura);
    }


    // ---------------------------------------
    // DETALLE FACTURA
    // ---------------------------------------

    public static void agregarDetalleFactura(int idFactura, int idPrenda, int cant, double precioUnit, JTable tabla){
        Detallefactura nuevo = new Detallefactura(idFactura, idPrenda, cant, precioUnit);
        org.example.DAO.DAODetalleFactura.agregarDetalleFactura(nuevo);
        tablaDetalleFactura(idFactura, tabla);
    }

    public static void actualizarDetalleFactura(int idFactura, int idPrenda, int cant, double precioUnit, JTable tabla){
        Detallefactura actualizado = new Detallefactura(idFactura, idPrenda, cant, precioUnit);
        org.example.DAO.DAODetalleFactura.actualizarDetalleFactura(actualizado);
        tablaDetalleFactura(idFactura, tabla);
    }

    public static void consultarDetalleFactura(int idFactura, JTable tabla){
        tablaDetalleFactura(idFactura, tabla);
    }

    public static void eliminarDetalleFactura(int idFactura, int idPrenda){
        org.example.DAO.DAODetalleFactura.eliminarDetalleFactura(idFactura, idPrenda);
    }


    // ---------------------------------------
    // USUARIO
    // ---------------------------------------

    public static void agregarUsuario(String id, String nombre, String pass, String tipo, JTable tabla){
        Usuario nuevo = new Usuario(id, nombre, pass, tipo);
        org.example.DAO.DAOusuario.AgregarUsuario(nuevo);
        tablaUsuarioID(id, tabla);
    }

    public static void actualizarUsuario(String id, String nombre, String pass, String tipo, JTable tabla){
        Usuario actualizado = new Usuario(id, nombre, pass, tipo);
        org.example.DAO.DAOusuario.actualizarUsuario(actualizado);
        tablaUsuarioID(id, tabla);
    }

    public static void consultarUsuario(String id, JTable tabla){
        tablaUsuarioID(id, tabla);
    }

    public static void eliminarUsuario(String id){
        org.example.DAO.DAOusuario.eliminarUsuario(id);
    }

}

