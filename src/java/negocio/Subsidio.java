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
public class Subsidio {

    private String id_subsidio;
    private String tipo_subsidio;
    private int descuento;
    private int fk_actividad;
    
    public Subsidio() {
    }

    public String getId_subsidio() {
        return id_subsidio;
    }

    public void setId_subsidio(String id_subsidio) {
        this.id_subsidio = id_subsidio;
    }

    public String getTipo_subsidio() {
        return tipo_subsidio;
    }

    public void setTipo_subsidio(String tipo_subsidio) {
        this.tipo_subsidio = tipo_subsidio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getFk_actividad() {
        return fk_actividad;
    }

    public void setFk_actividad(int fk_actividad) {
        this.fk_actividad = fk_actividad;
    }
    
    
}
