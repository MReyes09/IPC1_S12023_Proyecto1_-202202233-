package beam;

public class Factura extends GuiaEnvio{
    private int id_Factura;
    private String Nit;

    public Factura() {
    }

    public Factura(int id_Factura, String Nit) {
        this.id_Factura = id_Factura;
        this.Nit = Nit;
    }

    public Factura(int id_Usuario, String codigoPaquete, String depaO, String muniO, String direO, String depaD, String muniD, String direD, double precioPago, double tamanoPaquete, int numeroPaquetes, String fechaEnvio, double totalAPagar, String tipoServicio) {
        super(id_Usuario, codigoPaquete, depaO, muniO, direO, depaD, muniD, direD, precioPago, tamanoPaquete, numeroPaquetes, fechaEnvio, totalAPagar, tipoServicio);
    }
    
    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }

    public int getId_Factura() {
        return id_Factura;
    }

    public void setId_Factura(int id_Factura) {
        this.id_Factura = id_Factura;
    }
}