
package panel;

import beam.GuiaEnvio;
import controller.GuiaEnvioController;
import controller.MainController;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 * @author matth
 */
public class PanelEnvioSolicitado extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
    MainController mainCon = new MainController();
    GuiaEnvioController guiaController = new GuiaEnvioController(); 
    javax.swing.JPanel cambioPanel = null;
    
    public PanelEnvioSolicitado() {
        initComponents();
        setDataTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Envios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();

        tbl_Envios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código De Paquete", "Tipo De Servicio", "Destinatario", "Total De Envío", "Tipo De Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Envios);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("ENVIOS SOLICITADOS");

        btn_Volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Volver)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(294, 294, 294))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(78, 78, 78)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btn_Volver)
                .addGap(47, 47, 47))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        cambioPanel = mainCon.getpMenUsu();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void setDataTable(){
        model = (DefaultTableModel)tbl_Envios.getModel();
        ArrayList<GuiaEnvio> guiaSet = guiaController.getGuiasUsuarioLogueado();
        ArrayList<String> tipoServicio = guiaController.getListaTipoServicio();
        Object[] object = new Object[5];
        for(int i = 0; i < guiaSet.size(); i++){
            object[0] = i+1;
            object[1] = guiaSet.get(i).getTipoServicio();
            String destinatario = guiaSet.get(i).getDepaD()+"/"+guiaSet.get(i).getMuniD();
            object[2] = destinatario;
            object[3] = guiaSet.get(i).getTotalAPagar();
            object[4] = tipoServicio.get(i);
            model.addRow(object);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_Envios;
    // End of variables declaration//GEN-END:variables
}
