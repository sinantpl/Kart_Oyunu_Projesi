/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import javax.swing.JOptionPane;

/**
 *
 * @author Mertcan
 */
public class Arayüz extends javax.swing.JFrame {

    /**
     * Creates new form Oyun2
     */
    String ad = "";
    public Arayüz() {
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

        İsim = new javax.swing.JTextField();
        StartButonu = new javax.swing.JButton();
        Çıkış = new javax.swing.JButton();
        İsimLabelı = new javax.swing.JLabel();
        Anamenü = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        İsim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                İsimActionPerformed(evt);
            }
        });
        getContentPane().add(İsim);
        İsim.setBounds(190, 580, 160, 20);

        StartButonu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mertcan\\Desktop\\sonlar\\startson.png")); // NOI18N
        StartButonu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButonuActionPerformed(evt);
            }
        });
        getContentPane().add(StartButonu);
        StartButonu.setBounds(160, 620, 220, 130);

        Çıkış.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mertcan\\Desktop\\sonlar\\kapatma tuşu.png")); // NOI18N
        Çıkış.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ÇıkışActionPerformed(evt);
            }
        });
        getContentPane().add(Çıkış);
        Çıkış.setBounds(1350, 10, 10, 10);

        İsimLabelı.setText("İsim Giriniz");
        getContentPane().add(İsimLabelı);
        İsimLabelı.setBounds(240, 560, 90, 14);

        Anamenü.setIcon(new javax.swing.ImageIcon("C:\\Users\\Mertcan\\Desktop\\sonlar\\anamenümüz.png")); // NOI18N
        getContentPane().add(Anamenü);
        Anamenü.setBounds(0, 0, 1370, 770);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1370, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 40, 1370, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void İsimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_İsimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_İsimActionPerformed

    private void StartButonuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButonuActionPerformed
        // TODO add your handling code here:
        ad = İsim.getText();
        this.setVisible(false);
        Oyun ekran = new Oyun();
        ekran.setSize(1368,768);
        ekran.setVisible(true);
    }//GEN-LAST:event_StartButonuActionPerformed

    private void ÇıkışActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ÇıkışActionPerformed
        // TODO add your handling code here:
        int sonuc = JOptionPane.showConfirmDialog(null,
                "Kapatmak İstediğinize Emin Misiniz?",
                "Uyarı",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        if (sonuc == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_ÇıkışActionPerformed

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
            java.util.logging.Logger.getLogger(Arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arayüz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Anamenü;
    private javax.swing.JButton StartButonu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton Çıkış;
    private javax.swing.JTextField İsim;
    private javax.swing.JLabel İsimLabelı;
    // End of variables declaration//GEN-END:variables
}
