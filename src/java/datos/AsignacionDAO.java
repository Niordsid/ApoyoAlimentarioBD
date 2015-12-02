/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import negocio.Convocatoria;
import negocio.Usuario;
import util.RHException;
import util.ServiceLocator;

/**
 *
 * @author AndreStereo
 */
public class AsignacionDAO {
    
    
    public String[] AsignarPuntajes(Usuario user) throws RHException {
        String pm_error = null;
        String pc_error = null;

        try {

            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            CallableStatement cstmt = conexion.prepareCall("{call S_PR_ASIGIGNAR_PUNTAJES(?,?,?)}");

            cstmt.setInt(1, 1);     
            cstmt.registerOutParameter(2, java.sql.Types.NUMERIC);
            cstmt.registerOutParameter(3, java.sql.Types.VARCHAR);

            cstmt.executeQuery();

            
            pc_error = String.valueOf(cstmt.getInt(2));
            pm_error = cstmt.getString(3);
            
            cstmt.close();
            cstmt = null;
            ServiceLocator.getInstance(user).commit();

        } catch (SQLException e) {
            pm_error = "OperacionDAO " + "Error Ejecutando el Procedimiento: " + e.getMessage();

        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }

        return new String[]{pm_error, pc_error};
    }
    
    
    
    
}
