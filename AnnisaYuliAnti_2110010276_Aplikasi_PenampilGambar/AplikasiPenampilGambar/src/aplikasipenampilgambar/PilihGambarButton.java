
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiPenampilGambar;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Acer
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PenampilGambar
     */
    public PilihGambarButton() {
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

        bt_panel = new javax.swing.JPanel();
        bt_glassfish = new javax.swing.JButton();
        bt_javaee = new javax.swing.JButton();
        bt_postgresql = new javax.swing.JButton();
        bt_exit = new javax.swing.JButton();
        gambar_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_glassfish.setText("Glassfish");
        bt_glassfish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_glassfishActionPerformed(evt);
            }
        });
        bt_panel.add(bt_glassfish);

        bt_javaee.setText("JavaEE");
        bt_javaee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_javaeeActionPerformed(evt);
            }
        });
        bt_panel.add(bt_javaee);

        bt_postgresql.setText("PostgreSQL");
        bt_postgresql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_postgresqlActionPerformed(evt);
            }
        });
        bt_panel.add(bt_postgresql);

        bt_exit.setText("Exit");
        bt_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_exitActionPerformed(evt);
            }
        });
        bt_panel.add(bt_exit);

        getContentPane().add(bt_panel, java.awt.BorderLayout.PAGE_START);

        gambar_panel.setLayout(new java.awt.CardLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AplikasiPenampilGambar/glassfish.jpg"))); // NOI18N
        gambar_panel.add(jLabel1, "");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AplikasiPenampilGambar/javaee.jpg"))); // NOI18N
        gambar_panel.add(jLabel2, "1");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AplikasiPenampilGambar/postgrasql.jpg"))); // NOI18N
        gambar_panel.add(jLabel3, "2");

        getContentPane().add(gambar_panel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_glassfishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_glassfishActionPerformed
        CardLayout cl = (CardLayout)(gambar_panel.getLayout());
        cl.show(gambar_panel, "0");
    }//GEN-LAST:event_bt_glassfishActionPerformed

    private void bt_javaeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_javaeeActionPerformed
        CardLayout cl = (CardLayout)(gambar_panel.getLayout());
        cl.show(gambar_panel, "1");
    }//GEN-LAST:event_bt_javaeeActionPerformed

    private void bt_postgresqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_postgresqlActionPerformed
        CardLayout cl = (CardLayout)(gambar_panel.getLayout());
        cl.show(gambar_panel, "2");
    }//GEN-LAST:event_bt_postgresqlActionPerformed

    private void bt_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bt_exitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {         
                 new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_exit;
    private javax.swing.JButton bt_glassfish;
    private javax.swing.JButton bt_javaee;
    private javax.swing.JPanel bt_panel;
    private javax.swing.JButton bt_postgresql;
    private javax.swing.JPanel gambar_panel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}