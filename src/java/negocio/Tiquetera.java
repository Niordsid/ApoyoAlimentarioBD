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
    private String fk_beneficio;
    private String fecha_entrega;
    private String fecha_vencimiento;
    private int valor_total_tiquetes;

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

    public String getFk_beneficio() {
        return fk_beneficio;
    }

    public void setFk_beneficio(String fk_beneficio) {
        this.fk_beneficio = fk_beneficio;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public int getValor_total_tiquetes() {
        return valor_total_tiquetes;
    }

    public void setValor_total_tiquetes(int valor_total_tiquetes) {
        this.valor_total_tiquetes = valor_total_tiquetes;
    }

}
