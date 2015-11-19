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
public class Peticion {
    
    private int id_peticion;
    private String nom_solicitante;
    private String ape_solicitante;
    private String correo_solicitante;
    private String codigo_solicitante;
    
    
    public Peticion(){
        
    }

    public int getId_peticion() {
        return id_peticion;
    }

    public void setId_peticion(int id_peticion) {
        this.id_peticion = id_peticion;
    }

    public String getNom_solicitante() {
        return nom_solicitante;
    }

    public void setNom_solicitante(String nom_solicitante) {
        this.nom_solicitante = nom_solicitante;
    }

    public String getApe_solicitante() {
        return ape_solicitante;
    }

    public void setApe_solicitante(String ape_solicitante) {
        this.ape_solicitante = ape_solicitante;
    }

    public String getCorreo_solicitante() {
        return correo_solicitante;
    }

    public void setCorreo_solicitante(String correo_solicitante) {
        this.correo_solicitante = correo_solicitante;
    }

    public String getCodigo_solicitante() {
        return codigo_solicitante;
    }

    public void setCodigo_solicitante(String codigo_solicitante) {
        this.codigo_solicitante = codigo_solicitante;
    }
    
    
}
