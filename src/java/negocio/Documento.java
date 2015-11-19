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
public class Documento {

    private String id_documento;
    private int fk_solicitud;
    private String descripcion_doc;
    private String nombre_archivo;
    private int puntaje_doc;

    public Documento() {
    }

    public String getId_documento() {
        return id_documento;
    }

    public void setId_documento(String id_documento) {
        this.id_documento = id_documento;
    }

    public int getfk_solicitud() {
        return fk_solicitud;
    }

    public void setfk_solicitud(int id_solicitud) {
        this.fk_solicitud = id_solicitud;
    }

    public String getDescripcion_doc() {
        return descripcion_doc;
    }

    public void setDescripcion_doc(String descripcion_doc) {
        this.descripcion_doc = descripcion_doc;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public int getPuntaje_doc() {
        return puntaje_doc;
    }

    public void setPuntaje_doc(int puntaje_doc) {
        this.puntaje_doc = puntaje_doc;
    }

    
}
