
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
    
    public ArrayList<Region> getListRegion(){
        return listRegion;
    }
    
}