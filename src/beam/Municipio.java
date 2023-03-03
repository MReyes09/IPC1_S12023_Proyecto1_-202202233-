package beam;

public class Municipio {
    private int id_depart;
    private String nameMun;
    
    Municipio(){
    }

    public Municipio(int id_depart, String nameMun) {
        this.id_depart = id_depart;
        this.nameMun = nameMun;
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
