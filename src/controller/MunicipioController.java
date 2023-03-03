
package controller;

import beam.Municipio;
import java.util.ArrayList;
import controller.DepartamentoController;

/**
 * @author matth
 */
public class MunicipioController {
    static ArrayList<Municipio> municipios = new ArrayList<Municipio>();
    DepartamentoController depaControl = new DepartamentoController();
    
    public void createMunicipio(){
        //PETEN
        municipios.add(new Municipio(1, "Flores"));
        municipios.add(new Municipio(1, "Dolores"));
        municipios.add(new Municipio(1, "San Benito"));
        municipios.add(new Municipio(1, "San Francisco"));
        municipios.add(new Municipio(1, "San Andrés"));
        municipios.add(new Municipio(1, "La Libertad"));
        municipios.add(new Municipio(1, "San José"));
        municipios.add(new Municipio(1, "Sayaxché"));
        municipios.add(new Municipio(1, "Melchor de Mencos"));
        municipios.add(new Municipio(1, "Poptún"));
        municipios.add(new Municipio(1, "Santa Ana"));
        municipios.add(new Municipio(1, "La Laguna"));
        // El Quiche
        municipios.add(new Municipio(2, "Santa Cruz del Quiché"));
        municipios.add(new Municipio(2, "Chiché"));
        municipios.add(new Municipio(2, "Chinique"));
        municipios.add(new Municipio(2, "Zacualpa"));
        municipios.add(new Municipio(2, "Chajul"));
        municipios.add(new Municipio(2, "Chichicastenango"));
        municipios.add(new Municipio(2, "Patzité"));
        municipios.add(new Municipio(2, "San Antonio Ilotenango"));
        municipios.add(new Municipio(2, "San Bartolomé Jocotenango"));
        municipios.add(new Municipio(2, "San Juan Cotzal"));
        municipios.add(new Municipio(2, "Joyabaj"));
        municipios.add(new Municipio(2, "Nebaj"));
        municipios.add(new Municipio(2, "San Andrés Sajcabajá"));
        municipios.add(new Municipio(2, "Uspantán"));
        municipios.add(new Municipio(2, "Sacapulas"));
        municipios.add(new Municipio(2, "San Miguel Uspantán"));
        municipios.add(new Municipio(2, "Canillá"));
        municipios.add(new Municipio(2, "Chicamán"));
        municipios.add(new Municipio(2, "Ixcan"));
        municipios.add(new Municipio(2, "Pachalum"));
        //Alta Verapaz
        municipios.add(new Municipio(3, "Cobán"));
        municipios.add(new Municipio(3, "Santa Cruz Verapaz"));
        municipios.add(new Municipio(3, "San Cristóbal Verapaz"));
        municipios.add(new Municipio(3, "Tactic"));
        municipios.add(new Municipio(3, "Tamahú"));
        municipios.add(new Municipio(3, "Tucurú"));
        municipios.add(new Municipio(3, "Panzós"));
        municipios.add(new Municipio(3, "Senahú"));
        municipios.add(new Municipio(3, "Cahabón"));
        municipios.add(new Municipio(3, "San Pedro Carchá"));
        municipios.add(new Municipio(3, "San Juan Chamelco"));
        municipios.add(new Municipio(3, "Lanquín"));
        municipios.add(new Municipio(3, "Santa María Cahabón"));
        municipios.add(new Municipio(3, "Chisec"));
        municipios.add(new Municipio(3, "Chahal"));
        municipios.add(new Municipio(3, "Fray Bartolomé de las Casas"));
        municipios.add(new Municipio(3, "La Tinta"));
        municipios.add(new Municipio(3, "Raxruhá"));
        //Baja Verapaz
        municipios.add(new Municipio(4, "Salamá"));
        municipios.add(new Municipio(4, "San Miguel Chicaj"));
        municipios.add(new Municipio(4, "Rabinal"));
        municipios.add(new Municipio(4, "Cubulco"));
        municipios.add(new Municipio(4, "Granados"));
        municipios.add(new Municipio(4, "Santa Cruz El Chol"));
        municipios.add(new Municipio(4, "San Jerónimo"));
        municipios.add(new Municipio(4, "Purulhá"));
        
        municipios.add(new Municipio(5, "Puerto Barrios"));
        municipios.add(new Municipio(5, "Livingston"));
        municipios.add(new Municipio(5, "El Estor"));
        municipios.add(new Municipio(5, "Morales"));
        municipios.add(new Municipio(5, "Los Amates"));
        
        municipios.add(new Municipio(6, "Zacapa"));
        municipios.add(new Municipio(6, "Estanzuela"));
        municipios.add(new Municipio(6, "Río Hondo"));
        municipios.add(new Municipio(6, "Gualán"));
        municipios.add(new Municipio(6, "Huité"));
        
        municipios.add(new Municipio(7, "Chiquimula"));
        municipios.add(new Municipio(7, "Esquipulas"));
        municipios.add(new Municipio(7, "San Jacinto"));
        municipios.add(new Municipio(7, "Ipala"));
        municipios.add(new Municipio(7, "Camotán"));
        
        municipios.add(new Municipio(8, "Guatemala"));
        municipios.add(new Municipio(8, "Mixco"));
        municipios.add(new Municipio(8, "Villa Nueva"));
        municipios.add(new Municipio(8, "Chinautla"));
        municipios.add(new Municipio(8, "San Miguel Petapa"));
        
        municipios.add(new Municipio(9, "Antigua Guatemala"));
        municipios.add(new Municipio(9, "Jocotenango"));
        municipios.add(new Municipio(9, "Ciudad Vieja"));
        municipios.add(new Municipio(9, "San Lucas Sacatepéquez"));
        municipios.add(new Municipio(9, "Santiago Sacatepéquez"));
        
        municipios.add(new Municipio(10, "San Marcos"));
        municipios.add(new Municipio(10, "Comitancillo"));
        municipios.add(new Municipio(10, "San Pedro Sacatepéquez"));
        municipios.add(new Municipio(10, "San Lorenzo"));
        municipios.add(new Municipio(10, "Malacatán"));
        
        municipios.add(new Municipio(11, "Retalhuleu"));
        municipios.add(new Municipio(11, "Champerico"));
        municipios.add(new Municipio(11, "San Sebastian"));
        municipios.add(new Municipio(11, "Santa Cruz Muluá"));
        municipios.add(new Municipio(11, "Nuevo San Carlos"));
        
        municipios.add(new Municipio(12, "Quetzaltenango"));
        municipios.add(new Municipio(12, "Olintepeque"));
        municipios.add(new Municipio(12, "Cantel"));
        municipios.add(new Municipio(12, "Salcajá"));
        municipios.add(new Municipio(12, "San Juan Ostuncalco"));
        
        //Suchitepéquez
        municipios.add(new Municipio(13, "Mazatenango"));
        municipios.add(new Municipio(13, "San Francisco Zapotitlán"));
        municipios.add(new Municipio(13, "San Bernardino"));
        municipios.add(new Municipio(13, "San Gabriel"));
        municipios.add(new Municipio(13, "Chicacao"));
        municipios.add(new Municipio(13, "Patulul"));
        municipios.add(new Municipio(13, "Samayac"));
        municipios.add(new Municipio(13, "Pueblo Nuevo"));
        municipios.add(new Municipio(13, "Río Bravo"));
        municipios.add(new Municipio(13, "San Antonio Suchitepéquez"));
        municipios.add(new Municipio(13, "San Miguel Panán"));
        municipios.add(new Municipio(13, "San Pablo Jocopilas"));
        municipios.add(new Municipio(13, "San Bernardino"));
        municipios.add(new Municipio(13, "Cuyotenango"));
        municipios.add(new Municipio(13, "San José El Ídolo"));
        municipios.add(new Municipio(13, "Santo Domingo Suchitepéquez"));
        
        //Sololá
        municipios.add(new Municipio(14, "Sololá"));
        municipios.add(new Municipio(14, "San José Chacayá"));
        municipios.add(new Municipio(14, "Santa María Visitación"));
        municipios.add(new Municipio(14, "Santa Lucía Utatlán"));
        municipios.add(new Municipio(14, "Nahualá"));
        municipios.add(new Municipio(14, "Santa Catarina Ixtahuacán"));
        municipios.add(new Municipio(14, "Santa Clara La Laguna"));
        municipios.add(new Municipio(14, "Concepción"));
        municipios.add(new Municipio(14, "San Andrés Semetabaj"));
        municipios.add(new Municipio(14, "Panajachel"));
        municipios.add(new Municipio(14, "Santa Cruz La Laguna"));
        municipios.add(new Municipio(14, "San Juan La Laguna"));
        municipios.add(new Municipio(14, "San Pedro La Laguna"));
        municipios.add(new Municipio(14, "Santiago Atitlán"));
        
        //Agregando municipios de Totonicapán
        municipios.add(new Municipio(15, "Totonicapán"));
        municipios.add(new Municipio(15, "Momostenango"));
        municipios.add(new Municipio(15, "San Andrés Xecul"));
        municipios.add(new Municipio(15, "San Francisco El Alto"));
        municipios.add(new Municipio(15, "San Cristóbal Totonicapán"));
        municipios.add(new Municipio(15, "Santa María Chiquimula"));
        municipios.add(new Municipio(15, "San Bartolo Aguas Calientes"));
        municipios.add(new Municipio(15, "San Antonio Sija"));
        municipios.add(new Municipio(15, "Cajolá"));
        municipios.add(new Municipio(15, "Santa Lucía La Reforma"));
        
        //Agregando municipios de Huehuetenango
        municipios.add(new Municipio(16, "Huehuetenango"));
        municipios.add(new Municipio(16, "Chiantla"));
        municipios.add(new Municipio(16, "Cuilco"));
        municipios.add(new Municipio(16, "Huehuetenango"));
        municipios.add(new Municipio(16, "La Democracia"));
        municipios.add(new Municipio(16, "La Libertad"));
        municipios.add(new Municipio(16, "Malacatancito"));
        municipios.add(new Municipio(16, "Nentón"));
        municipios.add(new Municipio(16, "San Juan Atitán"));
        municipios.add(new Municipio(16, "San Mateo Ixtatán"));
        municipios.add(new Municipio(16, "Santa Bárbara"));
        municipios.add(new Municipio(16, "Soloma"));
        municipios.add(new Municipio(16, "Tectitán"));
        municipios.add(new Municipio(16, "Todos Santos Cuchumatán"));
        
        municipios.add(new Municipio(18, "Jalapa"));
        municipios.add(new Municipio(18, "San Pedro Pinula"));
        municipios.add(new Municipio(18, "San Luis Jilotepeque"));
        municipios.add(new Municipio(18, "San Manuel Chaparrón"));
        municipios.add(new Municipio(18, "San Carlos Alzatate"));
        municipios.add(new Municipio(18, "Monjas"));
        municipios.add(new Municipio(18, "Mataquescuintla"));
        
        //Municipios de Jutiapa
        municipios.add(new Municipio(19, "Jutiapa"));
        municipios.add(new Municipio(19, "El Progreso"));
        municipios.add(new Municipio(19, "Santa Catarina Mita"));
        municipios.add(new Municipio(19, "Agua Blanca"));
        municipios.add(new Municipio(19, "Asunción Mita"));
        municipios.add(new Municipio(19, "Yupiltepeque"));
        municipios.add(new Municipio(19, "Atescatempa"));
        municipios.add(new Municipio(19, "Jerez"));
        municipios.add(new Municipio(19, "El Adelanto"));
        municipios.add(new Municipio(19, "Zapotitlán"));
        municipios.add(new Municipio(19, "Comapa"));
        municipios.add(new Municipio(19, "Jalpatagua"));
        municipios.add(new Municipio(19, "Conguaco"));
        municipios.add(new Municipio(19, "Moyuta"));
        municipios.add(new Municipio(19, "Pasaco"));
        municipios.add(new Municipio(19, "Quezada"));
        municipios.add(new Municipio(19, "San José Acatempa"));
        
        //Municipios de Santa Rosa
        municipios.add(new Municipio(20, "Cuilapa"));
        municipios.add(new Municipio(20, "Barberena"));
        municipios.add(new Municipio(20, "Santa Rosa de Lima"));
        municipios.add(new Municipio(20, "Casillas"));
        municipios.add(new Municipio(20, "San Rafael Las Flores"));
        municipios.add(new Municipio(20, "Oratorio"));
        municipios.add(new Municipio(20, "San Juan Tecuaco"));
        municipios.add(new Municipio(20, "Chiquimulilla"));
        municipios.add(new Municipio(20, "Taxisco"));
        municipios.add(new Municipio(20, "Santa María Ixhuatán"));
        municipios.add(new Municipio(20, "Guazacapán"));
        municipios.add(new Municipio(20, "Pueblo Nuevo Viñas"));
        municipios.add(new Municipio(20, "Nueva Santa Rosa"));
        
                // Escuintla (ID 21)
        municipios.add(new Municipio(21, "Escuintla"));
        municipios.add(new Municipio(21, "Santa Lucía Cotzumalguapa"));
        municipios.add(new Municipio(21, "La Democracia"));
        municipios.add(new Municipio(21, "Siquinalá"));
        municipios.add(new Municipio(21, "Masagua"));
        municipios.add(new Municipio(21, "Tiquisate"));
        municipios.add(new Municipio(21, "La Gomera"));
        municipios.add(new Municipio(21, "Guanagazapa"));
        municipios.add(new Municipio(21, "Puerto de San José"));
        municipios.add(new Municipio(21, "Iztapa"));
        
        // Chimaltenango (ID 22)
        municipios.add(new Municipio(22, "Chimaltenango"));
        municipios.add(new Municipio(22, "San José Poaquil"));
        municipios.add(new Municipio(22, "San Martín Jilotepeque"));
        municipios.add(new Municipio(22, "Comalapa"));
        municipios.add(new Municipio(22, "Santa Apolonia"));
        municipios.add(new Municipio(22, "Tecpán Guatemala"));
        municipios.add(new Municipio(22, "Patzún"));
        municipios.add(new Municipio(22, "Pochuta"));
        municipios.add(new Municipio(22, "Patzicía"));
        municipios.add(new Municipio(22, "Santa Cruz Balanyá"));
        municipios.add(new Municipio(22, "Acatenango"));
        municipios.add(new Municipio(22, "Yepocapa"));
        municipios.add(new Municipio(22, "San Andrés Itzapa"));
        
    }
    
    public void agregar(int id_Departamento, String nombreMunicipio){
        municipios.add(new Municipio(id_Departamento, nombreMunicipio));
    }
    
    public void actualizar(int id_Departamento, String nombreMunicipio, String nombreAnterior){
        for(int i = 0; i<municipios.size();i++){
            if(municipios.get(i).getNameMun().equals(nombreAnterior)){
                municipios.set(i, new Municipio(id_Departamento, nombreMunicipio));
            }
        }
    }
    
    public void eliminar(String nombreMunicipio){
        for(int i = 0; i<municipios.size(); i++){
            if(municipios.get(i).getNameMun().equals(nombreMunicipio)){
                municipios.remove(i);
            }
        }
    }
    
    public ArrayList<Municipio> getMunicipio(){
        return municipios;
    }
}
