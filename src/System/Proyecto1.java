
package System;

import controller.UsuarioController;
import ventana.ViewInicial;

/**
 * @author matth
 */
public class Proyecto1 {
    static UsuarioController usController = new UsuarioController();
    
    public static void main(String[] args) {
        usController.createUsuarioAdmin();
        ViewInicial vMain = new ViewInicial();
        vMain.setVisible(true);
        vMain.setLocationRelativeTo(null);
    }
}
