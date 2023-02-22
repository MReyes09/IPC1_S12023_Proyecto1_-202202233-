
package controller;

import System.Proyecto1;
import panel.PanelLogin;

/**
 * @author matth
 */
public class MainController {
    public Proyecto1 escenario = new Proyecto1();
    public PanelLogin pLogin = new PanelLogin();

    public Proyecto1 getMain() {
        return escenario;
    }

    public PanelLogin getpLogin() {
        return pLogin;
    }
}
