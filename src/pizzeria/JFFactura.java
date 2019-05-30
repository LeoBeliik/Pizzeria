package pizzeria;
//@author Leo

import ar.com.mycompany.entities.EstadoFacturas;
import ar.com.mycompany.entities.Facturas;
import ar.com.mycompany.entities.Pedidos;
import ar.com.mycompany.services.IFacturasService;
import ar.com.mycompany.servicesImp.FacturasService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFFactura extends javax.swing.JFrame {

    static IFacturasService entityService = new FacturasService();
    private Facturas entity;

    List<EstadoFacturas> estado = new ArrayList<EstadoFacturas>();
    List<Pedidos> pedido = new ArrayList<Pedidos>();
 
    private void loadEntities() {

        DefaultTableModel dt = new DefaultTableModel();
        String[] col = new String[5];
        col[0] = "Id";
        dt.setColumnIdentifiers(col);
        col[1] = "Emision";
        dt.setColumnIdentifiers(col);
        col[2] = "Numero";
        dt.setColumnIdentifiers(col);
        col[3] = "Nombre";
        dt.setColumnIdentifiers(col);
        col[4] = "Estado";
        dt.setColumnIdentifiers(col);

        List<Facturas> result = entityService.getAll();

        for (Facturas c : result) {
            String[] row = new String[5];
            row[0] = String.valueOf(c.getIdFacturas());
            row[1] = String.valueOf(c.getFechaHoraEmision());
            row[2] = String.valueOf(c.getNumero());
            row[3] = c.getPedido().getNombreCliente();
            row[4] = c.getEstado().getNombre();
            dt.addRow(row);
        }
        this.jTable1.setModel(dt);
        jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));

    }

    private void loadCombos() {

        cmbNombre.removeAllItems();
        cmbPedido.removeAllItems();

        estado = entityService.getListEstadoFacturas();
        for (EstadoFacturas t : estado) {
            cmbNombre.addItem(t.getNombre());
        }
        
        pedido = entityService.getListPedidos();
        for (Pedidos p : pedido) {
            cmbPedido.addItem(p.getNombreCliente());
        }
    }

    public JFFactura() {
        initComponents();
        jlIdFactura.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNumero = new javax.swing.JTextField();
        cmbNombre = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jlEmision = new javax.swing.JLabel();
        jlNumero = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        txtEmision = new javax.swing.JTextField();
        jlIdFactura = new javax.swing.JLabel();
        btnNewEstFac = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jlPedido = new javax.swing.JLabel();
        cmbPedido = new javax.swing.JComboBox<>();
        btnNewPedido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Facturas");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cmbNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNuevo.setText("Nuevo");
        btnNuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNuevoMouseClicked(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jlEmision.setText("Emision:");

        jlNumero.setText("Numero:");

        jlNombre.setText("Nombre:");

        jlIdFactura.setEnabled(false);
        jlIdFactura.setFocusable(false);
        jlIdFactura.setRequestFocusEnabled(false);
        jlIdFactura.setVerifyInputWhenFocusTarget(false);

        btnNewEstFac.setText("...");
        btnNewEstFac.setMaximumSize(new java.awt.Dimension(45, 20));
        btnNewEstFac.setMinimumSize(new java.awt.Dimension(45, 20));
        btnNewEstFac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewEstFacMouseClicked(evt);
            }
        });

        btnExit.setText("Cerrar");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });

        jlPedido.setText("Pedido:");

        cmbPedido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnNewPedido.setText("...");
        btnNewPedido.setMaximumSize(new java.awt.Dimension(45, 20));
        btnNewPedido.setMinimumSize(new java.awt.Dimension(45, 20));
        btnNewPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNewPedidoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNumero)
                            .addComponent(jlEmision))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmision)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cmbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(cmbPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNewEstFac, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jlIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlEmision)
                                .addComponent(txtEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlIdFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(cmbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewEstFac, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPedido)
                            .addComponent(cmbPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNewPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addGap(5, 5, 5)
                        .addComponent(btnGuardar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNuevoMouseClicked

        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);

        txtEmision.setText(strDate);
        txtNumero.setText("");
        jlIdFactura.setText("0");
        txtEmision.setEditable(true);
        txtNumero.setEditable(true);
        txtNumero.setEditable(true);
        btnNewEstFac.setEnabled(true);
        txtEmision.requestFocus();
        cmbNombre.setEnabled(true);
        cmbPedido.setEnabled(true);
        btnNewPedido.setEnabled(true);
    }//GEN-LAST:event_btnNuevoMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

        if (txtEmision.getText().equals("")) {
            return;
        }

        if (jlIdFactura.getText().equals("0")) {

            entity = new Facturas();

        } else {

            entity = entityService.find(Integer.parseInt(jlIdFactura.getText()));

        }

        try {

            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

            entity.setFechaHoraEmision(formatter.parse(txtEmision.getText()));
            entity.setNumero(Integer.parseInt(txtNumero.getText()));
            entity.setEstado(estado.get(cmbNombre.getSelectedIndex()));
            entity.setPedido(pedido.get(cmbPedido.getSelectedIndex()));

            entityService.save(entity);

        } catch (ParseException | NumberFormatException e) {
            Logger.getLogger(JFFactura.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(txtNumero, "Numero de factura no puede ser texto o estar en blanco.");
            return;
        }

        txtEmision.setText("");
        txtNumero.setText("");
        jlIdFactura.setText("0");

        txtEmision.setEnabled(false);
        txtNumero.setEnabled(false);
        btnNewEstFac.setEnabled(false);
        cmbNombre.setEnabled(false);
        cmbPedido.setEnabled(false);
        btnNewPedido.setEnabled(false);

        loadEntities();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Integer row = jTable1.getSelectedRow();
        jlIdFactura.setText((String) jTable1.getModel().getValueAt(row, 0));
        entity = entityService.find(Integer.parseInt(jlIdFactura.getText()));
        txtEmision.setText(sdf.format(entity.getFechaHoraEmision()));
        txtNumero.setText(String.valueOf(entity.getNumero()));
/*
        for (int i = 1; i <= estado.size(); i++) {
            if (estado.get(i - 1).getIdEstadoFacturas() == entity.getEstadofacturas().getIdEstadoFacturas()) {
                cmbNombre.setSelectedIndex(i - 1);
                break;
            }

        }
*/
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
        if (evt.getKeyCode() == 127) {

            JDialog.setDefaultLookAndFeelDecorated(true);
            int response = JOptionPane.showConfirmDialog(null, "Seguro desea eliminar el registro? ", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {

                Integer row = jTable1.getSelectedRow();
                jlIdFactura.setText((String) jTable1.getModel().getValueAt(row, 0));
                entity = entityService.find(Integer.parseInt(jlIdFactura.getText()));
                entityService.delete(entity);
                loadEntities();

            }

        }
    }//GEN-LAST:event_jTable1KeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        loadEntities();
        loadCombos();

        txtEmision.setEditable(false);
        txtNumero.setEditable(false);
        btnNewEstFac.setEnabled(false);
        btnNewPedido.setEnabled(false);
        cmbNombre.setEnabled(false);
        cmbPedido.setEnabled(false);

    }//GEN-LAST:event_formWindowOpened

    private void btnNewEstFacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewEstFacMouseClicked
        new JFEstadoFacturas().setVisible(true);
    }//GEN-LAST:event_btnNewEstFacMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnNewPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNewPedidoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewPedidoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFFactura().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNewEstFac;
    private javax.swing.JButton btnNewPedido;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cmbNombre;
    private javax.swing.JComboBox<String> cmbPedido;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel jlEmision;
    private javax.swing.JLabel jlIdFactura;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlPedido;
    private javax.swing.JTextField txtEmision;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

}
