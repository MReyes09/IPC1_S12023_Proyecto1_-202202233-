
package panel;

import beam.Kiosco;
import beam.Region;
import controller.KioscoController;
import controller.MainController;
import controller.RegionController;
import controller.UsuarioController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author matth
 */
public class PanelKiosco extends javax.swing.JPanel {
    RegionController regContr = new RegionController();
    KioscoController kioCon = new KioscoController();
    DefaultTableModel model = new DefaultTableModel();
    int i=0;

    public PanelKiosco() {
        initComponents();
        setDatosCodReg();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Kioscos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_CodKiosco = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        cmb_CodRegion = new javax.swing.JComboBox<>();
        btn_Volver = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Obtener = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("CONTROL DE KIOSCOS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Código Kiosco:");

        tb_Kioscos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Códgo Kiosco", "Nombre", "Código Región"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_Kioscos);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Código Región:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Nombre Kiosco:");

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Obtener.setText("Obtener Datos");
        btn_Obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ObtenerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_CodKiosco, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_CodRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Nombre)
                        .addGap(156, 156, 156))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(295, 295, 295))))
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btn_Volver)
                .addGap(142, 142, 142)
                .addComponent(btn_Obtener)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Actualizar)
                .addGap(12, 12, 12)
                .addComponent(btn_Eliminar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_CodKiosco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmb_CodRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_Obtener))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int id_Kiosco = Integer.parseInt(txt_CodKiosco.getText());
        kioCon.eliminar(id_Kiosco);
        int index = tb_Kioscos.getRowCount();
        for(int e=0; e<index;e++){
            model.removeRow(0);
        }
        i = 0;
        listar();
        limpiar();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String codRegion = cmb_CodRegion.getSelectedItem().toString();
        String nombreKio = txt_Nombre.getText();
        kioCon.agregar(codRegion, nombreKio);
        listar();        
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ObtenerActionPerformed
        int fila = tb_Kioscos.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila antes");
        }else{
            String idKiosco = String.valueOf(tb_Kioscos.getValueAt(fila, 0));
            String nombre = (String)tb_Kioscos.getValueAt(fila, 1);
            String idRegion = (String)(tb_Kioscos.getValueAt(fila, 2));
            txt_CodKiosco.setText(idKiosco);
            txt_Nombre.setText(nombre);
            cmb_CodRegion.setSelectedItem(idRegion);
        }
    }//GEN-LAST:event_btn_ObtenerActionPerformed

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        MainController mainCon = new MainController();
        javax.swing.JPanel cambioPanel=null;
        i = 0;
        UsuarioController usuController = new UsuarioController();
        if(usuController.getUserLogin().getRol().equals("Admin")){
            cambioPanel = mainCon.getpMenAdm();
            mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
        }else if(usuController.getUserLogin().getRol().equals("Empresarial")){
            cambioPanel = mainCon.getPanelMenuEmp();
            mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
        }
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        int index = tb_Kioscos.getRowCount();
        int idKiosco = Integer.parseInt(txt_CodKiosco.getText());
        String codRegion = cmb_CodRegion.getSelectedItem().toString();
        String nombreKio = txt_Nombre.getText();
        for(int e=0; e<index;e++){
            model.removeRow(0);
        }
        kioCon.actualizar(idKiosco, codRegion, nombreKio);
        i = 0;
        listar();
        limpiar();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void setDatosCodReg(){
        ArrayList<Region> reg = new ArrayList<Region>();
        reg = regContr.getListRegion();
        for(int i = 0; i<reg.size(); i++){
            cmb_CodRegion.addItem(reg.get(i).getId_region());
        }
        txt_CodKiosco.setEnabled(false);
    }
    
    private void listar(){
        model = (DefaultTableModel)tb_Kioscos.getModel();
        List<Kiosco> lista = kioCon.listarKioscos();
        Object[]object = new Object[3];
        for(i = i;i < lista.size(); i++){
            object[0]=lista.get(i).getId_Kiosco();
            object[1]=lista.get(i).getNombreKiosco();
            object[2]=lista.get(i).getCodRegion();
            model.addRow(object);
        }
    }
    
    private void limpiar(){
        txt_CodKiosco.setText("");
        txt_Nombre.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Obtener;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cmb_CodRegion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tb_Kioscos;
    private javax.swing.JTextField txt_CodKiosco;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
