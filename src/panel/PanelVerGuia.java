
package panel;

import beam.GuiaEnvio;
import controller.GuiaEnvioController;
import controller.MainController;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static panel.PanelCotizacionPaquetes.id;

/**
 * @author matth
 */
public class PanelVerGuia extends javax.swing.JPanel {
    MainController mainCon = new MainController();
    GuiaEnvioController guiaController = new GuiaEnvioController();
    javax.swing.JPanel cambioPanel = null;
    String codigoGuia;
    int codGuia;

    public PanelVerGuia() {
        initComponents();
        agregarCodigosGuia();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cmb_CodGuia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_CodPaquete = new javax.swing.JTextField();
        txt_Origen = new javax.swing.JTextField();
        txt_Destino = new javax.swing.JTextField();
        txt_TipoPago = new javax.swing.JTextField();
        txt_PesoTotal = new javax.swing.JTextField();
        txt_NumPaquete = new javax.swing.JTextField();
        txt_Fecha = new javax.swing.JTextField();
        txt_Total = new javax.swing.JTextField();
        btn_Descargas = new javax.swing.JButton();

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Código Guia:");

        cmb_CodGuia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CodGuiaActionPerformed(evt);
            }
        });

        jLabel2.setText("Código paquete:");

        jLabel3.setText("Origen:");

        jLabel4.setText("Destino:");

        jLabel5.setText("Tipo de pago:");

        jLabel6.setText("Tamaño del paquete:");

        jLabel7.setText("Número de paquetes:");

        jLabel8.setText("Fecha de envío:");

        jLabel9.setText("Total a pagar:");

        btn_Descargas.setText("Descargar Guia");
        btn_Descargas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DescargasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_CodGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_Descargas))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txt_CodPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_PesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_NumPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txt_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_CodGuia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_CodPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_PesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_NumPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_Descargas))
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cambioPanel = mainCon.getPanelFacturaGuia();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmb_CodGuiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CodGuiaActionPerformed
       codigoGuia = cmb_CodGuia.getSelectedItem().toString();
       GuiaEnvio guiaSet = guiaController.getEspecificGuia(codigoGuia);
       codGuia = cmb_CodGuia.getSelectedIndex()+1;
       txt_CodPaquete.setText(String.valueOf(codGuia));
       txt_Destino.setText(guiaSet.getDepaD() +"/"+guiaSet.getMuniD());
       txt_Fecha.setText(guiaSet.getFechaEnvio());
       txt_NumPaquete.setText(String.valueOf(guiaSet.getNumeroPaquetes()));
       txt_Origen.setText(guiaSet.getDepaO()+"/"+guiaSet.getMuniO());
       txt_PesoTotal.setText(""+guiaSet.getTamanoPaquete() +" Lb");
       txt_TipoPago.setText(guiaSet.getTipoServicio());
       txt_Total.setText("Q"+guiaSet.getTotalAPagar());
    }//GEN-LAST:event_cmb_CodGuiaActionPerformed

    private void btn_DescargasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DescargasActionPerformed
        String codPaquete = txt_CodPaquete.getText();
        String destino = txt_Destino.getText();
        String fecha = txt_Fecha.getText();
        String numPaquete = txt_NumPaquete.getText();
        String origen = txt_Origen.getText();
        String pesoTotal = txt_PesoTotal.getText();
        String tipoPago = txt_TipoPago.getText();
        String total = txt_Total.getText();
        try{
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("C:\\Users\\matth\\Downloads\\Guia_"+ codigoGuia +".html"));
            outputStreamWriter.write("<html>" +
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
                "<tr><th colspan = '2'>Datos de la guia</th></tr>" +
                "<tr><td>Código de guia:</td><td>" + codigoGuia + "</td></tr>" +
                "<tr><td>Codigo de paquete:</td><td>" + codPaquete + "</td></tr>" +
                "<tr><td>Origen:</td><td>" + origen + "</td></tr>" +
                "<tr><td>Destino:</td><td>" + destino + "</td></tr>" +
                "<tr><td>Peso total:</td><td>" + pesoTotal +"</td></tr>" +
                "<tr><td>Numero de paquetes:</td><td>" + numPaquete + "</td></tr>" +
                "<tr><td>Fecha de envio:</td><td>" + fecha + "</td></tr>" +
                "<tr><td>Tipo de pago:</td><td>" + tipoPago + "</td></tr>" +
                "<tr><td>Total:</td><td>" + total + "</td></tr>" +
                "</table>"+
                "</body>" +
                "</html>");
            outputStreamWriter.close();
        }catch(IOException ex){
            JOptionPane.showMessageDialog(null, "Error al descargar la guia");
        }
        JOptionPane.showMessageDialog(null, "Se ha descargado la guia con exito");
    }//GEN-LAST:event_btn_DescargasActionPerformed

    private void agregarCodigosGuia(){
        ArrayList<GuiaEnvio> guias = guiaController.getGuiasUsuarioLogueado();
        if(guias != null){
            for(int i = 0; i < guias.size(); i++){
                cmb_CodGuia.addItem(guias.get(i).getCodigoPaquete());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Descargas;
    private javax.swing.JComboBox<String> cmb_CodGuia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_CodPaquete;
    private javax.swing.JTextField txt_Destino;
    private javax.swing.JTextField txt_Fecha;
    private javax.swing.JTextField txt_NumPaquete;
    private javax.swing.JTextField txt_Origen;
    private javax.swing.JTextField txt_PesoTotal;
    private javax.swing.JTextField txt_TipoPago;
    private javax.swing.JTextField txt_Total;
    // End of variables declaration//GEN-END:variables
}
