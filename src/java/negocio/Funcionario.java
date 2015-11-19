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
public class Funcionario {
    private String id_funcionario;
    private String nombre_funcionario;
    private String apellido_funcionario;
    
    public Funcionario(){
    }

    public String getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(String id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNombre_funcionario() {
        return nombre_funcionario;
    }

    public void setNombre_funcionario(String nombre_funcionario) {
        this.nombre_funcionario = nombre_funcionario;
    }

    public String getApellido_funcionario() {
        return apellido_funcionario;
    }

    public void setApellido_funcionario(String apellido_funcionario) {
        this.apellido_funcionario = apellido_funcionario;
    }
    
    
}
