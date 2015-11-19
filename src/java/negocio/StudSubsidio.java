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
public class StudSubsidio {

    private int fk_solicitud;
    private String fk_subsidio;
    private String fk_funcionario;
    
    public StudSubsidio() {
    }

    public int getFk_solicitud() {
        return fk_solicitud;
    }

    public void setFk_solicitud(int fk_solicitud) {
        this.fk_solicitud = fk_solicitud;
    }

    public String getFk_subsidio() {
        return fk_subsidio;
    }

    public void setFk_subsidio(String fk_subsidio) {
        this.fk_subsidio = fk_subsidio;
    }

    public String getFk_funcionario() {
        return fk_funcionario;
    }

    public void setFk_funcionario(String fk_funcionario) {
        this.fk_funcionario = fk_funcionario;
    }
     
    
    
}
