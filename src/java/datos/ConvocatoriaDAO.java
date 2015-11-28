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

import negocio.Convocatoria;
import negocio.Estudiante;
import negocio.Usuario;

import util.RHException;

import util.ServiceLocator;

/**
 *
 * @author AndreStereo
 */
public class ConvocatoriaDAO {

    private Convocatoria convocatoria;
    private Estudiante estudiante;

    public ConvocatoriaDAO() {
        convocatoria = new Convocatoria();
        estudiante = new Estudiante();
    }

    public String[] crearConvocatoria(Convocatoria conv, Usuario user) throws RHException {
        String pm_error = null;
        String pc_error = null;

        try {

            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            CallableStatement cstmt = conexion.prepareCall("{call S_PR_CREAR_CONVOCATORIA(?,?,?,?,?,?,?,?)}");

            cstmt.setString(1, conv.getId_convocatoria());
            cstmt.setString(2, conv.getFecha_inicioconvocatoria());
            cstmt.setString(3, conv.getFecha_finconvocatoria());
            cstmt.setInt(4, conv.getV_cupos_A());
            cstmt.setInt(5, conv.getV_cupos_B());
            cstmt.setInt(6, conv.getV_cupos_C());

            cstmt.registerOutParameter(7, java.sql.Types.NUMERIC);
            cstmt.registerOutParameter(8, java.sql.Types.VARCHAR);

            cstmt.executeQuery();

            pm_error = cstmt.getString(8);
            pc_error = String.valueOf(cstmt.getInt(7));

            cstmt.close();
            cstmt = null;
            ServiceLocator.getInstance(user).commit();

        } catch (SQLException e) {
            System.out.println("NO-OK");
            //throw new RHException("Convocatoria_DAO " + "Error Registrar Convocatoria: " + e.getMessage());
            pm_error = "Convocatoria_DAO " + "Error Registrar Convocatoria: " + e.getMessage();

        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }

        return new String[]{pm_error, pc_error};
    }

    public void actualizarfechainicio(Usuario user) throws RHException {

        try {
            String query = "UPDATE convocatoria SET f_fechainicio=" + convocatoria.getFecha_inicioconvocatoria() + " WHERE k_solicitud=" + convocatoria.getId_convocatoria();

            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(query);

            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();

        } catch (SQLException e) {
            throw new RHException("ConvocatoriaDAO", "NO SE LOGRO ACTUALIZAR LA FECHA DE INICIO" + e.getMessage());
        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }
    }

    public void actualizarfechafin(Usuario user) throws RHException {

        try {
            String query = "UPDATE convocatoria SET f_fechafin=" + convocatoria.getFecha_finconvocatoria() + " WHERE k_solicitud=" + convocatoria.getId_convocatoria();

            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(query);
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();

        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo crear el empleado" + e.getMessage());
        } finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }
    }

    public Convocatoria consultarconvocatoria(Usuario user) throws RHException {
        try {

            String query = "SELECT K_CONVOCATORIA, F_FECHAINICIO, F_FECHAFIN FROM CONVOCATORIA";
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(query);
            ResultSet resultado = prepStmt.executeQuery();
            while (resultado.next()) {
                String idconvocatoria = resultado.getString("K_CONVOCATORIA");
                String f_fechainicio = resultado.getString("F_FECHAINICIO");
                String f_fechafin = resultado.getString("F_FECHAFIN");
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

    public String SelectConvocatoria(Usuario user) throws RHException {
        String idconvocatoria = "";
        try {

            String query = "SELECT K_CONVOCATORIA FROM UDA_AVISO WHERE N_ESTADOCONVO='Abierta' order by K_CONVOCATORIA desc";
            Connection conexion = ServiceLocator.getInstance(user).tomarConexion();
            PreparedStatement prepStmt = conexion.prepareStatement(query);
            ResultSet resultado = prepStmt.executeQuery();
            while (resultado.next()) {
                idconvocatoria = resultado.getString("K_CONVOCATORIA");

            }
            prepStmt.executeUpdate();
            prepStmt.close();
            ServiceLocator.getInstance(user).commit();
            // Cierra el statement antes de terminar
            prepStmt.close();
            // Devuelve los usuarios
            return idconvocatoria;
        } catch (SQLException e) {
            throw new RHException("EmpleadoDAO", "No pudo actualizar el estado" + e.getMessage());
        }finally {
            ServiceLocator.getInstance(user).liberarConexion();
        }
        
    }

    public Convocatoria getConvocatoria() {
        return convocatoria;
    }

    public void setConvocatoria(Convocatoria convocatoria) {
        this.convocatoria = convocatoria;
    }

}
