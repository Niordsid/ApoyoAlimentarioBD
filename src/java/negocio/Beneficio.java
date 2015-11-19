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
public class Beneficio {

    private String id_beneficio;
    private int fk_actividad;
    private String fk_subsidio;
    private int fk_solicitud;

    public Beneficio() {
    }

    public String getId_subsidio() {
        return id_beneficio;
    }

    public void setId_subsidio(String id_subsidio) {
        this.id_beneficio = id_subsidio;
    }

    public String getTipo_subsidio() {
        return fk_subsidio;
    }

    public void setTipo_subsidio(String tipo_subsidio) {
        this.fk_subsidio = tipo_subsidio;
    }

    public int getDescuento() {
        return fk_solicitud;
    }

    public void setDescuento(int descuento) {
        this.fk_solicitud = descuento;
    }

    public int getFk_actividad() {
        return fk_actividad;
    }

    public void setFk_actividad(int fk_actividad) {
        this.fk_actividad = fk_actividad;
    }

}
