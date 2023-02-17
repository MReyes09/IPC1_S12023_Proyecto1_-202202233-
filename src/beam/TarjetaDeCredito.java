package beam;

import java.util.Date;

public class TarjetaDeCredito {
    private int id_tarje;
    private String nameTarjeta;
    private int numTarjeta;
    private Date fechVencimiento;

    public TarjetaDeCredito(int id_tarje,String nameTarjeta, int numTarjeta, Date fechVencimiento) {
        this.id_tarje = id_tarje;
        this.nameTarjeta = nameTarjeta;
        this.numTarjeta = numTarjeta;
        this.fechVencimiento = fechVencimiento;
    }

    public int getId_tarje() {
        return id_tarje;
    }

    public void setId_tarje(int id_tarje) {
        this.id_tarje = id_tarje;
    }

    public String getNameTarjeta() {
        return nameTarjeta;
    }

    public void setNameTarjeta(String nameTarjeta) {
        this.nameTarjeta = nameTarjeta;
    }

    public int getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(int numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public Date getFechVencimiento() {
        return fechVencimiento;
    }

    public void setFechVencimiento(Date fechVencimiento) {
        this.fechVencimiento = fechVencimiento;
    }
    
}
