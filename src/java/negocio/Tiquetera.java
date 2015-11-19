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
public class Tiquetera {

    private int id_tiquetera;
    private int valor_total;
    private String fk_subsidio;
    private String fecha_uso;
    
    public Tiquetera() {
    }

    public int getId_tiquetera() {
        return id_tiquetera;
    }

    public void setId_tiquetera(int id_tiquetera) {
        this.id_tiquetera = id_tiquetera;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    }

    public String getFk_subsidio() {
        return fk_subsidio;
    }

    public void setFk_subsidio(String fk_subsidio) {
        this.fk_subsidio = fk_subsidio;
    }

    public String getFecha_uso() {
        return fecha_uso;
    }

    public void setFecha_uso(String fecha_uso) {
        this.fecha_uso = fecha_uso;
    }
    
    
}
