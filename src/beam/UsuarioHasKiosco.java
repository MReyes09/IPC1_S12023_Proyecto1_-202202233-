
package beam;

/**
 * @author matth
 */
public class UsuarioHasKiosco {
    private int id_Usu;
    private int id_Kiosco;
    
    UsuarioHasKiosco(){
    }

    public UsuarioHasKiosco(int id_Usu, int id_Kiosco) {
        this.id_Usu = id_Usu;
        this.id_Kiosco = id_Kiosco;
    }    

    public int getId_Usu() {
        return id_Usu;
    }

    public void setId_Usu(int id_Usu) {
        this.id_Usu = id_Usu;
    }

    public int getId_Kiosco() {
        return id_Kiosco;
    }

    public void setId_Kiosco(int id_Kiosco) {
        this.id_Kiosco = id_Kiosco;
    }
}
