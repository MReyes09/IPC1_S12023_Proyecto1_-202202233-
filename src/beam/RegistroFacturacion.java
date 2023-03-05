
package beam;

/**
 * @author matth
 */
public class RegistroFacturacion {
    private int id_Usuario;
    private String nombreCompleto;
    private String direccion;
    private String NIT;

    public RegistroFacturacion() {
    }

    public RegistroFacturacion(int id_Usuario, String nombreCompleto, String direccion, String NIT) {
        this.id_Usuario = id_Usuario;
        this.nombreCompleto = nombreCompleto;
        this.direccion = direccion;
        this.NIT = NIT;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }
}
