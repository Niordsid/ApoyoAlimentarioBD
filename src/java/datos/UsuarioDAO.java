/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import negocio.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.RHException;
import util.ServiceLocator;

/**
 *
 * @author AndreStereo
 */
public class UsuarioDAO {
    
    public UsuarioDAO() {

    }

    public String ingresar(Usuario user) throws RHException {

        String strSQL = "SELECT user FROM dual";
        String sa = null;

        try {
            Connection conexion;
            conexion = new ServiceLocator(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet tabla = null;
            tabla = prepStmt.executeQuery(strSQL);

            while (tabla.next()) {
                sa = tabla.getString(1);
            }
            prepStmt.close();
        } catch (SQLException ex) {
            sa = "Este es el error" + ex.getMessage();
        }

        return sa;
    }

    
}
