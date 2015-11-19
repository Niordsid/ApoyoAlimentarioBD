/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import negocio.Estudiante;
import util.RHException;
/**
 *
 * @author Alejandra
 */
public class EstudianteDAO {

    public EstudianteDAO() {
    }
    
    
    public void consultaretudiante(Estudiante estudiante) throws RHException{
        
        String strSQL = "SELECT K_ESTUDIANTE, N_NOMBREESTUD, N_APELLIDO FROM ESTUDIANTE WHERE K_ESTUDIANTE=";
        
    }
}
