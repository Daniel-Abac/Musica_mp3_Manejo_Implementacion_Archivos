/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
/**
 *
 * @author Daniel
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPaneEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAgregar = new javax.swing.JMenu();
        jCheckBoxMenuItemAgregarRuta = new javax.swing.JCheckBoxMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jCheckBoxMenuItemEditar = new javax.swing.JCheckBoxMenuItem();
        jMenuEditar1 = new javax.swing.JMenu();
        jCheckBoxMenuItemSalir = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");

        jDesktopPaneEscritorio.setToolTipText("");
        jDesktopPaneEscritorio.setName(""); // NOI18N

        javax.swing.GroupLayout jDesktopPaneEscritorioLayout = new javax.swing.GroupLayout(jDesktopPaneEscritorio);
        jDesktopPaneEscritorio.setLayout(jDesktopPaneEscritorioLayout);
        jDesktopPaneEscritorioLayout.setHorizontalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1040, Short.MAX_VALUE)
        );
        jDesktopPaneEscritorioLayout.setVerticalGroup(
            jDesktopPaneEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );

        jMenuBar1.setToolTipText("Principal");

        jMenuAgregar.setText("Agregar");

        jCheckBoxMenuItemAgregarRuta.setSelected(true);
        jCheckBoxMenuItemAgregarRuta.setText("Agregar Ruta");
        jCheckBoxMenuItemAgregarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemAgregarRutaActionPerformed(evt);
            }
        });
        jMenuAgregar.add(jCheckBoxMenuItemAgregarRuta);

        jMenuBar1.add(jMenuAgregar);

        jMenuEditar.setText("Editar");

        jCheckBoxMenuItemEditar.setSelected(true);
        jCheckBoxMenuItemEditar.setText("Editar");
        jCheckBoxMenuItemEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemEditarActionPerformed(evt);
            }
        });
        jMenuEditar.add(jCheckBoxMenuItemEditar);

        jMenuBar1.add(jMenuEditar);

        jMenuEditar1.setText("Salir");

        jCheckBoxMenuItemSalir.setSelected(true);
        jCheckBoxMenuItemSalir.setText("Salir");
        jCheckBoxMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuEditar1.add(jCheckBoxMenuItemSalir);

        jMenuBar1.add(jMenuEditar1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPaneEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPaneEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItemAgregarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemAgregarRutaActionPerformed
        // TODO add your handling code here:
        try {
            Ruta open = new Ruta();
            jDesktopPaneEscritorio.add(open);
            open.show();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCheckBoxMenuItemAgregarRutaActionPerformed

    private void jCheckBoxMenuItemEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemEditarActionPerformed
        // TODO add your handling code here:s
        try {
            Editar open = new Editar();
            jDesktopPaneEscritorio.add(open);
            open.show();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jCheckBoxMenuItemEditarActionPerformed

    private void jCheckBoxMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jCheckBoxMenuItemSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemAgregarRuta;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemEditar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItemSalir;
    private javax.swing.JDesktopPane jDesktopPaneEscritorio;
    private javax.swing.JMenu jMenuAgregar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuEditar1;
    // End of variables declaration//GEN-END:variables
}

