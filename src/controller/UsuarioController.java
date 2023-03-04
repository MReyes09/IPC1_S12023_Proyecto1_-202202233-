
package controller;

import beam.Kiosco;
import beam.Usuario;
import beam.UsuarioHasKiosco;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Matthew Reyes
 */

public class UsuarioController {
    static ArrayList<Usuario> usuario = new ArrayList<Usuario>();
    static javax.swing.JPanel cambioPanel = null;
    static MainController mainController = new MainController();
    static int indOfUserLogin=0;
    
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
                        indOfUserLogin = i;
                        cambioPanel = mainController.getpMenAdm();
                        return cambioPanel;
                    }else if(usuario.get(i).getRol().equals("Usuario")){
                        indOfUserLogin = i;
                        i = usuario.size();
                        cambioPanel = mainController.getpMenUsu();
                        return cambioPanel;
                    }else if(usuario.get(i).getRol().equals("Empresarial")){
                        indOfUserLogin = i;
                        i = usuario.size();
                        cambioPanel = mainController.getPanelMenuEmp();
                        return cambioPanel;
                    }else if(usuario.get(i).getRol().equals("Kiosco")){
                        indOfUserLogin = i;
                        i = usuario.size();
                        cambioPanel = mainController.getPanelMenuKiosco();
                        return cambioPanel;
                    }
                    i = usuario.size();
                }else{
                    i = usuario.size();
                    JOptionPane.showMessageDialog(null,"Contraseña incorrecta");
                    return null;
                    }
            }
        }
        JOptionPane.showMessageDialog(null,"Los datos proporcionados no corresponden a ningun usuario");
        return null;
    }
    
    public ArrayList<Usuario> getListaUsuarios(){
        return usuario;
    }
    
    public javax.swing.JPanel createUsuario(String nameUsu, String lastNamUsu, String passUsu,
            String dpiUsu, String dateborn, String gender, String nationality,
            String nickName, String phone, String rol, String gmail, String kiosco)
    {//PARAMETROS DE ENTRADA PARA ESTE METODO        
        if(passUsu.matches(".*[A-Z].*") && passUsu.matches(".*[a-z].*")
            && passUsu.matches(".*\\d.*")
            && passUsu.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*"))
        {//Validacion de la password
            if(rol.equals("Kiosco")){
                UsuarioHasKioscoController usuHasController = new UsuarioHasKioscoController();
                KioscoController kioscoController = new KioscoController(); 
                ArrayList<Kiosco> kioscos = kioscoController.listarKioscos();
                for(int i = 0; i < kioscos.size(); i++){
                    if(kioscos.get(i).getNombreKiosco().equals(kiosco)){
                        usuHasController.agregar(usuario.size(), kioscos.get(i).getId_Kiosco());
                        i = kioscos.size();
                        JOptionPane.showMessageDialog(null,usuario.size() +" "+kiosco);
                    }
                }
                //usuario.add(new UsuarioHasKiosco(usuario.size(),0));
            }
            usuario.add(new Usuario(usuario.size(),nameUsu,lastNamUsu,passUsu
                    ,dpiUsu,dateborn,gender,nationality
                    ,nickName,phone,rol,"",gmail));
            cambioPanel = mainController.getpLogin();
            JOptionPane.showMessageDialog(null,"Se registro con exito");
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
    
    public Usuario getUserLogin(){
        Usuario usuLoged = new Usuario();        
        usuLoged = usuario.get(indOfUserLogin);
        return usuLoged;
    }
    
    public Usuario actualizar(Usuario usu){
        Usuario usuChange = new Usuario();
        usuChange = usuario.set(usu.getId_usu(), usu);
         JOptionPane.showMessageDialog(null,"El usuario fue actualizado exitosamente");
        return usuChange;
    }
}