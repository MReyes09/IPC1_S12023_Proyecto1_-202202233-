package beam;

public class Paquete {
    private int id_paquete;
    private String depaOrig;
    private String muniOrig;
    private String direccOrig;
    private String depaDest;
    private String muniDest;
    private String direccDest;
    private int cantPaquetes;
    private String pesoTot;

    public Paquete(int id_paquete, String depaOrig, String muniOrig, String direccOrig, String depaDest, String muniDest, String direccDest, int cantPaquetes, String pesoTot) {
        this.id_paquete = id_paquete;
        this.depaOrig = depaOrig;
        this.muniOrig = muniOrig;
        this.direccOrig = direccOrig;
        this.depaDest = depaDest;
        this.muniDest = muniDest;
        this.direccDest = direccDest;
        this.cantPaquetes = cantPaquetes;
        this.pesoTot = pesoTot;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public String getDepaOrig() {
        return depaOrig;
    }

    public void setDepaOrig(String depaOrig) {
        this.depaOrig = depaOrig;
    }

    public String getMuniOrig() {
        return muniOrig;
    }

    public void setMuniOrig(String muniOrig) {
        this.muniOrig = muniOrig;
    }

    public String getDireccOrig() {
        return direccOrig;
    }

    public void setDireccOrig(String direccOrig) {
        this.direccOrig = direccOrig;
    }

    public String getDepaDest() {
        return depaDest;
    }

    public void setDepaDest(String depaDest) {
        this.depaDest = depaDest;
    }

    public String getMuniDest() {
        return muniDest;
    }

    public void setMuniDest(String muniDest) {
        this.muniDest = muniDest;
    }

    public String getDireccDest() {
        return direccDest;
    }

    public void setDireccDest(String direccDest) {
        this.direccDest = direccDest;
    }

    public int getCantPaquetes() {
        return cantPaquetes;
    }

    public void setCantPaquetes(int cantPaquetes) {
        this.cantPaquetes = cantPaquetes;
    }

    public String getPesoTot() {
        return pesoTot;
    }

    public void setPesoTot(String pesoTot) {
        this.pesoTot = pesoTot;
    }
    
}
