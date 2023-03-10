package beam;

import java.util.Date;

public class TarjetaDeCredito {
    private int id_tarje;
    private int id_Usuario;
    private String nameTarjeta;
    private String numTarjeta;
    private String fechVencimiento;

    public TarjetaDeCredito() {
    }

    public TarjetaDeCredito(int id_tarje, int id_Usuario, String nameTarjeta, String numTarjeta, String fechVencimiento) {
        this.id_tarje = id_tarje;
        this.id_Usuario = id_Usuario;
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

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNameTarjeta() {
        return nameTarjeta;
    }

    public void setNameTarjeta(String nameTarjeta) {
        this.nameTarjeta = nameTarjeta;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public String getFechVencimiento() {
        return fechVencimiento;
    }

    public void setFechVencimiento(String fechVencimiento) {
        this.fechVencimiento = fechVencimiento;
    }

}
