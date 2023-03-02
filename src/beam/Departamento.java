
package beam;

public class Departamento {
    private int id_depart;
    private String id_region;
    private String region;
    private String nombre;

    public Departamento(){
    }

    public Departamento(int id_depart, String id_region, String region, String nombre) {
        this.id_depart = id_depart;
        this.id_region = id_region;
        this.region = region;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_depart() {
        return id_depart;
    }

    public void setId_depart(int id_depart) {
        this.id_depart = id_depart;
    }

    public String getId_region() {
        return id_region;
    }

    public void setId_region(String id_region) {
        this.id_region = id_region;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
}
