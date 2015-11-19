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
public class Estudiante {
    private String  id_estudiante;
    private String  nombre_estudiante;
    private String  apellido_estudiante;
    private int cantidad_matriculas;
    private String id_proyecto;
    private String estado_estudiante;
    private String d_correoelectro;
    private String id_carnet;
    

    
    public Estudiante(){
    
    }
    public String getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(String id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getApellido_estudiante() {
        return apellido_estudiante;
    }

    public void setApellido_estudiante(String apellido_estudiante) {
        this.apellido_estudiante = apellido_estudiante;
    }

    public int getCantidad_matriculas() {
        return cantidad_matriculas;
    }

    public void setCantidad_matriculas(int cantidad_matriculas) {
        this.cantidad_matriculas = cantidad_matriculas;
    }

    public String getFk_facultad() {
        return id_proyecto;
    }

    public void setFk_facultad(String fk_facultad) {
        this.id_proyecto = fk_facultad;
    }

    public String getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(String id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getEstado_estudiante() {
        return estado_estudiante;
    }

    public void setEstado_estudiante(String estado_estudiante) {
        this.estado_estudiante = estado_estudiante;
    }

    public String getD_correoelectro() {
        return d_correoelectro;
    }

    public void setD_correoelectro(String d_correoelectro) {
        this.d_correoelectro = d_correoelectro;
    }

    public String getId_carnet() {
        return id_carnet;
    }

    public void setId_carnet(String id_carnet) {
        this.id_carnet = id_carnet;
    }
    
    
    
}
