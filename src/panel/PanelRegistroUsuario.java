
package panel;

import beam.Kiosco;
import controller.KioscoController;
import controller.MainController;
import controller.UsuarioController;
import java.util.ArrayList;

/**
 * @author matth
 */
public class PanelRegistroUsuario extends javax.swing.JPanel {
    MainController mainControl = new MainController();
    javax.swing.JPanel cambioPanel=null;
    KioscoController kioscoController = new KioscoController();
    
    public PanelRegistroUsuario() {
        initComponents();
        lbl_Kiosco.setVisible(false);
        cmb_Kiosco.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        txt_Apellido = new javax.swing.JTextField();
        txt_Dpi = new javax.swing.JTextField();
        txt_Correo = new javax.swing.JTextField();
        cmb_Rol = new javax.swing.JComboBox<>();
        txt_FechaNac = new javax.swing.JTextField();
        cmb_Genero = new javax.swing.JComboBox<>();
        txt_Alias = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Password = new javax.swing.JTextField();
        btn_Registrarse = new javax.swing.JButton();
        btn_IniciarSesion = new javax.swing.JButton();
        cmb_Nacionalidad = new javax.swing.JComboBox<>();
        lbl_Kiosco = new javax.swing.JLabel();
        cmb_Kiosco = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("REGISTRO DE USUARIO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("DPI:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Fecha de nacimiento:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Genero:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nacionalidad:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Alias:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Teléfono:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Rol:");

        cmb_Rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Empresarial", "Kiosco" }));
        cmb_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_RolActionPerformed(evt);
            }
        });

        cmb_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));

        btn_Registrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Registrarse.setForeground(new java.awt.Color(0, 0, 0));
        btn_Registrarse.setText("Registrarse");
        btn_Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarseActionPerformed(evt);
            }
        });

        btn_IniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_IniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        btn_IniciarSesion.setText("Iniciar Sesión");
        btn_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IniciarSesionActionPerformed(evt);
            }
        });

        cmb_Nacionalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estados Unidos", "México", "Guatemala", "Belice", "Honduras", "El Salvador", "Nicaragua", "Costa Rica", "Panamá", "Otro" }));

        lbl_Kiosco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Kiosco.setForeground(new java.awt.Color(0, 0, 0));
        lbl_Kiosco.setText("Kiosco:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(269, 269, 269))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_Rol, 0, 210, Short.MAX_VALUE)
                            .addComponent(txt_Correo)
                            .addComponent(txt_Dpi)
                            .addComponent(txt_Apellido)
                            .addComponent(txt_Nombre)
                            .addComponent(cmb_Nacionalidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btn_IniciarSesion))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(lbl_Kiosco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmb_Genero, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Alias, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Password, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_FechaNac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(cmb_Kiosco, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(btn_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(cmb_Nacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txt_FechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cmb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txt_Alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txt_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_Rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_Kiosco)
                                .addComponent(cmb_Kiosco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_IniciarSesion)
                    .addComponent(btn_Registrarse))
                .addGap(66, 66, 66))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IniciarSesionActionPerformed
        cambioPanel = mainControl.getpLogin();
        mainControl.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_IniciarSesionActionPerformed

    private void btn_RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarseActionPerformed
        String nameUsu, lastNamUsu, passUsu,
                dpiUsu, dateborn, gender, 
                nationality, nickName, phone, rol, gmail, kiosco;
        //Entradas txt
        nameUsu = txt_Nombre.getText();
        lastNamUsu = txt_Apellido.getText();
        passUsu = txt_Password.getText();
        dpiUsu = txt_Dpi.getText();
        dateborn = txt_FechaNac.getText();        
        nickName = txt_Alias.getText();
        phone = txt_Telefono.getText();
        gmail = txt_Correo.getText();
        //Entada comboBox
        if(cmb_Kiosco.getSelectedItem()!= null){
            kiosco = cmb_Kiosco.getSelectedItem().toString();
        }else{
            kiosco = "";
        }
        gender = cmb_Genero.getSelectedItem().toString();
        rol = cmb_Rol.getSelectedItem().toString();
        nationality = cmb_Nacionalidad.getSelectedItem().toString();
        //Envio a la funcion
        UsuarioController usuControl = new UsuarioController(); 
        cambioPanel = usuControl.createUsuario(nameUsu, lastNamUsu, passUsu, 
                dpiUsu, dateborn, gender, nationality, nickName, phone, rol, gmail, kiosco);
        if(cambioPanel != null){
            mainControl.getMain().getvMain().cambiarPaneles(cambioPanel);
        }
    }//GEN-LAST:event_btn_RegistrarseActionPerformed

    private void cmb_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_RolActionPerformed
        String rol = cmb_Rol.getSelectedItem().toString();
        
        if(rol.equals("Kiosco")){
            lbl_Kiosco.setVisible(true);
            cmb_Kiosco.setVisible(true);
            setDatosKiosco();
        }else{
            lbl_Kiosco.setVisible(false);
            cmb_Kiosco.setVisible(false);
        }
    }//GEN-LAST:event_cmb_RolActionPerformed

    private void setDatosKiosco(){
        ArrayList<Kiosco> kiosco = kioscoController.listarKioscos();
        for(int i = 0; i < kiosco.size(); i++){
            cmb_Kiosco.addItem(kiosco.get(i).getNombreKiosco());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_IniciarSesion;
    private javax.swing.JButton btn_Registrarse;
    private javax.swing.JComboBox<String> cmb_Genero;
    private javax.swing.JComboBox<String> cmb_Kiosco;
    private javax.swing.JComboBox<String> cmb_Nacionalidad;
    private javax.swing.JComboBox<String> cmb_Rol;
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
    private javax.swing.JLabel lbl_Kiosco;
    private javax.swing.JTextField txt_Alias;
    private javax.swing.JTextField txt_Apellido;
    private javax.swing.JTextField txt_Correo;
    private javax.swing.JTextField txt_Dpi;
    private javax.swing.JTextField txt_FechaNac;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Password;
    private javax.swing.JTextField txt_Telefono;
    // End of variables declaration//GEN-END:variables
}
