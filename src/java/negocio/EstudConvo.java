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
public class EstudConvo {

    private String fk_estudiante;
    private String fk_convocatoria;
    
    public EstudConvo() {
    }

    public String getFk_estudiante() {
        return fk_estudiante;
    }

    public void setFk_estudiante(String fk_estudiante) {
        this.fk_estudiante = fk_estudiante;
    }

    public String getFk_convocatoria() {
        return fk_convocatoria;
    }

    public void setFk_convocatoria(String fk_convocatoria) {
        this.fk_convocatoria = fk_convocatoria;
    }
    
    
}
