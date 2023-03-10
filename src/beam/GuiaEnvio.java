
package beam;

/**
 * @author matth
 */
public class GuiaEnvio {
    int id_Usuario;
    String codigoPaquete;
    //ORIGEN
    String depaO;
    String muniO;
    String direO;
    //DESTINO
    String depaD;
    String muniD;
    String direD;
    double precioPago;
    double tamanoPaquete;
    int numeroPaquetes;
    String fechaEnvio;
    double totalAPagar;
    String tipoServicio;
    
    public GuiaEnvio() {
    }

    public GuiaEnvio(int id_Usuario, String codigoPaquete, String depaO, String muniO, String direO, String depaD, String muniD, String direD, double precioPago, double tamanoPaquete, int numeroPaquetes, String fechaEnvio, double totalAPagar, String tipoServicio) {
        this.id_Usuario = id_Usuario;
        this.codigoPaquete = codigoPaquete;
        this.depaO = depaO;
        this.muniO = muniO;
        this.direO = direO;
        this.depaD = depaD;
        this.muniD = muniD;
        this.direD = direD;
        this.precioPago = precioPago;
        this.tamanoPaquete = tamanoPaquete;
        this.numeroPaquetes = numeroPaquetes;
        this.fechaEnvio = fechaEnvio;
        this.totalAPagar = totalAPagar;
        this.tipoServicio = tipoServicio;
    }    

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getCodigoPaquete() {
        return codigoPaquete;
    }

    public void setCodigoPaquete(String codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    public String getDepaO() {
        return depaO;
    }

    public void setDepaO(String depaO) {
        this.depaO = depaO;
    }

    public String getMuniO() {
        return muniO;
    }

    public void setMuniO(String muniO) {
        this.muniO = muniO;
    }

    public String getDireO() {
        return direO;
    }

    public void setDireO(String direO) {
        this.direO = direO;
    }

    public String getDepaD() {
        return depaD;
    }

    public void setDepaD(String depaD) {
        this.depaD = depaD;
    }

    public String getMuniD() {
        return muniD;
    }

    public void setMuniD(String muniD) {
        this.muniD = muniD;
    }

    public String getDireD() {
        return direD;
    }

    public void setDireD(String direD) {
        this.direD = direD;
    }

    public double getPrecioPago() {
        return precioPago;
    }

    public void setPrecioPago(double precioPago) {
        this.precioPago = precioPago;
    }

    public double getTamanoPaquete() {
        return tamanoPaquete;
    }

    public void setTamanoPaquete(double tamanoPaquete) {
        this.tamanoPaquete = tamanoPaquete;
    }

    public int getNumeroPaquetes() {
        return numeroPaquetes;
    }

    public void setNumeroPaquetes(int numeroPaquetes) {
        this.numeroPaquetes = numeroPaquetes;
    }

    public String getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(String fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    public double getTotalAPagar() {
        return totalAPagar;
    }

    public void setTotalAPagar(double totalAPagar) {
        this.totalAPagar = totalAPagar;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
}