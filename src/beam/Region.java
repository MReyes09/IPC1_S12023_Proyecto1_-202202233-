package beam;

public class Region {
    private String id_region;
    private String nameReg;
    private float preciEstandar;
    private float precEspecial;
    
    public Region(){
    
    }

    public Region(String id_region, String nameReg, float preciEstandar, float precEspecial) {
        this.id_region = id_region;
        this.nameReg = nameReg;
        this.preciEstandar = preciEstandar;
        this.precEspecial = precEspecial;
    }

    public String getId_region() {
        return id_region;
    }

    public void setId_region(String id_region) {
        this.id_region = id_region;
    }

    public String getNameReg() {
        return nameReg;
    }

    public void setNameReg(String nameReg) {
        this.nameReg = nameReg;
    }

    public float getPreciEstandar() {
        return preciEstandar;
    }

    public void setPreciEstandar(float preciEstandar) {
        this.preciEstandar = preciEstandar;
    }

    public float getPrecEspecial() {
        return precEspecial;
    }

    public void setPrecEspecial(float precEspecial) {
        this.precEspecial = precEspecial;
    }
    
}
