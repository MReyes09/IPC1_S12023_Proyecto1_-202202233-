
package panel;

import beam.RegistroFacturacion;
import beam.TarjetaDeCredito;
import beam.Usuario;
import controller.FacturaController;
import controller.GuiaEnvioController;
import controller.MainController;
import controller.RegistroFacturacionController;
import controller.TarjetaController;
import controller.UsuarioController;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author matth
 */
public class PanelCompraEnvio extends javax.swing.JPanel {
    MainController mainCon = new MainController();
    RegistroFacturacionController regController = new RegistroFacturacionController();
    TarjetaController tarjetaControl = new TarjetaController();
    UsuarioController usuarioControl = new UsuarioController();
    GuiaEnvioController guiaController = new GuiaEnvioController();
    FacturaController facturaController = new FacturaController();
    javax.swing.JPanel cambioPanel = null;
    
    public PanelCompraEnvio() {
        initComponents();
        setearData();
        cmb_Tarjetas.setVisible(false);
        lbl_Tarjeta1.setVisible(false);
        txt_CVV.setVisible(false);
        lbl_Tarjeta.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Direccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Nit = new javax.swing.JTextField();
        txt_NombreCompleto = new javax.swing.JTextField();
        cmb_TipoPago = new javax.swing.JComboBox<>();
        lbl_Tarjeta = new javax.swing.JLabel();
        cmb_Tarjetas = new javax.swing.JComboBox<>();
        btn_Volver = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_Mensaje = new javax.swing.JLabel();
        lbl_Tarjeta1 = new javax.swing.JLabel();
        txt_CVV = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("SOLICITAR SERVICIO DE ENVIO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Tipo de Pago:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre Completo:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Dirección:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Nit:");

        cmb_TipoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago en efectivo", "Pago con tarjeta" }));
        cmb_TipoPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_TipoPagoActionPerformed(evt);
            }
        });

        lbl_Tarjeta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Tarjeta.setText("Tarjeta:");

        btn_Volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Comprar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Datos De Facturación");

        lbl_Mensaje.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Mensaje.setText("Recargo de Q 5.00 ");

        lbl_Tarjeta1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Tarjeta1.setText("Confirmar compra con CVV de tarjeta:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txt_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(15, 15, 15)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_Nit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_Tarjeta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmb_Tarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btn_Volver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Mensaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Tarjeta1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_CVV, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(133, 133, 133)))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txt_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_Nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmb_TipoPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Tarjeta)
                    .addComponent(cmb_Tarjetas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Tarjeta1)
                        .addComponent(txt_CVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Mensaje))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(jButton2))
                .addGap(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        GuiaEnvioController guiaController = new GuiaEnvioController();
        guiaController.eliminarTemporal();        
        cambioPanel = mainCon.getPanelCotizacionPaquetes();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void cmb_TipoPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_TipoPagoActionPerformed
        int index = cmb_TipoPago.getSelectedIndex();
        
        if(index == 1){
            cmb_Tarjetas.setVisible(true);
            lbl_Tarjeta.setVisible(true);
            lbl_Tarjeta1.setVisible(true);
            txt_CVV.setVisible(true);
            lbl_Mensaje.setVisible(false);
            listar();
        }else{
            lbl_Mensaje.setVisible(true);
            cmb_Tarjetas.setVisible(false);
            lbl_Tarjeta.setVisible(false);
            lbl_Tarjeta1.setVisible(false);
            txt_CVV.setVisible(false);
        }
    }//GEN-LAST:event_cmb_TipoPagoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = cmb_TipoPago.getSelectedIndex();
        
        if(index == 1){
            String tarjeta = cmb_Tarjetas.getSelectedItem().toString();
            guiaController.agregarAlTotal(null);
            facturaController.generarFactura();
        }else if(index ==0 ){
            String pagoEfectivo = "Pago en efectivo"; 
            guiaController.agregarAlTotal(pagoEfectivo);
            String tarjeta = "";
            facturaController.generarFactura();
        }
        JOptionPane.showMessageDialog(null,"Compra generada");
        cambioPanel = mainCon.getpMenUsu();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void setearData(){
        RegistroFacturacion registro = new RegistroFacturacion();
        registro = regController.getRegistroFacturacion();
        if(registro != null){
            txt_NombreCompleto.setText(registro.getNombreCompleto());
            txt_Direccion.setText(registro.getDireccion());
            txt_Nit.setText(registro.getNIT());
        }
    }
    
    private void listar(){
        ArrayList<TarjetaDeCredito> lista = tarjetaControl.getListTarjetas();
        Usuario usuarioLoged = usuarioControl.getUserLogin();
        for (int i = 0; i < lista.size(); i++){
            if(usuarioLoged.getId_usu()==lista.get(i).getId_Usuario()){
                cmb_Tarjetas.addItem(ofuscarTarjeta(lista.get(i).getNumTarjeta()));
            }
        }
    }

    public static String ofuscarTarjeta(String numeroTarjeta) {
        // Obtener los últimos cuatro dígitos de la tarjeta
        String ultimosCuatroDigitos = numeroTarjeta.substring(numeroTarjeta.length() - 4);
        // Ofuscar los primeros dígitos
        String ofuscado = "XXXX-XXXX-XXXX-" + ultimosCuatroDigitos;
        return ofuscado;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cmb_Tarjetas;
    private javax.swing.JComboBox<String> cmb_TipoPago;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lbl_Mensaje;
    private javax.swing.JLabel lbl_Tarjeta;
    private javax.swing.JLabel lbl_Tarjeta1;
    private javax.swing.JTextField txt_CVV;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nit;
    private javax.swing.JTextField txt_NombreCompleto;
    // End of variables declaration//GEN-END:variables
}
