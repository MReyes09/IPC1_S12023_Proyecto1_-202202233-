
package panel;

import beam.TarjetaDeCredito;
import beam.Usuario;
import controller.MainController;
import controller.TarjetaController;
import controller.UsuarioController;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author matth
 */
public class PanelRegistroTarjeta extends javax.swing.JPanel {
    MainController mainCon = new MainController();
    javax.swing.JPanel cambioPanel = null;
    DefaultTableModel model = new DefaultTableModel();
    TarjetaController tarjetaControl = new TarjetaController();
    UsuarioController usuarioControl = new UsuarioController();
    int id_Tarjeta;
    
    public PanelRegistroTarjeta() {
        initComponents();
        listar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_NumeroTarjeta = new javax.swing.JTextField();
        txt_Fecha = new javax.swing.JTextField();
        txt_NombreTarjeta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Tarjetas = new javax.swing.JTable();
        btn_Volver = new javax.swing.JButton();
        btn_Obtener = new javax.swing.JButton();
        btn_Agregar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Registro Tarjeta De Credito/Debito");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre tarjeta de crédito/debito: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Número Tarjeta:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de vencimiento:");

        tbl_Tarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Tarjeta", "No. Tarjeta", "Nombre Tarjeta", "Fecha Vencimiento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_Tarjetas);
        if (tbl_Tarjetas.getColumnModel().getColumnCount() > 0) {
            tbl_Tarjetas.getColumnModel().getColumn(0).setResizable(false);
        }

        btn_Volver.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Volver.setText("Volver");
        btn_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VolverActionPerformed(evt);
            }
        });

        btn_Obtener.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Obtener.setText("Obtener Datos");
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
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_NumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_NombreTarjeta)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(btn_Volver)
                        .addGap(111, 111, 111)
                        .addComponent(btn_Obtener)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Actualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Eliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(txt_NumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_NombreTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Volver)
                    .addComponent(btn_Obtener)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Actualizar)
                    .addComponent(btn_Eliminar))
                .addContainerGap(36, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VolverActionPerformed
        cambioPanel = mainCon.getpMenUsu();
        mainCon.getMain().getvMain().cambiarPaneles(cambioPanel);
    }//GEN-LAST:event_btn_VolverActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        String fechaVencimiento = txt_Fecha.getText();
        String nombre = txt_NombreTarjeta.getText();
        String codTarjeta = null;
        try{
        codTarjeta = txt_NumeroTarjeta.getText();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: verifica que el numero de tarjeta contengan solo numeros");
        }
        tarjetaControl.createTarjeta(nombre, fechaVencimiento, codTarjeta);
        listar();
        limpiar();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        String fecha = txt_Fecha.getText();
        String nombre = txt_NombreTarjeta.getText();
        String codTarjeta = null;
        try{
        codTarjeta = txt_NumeroTarjeta.getText();
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error: verifica que el numero de tarjeta contengan solo numeros");
        }
        tarjetaControl.actualizar(id_Tarjeta, nombre, fecha, codTarjeta);
        listar();
        limpiar();
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void btn_ObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ObtenerActionPerformed
        int fila = tbl_Tarjetas.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila antes");
        }else{
            id_Tarjeta = Integer.parseInt(tbl_Tarjetas.getValueAt(fila, 0).toString());
            txt_NumeroTarjeta.setText(tbl_Tarjetas.getValueAt(fila, 1).toString());
            txt_NombreTarjeta.setText((String)tbl_Tarjetas.getValueAt(fila, 2));
            txt_Fecha.setText((String)tbl_Tarjetas.getValueAt(fila, 3));
        }
    }//GEN-LAST:event_btn_ObtenerActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        tarjetaControl.eliminar(id_Tarjeta);
        listar();
        limpiar();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void listar(){
        int index = tbl_Tarjetas.getRowCount();
        for(int e = 0; e<index;e++){
            model.removeRow(0);
        }
        model = (DefaultTableModel)tbl_Tarjetas.getModel();
        List<TarjetaDeCredito> lista = tarjetaControl.getListTarjetas();
        Usuario usuarioLoged = usuarioControl.getUserLogin();
        Object[]object = new Object[4];
        for(int i =0; i < lista.size();i++){
            if(usuarioLoged.getId_usu()==lista.get(i).getId_Usuario()){
                object[0] = lista.get(i).getId_tarje();
                object[1] = ofuscarTarjeta(lista.get(i).getNumTarjeta());
                object[2] = lista.get(i).getNameTarjeta();
                object[3] = lista.get(i).getFechVencimiento();
                model.addRow(object);
            }
        }
    }
    
    public static String ofuscarTarjeta(String numeroTarjeta) {
        // Obtener los últimos cuatro dígitos de la tarjeta
        String ultimosCuatroDigitos = numeroTarjeta.substring(numeroTarjeta.length() - 4);
        // Ofuscar los primeros dígitos
        String ofuscado = "XXXX-XXXX-XXXX-" + ultimosCuatroDigitos;
        return ofuscado;
    }
    
    public void limpiar(){
        txt_NombreTarjeta.setText("");
        txt_NumeroTarjeta.setText("");
        txt_Fecha.setText("");
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
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tbl_Tarjetas;
    private javax.swing.JTextField txt_Fecha;
    private javax.swing.JTextField txt_NombreTarjeta;
    private javax.swing.JTextField txt_NumeroTarjeta;
    // End of variables declaration//GEN-END:variables
}
