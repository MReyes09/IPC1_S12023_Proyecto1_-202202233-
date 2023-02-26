
package System;

import controller.RegionController;
import controller.UsuarioController;
import ventana.ViewInicial;

/**
 * @author matth
 */
public class Proyecto1 {
    static UsuarioController usController = new UsuarioController();
    static ViewInicial vMain = new ViewInicial();
    static RegionController regionController = new RegionController();
    
    public static void main(String[] args) {
        usController.createUsuarioAdmin();
        regionController.createRegionesDefined();
        vMain.setVisible(true);
        vMain.setLocationRelativeTo(null);
    }

    public ViewInicial getvMain() {
        return vMain;
    }
}
