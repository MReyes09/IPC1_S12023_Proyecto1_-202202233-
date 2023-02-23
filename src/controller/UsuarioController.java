
package controller;

import beam.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import panel.PanelMenuUsuario;
import panel.PanelMenuAdmin;

/*
 * @author Matthew Reyes
 */

public class UsuarioController {
    static ArrayList<Usuario> usuario = new ArrayList<Usuario>();
    static javax.swing.JPanel cambioPanel = null;
    static MainController mainController = new MainController();
    //PUNTO DE ERROR
    //PanelMenuAdmin pMenAdm = new PanelMenuAdmin();
    //PanelMenuUsuario pMenUsu = new PanelMenuUsuario();
    
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
                        cambioPanel = mainController.getpMenAdm();
                        return cambioPanel;
                    }else if(usuario.get(i).getRol().equals("Admin")){
                        System.out.println("ROL:"+usuario.get(i).getRol()+
                                " GMAIL:" + usuario.get(i).getGmail());
                        cambioPanel = mainController.getpMenUsu();
                        return cambioPanel;
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
    
    public javax.swing.JPanel createUsuario(String nameUsu, String lastNamUsu, String passUsu,
            String dpiUsu, String dateborn, String gender, String nationality,
            String nickName, String phone, String rol, String gmail)
    {//PARAMETROS DE ENTRADA PARA ESTE METODO        
        if(passUsu.matches(".*[A-Z].*") && passUsu.matches(".*[a-z].*")
            && passUsu.matches(".*\\d.*")
            && passUsu.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"))
        {//Validacion de la password
            usuario.add(new Usuario(usuario.size(),nameUsu,lastNamUsu,passUsu
                    ,dpiUsu,dateborn,gender,nationality
                    ,nickName,phone,rol,"",gmail));
            cambioPanel = mainController.getpLogin();
            JOptionPane.showMessageDialog(null,usuario.size());
            return cambioPanel;
        }else{
            JOptionPane.showMessageDialog(null, "La contraseña debe cumplir con los siguientes requisitos:\n"
            + "- Al menos una letra mayúscula.\n"
            + "- Al menos una letra minúscula.\n"
            + "- Al menos un número.\n"
            + "- Al menos un caracter especial.\n"
            + "Por favor, ingrese una contraseña válida.");
        }
        return null;
    }
}