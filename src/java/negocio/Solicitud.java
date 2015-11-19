/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author AndreStereo
 */
public class Solicitud {

    private int id_solicitud;
    private String fk_estudiante;
    private String fk_convocatoria;
    private String estado_solicitud;
    private String fecha_solicitud;

    public Solicitud() {

    }

    public Solicitud(int id_solicitud, String fk_estudiante, String fk_convocatoria, String estado_solicitud, String fecha_solicitud) {
        this.id_solicitud = id_solicitud;
        this.fk_estudiante = fk_estudiante;
        this.fk_convocatoria = fk_convocatoria;

        this.estado_solicitud = estado_solicitud;
        this.fecha_solicitud = fecha_solicitud;

    }

    public int getId_solicitud() {
        return id_solicitud;
    }

    public void setId_solicitud(int id_solicitud) {
        this.id_solicitud = id_solicitud;
    }

    public String getFk_estudiante() {
        return fk_estudiante;
    }

    public void setFk_estudiante(String fk_estudiante) {
        this.fk_estudiante = fk_estudiante;
    }

    public String getFk_convocatoria() {
        return fk_convocatoria;
    }

    public void setFk_convocatoria(String fk_convocatoria) {
        this.fk_convocatoria = fk_convocatoria;
    }

    public String getEstado_solicitud() {
        return estado_solicitud;
    }

    public void setEstado_solicitud(String estado_solicitud) {
        this.estado_solicitud = estado_solicitud;
    }

    public String getFecha_solicitud() {
        return fecha_solicitud;
    }

    public void setFecha_solicitud(String fecha_solicitud) {
        this.fecha_solicitud = fecha_solicitud;
    }

}
