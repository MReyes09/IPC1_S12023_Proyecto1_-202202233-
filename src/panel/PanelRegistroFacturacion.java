
package panel;

import beam.RegistroFacturacion;
import controller.MainController;
import javax.swing.JOptionPane;
import controller.RegistroFacturacionController;

/**
 * @author matth
 */
public class PanelRegistroFacturacion extends javax.swing.JPanel {
    MainController mainCon = new MainController();
    javax.swing.JPanel cambioPanel = null;
    RegistroFacturacionController regController = new RegistroFacturacionController(); 
    
    public PanelRegistroFacturacion() {
        initComponents();
        setearData();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Volver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_NombreCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Nit = new javax.swing.JTextField();
        btn_Guardar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        btn_Volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE FACTURACIÓN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Completo:");

        txt_NombreCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreCompletoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Dirección:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nit:");

        btn_Guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(btn_Volver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Guardar)
                .addGap(18, 18, 18)
                .addComponent(btn_Actualizar)
                .addGap(66, 66, 66))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nit, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(233, 233, 233))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_NombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txt_Nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Actualizar))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        cambioPanel = mainCon.getpMenUsu();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);        
    }//GEN-LAST:event_btn_VolverActionPerformed
    
    private void txt_NombreCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreCompletoActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        String nombreCompleto = txt_NombreCompleto.getText();
        String direccion = txt_Direccion.getText();
        String nit = null;
        double nit2 =0;
        boolean validar = true;
        try{
            nit2 = Double.valueOf(txt_Nit.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: verifica que el NIT contengan solo numeros");
            validar = false;
        }
        if(validar == true){
            nit = String.valueOf(nit2);
            regController.agregar(nombreCompleto, direccion, nit);
            btn_Guardar.setVisible(false);
        }
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        String nombreCompleto = txt_NombreCompleto.getText();
        String direccion = txt_Direccion.getText();
        String nit = null;
        int nit2 =0;
        boolean validar = true;
        try{
            nit2 = Integer.parseInt(txt_Nit.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: verifica que el NIT contengan solo numeros");
            validar = false;
        }
        if(validar == true){
            nit = String.valueOf(nit2);
            regController.actualizar(nombreCompleto, direccion, nit);
        }
    }//GEN-LAST:event_btn_ActualizarActionPerformed
    
    private void setearData(){
        RegistroFacturacion registro = new RegistroFacturacion();
        registro = regController.getRegistroFacturacion();
        if(registro != null){
            txt_NombreCompleto.setText(registro.getNombreCompleto());
            txt_Direccion.setText(registro.getDireccion());
            txt_Nit.setText(registro.getNIT());
            btn_Guardar.setVisible(false);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_Direccion;
    private javax.swing.JTextField txt_Nit;
    private javax.swing.JTextField txt_NombreCompleto;
    // End of variables declaration//GEN-END:variables
}
