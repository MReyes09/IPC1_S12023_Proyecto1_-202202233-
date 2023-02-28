
package beam;

/**
 * @author matth
 */
public class Kiosco {
    private int id_Kiosco;
    private String codRegion;
    private String nombreKio;

    public Kiosco() {
    }

    public Kiosco(int id_Kiosco, String codRegion, String nombreKio) {
        this.id_Kiosco = id_Kiosco;
        this.codRegion = codRegion;
        this.nombreKio = nombreKio;
    }

    public int getId_Kiosco() {
        return id_Kiosco;
    }

    public void setId_Kiosco(int id_Kiosco) {
        this.id_Kiosco = id_Kiosco;
    }

    public String getCodRegion() {
        return codRegion;
    }

    public void setCodRegion(String codRegion) {
        this.codRegion = codRegion;
    }

    public String getNombreKio() {
        return nombreKio;
    }

    public void setNombreKio(String nombreKio) {
        this.nombreKio = nombreKio;
    }
}
