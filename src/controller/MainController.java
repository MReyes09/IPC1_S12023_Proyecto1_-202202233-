
package controller;

import System.Proyecto1;
import panel.PanelLogin;
import panel.PanelMenuAdmin;
import panel.PanelMenuUsuario;
import panel.PanelRegistroUsuario;

/**
 * @author matth
 */
public class MainController {
    public Proyecto1 escenario = new Proyecto1();
    public PanelLogin pLogin = new PanelLogin();
    //

    public Proyecto1 getMain() {
        return escenario;
    }

    public PanelLogin getpLogin() {
        return pLogin;
    }
    public PanelRegistroUsuario getpRegUsuario() {
        PanelRegistroUsuario pRegUsuario = new PanelRegistroUsuario();
        return pRegUsuario;
    }

    public PanelMenuAdmin getpMenAdm() {
        PanelMenuAdmin pMenAdm = new PanelMenuAdmin();
        return pMenAdm;
    }

    public PanelMenuUsuario getpMenUsu() {
        PanelMenuUsuario pMenUsu = new PanelMenuUsuario();
        return pMenUsu;
    }
    
    
}
