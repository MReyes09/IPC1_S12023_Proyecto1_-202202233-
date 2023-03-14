
package panel;

import beam.Departamento;
import beam.Region;
import controller.DepartamentoController;
import controller.KioscoController;
import controller.MainController;
import controller.RegionController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author matth
 */
public class PanelDepartamento extends javax.swing.JPanel {
    RegionController regContr = new RegionController();
    KioscoController kioCon = new KioscoController();
    DefaultTableModel model = new DefaultTableModel();
    DepartamentoController depaController = new DepartamentoController();
    int i=0;

    public PanelDepartamento() {
        initComponents();
        setDatosCodReg();
        listar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_CodDepa = new javax.swing.JTextField();
        txt_NomDepa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_NomReg = new javax.swing.JTextField();
        cmb_CodReg = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Departamento = new javax.swing.JTable();
        btn_Volver = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Obtener = new javax.swing.JButton();
        btn_Municipios = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código Región:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre Departamento:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Código Departamento:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONTROL DE DEPARTAMENTO");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nombre Región:");

        cmb_CodReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_CodRegActionPerformed(evt);
            }
        });

        tbl_Departamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Departamento", "Departamento", "Código Región", "Región"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Departamento);

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

        btn_Municipios.setText("Munincipios");
        btn_Municipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MunicipiosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_CodDepa)
                            .addComponent(cmb_CodReg, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_NomDepa, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(txt_NomReg, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Volver)
                                .addGap(142, 142, 142)
                                .addComponent(btn_Obtener)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Agregar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Actualizar))
                                    .addComponent(btn_Municipios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addComponent(btn_Eliminar)))))
                .addContainerGap(81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_CodDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_NomDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(txt_NomReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_CodReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btn_Municipios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_Obtener))
                .addGap(43, 43, 43))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        MainController mainCon = new MainController();
        javax.swing.JPanel cambioPanel=null;
        i = 0;
        cambioPanel = mainCon.getpMenAdm();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String nombre = txt_NomDepa.getText();
        String id_Reg = cmb_CodReg.getSelectedItem().toString();
        String region = txt_NomReg.getText();
        depaController.agregar(id_Reg, region, nombre);
        listar();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        int index = tbl_Departamento.getRowCount();
        int idDepa = Integer.parseInt(txt_CodDepa.getText());
        String nombre = txt_NomDepa.getText();
        String id_Reg = cmb_CodReg.getSelectedItem().toString();
        String region = txt_NomReg.getText();
        for(int e = 0; e<index;e++){
            model.removeRow(0);
        }
        depaController.actualizar(idDepa, id_Reg, nombre, region);
        i=0;
        listar();
        limpiar();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int id_Depa = Integer.parseInt(txt_CodDepa.getText());
        depaController.eliminar(id_Depa);
        int index = tbl_Departamento.getRowCount();
        for(int e=0; e<index;e++){
            model.removeRow(0);
        }
        i = 0;
        listar();
        limpiar();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ObtenerActionPerformed
        int fila = tbl_Departamento.getSelectedRow();
        if(fila == -1 ){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila antes");
        }else{
            String id_Depa = String.valueOf(tbl_Departamento.getValueAt(fila, 0));
            String nombre = (String)tbl_Departamento.getValueAt(fila, 1);
            String id_Reg = (String)tbl_Departamento.getValueAt(fila, 2);
            String region = (String)tbl_Departamento.getValueAt(fila, 3);
            txt_CodDepa.setText(id_Depa);
            txt_NomDepa.setText(nombre);
            cmb_CodReg.setSelectedItem(region);
            txt_NomReg.setText(region);
        }
    }//GEN-LAST:event_btn_ObtenerActionPerformed

    private void cmb_CodRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_CodRegActionPerformed
        String codReg = cmb_CodReg.getSelectedItem().toString();
        ArrayList<Region> reg = new ArrayList<Region>();
        reg = regContr.getListRegion();
        for(int i = 0; i < reg.size(); i++){
            if(reg.get(i).getId_region().equals(codReg)){
                txt_NomReg.setText(reg.get(i).getNameReg());
            }
        }
    }//GEN-LAST:event_cmb_CodRegActionPerformed

    private void btn_MunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MunicipiosActionPerformed
        MainController mainCon = new MainController();
        javax.swing.JPanel cambioPanel=null;
        cambioPanel = mainCon.getPanelMunicipio();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_MunicipiosActionPerformed

    private void setDatosCodReg(){
        ArrayList<Region> reg = new ArrayList<Region>();
        reg = regContr.getListRegion();
        for(int i = 0; i<reg.size(); i++){
            cmb_CodReg.addItem(reg.get(i).getId_region());
        }
        txt_CodDepa.setEnabled(false);
        txt_NomReg.setEnabled(false);
    }
    
    private void listar(){
        model = (DefaultTableModel)tbl_Departamento.getModel();
        List<Departamento> lista = depaController.getDepartamento();
        Object[]object = new Object[4];
        for(i = i;i < lista.size(); i++){
            object[0]=lista.get(i).getId_depart();
            object[1]=lista.get(i).getNombre();
            object[2]=lista.get(i).getId_region();
            object[3]=lista.get(i).getRegion();
            model.addRow(object);
        }
    }
    
    private void limpiar(){
        txt_CodDepa.setText("");
        txt_NomDepa.setText("");
        txt_NomReg.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Municipios;
    private javax.swing.JButton btn_Obtener;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cmb_CodReg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_Departamento;
    private javax.swing.JTextField txt_CodDepa;
    private javax.swing.JTextField txt_NomDepa;
    private javax.swing.JTextField txt_NomReg;
    // End of variables declaration//GEN-END:variables
}
