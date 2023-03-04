
package panel;

import beam.Departamento;
import beam.Municipio;
import controller.DepartamentoController;
import controller.MainController;
import controller.MunicipioController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author matth
 */
public class PanelMunicipio extends javax.swing.JPanel {
    DepartamentoController depaController = new DepartamentoController();
    DefaultTableModel model = new DefaultTableModel();
    MunicipioController muniController = new MunicipioController();
    String municipioAnterior;

    public PanelMunicipio() {
        initComponents();
        setDatosDepa();
        txt_CodDepa.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Municipios = new javax.swing.JTable();
        txt_CodDepa = new javax.swing.JTextField();
        txt_Muni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmb_Departamento = new javax.swing.JComboBox<>();
        btn_Volver = new javax.swing.JButton();
        btn_Obtener = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Municipio:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Departamento:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Código Departamento:");

        tbl_Municipios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Municipio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Municipios);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("CONTROL DE MUNICIPIOS");

        cmb_Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_DepartamentoActionPerformed(evt);
            }
        });

        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        btn_Obtener.setText("Obtener Datos");
        btn_Obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ObtenerActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_CodDepa, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_Departamento, 0, 162, Short.MAX_VALUE)))
                .addGap(124, 124, 124))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Muni, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btn_Volver)
                        .addGap(165, 165, 165)
                        .addComponent(btn_Obtener)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(txt_CodDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_Departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Muni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Obtener)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_Eliminar))
                .addGap(46, 46, 46))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        MainController mainCon = new MainController();
        javax.swing.JPanel cambioPanel=null;
        cambioPanel = mainCon.getPanelDepartamento();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void cmb_DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_DepartamentoActionPerformed
        String departamento = cmb_Departamento.getSelectedItem().toString();
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        departamentos = depaController.getDepartamento();
        for(int i =0; i<departamentos.size();i++){
            if(departamentos.get(i).getNombre().equals(departamento)){
                int id_Departamento = departamentos.get(i).getId_depart();
                i = departamentos.size();
                listar(id_Departamento, departamento);
            }
        }
    }//GEN-LAST:event_cmb_DepartamentoActionPerformed

    private void btn_ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ObtenerActionPerformed
        int fila = tbl_Municipios.getSelectedRow();
        if(fila == -1 ){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila antes");
        }else{
            String nombre = (String)tbl_Municipios.getValueAt(fila, 1);
            txt_Muni.setText(nombre);
            municipioAnterior = nombre;
        }
    }//GEN-LAST:event_btn_ObtenerActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        int id_Departamento = Integer.parseInt(txt_CodDepa.getText());
        String nombreMunicipio = txt_Muni.getText();
        muniController.agregar(id_Departamento, nombreMunicipio);
        String departamento = cmb_Departamento.getSelectedItem().toString();
        listar(id_Departamento, departamento);
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        int id_Departamento = Integer.parseInt(txt_CodDepa.getText());
        String nombreMunicipio = txt_Muni.getText();
        muniController.actualizar(id_Departamento, nombreMunicipio, municipioAnterior);
        String departamento = cmb_Departamento.getSelectedItem().toString();
        listar(id_Departamento, departamento);
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        int id_Departamento = Integer.parseInt(txt_CodDepa.getText());
        String nombreMunicipio = txt_Muni.getText();
        muniController.eliminar(nombreMunicipio);
        String departamento = cmb_Departamento.getSelectedItem().toString();
        listar(id_Departamento, departamento);
    }//GEN-LAST:event_btn_EliminarActionPerformed

    public void setDatosDepa(){
        ArrayList<Departamento> depa = new ArrayList<Departamento>();
        depa = depaController.getDepartamento();
        for(int e = 0; e < depa.size(); e++){
            cmb_Departamento.addItem(depa.get(e).getNombre());
        }
        txt_CodDepa.setEditable(false);
    }
    
    private void listar(int id_Departamento, String departamento){
        int index = tbl_Municipios.getRowCount();
        if(index > 0){
            for(int e = 0; e<index;e++){
            model.removeRow(0);
            }
        }
        model = (DefaultTableModel)tbl_Municipios.getModel();
        List<Departamento> lista = depaController.getDepartamento();
        ArrayList<Municipio> muniList = muniController.getMunicipio();
        Object[]object = new Object[2];
        int e = 0;
        txt_CodDepa.setText(String.valueOf(id_Departamento));
        for(int i =0; i<muniList.size();i++){
            if(muniList.get(i).getId_depart()== id_Departamento){
                e = e+1;
                object[0] = e;
                object[1] = muniList.get(i).getNameMun();
                model.addRow(object);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Obtener;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JComboBox<String> cmb_Departamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_Municipios;
    private javax.swing.JTextField txt_CodDepa;
    private javax.swing.JTextField txt_Muni;
    // End of variables declaration//GEN-END:variables
}
