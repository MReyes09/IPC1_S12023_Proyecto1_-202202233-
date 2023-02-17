
package beam;

import java.util.Date;

public class Usuario {

    private int id_usu;
    private String nameUsu;
    private String lastNamUsu;
    private String passUsu;
    private String dpiUsu;
    private Date dateborn;
    private String gender;
    private String nationality;
    private String nickNamme;
    private String phone;
    private String rol;
    private String image;

    public Usuario(int id_usu, String nameUsu, String lastNamUsu, String passUsu, String dpiUsu, Date dateborn, String gender, String nationality, String nickNamme, String phone, String rol, String image) {
        this.id_usu = id_usu;
        this.nameUsu = nameUsu;
        this.lastNamUsu = lastNamUsu;
        this.passUsu = passUsu;
        this.dpiUsu = dpiUsu;
        this.dateborn = dateborn;
        this.gender = gender;
        this.nationality = nationality;
        this.nickNamme = nickNamme;
        this.phone = phone;
        this.rol = rol;
        this.image = image;
    }

    public int getId_usu() {
        return id_usu;
    }

    public void setId_usu(int id_usu) {
        this.id_usu = id_usu;
    }

    public String getNameUsu() {
        return nameUsu;
    }

    public void setNameUsu(String nameUsu) {
        this.nameUsu = nameUsu;
    }

    public String getLastNamUsu() {
        return lastNamUsu;
    }

    public void setLastNamUsu(String lastNamUsu) {
        this.lastNamUsu = lastNamUsu;
    }

    public String getPassUsu() {
        return passUsu;
    }

    public void setPassUsu(String passUsu) {
        this.passUsu = passUsu;
    }

    public String getDpiUsu() {
        return dpiUsu;
    }

    public void setDpiUsu(String dpiUsu) {
        this.dpiUsu = dpiUsu;
    }

    public Date getDateborn() {
        return dateborn;
    }

    public void setDateborn(Date dateborn) {
        this.dateborn = dateborn;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNickNamme() {
        return nickNamme;
    }

    public void setNickNamme(String nickNamme) {
        this.nickNamme = nickNamme;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
}
