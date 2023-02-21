
package ventana;

import controller.UsuarioController;
import java.awt.BorderLayout;
import panel.PanelMenuUsuario;
import view.panel.PanelMenuAdmin;

/**
 * @author matth
 */
public class ViewInicial extends javax.swing.JFrame {
    //                      Importacion de paneles
    PanelMenuAdmin pMenAdm = new PanelMenuAdmin();
    PanelMenuUsuario pMenUsu = new PanelMenuUsuario();
    //-----------------------------------------------------
    // INSTANCIAS DE CONTROLLADOR
    UsuarioController tempUsuarioControlador = new UsuarioController();
    javax.swing.JPanel panelFind = null;
    //INSTANCIAS DE CLASES
    
    public ViewInicial() {
        initComponents();
    }
    
    public void cambiarPaneles(javax.swing.JPanel miPanel){
        miPanel.setSize(750, 477); //Ancho y alto de los paneles colocados en la ventana
        miPanel.setLocation(0, 0); //Colocado en la posicion superior izquierda de la ventana
        panelBase.removeAll();
        panelBase.add(miPanel, BorderLayout.CENTER);
        panelBase.revalidate();
        panelBase.revalidate();
        panelBase.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        panelBase = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Password = new javax.swing.JPasswordField();
        btn_Ingresar = new javax.swing.JButton();
        txt_Gmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("USAC -Delivery");

        panelBase.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("INICIAR SESIÓN");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Correo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password:");

        txt_Password.setText("202202233");

        btn_Ingresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Ingresar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Ingresar.setText("Ingresar");
        btn_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_IngresarActionPerformed(evt);
            }
        });

        txt_Gmail.setText("ipc1_carnet@ipc1delivery.com");

        javax.swing.GroupLayout panelBaseLayout = new javax.swing.GroupLayout(panelBase);
        panelBase.setLayout(panelBaseLayout);
        panelBaseLayout.setHorizontalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Password, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                    .addComponent(txt_Gmail))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                .addContainerGap(308, Short.MAX_VALUE)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(306, 306, 306))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBaseLayout.createSequentialGroup()
                        .addComponent(btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))))
        );
        panelBaseLayout.setVerticalGroup(
            panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBaseLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelBaseLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(panelBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btn_Ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_IngresarActionPerformed
        String correo = txt_Gmail.getText();
        String password = String.valueOf(txt_Password.getPassword());
        
        panelFind = tempUsuarioControlador.login(correo, password);
        if(panelFind != null){
            cambiarPaneles(panelFind);
        }
        /*
        boolean ingreso = false;
        for(int i=0; i<usuarios.size();i++){
            if(correo.equals(usuarios.get(i).getGmail())){
                if(password.equals(usuarios.get(i).getPassUsu())){
                    JOptionPane.showMessageDialog(this,"Sesión Inicializada");
                    if(usuarios.get(i).getRol().equals("Admin")){
                        cambiarPaneles(pMenAdm);
                        break;
                    }else if(usuarios.get(i).getRol().equals("Admin")){
                        cambiarPaneles(pMenUsu);
                        break;
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"Contraseña incorrecta");
                    break;
                }
            }else{
                JOptionPane.showMessageDialog(this,"Correo Incorrecto");
                break;
            }
        }JOptionPane.showMessageDialog(this,"Los datos brindados no son existentes");
        */
    }//GEN-LAST:event_btn_IngresarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JPanel panelBase;
    private javax.swing.JTextField txt_Gmail;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables
}
