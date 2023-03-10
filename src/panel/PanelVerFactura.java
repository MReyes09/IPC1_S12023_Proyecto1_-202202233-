
package panel;

import beam.Factura;
import controller.FacturaController;
import controller.GuiaEnvioController;
import controller.MainController;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author matth
 */
public class PanelVerFactura extends javax.swing.JPanel {
    FacturaController facturaController = new FacturaController();
    MainController mainCon = new MainController();
    javax.swing.JPanel cambioPanel = null;
    int codigoFactura;
    
    public PanelVerFactura() {
        initComponents();
        setDataCMB();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txt_PesoTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_NumPaquete = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Total = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_CodPaquete = new javax.swing.JTextField();
        txt_Origen = new javax.swing.JTextField();
        txt_Destino = new javax.swing.JTextField();
        txt_TipoPago = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cmb_CodFactura = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_Nit = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jLabel3.setText("Origen:");

        jLabel4.setText("Destino:");

        jLabel5.setText("Tipo de pago:");

        jLabel6.setText("Tamaño del paquete:");

        jLabel7.setText("Número de paquetes:");

        jLabel9.setText("Total a pagar:");

        jLabel1.setText("Registro Factura:");

        cmb_CodFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CodFacturaActionPerformed(evt);
            }
        });

        jLabel2.setText("Código paquete:");

        jLabel10.setText("NIT:");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Descargar Factura");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_CodFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_CodPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel6))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_PesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_NumPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Nit, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmb_CodFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_CodPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Origen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_PesoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txt_NumPaquete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_Nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt_Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_CodFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CodFacturaActionPerformed
        codigoFactura = Integer.parseInt(cmb_CodFactura.getSelectedItem().toString());
        Factura facturaSet = facturaController.getFacturaDefined(codigoFactura);
        int codigoPaquete = cmb_CodFactura.getSelectedIndex()+1;
        txt_CodPaquete.setText(String.valueOf(codigoPaquete));
        txt_Origen.setText(facturaSet.getDepaO()+"/"+facturaSet.getMuniO());
        txt_Destino.setText(facturaSet.getDepaD() +"/"+facturaSet.getMuniD());
        txt_TipoPago.setText(facturaSet.getTipoServicio());
        txt_PesoTotal.setText(""+facturaSet.getTamanoPaquete() +" Lb");
        txt_NumPaquete.setText(String.valueOf(facturaSet.getNumeroPaquetes()));
        txt_Nit.setText(facturaSet.getNit());
        txt_Total.setText("Q"+facturaSet.getTotalAPagar());
    }//GEN-LAST:event_cmb_CodFacturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cambioPanel = mainCon.getPanelFacturaGuia();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String codigoPaquete = txt_CodPaquete.getText();
        String origen = txt_Origen.getText();
        String destino = txt_Destino.getText();
        String tipoPago = txt_TipoPago.getText();
        String pesoTotal = txt_PesoTotal.getText();
        String numPaquete = txt_NumPaquete.getText();
        String nit = txt_Nit.getText();
        String total = txt_Total.getText();        
        
        try{
            FileOutputStream rutaDescarga = new FileOutputStream("C:\\Users\\matth\\Downloads\\Factura_"+ codigoFactura +".html");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(rutaDescarga, "UTF-8");
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
                "<tr><th colspan = '2'>Datos de la factura</th></tr>" +
                "<tr><td>Código de guia:</td><td>" + codigoFactura + "</td></tr>" +
                "<tr><td>Codigo de paquete:</td><td>" + codigoPaquete + "</td></tr>" +
                "<tr><td>Origen:</td><td>" + origen + "</td></tr>" +
                "<tr><td>Destino:</td><td>" + destino + "</td></tr>" +
                "<tr><td>Peso total:</td><td>" + pesoTotal +"</td></tr>" +
                "<tr><td>Numero de paquetes:</td><td>" + numPaquete + "</td></tr>" +
                "<tr><td>Tipo de pago:</td><td>" + tipoPago + "</td></tr>" +
                "<tr><td>NIT:</td><td>" + nit + "</td></tr>" +
                "<tr><td>Total:</td><td>" + total + "</td></tr>" +
                "</table>"+
                "</body>" +
                "</html>");
            outputStreamWriter.close();
        }catch(IOException ex){
                JOptionPane.showMessageDialog(null, "Error al descargar la factura");
        }
        JOptionPane.showMessageDialog(null, "Se ha descargado la factura con exito");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setDataCMB(){
        ArrayList<Factura> tempFactura = facturaController.getUserFac();
        if(tempFactura != null){
            for(int i = 0; i < tempFactura.size(); i++){
                String id_Factura = String.valueOf(tempFactura.get(i).getId_Factura());
                cmb_CodFactura.addItem(id_Factura);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_CodFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_CodPaquete;
    private javax.swing.JTextField txt_Destino;
    private javax.swing.JTextField txt_Nit;
    private javax.swing.JTextField txt_NumPaquete;
    private javax.swing.JTextField txt_Origen;
    private javax.swing.JTextField txt_PesoTotal;
    private javax.swing.JTextField txt_TipoPago;
    private javax.swing.JTextField txt_Total;
    // End of variables declaration//GEN-END:variables
}
