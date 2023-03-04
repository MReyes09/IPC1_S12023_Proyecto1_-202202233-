
package controller;

import beam.Kiosco;
import beam.Usuario;
import beam.UsuarioHasKiosco;
import java.util.ArrayList;

/**
 * @author matth
 */
public class UsuarioHasKioscoController {
    static ArrayList<UsuarioHasKiosco> usuHasKio = new ArrayList<UsuarioHasKiosco>();
    UsuarioController usuController = new UsuarioController();
    Usuario usuarios = usuController.getUserLogin();
    KioscoController kioscoController = new KioscoController();
    ArrayList<Kiosco> kioscos = kioscoController.listarKioscos();
    
    public void agregar(int id_Usuario, int id_Kiosco){
        usuHasKio.add(new UsuarioHasKiosco(id_Usuario,id_Kiosco));
    }
    
    public Kiosco getKioscoByName(int id_UserLoged){
        for(int i = 0; i < usuHasKio.size();i++){
            if(usuHasKio.get(i).getId_Usu()== id_UserLoged){
                int id_Kiosco = usuHasKio.get(i).getId_Kiosco();
                i = usuHasKio.size();                
                for(int x = 0; x<kioscos.size(); x++){
                    if(kioscos.get(x).getId_Kiosco()==id_Kiosco){
                        Kiosco kiosco = new Kiosco();
                        kiosco = kioscos.get(x);
                        return kiosco;
                    }
                }
            }
        }
        return null;
    }
    
    public ArrayList<UsuarioHasKiosco> getUsuarioHasKiosco(){
        return usuHasKio;
    }
}
