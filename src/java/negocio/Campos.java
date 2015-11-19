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
public class Campos {
    
    
    private String id_campo;
    private String respuesta;
    private int puntaje_respuesta;
    
    
    public Campos(){
        
    }

    public String getId_campo() {
        return id_campo;
    }

    public void setId_campo(String id_campo) {
        this.id_campo = id_campo;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public int getPuntaje_respuesta() {
        return puntaje_respuesta;
    }

    public void setPuntaje_respuesta(int puntaje_respuesta) {
        this.puntaje_respuesta = puntaje_respuesta;
    }
    
    
}
