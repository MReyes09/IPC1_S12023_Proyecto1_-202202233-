
package controller;

import System.Proyecto1;
import panel.PanelDepartamento;
import panel.PanelLogin;
import panel.PanelMenuAdmin;
import panel.PanelMenuEmpresarial;
import panel.PanelMenuUsuario;
import panel.PanelRegion;
import panel.PanelRegistroUsuario;
import panel.PanelPerfil;
import panel.PanelKiosco;
import panel.PanelMunicipio;

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
    
    public PanelRegion getPanelRegion(){
        PanelRegion pRegion = new PanelRegion();
        return pRegion;
    }
    
    public PanelPerfil getPanelPerfil(){
        PanelPerfil pPerfil = new PanelPerfil();
        return pPerfil;
    }
    
    public PanelMenuEmpresarial getPanelMenuEmp(){
        PanelMenuEmpresarial pMenEm = new PanelMenuEmpresarial();
        return pMenEm;
    }
    
    public PanelKiosco getPanelKiosco(){
        PanelKiosco pKiosco = new PanelKiosco();
        return pKiosco;
    }
    
    public PanelDepartamento getPanelDepartamento(){
        PanelDepartamento pDepa = new PanelDepartamento();
        return pDepa;
    }
    
    public PanelMunicipio getPanelMunicipio(){
        PanelMunicipio pMuni = new PanelMunicipio();
        return pMuni;
    }
}
