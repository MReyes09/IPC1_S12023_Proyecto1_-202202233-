package beam;

import java.util.Date;

public class Factura {
    private int id_usu;
    private int id_paquete;
    private Date fechaEnvio;

    public Factura(int id_usu, int id_paquete, Date fechaEnvio) {
        this.id_usu = id_usu;
        this.id_paquete = id_paquete;
        this.fechaEnvio = fechaEnvio;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public int getId_paquete() {
        return id_paquete;
    }

    public void setId_paquete(int id_paquete) {
        this.id_paquete = id_paquete;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
        
}
