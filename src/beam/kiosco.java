
package beam;

public class kiosco {
    private int id_Kiosco;
    private String nomkiosco;
    private int id_region;

    public kiosco(int id_Kiosco, String nomkiosco, int id_region) {
        this.id_Kiosco = id_Kiosco;
        this.nomkiosco = nomkiosco;
        this.id_region = id_region;
    }

    public int getId_Kiosco() {
        return id_Kiosco;
    }

    public void setId_Kiosco(int id_Kiosco) {
        this.id_Kiosco = id_Kiosco;
    }

    public String getNomkiosco() {
        return nomkiosco;
    }

    public void setNomkiosco(String nomkiosco) {
        this.nomkiosco = nomkiosco;
    }

    public int getId_region() {
        return id_region;
    }

    public void setId_region(int id_region) {
        this.id_region = id_region;
    }
    
}
