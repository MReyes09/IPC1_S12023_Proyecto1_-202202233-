package beam;

public class Municipio {
    private int id_muni;
    private int id_depart;
    private String nameMun;

    public Municipio(int id_muni, int id_depart, String nameMun) {
        this.id_muni = id_muni;
        this.id_depart = id_depart;
        this.nameMun = nameMun;
    }

    public int getId_muni() {
        return id_muni;
    }

    public void setId_muni(int id_muni) {
        this.id_muni = id_muni;
    }

    public int getId_depart() {
        return id_depart;
    }

    public void setId_depart(int id_depart) {
        this.id_depart = id_depart;
    }

    public String getNameMun() {
        return nameMun;
    }

    public void setNameMun(String nameMun) {
        this.nameMun = nameMun;
    }
    
}
