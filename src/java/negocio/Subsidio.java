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
    private int porcentaje_descuento;

    
    public Subsidio(){
                
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

    public int getPorcentaje_descuento() {
        return porcentaje_descuento;
    }

    public void setPorcentaje_descuento(int porcentaje_descuento) {
        this.porcentaje_descuento = porcentaje_descuento;
    }
    
    
    
    
    
}
