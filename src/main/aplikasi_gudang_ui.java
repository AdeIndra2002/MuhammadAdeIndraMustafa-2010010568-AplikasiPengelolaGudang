/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author cncti
 */
public class aplikasi_gudang_ui extends javax.swing.JFrame {

    /**
     * Creates new form aplikasi_gudang_ui
     */
    public aplikasi_gudang_ui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dPanel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuBarang = new javax.swing.JMenuItem();
        menuSupplier = new javax.swing.JMenuItem();
        menuTransaksi = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dPanelLayout = new javax.swing.GroupLayout(dPanel);
        dPanel.setLayout(dPanelLayout);
        dPanelLayout.setHorizontalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        dPanelLayout.setVerticalGroup(
            dPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 628, Short.MAX_VALUE)
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Menus");

        menuBarang.setText("Menu Barang");
        menuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBarangActionPerformed(evt);
            }
        });
        jMenu2.add(menuBarang);

        menuSupplier.setText("Menu Supplier");
        menuSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSupplierActionPerformed(evt);
            }
        });
        jMenu2.add(menuSupplier);

        menuTransaksi.setText("Menu Transaksi");
        menuTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTransaksiActionPerformed(evt);
            }
        });
        jMenu2.add(menuTransaksi);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dPanel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dPanel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBarangActionPerformed
        // TODO add your handling code here:
        barangUI kv = new barangUI();
        dPanel.add(kv);
        kv.setVisible(true);
    }//GEN-LAST:event_menuBarangActionPerformed

    private void menuSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSupplierActionPerformed
        // TODO add your handling code here:
        supplierUI kv = new supplierUI();
        dPanel.add(kv);
        kv.setVisible(true);
    }//GEN-LAST:event_menuSupplierActionPerformed

    private void menuTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTransaksiActionPerformed
        // TODO add your handling code here:
        transaksiUI kv = new transaksiUI();
        dPanel.add(kv);
        kv.setVisible(true);
    }//GEN-LAST:event_menuTransaksiActionPerformed

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
            java.util.logging.Logger.getLogger(aplikasi_gudang_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplikasi_gudang_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplikasi_gudang_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplikasi_gudang_ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplikasi_gudang_ui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dPanel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuBarang;
    private javax.swing.JMenuItem menuSupplier;
    private javax.swing.JMenuItem menuTransaksi;
    // End of variables declaration//GEN-END:variables
}
