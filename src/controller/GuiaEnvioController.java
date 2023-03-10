
package controller;

import beam.GuiaEnvio;
import beam.Usuario;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

/**
 * @author matth
 */
public class GuiaEnvioController {
    private static final String LETRAS_MAYUSCULAS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LETRAS_MINUSCULAS = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUMEROS = "0123456789";
    private static final String CARACTERES = LETRAS_MAYUSCULAS + LETRAS_MINUSCULAS + NUMEROS + "_-";
    UsuarioController usuarioController = new UsuarioController();
    static ArrayList<GuiaEnvio> listaGuias = new ArrayList<GuiaEnvio>();
    static ArrayList<String> listaTipoServicio = new ArrayList<String>(); 
    
    public void agregarGuiaTemporal(int numPaquetes, int tipoEnvio, double pesoTotal, double envioCosto, double costoTotal,
                                String depaO, String muniO, String direO, String depaD, String muniD, String direD, String tipoServicio)
    {
        int idUsuario = usuarioController.getUserLogin().getId_usu();
        String cod = generarCodigoGuia();
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFormateada = fechaActual.format(formato);
        
        listaGuias.add(new GuiaEnvio(idUsuario,cod,depaO,muniO,direO
                ,depaD,muniD,direD,envioCosto,pesoTotal
                ,numPaquetes,fechaFormateada,costoTotal, tipoServicio));
        System.out.println("Data: " + idUsuario + cod);
    }
    
    public static String generarCodigoGuia() {
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append("IPC1C");

        // Generar 5 caracteres aleatorios
        for (int i = 0; i < 5; i++) {
            int index = rnd.nextInt(CARACTERES.length());
            sb.append(CARACTERES.charAt(index));
        }
        String codigoGuia = sb.toString();
        boolean codigoUnico = verificarCodigoUnicoEnSistema(codigoGuia);

        while (!codigoUnico) {
            sb.setLength(0);
            sb.append("IPC1C");
            for (int i = 0; i < 5; i++) {
                int index = rnd.nextInt(CARACTERES.length());
                sb.append(CARACTERES.charAt(index));
            }
            codigoGuia = sb.toString();
            codigoUnico = verificarCodigoUnicoEnSistema(codigoGuia);
        }
        return codigoGuia;
    }

    private static boolean verificarCodigoUnicoEnSistema(String codigoGuia) {
        for(int i = 0; i < listaGuias.size(); i++){
            if(listaGuias.get(i).getCodigoPaquete().equals(codigoGuia)){
                return false;
            }
        }
        return true;
    }
    
    public ArrayList<GuiaEnvio> getGuiasUsuarioLogueado(){
        Usuario usuario = usuarioController.getUserLogin();
        ArrayList<GuiaEnvio> guiaEnvio = new ArrayList<GuiaEnvio>();
        for(int i = 0; i < listaGuias.size(); i++){
            if(listaGuias.get(i).getId_Usuario()== usuario.getId_usu()){
                guiaEnvio.add(listaGuias.get(i));
            }
        }
        return guiaEnvio;
    }
    
    public GuiaEnvio getEspecificGuia(String codigoGuia){
        ArrayList<GuiaEnvio> temporal = getGuiasUsuarioLogueado();
        for(int i = 0; i < temporal.size() ; i++){
            if(temporal.get(i).getCodigoPaquete().equals(codigoGuia)){
                GuiaEnvio guiaFind = temporal.get(i);
                return guiaFind;
            }
        }
        return null;
    }
    
    public void eliminarTemporal(){
        int index = listaGuias.size()-1;
        listaGuias.remove(index);
    }
    
    public void agregarAlTotal(String tipoPago){
        int index = listaGuias.size()-1;
        GuiaEnvio guiaUp = listaGuias.get(index);
        listaTipoServicio.add(guiaUp.getTipoServicio());
        if(tipoPago == null){
            guiaUp.setTipoServicio("Pago con tarjeta");
        }else{
            double ant = guiaUp.getTotalAPagar();
            guiaUp.setTipoServicio(tipoPago);
            guiaUp.setTotalAPagar(ant+5);
        }
        listaGuias.set(index, guiaUp);
    }
    
    public ArrayList<GuiaEnvio> getGuiaEnvio(){
        return listaGuias;
    }
    
    public ArrayList<String> getListaTipoServicio(){
        return listaTipoServicio;
    }
}
