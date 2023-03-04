
package panel;

import beam.Region;
import controller.MainController;
import controller.RegionController;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author matth
 */
public class PanelRegion extends javax.swing.JPanel {
    DefaultTableModel model = new DefaultTableModel();
    MainController mainCon = new MainController();
    RegionController regionControl = new RegionController();
    javax.swing.JPanel cambioPanel=null;
    String id_RegionAnterior;
    
    public PanelRegion() {
        initComponents();
        listar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_Volver = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Regiones = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_CodigoRegion = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_PrecioEstandar = new javax.swing.JTextField();
        txt_PrecioEspecial = new javax.swing.JTextField();
        btn_Obtener = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("REGIONES Y PRECIOS");

        btn_Volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        tbl_Regiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CódigoRegión", "Región", "Precio Estándar", "Precio Especial"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Regiones);
        if (tbl_Regiones.getColumnModel().getColumnCount() > 0) {
            tbl_Regiones.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Código de región:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Nombre de la región:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Précio estándar:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Précio especial:");

        btn_Obtener.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Obtener.setText("Obtener datos");
        btn_Obtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ObtenerActionPerformed(evt);
            }
        });

        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Actualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_CodigoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_PrecioEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_PrecioEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95)
                                .addComponent(btn_Obtener)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Agregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Eliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_CodigoRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_PrecioEstandar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_PrecioEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Obtener)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_Eliminar))
                .addGap(51, 51, 51))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        cambioPanel = mainCon.getpMenAdm();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ObtenerActionPerformed
        int fila = tbl_Regiones.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila antes");
        }else{
            String idRegion = (String)tbl_Regiones.getValueAt(fila, 0);
            id_RegionAnterior = idRegion;
            String nombre = (String)tbl_Regiones.getValueAt(fila, 1);
            String precioEstandar = String.valueOf(tbl_Regiones.getValueAt(fila, 2));
            String precioEspecial = String.valueOf(tbl_Regiones.getValueAt(fila, 3));
            txt_CodigoRegion.setText(idRegion);
            txt_Nombre.setText(nombre);
            txt_PrecioEstandar.setText(precioEstandar);
            txt_PrecioEspecial.setText(precioEspecial);            
        }
    }//GEN-LAST:event_btn_ObtenerActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String codigoRegion = txt_CodigoRegion.getText();
        String nameRegion = txt_Nombre.getText();
        float precioEstandar = 0;
        float precioEspecial = 0;
        try{
        precioEstandar = Float.valueOf(txt_PrecioEstandar.getText());
        precioEspecial = Float.valueOf(txt_PrecioEspecial.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: verifica que los precios contengan solo numeros");
        }
        regionControl.agregar(codigoRegion, nameRegion, precioEstandar, precioEspecial);
        listar();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        String codigoRegion = txt_CodigoRegion.getText();
        String nameRegion = txt_Nombre.getText();
        float precioEstandar = 0;
        float precioEspecial = 0;
        try{
        precioEstandar = Float.valueOf(txt_PrecioEstandar.getText());
        precioEspecial = Float.valueOf(txt_PrecioEspecial.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: verifica que los precios contengan solo numeros");
        }
        regionControl.actualizar(id_RegionAnterior , codigoRegion, nameRegion, precioEstandar, precioEspecial);
        listar();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        String codigoRegion = txt_CodigoRegion.getText();
        regionControl.eliminar(codigoRegion);
        listar();        
    }//GEN-LAST:event_btn_EliminarActionPerformed
    
    private void actionPerformed(){
        //if(e.getSource()==btn_Obtener){
            int fila = tbl_Regiones.getSelectedRow();
            if(fila == -1){
                JOptionPane.showMessageDialog(null, "Debe seleccionar una fila antes");
            }else{
                String idRegion = (String)tbl_Regiones.getValueAt(fila, 0);
                String nombre = (String)tbl_Regiones.getValueAt(fila, 1);
                String precioEstandar = (String)tbl_Regiones.getValueAt(fila, 2);
                String precioEspecial = (String)tbl_Regiones.getValueAt(fila, 3);
                txt_CodigoRegion.setText(idRegion);
                txt_Nombre.setText(nombre);
                txt_PrecioEstandar.setText(precioEstandar);
                txt_PrecioEspecial.setText(precioEspecial);
            }
        //}
    }
    
    private void listar(){
        int index = tbl_Regiones.getRowCount();
        for(int e = 0; e<index;e++){
            model.removeRow(0);
        }
        model = (DefaultTableModel)tbl_Regiones.getModel();
        List<Region> lista = regionControl.getListRegion();        
        Object[]object = new Object[4];
        for(int i =0; i < lista.size();i++){
            object[0]=lista.get(i).getId_region();
            object[1]=lista.get(i).getNameReg();
            object[2]=lista.get(i).getPreciEstandar();
            object[3]=lista.get(i).getPrecEspecial();
            model.addRow(object);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Obtener;
    private javax.swing.JButton btn_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_Regiones;
    public javax.swing.JTextField txt_CodigoRegion;
    public javax.swing.JTextField txt_Nombre;
    public javax.swing.JTextField txt_PrecioEspecial;
    public javax.swing.JTextField txt_PrecioEstandar;
    // End of variables declaration//GEN-END:variables
}
