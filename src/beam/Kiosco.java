
package beam;

/**
 * @author matth
 */
public class Kiosco {
        private int id_Kiosco;
    private String codRegion;
    private String nombreKiosco;

    public Kiosco() {
    }

    public Kiosco(int id_Kiosco, String codRegion, String nombreKiosco) {
        this.id_Kiosco = id_Kiosco;
        this.codRegion = codRegion;
        this.nombreKiosco = nombreKiosco;
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

    public String getNombreKiosco() {
        return nombreKiosco;
    }

    public void setNombreKiosco(String nombreKiosco) {
        this.nombreKiosco = nombreKiosco;
    }
}
