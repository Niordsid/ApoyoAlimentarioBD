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
public class Convocatoria {

    private String id_convocatoria;
    private String n_estado_convo;
    private String fecha_inicioconvocatoria;
    private String fecha_finconvocatoria;
    private int v_cupos_A;
    private int v_cupos_B;
    private int v_cupos_C;
    
    public Convocatoria() {
    }

    public String getId_convocatoria() {
        return id_convocatoria;
    }

    public void setId_convocatoria(String id_convocatoria) {
        this.id_convocatoria = id_convocatoria;
    }

    public String getFecha_inicioconvocatoria() {
        return fecha_inicioconvocatoria;
    }

    public void setFecha_inicioconvocatoria(String fecha_inicioconvocatoria) {
        this.fecha_inicioconvocatoria = fecha_inicioconvocatoria;
    }

    public String getFecha_finconvocatoria() {
        return fecha_finconvocatoria;
    }

    public void setFecha_finconvocatoria(String fecha_finconvocatoria) {
        this.fecha_finconvocatoria = fecha_finconvocatoria;
    }

    public String getN_estado_convo() {
        return n_estado_convo;
    }

    public void setN_estado_convo(String n_estado_convo) {
        this.n_estado_convo = n_estado_convo;
    }

    public int getV_cupos_A() {
        return v_cupos_A;
    }

    public void setV_cupos_A(int v_cupos_A) {
        this.v_cupos_A = v_cupos_A;
    }

    public int getV_cupos_B() {
        return v_cupos_B;
    }

    public void setV_cupos_B(int v_cupos_B) {
        this.v_cupos_B = v_cupos_B;
    }

    public int getV_cupos_C() {
        return v_cupos_C;
    }

    public void setV_cupos_C(int v_cupos_C) {
        this.v_cupos_C = v_cupos_C;
    }

    
}
