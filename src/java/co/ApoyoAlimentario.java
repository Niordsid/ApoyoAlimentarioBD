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
import datos.SolicitudDAO;
import negocio.Usuario;
import datos.UsuarioDAO;
import java.util.StringTokenizer;
import negocio.Convocatoria;
import negocio.Solicitud;
import util.RHException;

public class ApoyoAlimentario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RHException {

        Usuario user = new Usuario();
        ConvocatoriaDAO convDao = new ConvocatoriaDAO();
        Convocatoria conv = new Convocatoria();
        String id_con =null;

        user.setUser("E20101020089");
        user.setPasswd("E20101020089");

        id_con = convDao.SelectConvocatoria(user);
        System.out.println(id_con);

        //ahora la conexión 
        UsuarioDAO userDao = new UsuarioDAO();
        Solicitud sol = new Solicitud();
        SolicitudDAO soldao = new SolicitudDAO();

        sol.setFk_estudiante(user.getUser());
        sol.setFk_convocatoria(id_con);

        System.out.println(soldao.registrarsolicitud(user, sol));

    }

}
