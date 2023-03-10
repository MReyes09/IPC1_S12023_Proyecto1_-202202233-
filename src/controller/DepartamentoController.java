
package controller;

import beam.Departamento;
import java.util.ArrayList;

/**
 * @author matth
 */
public class DepartamentoController {
    static ArrayList<Departamento> departamento = new ArrayList<Departamento>();
    static int i = 23;
    
    public void createDepartamentos(){
        departamento.add(new Departamento(1, "NT", "Norte", "Petén"));
        departamento.add(new Departamento(2, "NT", "Norte", "El Quiché"));
        departamento.add(new Departamento(3, "NT", "Norte", "Alta Verapaz"));
        departamento.add(new Departamento(4, "NT", "Norte", "Baja Verapaz"));
        departamento.add(new Departamento(5, "NO", "Nororiente", "Izabal"));
        departamento.add(new Departamento(6, "NO", "Nororiente", "Zacapa"));
        departamento.add(new Departamento(7, "NO", "Nororiente", "Chiquimula"));
        departamento.add(new Departamento(8, "M", "Metropolitana", "Guatemala"));
        departamento.add(new Departamento(9, "M", "Metropolitana", "Sacatepéquez"));
        departamento.add(new Departamento(10, "SO", "Suroccidente", "San Marcos"));
        departamento.add(new Departamento(11, "SO", "Suroccidente", "Retalhuleu"));
        departamento.add(new Departamento(12, "SO", "Suroccidente", "Quetzaltenango"));
        departamento.add(new Departamento(13, "SO", "Suroccidente", "Suchitepéquez"));
        departamento.add(new Departamento(14, "SO", "Suroccidente", "Sololá"));
        departamento.add(new Departamento(15, "SO", "Suroccidente", "Totonicapán"));
        departamento.add(new Departamento(16, "NOC", "Noroccidente", "Huehuetenango"));
        departamento.add(new Departamento(17, "NOC", "Noroccidente", "Totonicapán"));
        departamento.add(new Departamento(18, "SO", "Suroriente", "Jalapa"));
        departamento.add(new Departamento(19, "SO", "Suroriente", "Jutiapa"));
        departamento.add(new Departamento(20, "SO", "Suroriente", "Santa Rosa"));
        departamento.add(new Departamento(21, "SO", "Suroriente", "Escuintla"));
        departamento.add(new Departamento(22, "SO", "Suroriente", "Chimaltenango"));
    }  
    
    public void agregar(String id_Reg, String region, String nombre){
        departamento.add(new Departamento(i, id_Reg,region,nombre));
        i++;
    }
    
    public void actualizar(int codDepa, String codReg, String nombre, String region){
        for(int e = 0; e < departamento.size(); e++){
            if(departamento.get(e).getId_depart() == codDepa){
                departamento.set(e, new Departamento(codDepa,codReg,region,nombre));
            }
        }
    }
    
    public void eliminar(int id_Depa){
        for(int e = 0; e<departamento.size();e++){
            if(departamento.get(e).getId_depart() == id_Depa){
                departamento.remove(e);
            }
        }
    }
    
    public ArrayList<Departamento> getDepartamento(){
        return departamento;
    }
}
