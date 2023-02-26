/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package panel;

import controller.MainController;
import controller.RegionController;

/**
 * @author matth
 */
public class PanelMenuEmpresarial extends javax.swing.JPanel {
    MainController mainCon = new MainController();
    javax.swing.JPanel cambioPanel=null;
    
    public PanelMenuEmpresarial() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Cerrar = new javax.swing.JButton();
        btn_Perfil = new javax.swing.JButton();
        btn_Kiosco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btn_Cerrar.setText("Cerrar Sesión");
        btn_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CerrarActionPerformed(evt);
            }
        });

        btn_Perfil.setText("Perfil");
        btn_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PerfilActionPerformed(evt);
            }
        });

        btn_Kiosco.setText("Control de Kioscos");
        btn_Kiosco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KioscoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("MENU EMPRESARIAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btn_Cerrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 325, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btn_Kiosco)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btn_Perfil)
                            .addGap(30, 30, 30))))
                .addGap(279, 279, 279))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(btn_Kiosco)
                .addGap(42, 42, 42)
                .addComponent(btn_Perfil)
                .addGap(90, 90, 90)
                .addComponent(btn_Cerrar)
                .addGap(61, 61, 61))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CerrarActionPerformed
        cambioPanel = mainCon.getpLogin();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_CerrarActionPerformed

    private void btn_KioscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KioscoActionPerformed
        cambioPanel = mainCon.getPanelKiosco();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_KioscoActionPerformed

    private void btn_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PerfilActionPerformed
        cambioPanel = mainCon.getPanelPerfil();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_PerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cerrar;
    private javax.swing.JButton btn_Kiosco;
    private javax.swing.JButton btn_Perfil;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
