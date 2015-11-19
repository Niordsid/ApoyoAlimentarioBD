/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

/**
 *
 * @author AndreStereo
 */
import datos.ConvocatoriaDAO;
import negocio.Usuario;
import datos.UsuarioDAO;
import java.util.StringTokenizer;
import negocio.Convocatoria;
import util.RHException;

public class ApoyoAlimentario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RHException {

        Usuario user = new Usuario();

        user.setUser("ANDRES");
        user.setPasswd("ANDRES");

        //ahora la conexión 
        UsuarioDAO userDao = new UsuarioDAO();
        Convocatoria conv = new Convocatoria();
        
        StringTokenizer st = new StringTokenizer("2015-02-02", "-", true);
        String ano = "";
        while (st.hasMoreTokens()) {
            ano = st.nextToken() + ano;
        }
        StringTokenizer st2 = new StringTokenizer("2015-03-02", "-", true);
        String ano2 = "";
        while (st2.hasMoreTokens()) {
            ano2 = st2.nextToken() + ano2;
        }
        conv.setId_convocatoria("2015-1");
        conv.setFecha_inicioconvocatoria(ano);
        conv.setFecha_finconvocatoria(ano2);
        conv.setV_cupos_A(Integer.parseInt("200"));
        conv.setV_cupos_B(Integer.parseInt("200"));
        conv.setV_cupos_C(Integer.parseInt("200"));
        
        System.out.println(conv.getId_convocatoria());
        System.out.println(conv.getFecha_inicioconvocatoria());
        System.out.println(conv.getFecha_finconvocatoria());
        System.out.println(conv.getV_cupos_A());
        System.out.println(conv.getV_cupos_B());
        System.out.println(conv.getV_cupos_C());        
        
        ConvocatoriaDAO convDao = new ConvocatoriaDAO();
        String rta[] = convDao.crearConvocatoria(conv, user);                         
        
         System.out.println(rta[0]);
         System.out.println(rta[1]);
        
        
        
       
        
    }

}
