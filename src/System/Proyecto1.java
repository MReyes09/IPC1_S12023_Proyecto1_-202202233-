
package System;

import controller.RegionController;
import controller.UsuarioController;
import ventana.ViewInicial;
import controller.DepartamentoController;
import controller.MunicipioController;

/**
 * @author matth
 *//**
 * @author matth
 */
public class Proyecto1 {
    static UsuarioController usController = new UsuarioController();
    static ViewInicial vMain = new ViewInicial();
    static RegionController regionController = new RegionController();
    static DepartamentoController departamentoCon = new DepartamentoController();
    static MunicipioController municipioCon = new MunicipioController();
    
    public static void main(String[] args) {
        usController.createUsuarioAdmin();
        regionController.createRegionesDefined();
        departamentoCon.createDepartamentos();
        municipioCon.createMunicipio();
        vMain.setVisible(true);
        vMain.setLocationRelativeTo(null);
    }

    public ViewInicial getvMain() {
        return vMain;
    }
}
