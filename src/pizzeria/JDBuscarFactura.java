package pizzeria;
//@author Leo

import ar.com.mycompany.entities.EstadoPedidos;
import ar.com.mycompany.entities.Pedidos;
import ar.com.mycompany.services.IPedidoService;
import ar.com.mycompany.servicesImp.PedidoService;
import org.jboss.logging.Logger;

import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class JDBuscarFactura extends javax.swing.JDialog {

    static IPedidoService entityService = new PedidoService();
    private Pedidos entity;
    public int idPed = 0;

    List<EstadoPedidos> estado = new ArrayList<EstadoPedidos>();

    private void loadCombos() {

        cmbEstado.removeAllItems();

        estado = entityService.getListEstadoPedidos();
        for (EstadoPedidos t : estado) {
            cmbEstado.addItem(t.getNombre());
        }

    }

    public JDBuscarFactura(java.awt.Frame parent, boolean modal) {

        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDesdeFecha = new javax.swing.JTextField();
        txtHastaFecha = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnCarga = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Fecha:");

        btnCerrar.setText("Cerrar");
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        jLabel2.setText("Desde");

        lblId.setEnabled(false);

        jLabel3.setText("Hasta");

        txtDesdeFecha.setText(" ");

        txtHastaFecha.setText(" ");
        txtHastaFecha.setMinimumSize(new java.awt.Dimension(9, 20));

        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String[]{
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }
        ));
        jTable1.setEditingColumn(1);
        jTable1.setEditingRow(1);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCarga.setText("Cargar");
        btnCarga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargaMouseClicked(evt);
            }
        });
        jPanel1.add(btnCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 9, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 9, -1, -1));

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));
        jPanel1.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 10, 175, -1));

        jLabel4.setText("Estado:");
        jLabel4.setAlignmentY(1.0F);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 15, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnCerrar))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(90, 90, 90)
                                                                .addComponent(jLabel2)
                                                                .addGap(97, 97, 97)
                                                                .addComponent(jLabel3))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(txtDesdeFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(txtHastaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnBuscar)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtDesdeFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHastaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBuscar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblId, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(btnCerrar)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = formatter.format(date);

        txtDesdeFecha.setText(strDate);
        txtHastaFecha.setText(strDate);

        DefaultTableModel dt = new DefaultTableModel();
        String[] col = new String[4];
        col[0] = "Id";
        dt.setColumnIdentifiers(col);
        col[1] = "Fecha";
        dt.setColumnIdentifiers(col);
        col[2] = "Cliente";
        dt.setColumnIdentifiers(col);
        col[3] = "Estado";
        dt.setColumnIdentifiers(col);

        this.jTable1.setModel(dt);
        jTable1.removeColumn(jTable1.getColumnModel().getColumn(0));

        cmbEstado.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnCarga.setEnabled(false);
        loadCombos();

    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked

        DefaultTableModel dt = new DefaultTableModel();
        String[] col = new String[4];
        col[0] = "Id";
        dt.setColumnIdentifiers(col);
        col[1] = "Fecha";
        dt.setColumnIdentifiers(col);
        col[2] = "Cliente";
        dt.setColumnIdentifiers(col);
        col[3] = "Estado";
        dt.setColumnIdentifiers(col);

        this.jTable1.setModel(dt);

        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        List<Pedidos> result;

        try {

            result = entityService.getPedidos(formatter.parse(txtDesdeFecha.getText()), formatter.parse(txtHastaFecha.getText()));
            for (Pedidos c : result) {

                String[] row = new String[4];
                row[0] = String.valueOf(c.getIdPedidos());
                row[1] = String.valueOf(c.getFechaHoraCreacion());
                row[2] = String.valueOf(c.getNombreCliente());
                row[3] = String.valueOf(c.getEstadopedidos().getNombre());
                dt.addRow(row);

            }

            this.jTable1.setModel(dt);

        } catch (ParseException ex) {
            Logger.getLogger(JDBuscarFactura.class.getName()).log(Logger.Level.FATAL, null, ex);
        }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        Integer row = jTable1.getSelectedRow();
        idPed = Integer.parseInt((String) jTable1.getModel().getValueAt(row, 0));

        this.dispose();
        
        entity = entityService.find(Integer.parseInt(lblId.getText()));

        for (int i = 1; i <= estado.size(); i++) {
            if (estado.get(i - 1).getIdEstadoPedidos() == entity.getEstadopedidos().getIdEstadoPedidos()) {
                cmbEstado.setSelectedIndex(i - 1);
                break;
            }
        }
        txtDesdeFecha.setEnabled(false);
        txtHastaFecha.setEnabled(false);
        cmbEstado.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnCarga.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked

        entity = entityService.find(Integer.parseInt(lblId.getText()));
        entity.setEstadopedidos(estado.get(cmbEstado.getSelectedIndex()));
        entityService.save(entity);
        cmbEstado.setEnabled(false);
        txtDesdeFecha.setEnabled(true);
        txtHastaFecha.setEnabled(true);
        btnBuscarMouseClicked(null);

    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnCargaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargaMouseClicked

    }//GEN-LAST:event_btnCargaMouseClicked

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
            java.util.logging.Logger.getLogger(JDBuscarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDBuscarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDBuscarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDBuscarFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDBuscarFactura dialog = new JDBuscarFactura(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCarga;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    protected javax.swing.JLabel lblId;
    private javax.swing.JTextField txtDesdeFecha;
    private javax.swing.JTextField txtHastaFecha;
    // End of variables declaration//GEN-END:variables

}
