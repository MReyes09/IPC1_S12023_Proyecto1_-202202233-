
package panel;

import beam.Departamento;
import beam.Municipio;
import beam.Region;
import beam.RegistroFacturacion;
import controller.DepartamentoController;
import controller.GuiaEnvioController;
import controller.MainController;
import controller.MunicipioController;
import controller.RegionController;
import controller.RegistroFacturacionController;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author matth
 */
public class PanelCotizacionPaquetes extends javax.swing.JPanel {
    MainController mainCon = new MainController();
    javax.swing.JPanel cambioPanel = null;
    DepartamentoController depaController = new DepartamentoController();
    MunicipioController muniController = new MunicipioController();
    RegistroFacturacionController regController = new RegistroFacturacionController();
    RegionController regionController = new RegionController(); 
    GuiaEnvioController guiaController = new GuiaEnvioController();
    Region preciosRegion;
    
    //VARIABLES UTILIZADAS EN EL HTML
    int numPaquetes;
    int tipoEnvio;
    double pesoTotal;
    double envioCosto;
    double costoTotal;
    String tipoServicio;
    String depaO;
    String muniO;
    String direO;
    String depaD;
    String muniD;
    String direD;
    static int id;
    
    public PanelCotizacionPaquetes() {
        initComponents();
        listarDepartamentos();
        btn_DescargarC.setVisible(false);
        btn_Comprar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmb_DepaOrigen = new javax.swing.JComboBox<>();
        cmb_MuniOrigen = new javax.swing.JComboBox<>();
        txt_DireccOrigen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmb_DepaDes = new javax.swing.JComboBox<>();
        cmb_MuniDes = new javax.swing.JComboBox<>();
        txt_DireccDes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_NumPaquetes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmb_TipoEnvio = new javax.swing.JComboBox<>();
        btn_Volver = new javax.swing.JButton();
        txt_PesoTo = new javax.swing.JTextField();
        lbl_Resultado = new javax.swing.JLabel();
        btn_Cotizar = new javax.swing.JButton();
        btn_DescargarC = new javax.swing.JButton();
        btn_Comprar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("COTIZACiÓN DE PAQUETES");

        jLabel2.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jLabel2.setText("Origen");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Departamento:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Municipio:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Dirección:");

        cmb_DepaOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_DepaOrigenActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        jLabel6.setText("Destino");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Dirección:");

        cmb_DepaDes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_DepaDesActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Departamento:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Municipio:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Número de paquetes:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Peso Total (Libras):");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Tipo de envío:");

        btn_Volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        lbl_Resultado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Resultado.setText("Total a pagar:");

        btn_Cotizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Cotizar.setText("Cotizar");
        btn_Cotizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CotizarActionPerformed(evt);
            }
        });

        btn_DescargarC.setBackground(new java.awt.Color(153, 0, 0));
        btn_DescargarC.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_DescargarC.setText("Descargar Cotización");
        btn_DescargarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DescargarCActionPerformed(evt);
            }
        });

        btn_Comprar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Comprar.setText("Solicitar compra");
        btn_Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComprarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_PesoTo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(253, 253, 253))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_NumPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cmb_TipoEnvio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel5))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmb_MuniOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_DireccOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cmb_DepaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(47, 47, 47))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(btn_Volver))
                                            .addGap(250, 250, 250)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn_Cotizar)
                                                .addGap(18, 18, 18)
                                                .addComponent(btn_Comprar))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(cmb_DepaDes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cmb_MuniDes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txt_DireccDes, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                            .addGap(98, 98, 98)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(btn_DescargarC)
                        .addGap(115, 115, 115))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmb_DepaOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmb_MuniOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_DireccOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cmb_DepaDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cmb_MuniDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_DireccDes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txt_NumPaquetes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(cmb_TipoEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txt_PesoTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Resultado)
                    .addComponent(btn_DescargarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Cotizar)
                    .addComponent(btn_Comprar))
                .addGap(48, 48, 48))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        cambioPanel = mainCon.getpMenUsu();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void cmb_DepaOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_DepaOrigenActionPerformed
        String departamento = cmb_DepaOrigen.getSelectedItem().toString();
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        departamentos = depaController.getDepartamento();
        int id = 0;
        for(int i =0; i<departamentos.size();i++){
            if(departamentos.get(i).getNombre().equals(departamento)){
                int id_Departamento = departamentos.get(i).getId_depart();
                i = departamentos.size();
                listarMunicipio(id, id_Departamento, departamento);
            }
        }
    }//GEN-LAST:event_cmb_DepaOrigenActionPerformed

    private void cmb_DepaDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_DepaDesActionPerformed
        String departamento = cmb_DepaDes.getSelectedItem().toString();
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        departamentos = depaController.getDepartamento();
        int id = 1;
        int id_Departamento;
        String region;
        for(int i =0; i<departamentos.size();i++){
            if(departamentos.get(i).getNombre().equals(departamento)){
                id_Departamento = departamentos.get(i).getId_depart();
                region = departamentos.get(i).getId_region();
                preciosRegion = regionController.especificRegion(region);
                i = departamentos.size();
                listarMunicipio(id, id_Departamento, departamento);
            }
        }
        
    }//GEN-LAST:event_cmb_DepaDesActionPerformed

    private void btn_CotizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CotizarActionPerformed
        numPaquetes = Integer.valueOf(txt_NumPaquetes.getText());
        tipoEnvio = cmb_TipoEnvio.getSelectedIndex();
        pesoTotal = Double.valueOf(txt_PesoTo.getText());
        depaO = cmb_DepaOrigen.getSelectedItem().toString();
        muniO = cmb_MuniOrigen.getSelectedItem().toString();
        direO = txt_DireccOrigen.getText();
        depaD = cmb_DepaDes.getSelectedItem().toString();
        muniD = cmb_MuniDes.getSelectedItem().toString();
        direD = txt_DireccDes.getText();
        if(tipoEnvio == 0){
            tipoServicio = "Estandar";
            envioCosto = preciosRegion.getPreciEstandar();
        }else{
            tipoServicio = "Especial";
            envioCosto = preciosRegion.getPrecEspecial();
        }
        costoTotal = numPaquetes*pesoTotal*envioCosto;
        lbl_Resultado.setText("Total a pagar: Q" + costoTotal);
        btn_DescargarC.setVisible(true);
        btn_Comprar.setVisible(true);
    }//GEN-LAST:event_btn_CotizarActionPerformed

    private void btn_DescargarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DescargarCActionPerformed
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\matth\\Downloads\\Cotización"+ id +".html");
            fileWriter.write("<html>"+
            "<head>" +
            "<style>" +
            "body {" +
            "background-color: #f2f2f2;" +
            "font-family: Arial, sans-serif;" +
            "font-size: 16px;" +
            "line-height: 1.5;" +
            "color: #333;" +
            "margin: 0;" +
            "padding: 0;" +
            "}" +
            "h1 {" +
            "font-size: 32px;" +
            "font-weight: bold;" +
            "margin: 20px 0;" +
            "}" +
            "p {" +
            "margin: 10px 0;" +
            "}" +
            "table {" +
            "border-collapse: collapse;" +
            "width: 100%;" +
            "max-width: 600px;" +
            "margin: 20px auto;" +
            "}" +
            "th, td {" +
            "padding: 10px;" +
            "text-align: center;" +
            "border: 1px solid #ccc;" +
            "}" +
            "th {" +
            "background-color: #eee;" +
            "}" +
            "</style>" +
            "</head>" +
            "<body>" +
            "<table>" +
            "<tr><th>Origen</th><th>Destino</th></tr>" +

            // Primera fila de la tabla
            "<tr>" +
            "<td>" +
            "Departamento: "+ depaO +"<br>" +
            "Municipio: "+ muniO +"<br>" +
            "Direccion: "+ direO +
            "</td>" +

            "<td>" +
            "Departamento: "+ depaD +"<br>" +
            "Municipio: "+ muniD +"<br>" +
            "Direccion: "+ direD +
            "</td>" +
            "</tr>" +

            // Segunda fila de la tabla
            "<tr>" +
            "<td>Numero de paquetes: "+ numPaquetes +"</td>" +
            "<td>Costo de envio: Q"+ envioCosto +"</td>" +
            "</tr>" +

            // Tercera fila de la tabla
            "<tr>" +
            "<td>Peso Total(Libras): "+ pesoTotal +"Lb" +"</td>" +
            "<td></td>" +
            "</tr>" +

            // Cuarta fila de la tabla
            "<tr>" +
            "<td></td>" +
            "<td>Total a pagar: Q"+ costoTotal +"</td>" +
            "</tr>" +
            "</table>" +
            "</body></html>");
            fileWriter.close();
        } catch (IOException ex) {
            System.out.println("Error al escribir el archivo");
        }
        id++;
        JOptionPane.showMessageDialog(null, "Se ha descargado con exito la cotización\n"
                +"puedes verificar tu archivo en las descargas"
        );
    }//GEN-LAST:event_btn_DescargarCActionPerformed

    private void btn_ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComprarActionPerformed
        guiaController.agregarGuiaTemporal(numPaquetes, tipoEnvio, pesoTotal, envioCosto, costoTotal, depaO, muniO, direO, depaD, muniD, direD, tipoServicio);
        cambioPanel = mainCon.getPanelCompraEnvio();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_ComprarActionPerformed

    private void listarDepartamentos(){
        RegistroFacturacion registroFac = regController.getRegistroFacturacion();
        ArrayList<Departamento> depa = new ArrayList<Departamento>();
        depa = depaController.getDepartamento();
        for(int e = 0; e < depa.size(); e++){
            cmb_DepaOrigen.addItem(depa.get(e).getNombre());
            cmb_DepaDes.addItem(depa.get(e).getNombre());
        }
        if(registroFac != null){
            txt_DireccOrigen.setText(registroFac.getDireccion());
        }
    }
    
    private void listarMunicipio(int id, int id_Departamento, String departamento){
        ArrayList<Municipio> muniList = muniController.getMunicipio();
        if(id == 0){
            int x = cmb_MuniOrigen.getItemCount();
            for(int i = 0; i < x; i++){
                cmb_MuniOrigen.removeItemAt(0);
            }            
            for(int i =0 ; i < muniList.size(); i++){
                if(muniList.get(i).getId_depart()== id_Departamento){
                    cmb_MuniOrigen.addItem(muniList.get(i).getNameMun());
                }
            }
        }else if(id == 1){
            int x = cmb_MuniDes.getItemCount();
            for(int i = 0; i < x; i++){
                cmb_MuniDes.removeItemAt(0);                
            }            
            for(int i =0 ; i < muniList.size(); i++){
                if(muniList.get(i).getId_depart()== id_Departamento){
                    cmb_MuniDes.addItem(muniList.get(i).getNameMun());
                }
            }
            int y = cmb_TipoEnvio.getItemCount();
            for(int e = 0; e < y; e++){
                    cmb_TipoEnvio.removeItemAt(0);
            }
            cmb_TipoEnvio.addItem("Estandar: "+String.valueOf(preciosRegion.getPreciEstandar()));
            cmb_TipoEnvio.addItem("Especial: "+String.valueOf(preciosRegion.getPrecEspecial()));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Comprar;
    private javax.swing.JButton btn_Cotizar;
    private javax.swing.JButton btn_DescargarC;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cmb_DepaDes;
    private javax.swing.JComboBox<String> cmb_DepaOrigen;
    private javax.swing.JComboBox<String> cmb_MuniDes;
    private javax.swing.JComboBox<String> cmb_MuniOrigen;
    private javax.swing.JComboBox<String> cmb_TipoEnvio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_Resultado;
    private javax.swing.JTextField txt_DireccDes;
    private javax.swing.JTextField txt_DireccOrigen;
    private javax.swing.JTextField txt_NumPaquetes;
    private javax.swing.JTextField txt_PesoTo;
    // End of variables declaration//GEN-END:variables
}
