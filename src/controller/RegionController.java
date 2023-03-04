
package controller;

import beam.Region;
import java.util.ArrayList;

/**
 * @author matth
 */
public class RegionController {
    static ArrayList<Region> listRegion = new ArrayList<Region>();
    
    public void createRegionesDefined(){
        listRegion.add(new Region("M","Metropolitana",25f,35f));
        listRegion.add(new Region("NT","Norte",45.55f,68.5f));
        listRegion.add(new Region("NO","Nororiente",35.48f,58.68f));
        listRegion.add(new Region("SO","Suroriente",32.48f,38.68f));
        listRegion.add(new Region("SOC","Suroccidente",29f,34f));
        listRegion.add(new Region("NOC","Noroccidente",40f,44.5f));
    }
    
    public void agregar(String id_Region, String nameReg, float precioEstandar, float precioEspecial){
        listRegion.add(new Region(id_Region, nameReg, precioEstandar, precioEspecial));
    }
    
    public void actualizar(String id_RegionAnterior, String id_Region, String nameReg, float precioEstandar, float precioEspecial){
        for(int i = 0; i < listRegion.size(); i++){
            if(listRegion.get(i).getId_region().equals(id_RegionAnterior)){
                listRegion.set(i, new Region(id_Region, nameReg, precioEstandar, precioEspecial));
            }
        }
    }
    
    public void eliminar(String codigoRegion){
        for(int i = 0; i < listRegion.size(); i++){
            if(listRegion.get(i).getId_region().equals(codigoRegion)){
                listRegion.remove(i);
            }
        }
    }
    
    public ArrayList<Region> getListRegion(){
        return listRegion;
    }
    
}