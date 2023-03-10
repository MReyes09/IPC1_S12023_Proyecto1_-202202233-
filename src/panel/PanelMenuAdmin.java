
package panel;

import controller.MainController;

/**
 *
 * @author matth
 */
public class PanelMenuAdmin extends javax.swing.JPanel {
    MainController mainCon = new MainController();
    javax.swing.JPanel cambioPanel=null;
    
    
    public PanelMenuAdmin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btn_Kioscos = new javax.swing.JButton();
        btn_Regiones = new javax.swing.JButton();
        btn_Departamento = new javax.swing.JButton();
        btn_Reportes = new javax.swing.JButton();
        btn_Perfil = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("MENU ADMINISTRADOR");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Cerrar Sesión");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_Kioscos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Kioscos.setText("Manejo de Kioscos");
        btn_Kioscos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KioscosActionPerformed(evt);
            }
        });

        btn_Regiones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Regiones.setText("Manejo de Regiones y precios");
        btn_Regiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegionesActionPerformed(evt);
            }
        });

        btn_Departamento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Departamento.setText("Departamentos y Municipios");
        btn_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DepartamentoActionPerformed(evt);
            }
        });

        btn_Reportes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Reportes.setText("Reportes");

        btn_Perfil.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Perfil.setText("Perfil");
        btn_Perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PerfilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(264, 264, 264)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Regiones, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Kioscos, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(btn_Kioscos)
                .addGap(17, 17, 17)
                .addComponent(btn_Regiones)
                .addGap(18, 18, 18)
                .addComponent(btn_Departamento)
                .addGap(18, 18, 18)
                .addComponent(btn_Reportes)
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btn_Perfil))
                .addGap(63, 63, 63))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cambioPanel = mainCon.getpLogin();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_RegionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegionesActionPerformed
        cambioPanel = mainCon.getPanelRegion();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_RegionesActionPerformed

    private void btn_PerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PerfilActionPerformed
        cambioPanel = mainCon.getPanelPerfil();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_PerfilActionPerformed

    private void btn_KioscosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KioscosActionPerformed
        cambioPanel = mainCon.getPanelKiosco();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_KioscosActionPerformed

    private void btn_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DepartamentoActionPerformed
        cambioPanel = mainCon.getPanelDepartamento();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_DepartamentoActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Departamento;
    private javax.swing.JButton btn_Kioscos;
    private javax.swing.JButton btn_Perfil;
    private javax.swing.JButton btn_Regiones;
    private javax.swing.JButton btn_Reportes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
