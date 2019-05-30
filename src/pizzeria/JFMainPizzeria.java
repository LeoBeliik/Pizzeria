package pizzeria;
//@author Leo

import ar.com.mycompany.entities.*;

import java.awt.Color;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class JFMainPizzeria extends javax.swing.JFrame {

    private void allEnabled() {
        bttmPizza.setEnabled(true);
        bttmPedido.setEnabled(true);
        bttmFactura.setEnabled(true);
        bttmTamanio.setEnabled(true);
        bttmTipo.setEnabled(true);
        bttmVariedad.setEnabled(true);
        bttmEstadoP.setEnabled(true);
        bttmEstadoF.setEnabled(true);
    }

    public JFMainPizzeria() {

        initComponents();
        this.setLocationRelativeTo(null);

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttmPizza = new javax.swing.JLabel();
        bttmPedido = new javax.swing.JLabel();
        bttmFactura = new javax.swing.JLabel();
        bttmTamanio = new javax.swing.JLabel();
        bttmTipo = new javax.swing.JLabel();
        bttmVariedad = new javax.swing.JLabel();
        bttmEstadoP = new javax.swing.JLabel();
        bttmEstadoF = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnPizza = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnFacturas = new javax.swing.JButton();
        btnTamanio = new javax.swing.JButton();
        btnEstadoP = new javax.swing.JButton();
        btnEstadoF = new javax.swing.JButton();
        btnTipo = new javax.swing.JButton();
        btnVaria = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzeria Ramona");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(8, 8));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        bttmPizza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BttmPizza.png"))); // NOI18N
        bttmPizza.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        bttmPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BttmPedido.png"))); // NOI18N

        bttmFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BttmFactura.png"))); // NOI18N

        bttmTamanio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BttmTamaño.png"))); // NOI18N

        bttmTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BttmTipos.png"))); // NOI18N

        bttmVariedad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BttmVariedad.png"))); // NOI18N

        bttmEstadoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BttmEstadoP.png"))); // NOI18N

        bttmEstadoF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BttmEstadoF.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 3, 36)); // NOI18N
        jLabel1.setText("Pizzeria");

        btnPizza.setText("Pizzas");
        btnPizza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPizzaMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPizzaMouseEntered(evt);
            }
        });

        btnPedido.setText("Pedidos");
        btnPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPedidoMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPedidoMouseEntered(evt);
            }
        });

        btnFacturas.setText("Facturas");
        btnFacturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFacturasMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFacturasMouseEntered(evt);
            }
        });

        btnTamanio.setText("Tamaños");
        btnTamanio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTamanioMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTamanioMouseEntered(evt);
            }
        });

        btnEstadoP.setText("Estado de los pedidos");
        btnEstadoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstadoPMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstadoPMouseEntered(evt);
            }
        });

        btnEstadoF.setText("Estado de las facturas");
        btnEstadoF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstadoFMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstadoFMouseEntered(evt);
            }
        });

        btnTipo.setText("Tipos");
        btnTipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTipoMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTipoMouseEntered(evt);
            }
        });

        btnVaria.setText("Variedad");
        btnVaria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVariaMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVariaMouseEntered(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        btnExit.setText("Salir");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(bttmVariedad)
                                                                        .addComponent(bttmEstadoP))
                                                                .addGap(4, 4, 4)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(bttmPizza)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(5, 5, 5)
                                                                                .addComponent(bttmFactura))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(101, 101, 101)
                                                                .addComponent(bttmTamanio))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(104, 104, 104)
                                                                .addComponent(bttmPedido))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(bttmEstadoF))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(33, 33, 33)
                                                                .addComponent(bttmTipo))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(btnTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(77, 77, 77)
                                                                .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addComponent(btnPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(7, 7, 7)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnEstadoF, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                        .addComponent(btnTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGap(4, 4, 4)
                                                                                        .addComponent(btnVaria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(btnEstadoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(67, 67, 67)
                                                                .addComponent(bttmVariedad))
                                                        .addComponent(bttmEstadoP)))
                                        .addComponent(bttmPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(98, 98, 98)
                                                .addComponent(bttmFactura))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(bttmTamanio))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(bttmPedido))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(bttmEstadoF))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(109, 109, 109)
                                                .addComponent(bttmTipo)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnPizza, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnVaria, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEstadoF, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTamanio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        this.allEnabled();
    }//GEN-LAST:event_formWindowActivated

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.allEnabled();
        this.jLabel1.setForeground(Color.black);
    }//GEN-LAST:event_formMouseEntered

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        this.jLabel1.setForeground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnVariaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVariaMouseEntered
        this.allEnabled();
        bttmVariedad.setEnabled(false);
    }//GEN-LAST:event_btnVariaMouseEntered

    private void btnTipoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTipoMouseEntered
        this.allEnabled();
        bttmTipo.setEnabled(false);
    }//GEN-LAST:event_btnTipoMouseEntered

    private void btnEstadoFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadoFMouseEntered
        this.allEnabled();
        bttmEstadoF.setEnabled(false);
    }//GEN-LAST:event_btnEstadoFMouseEntered

    private void btnEstadoPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadoPMouseEntered
        this.allEnabled();
        bttmEstadoP.setEnabled(false);
    }//GEN-LAST:event_btnEstadoPMouseEntered

    private void btnTamanioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamanioMouseEntered
        this.allEnabled();
        bttmTamanio.setEnabled(false);
    }//GEN-LAST:event_btnTamanioMouseEntered

    private void btnFacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturasMouseEntered
        this.allEnabled();
        bttmFactura.setEnabled(false);
    }//GEN-LAST:event_btnFacturasMouseEntered

    private void btnPedidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidoMouseEntered
        this.allEnabled();
        bttmPedido.setEnabled(false);
    }//GEN-LAST:event_btnPedidoMouseEntered

    private void btnPizzaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPizzaMouseEntered
        this.allEnabled();
        bttmPizza.setEnabled(false);
    }//GEN-LAST:event_btnPizzaMouseEntered

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(1);
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnPizzaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPizzaMouseClicked
        new JFPizza().setVisible(true);
    }//GEN-LAST:event_btnPizzaMouseClicked

    private void btnPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidoMouseClicked
        new JFPedido().setVisible(true);
    }//GEN-LAST:event_btnPedidoMouseClicked

    private void btnTamanioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTamanioMouseClicked
        new JFTamanioPizzas().setVisible(true);
    }//GEN-LAST:event_btnTamanioMouseClicked

    private void btnEstadoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadoPMouseClicked
        new JFEstadoPedidos().setVisible(true);
    }//GEN-LAST:event_btnEstadoPMouseClicked

    private void btnEstadoFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstadoFMouseClicked
        new JFEstadoFacturas().setVisible(true);
    }//GEN-LAST:event_btnEstadoFMouseClicked

    private void btnTipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTipoMouseClicked
        new JFTiposPizzas().setVisible(true);
    }//GEN-LAST:event_btnTipoMouseClicked

    private void btnVariaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVariaMouseClicked
        new JFVariedadPizzas().setVisible(true);
    }//GEN-LAST:event_btnVariaMouseClicked

    private void btnFacturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFacturasMouseClicked
        new JFFactura().setVisible(true);
    }//GEN-LAST:event_btnFacturasMouseClicked

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
            java.util.logging.Logger.getLogger(JFMainPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMainPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMainPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMainPizzeria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMainPizzeria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadoF;
    private javax.swing.JButton btnEstadoP;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFacturas;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnPizza;
    private javax.swing.JButton btnTamanio;
    private javax.swing.JButton btnTipo;
    private javax.swing.JButton btnVaria;
    private javax.swing.JLabel bttmEstadoF;
    private javax.swing.JLabel bttmEstadoP;
    private javax.swing.JLabel bttmFactura;
    private javax.swing.JLabel bttmPedido;
    private javax.swing.JLabel bttmPizza;
    private javax.swing.JLabel bttmTamanio;
    private javax.swing.JLabel bttmTipo;
    private javax.swing.JLabel bttmVariedad;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
