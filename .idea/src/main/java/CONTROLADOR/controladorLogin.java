package org.example.controlador;

import org.example.DAO.DAOusuario;
import org.example.modelo.Usuario;
import org.example.vista.Login;
import org.example.vista.PantallaPrincipal;

import javax.swing.*;

public class controladorLogin {

    public static boolean validarPasswordUsuario(String idUser, String pass){
        DAOusuario dao = new DAOusuario();
        Usuario usuario = dao.obtenerUsuarioPorID(idUser);

        if(usuario == null){
            Login.textoErroneo();
            return false;
        }

        return pass.equals(usuario.getPasswordUsuario());
    }

    public static boolean loginController(String idUser, String pass){
        if(idUser.isEmpty() || pass.isEmpty()){
            Login.textoIngreseData();
            return false;
        }

        if(validarPasswordUsuario(idUser, pass)){
            DAOusuario dao = new DAOusuario();
            Usuario usuario = dao.obtenerUsuarioPorID(idUser);

            JOptionPane.showMessageDialog(null, "BIENVENIDO " + usuario.getNombreUsuario());

            PantallaPrincipal ui = new PantallaPrincipal(
                    usuario.getTipoUsuario(),
                    usuario.getNombreUsuario()
            );
            ui.setVisible(true);

            return true;
        }

        Login.textoErroneo();
        return false;
    }

}

