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
public class Tiquete {
    
    private String id_tiquete;
    private int id_tiquetera;
    private String f_tiquete;
    private String estado_tiquete;
    private String f_usotiquete;
    private int valor_tiquete;
    
    
    public Tiquete(){
        
    }

    public String getId_tiquete() {
        return id_tiquete;
    }

    public void setId_tiquete(String id_tiquete) {
        this.id_tiquete = id_tiquete;
    }

    public int getId_tiquetera() {
        return id_tiquetera;
    }

    public void setId_tiquetera(int id_tiquetera) {
        this.id_tiquetera = id_tiquetera;
    }

    public String getF_tiquete() {
        return f_tiquete;
    }

    public void setF_tiquete(String f_tiquete) {
        this.f_tiquete = f_tiquete;
    }

    public String getEstado_tiquete() {
        return estado_tiquete;
    }

    public void setEstado_tiquete(String estado_tiquete) {
        this.estado_tiquete = estado_tiquete;
    }

    public String getF_usotiquete() {
        return f_usotiquete;
    }

    public void setF_usotiquete(String f_usotiquete) {
        this.f_usotiquete = f_usotiquete;
    }

    public int getValor_tiquete() {
        return valor_tiquete;
    }

    public void setValor_tiquete(int valor_tiquete) {
        this.valor_tiquete = valor_tiquete;
    }
    
    
}
