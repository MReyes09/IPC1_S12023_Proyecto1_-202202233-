
package beam;

public class Departamento {
    private int id_depart;
    private int id_region;
    private String region;

    public Departamento(int id_depart, int id_region, String region) {
        this.id_depart = id_depart;
        this.id_region = id_region;
        this.region = region;
    }

    public int getId_depart() {
        return id_depart;
    }

    public void setId_depart(int id_depart) {
        this.id_depart = id_depart;
    }

    public int getId_region() {
        return id_region;
    }

    public void setId_region(int id_region) {
        this.id_region = id_region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
}
