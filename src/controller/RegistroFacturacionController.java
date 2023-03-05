
package controller;

import beam.RegistroFacturacion;
import beam.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author matth
 */
public class RegistroFacturacionController {
    UsuarioController usuarioController = new UsuarioController();
    static ArrayList<RegistroFacturacion> listRegistroFac = new ArrayList<RegistroFacturacion>();    
    
    public void agregar(String nombreCompleto, String direccion, String nit){
        Usuario usuario = usuarioController.getUserLogin();
        listRegistroFac.add(new RegistroFacturacion(usuario.getId_usu()
                ,nombreCompleto,direccion,nit));
        JOptionPane.showMessageDialog(null, "Se han guardado los datos con exito");
    }
    
    public void actualizar(String nombreCompleto, String direccion, String nit){
        Usuario usuario = usuarioController.getUserLogin();
        for(int i = 0; i < listRegistroFac.size(); i++){
            if(listRegistroFac.get(i).getId_Usuario() == usuario.getId_usu()){
                listRegistroFac.set(i, new RegistroFacturacion(usuario.getId_usu()
                ,nombreCompleto,direccion,nit));
                JOptionPane.showMessageDialog(null, "Se han actualizado los datos");
            }
        }
    }
    
    public RegistroFacturacion getRegistroFacturacion(){
        Usuario usuario = usuarioController.getUserLogin();
        for(int i = 0; i < listRegistroFac.size(); i++){
            if(listRegistroFac.get(i).getId_Usuario()==usuario.getId_usu()){
                RegistroFacturacion registro = listRegistroFac.get(i);
                return registro;
            }
        }
        return null;
    }
    
}
