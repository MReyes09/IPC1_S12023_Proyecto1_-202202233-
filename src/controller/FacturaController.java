
package controller;

import beam.Factura;
import beam.GuiaEnvio;
import beam.RegistroFacturacion;
import beam.Usuario;
import java.util.ArrayList;

/**
 * @author matth
 */
public class FacturaController {
    GuiaEnvioController guiaController = new GuiaEnvioController();
    static ArrayList<Factura> listFactura = new ArrayList<Factura>();
    UsuarioController usuarioController = new UsuarioController();
    RegistroFacturacionController registroController = new RegistroFacturacionController();
    
    public ArrayList<Factura> getListFactura(){
        return listFactura;
    }
    
    public void generarFactura(){
        RegistroFacturacion registroUsu = registroController.getRegistroFacturacion();
        Usuario usuarioLoged = usuarioController.getUserLogin();
        ArrayList<GuiaEnvio> guiaTemp = guiaController.getGuiaEnvio();
        GuiaEnvio guiaFinal = guiaTemp.get(guiaTemp.size()-1);
        
        //Herencia con GuiaEnvio
        int id_Usuario = usuarioLoged.getId_usu();
        String codigoPaquete = guiaFinal.getCodigoPaquete();
        int numPaquetes = guiaFinal.getNumeroPaquetes();
        int tipoEnvio;
        String fechaEnvio = guiaFinal.getFechaEnvio();
        double pesoTotal = guiaFinal.getTamanoPaquete();
        double envioCosto = guiaFinal.getPrecioPago();
        double costoTotal = guiaFinal.getTotalAPagar();
        String tipoServicio = guiaFinal.getTipoServicio();
        String depaO = guiaFinal.getDepaO();
        String muniO = guiaFinal.getMuniO();
        String direO = guiaFinal.getDireO();
        String depaD = guiaFinal.getDepaD();
        String muniD = guiaFinal.getMuniD();
        String direD = guiaFinal.getDireD();
        Factura tempFactura = new Factura(id_Usuario, codigoPaquete, depaO, muniO, direO
                , depaD, muniD, direD, envioCosto, pesoTotal
                , numPaquetes, fechaEnvio, costoTotal, tipoServicio);
        //-----------------------------------------------
        //Datos sobre la subClase Factura 
        String Nit = registroUsu.getNIT();
        int id_Factura;
        if(listFactura.size()==0){
            id_Factura = 1;
        }else{
            id_Factura = listFactura.size()+1;
        }
        tempFactura.setId_Factura(id_Factura);
        tempFactura.setNit(Nit);
        
        listFactura.add(tempFactura);
    }
    
    public ArrayList<Factura> getUserFac(){
        int id_Usuario = usuarioController.getUserLogin().getId_usu();
        ArrayList<Factura> listFacturaUser = new ArrayList<Factura>();
        for(int i = 0; i < listFactura.size(); i++){
            if (listFactura.get(i).getId_Usuario() == id_Usuario){
                listFacturaUser.add(listFactura.get(i));
            }
        }
        return listFacturaUser;
    }
    
    public Factura getFacturaDefined(int codFactura){
        Factura factura = new Factura();
        for(int i = 0; i < listFactura.size(); i++){
            if (listFactura.get(i).getId_Factura() == codFactura){
                factura = listFactura.get(i);
                return factura;
            }
        }
        return null;
    }
}
