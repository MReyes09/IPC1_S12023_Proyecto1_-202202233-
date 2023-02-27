
package controller;

import beam.Kiosco;
import java.util.ArrayList;

/**
 * @author matth
 */
public class KioscoController {
    static ArrayList<Kiosco> kioscos = new ArrayList<Kiosco>();
    
    public void actualizar(int codKiosco, String codRegion, String nombreKio){
        for(int i = 0; i<kioscos.size(); i++){
            if(kioscos.get(i).getId_Kiosco()== codKiosco){
                kioscos.set(i, new Kiosco(codKiosco, codRegion, nombreKio));
            }
        }
    }
    
    public void agregar(String codRegion, String nombreKio){
        kioscos.add(new Kiosco(kioscos.size()+1,codRegion,nombreKio));
    }
    
    public ArrayList<Kiosco> listarKioscos(){
        return kioscos;
    }
}
