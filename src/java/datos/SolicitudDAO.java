
package datos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import negocio.Convocatoria;


import negocio.Solicitud;
import negocio.Usuario;

import util.RHException;
import util.ServiceLocator;

public class SolicitudDAO {

    public SolicitudDAO() {

    }

    public String registrarsolicitud(Usuario user, Solicitud sol) throws RHException {
        
        String error = "";
        try {
            String query = "INSERT INTO UDA_POSTULACION (k_solicitud, k_estudiante, "
                    + " k_convocatoria, f_solicitud, n_estadosolicitud, v_puntajetotal)"
                    + "VALUES(SEC_SOLICITUD.nextval,?,?,SYSDATE,'En Proceso',NULL)";
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(query);
            
            prepStmt.setString(1, sol.getFk_estudiante());
            prepStmt.setString(2, sol.getFk_convocatoria());
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();
            error = "Registrado solicitud!!!";
        } catch (SQLException e) {
            throw new RHException("SolicitudDAO", "NO SE PUDO CREAR LA SOLICITUD " + e.getMessage());
        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }
        return error;
    }

 

    

    public void actualizarsolicitud(Usuario user) throws RHException {
        Solicitud solicitud = new Solicitud();
        try {
            String strSQL = "UPDATE solicitud SET n_estadosolicitud=" + solicitud.getEstado_solicitud() + " WHERE k_solicitud=" + solicitud.getId_solicitud();
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();
        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo actualizar el estado" + e.getMessage());
        }
    }

    public Solicitud consultarsolicitudes(Solicitud solicitud, Usuario user) throws RHException {
        String error = null;

        try {

            String strSQL = "SELECT K_SOLICITUD, K_ESTUDIANTE, K_CONVOCATORIA, N_ESTADOSOLICITUD, F_SOLICITUD FROM SOLICITUD";
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.executeUpdate();

            ResultSet resultado = prepStmt.executeQuery();
            while (resultado.next()) {
                solicitud.setId_solicitud(resultado.getInt(1));
                solicitud.setFk_estudiante(resultado.getString(2));
                solicitud.setFk_convocatoria(resultado.getString(3));
                solicitud.setFk_convocatoria(resultado.getString(3));
                solicitud.setFk_convocatoria(resultado.getString(3));

            }
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();
            // Cierra el statement antes de terminar
            prepStmt.close();
            // Devuelve los usuarios
            return null;
        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo actualizar el estado" + e.getMessage());
        }
    }

    public Solicitud consultarsolicitudfacultad(String facultad, Usuario user) throws RHException {
        Solicitud solicitud = new Solicitud();
        try {

            String strSQL = "SELECT K_SOLICITUD, C.K_ESTUDIANTE, C.K_CONVOCATORIA, N_ESTADOSOLICITUD, F_SOLICITUD, N_NOMBREFACULTAD FROM SOLICITUD S, "
                    + "ESTUD_CONVO C, ESTUDIANTE E, FACULTAD F WHERE S.K_CONVOCATORIA=C.K_CONVOCATORIA AND S.K_ESTUDIANTE=C.K_ESTUDIANTE "
                    + "AND E.K_ESTUDIANTE=C.K_ESTUDIANTE AND F.K_FACULTAD=E.K_FACULTAD";
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet resultado = prepStmt.executeQuery();
            while (resultado.next()) {
                String idSolicitud = resultado.getString("K_SOLICITUD");
                String idestudiante = resultado.getString("K_ESTUDIANTE");
                String idconvocatoria = (resultado.getString("K_CONVOCATORIA"));
                String idfuncionario = resultado.getString("K_FUNCIONARIO");
                String idestado = resultado.getString(" N_ESTADOSOLICITUD");
                String codigoVerificacion = resultado.getString("F_SOLICITUDN");

            }
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();
            // Cierra el statement antes de terminar
            prepStmt.close();

        } catch (SQLException e) {
            throw new RHException("SolicitudDAO", "No se pudo consultar las Solicitudes" + e.getMessage());
        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }
        return solicitud;
    }

    public Solicitud consultarestadosolicitud(String estado_solicitud, Usuario user) throws RHException {
        Solicitud solicitud = new Solicitud();
        try {
            String strSQL = "SELECT K_SOLICITUD, C.K_ESTUDIANTE, C.K_CONVOCATORIA, N_ESTADOSOLICITUD, F_SOLICITUD, N_NOMBREFACULTAD FROM SOLICITUD S, "
                    + "ESTUD_CONVO C, ESTUDIANTE E, FACULTAD F WHERE S.K_CONVOCATORIA=C.K_CONVOCATORIA AND S.K_ESTUDIANTE=C.K_ESTUDIANTE "
                    + "AND E.K_ESTUDIANTE=C.K_ESTUDIANTE AND F.K_FACULTAD=E.K_FACULTAD AND N_ESTADOSOLICITUD=" + solicitud.getEstado_solicitud();
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            ResultSet resultado = prepStmt.executeQuery();
            while (resultado.next()) {
                String idSolicitud = resultado.getString("K_SOLICITUD");
                String idestudiante = resultado.getString("K_ESTUDIANTE");
                String idconvocatoria = (resultado.getString("K_CONVOCATORIA"));
                String idfuncionario = resultado.getString("K_FUNCIONARIO");
                String idestado = resultado.getString(" N_ESTADOSOLICITUD");
                String codigoVerificacion = resultado.getString("F_SOLICITUDN");

            }
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();
            // Cierra el statement antes de terminar
            prepStmt.close();

        } catch (SQLException e) {
            throw new RHException("SolicitudDAO", "No se pudo consultar las Solicitudes" + e.getMessage());
        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }
        return solicitud;
    }
}
