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
public class ResFormula {
    
    private int fk_solicitud;
    private String fk_campo;
    private String soporte;
    private String validacion_soporte;
    private String fk_funcionario;
    
    
    public ResFormula(){
        
    }

    public int getFk_solicitud() {
        return fk_solicitud;
    }

    public void setFk_solicitud(int fk_solicitud) {
        this.fk_solicitud = fk_solicitud;
    }

    public String getFk_campo() {
        return fk_campo;
    }

    public void setFk_campo(String fk_campo) {
        this.fk_campo = fk_campo;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public String getValidacion_soporte() {
        return validacion_soporte;
    }

    public void setValidacion_soporte(String validacion_soporte) {
        this.validacion_soporte = validacion_soporte;
    }

    public String getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(String fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }
    
    
}
