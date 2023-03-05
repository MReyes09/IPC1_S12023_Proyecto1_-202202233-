
package controller;

import beam.TarjetaDeCredito;
import java.util.ArrayList;

/**
 * @author matth
 */
public class TarjetaController {
    UsuarioController usuarioControl = new UsuarioController();
    static ArrayList<TarjetaDeCredito> listTarjetas = new ArrayList<TarjetaDeCredito>();    
    static int id_ = 1;
    
    public void createTarjeta(String nombre, String fecha, String numeroTarjeta){
        listTarjetas.add(new TarjetaDeCredito(id_
                ,usuarioControl.getUserLogin().getId_usu()
                ,nombre,numeroTarjeta,fecha));
        id_++;
    }
    
    public void actualizar(int id_Tarjeta, String nombre, String fecha, String numeroTarjeta){
        for(int i = 0; i < listTarjetas.size(); i++){
            if(listTarjetas.get(i).getId_tarje()== id_Tarjeta){
                listTarjetas.set(i, new TarjetaDeCredito(id_Tarjeta
                ,usuarioControl.getUserLogin().getId_usu()
                ,nombre,numeroTarjeta,fecha));
            }
        }
    }
    
    public void eliminar(int id_Tarjeta){
        for(int i = 0; i < listTarjetas.size(); i++){
            if(listTarjetas.get(i).getId_tarje()== id_Tarjeta){
                listTarjetas.remove(i);
            }
        }
    }
    
    public ArrayList<TarjetaDeCredito> getListTarjetas(){
        return listTarjetas;
    }
}
