/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import negocio.Documento;

import negocio.Solicitud;
import negocio.Usuario;

import util.RHException;
import util.ServiceLocator;

/**
 *
 * @author AndreStereo
 */
public class SolicitudDAO {

    public SolicitudDAO() {

    }

    public String registrarsolicitud(Usuario user) throws RHException {
        Solicitud solicitud = new Solicitud();
        String error = "";
        try {
            String query = "INSERT INTO solicitud (k_solicitud, k_estudiante, "
                    + " k_convocatoria, n_estadosolicitud, f_solicitud) "
                    + "VALUES(codigosolicitud_seq.nextval,?,?,'En Proceso',?)";
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(query);
            //prepStmt.setInt(1, solicitud.getId_solicitud()); Se controla el ingreso del id con la secuencia
            prepStmt.setString(2, solicitud.getFk_estudiante());
            prepStmt.setString(3, solicitud.getFk_convocatoria());
            //prepStmt.setString(5, solicitud.getEstado_solicitud()); Se inserta por defecto el valor de solicitud En proceso
            prepStmt.setDate(6, java.sql.Date.valueOf(solicitud.getFecha_solicitud()));
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();
            error = "Registrado solicitud!!!";
        } catch (SQLException e) {
            throw new RHException("SolicitudDAO", "NO SE PUDO CREAR LA SOLICITUD" + e.getMessage());
        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }
        return error;
    }

    public void registrardocumentos(Usuario user) throws RHException {
        Solicitud solicitud = new Solicitud();
        Documento documento = new Documento();

        try {
            String query = "INSERT INTO DOCUMENTO (k_documento, k_solicitud, "
                    + " n_descripciondoc, n_archivo, v_puntajeprioridad) "
                    + "VALUES('D'||codigodocumento_seq.nextval,?,?,?,0)";
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(query);
            //prepStmt.setInt(1, solicitud.getId_solicitud()); Se controla el ingreso del id con la secuencia
            prepStmt.setInt(2, documento.getfk_solicitud());
            prepStmt.setString(3, documento.getDescripcion_doc());
            prepStmt.setString(4, documento.getNombre_archivo());

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();

        } catch (SQLException e) {
            throw new RHException("SolicitudDAO", "NO SE PUDO CREAR EL DOCUMENTO" + e.getMessage());
        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }

    }

    public void actualizarpuntajedocumento(Usuario user) throws RHException {
        Solicitud solicitud = new Solicitud();
        Documento documento = new Documento();
        try {
            String strSQL = "UPDATE DOCUMENTO SET v_puntajeprioridad=" + documento.getPuntaje_doc() + " WHERE k_documento=" + documento.getId_documento();
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(strSQL);
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();
        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo actualizar el estado" + e.getMessage());
        }
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
