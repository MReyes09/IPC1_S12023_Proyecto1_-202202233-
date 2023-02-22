
package controller;

import beam.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import panel.PanelMenuUsuario;
import ventana.ViewInicial;
import panel.PanelMenuAdmin;

/*
 * @author Matthew Reyes
 */

public class UsuarioController {
    static ArrayList<Usuario> usuario = new ArrayList<Usuario>();
    //PUNTO DE ERROR
    PanelMenuAdmin pMenAdm = new PanelMenuAdmin();
    PanelMenuUsuario pMenUsu = new PanelMenuUsuario();
    
    public void createUsuarioAdmin(){
        usuario.add(new Usuario(0,"",""
            ,"202202233","","","",""
            ,"","","Admin","","ipc1_202202233@ipc1delivery.com"));
    }
    public javax.swing.JPanel login(String correo, String password){
        for(int i=0; i<usuario.size();i++){
            if(correo.equals(usuario.get(i).getGmail())){
                if(password.equals(usuario.get(i).getPassUsu())){
                    JOptionPane.showMessageDialog(null,"Sesión Inicializada");
                    if(usuario.get(i).getRol().equals("Admin")){
                        System.out.println("ROL:"+usuario.get(i).getRol()+
                                " GMAIL:" + usuario.get(i).getGmail());
                        return pMenAdm;
                    }else if(usuario.get(i).getRol().equals("Admin")){
                        System.out.println("ROL:"+usuario.get(i).getRol()+
                                " GMAIL:" + usuario.get(i).getGmail());
                        return pMenUsu;
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Correo Incorrecto");
            }
        }
        return null;
    }
    
    public ArrayList<Usuario> getListaUsuarios(){
        return usuario;
    }
}