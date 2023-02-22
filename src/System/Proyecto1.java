
package System;

import controller.UsuarioController;
import ventana.ViewInicial;

/**
 * @author matth
 */
public class Proyecto1 {
    static UsuarioController usController = new UsuarioController();
    static ViewInicial vMain = new ViewInicial();
    
    public static void main(String[] args) {
        usController.createUsuarioAdmin();
        vMain.setVisible(true);
        vMain.setLocationRelativeTo(null);
    }

    public ViewInicial getvMain() {
        return vMain;
    }
}
