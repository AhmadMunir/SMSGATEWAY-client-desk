/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appsms;

/**
 *
 * @author khalila
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jLabel1 = new javax.swing.JLabel();
        buttonpulsa = new javax.swing.JButton();
        buttonpaket = new javax.swing.JButton();
        buttonLpulsa = new javax.swing.JButton();
        buttonLpaket = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Home = new javax.swing.JMenu();
        Pulsa = new javax.swing.JMenu();
        Paket = new javax.swing.JMenu();
        Laporan = new javax.swing.JMenu();
        Lpulsa = new javax.swing.JMenuItem();
        Lpaket = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lohit Devanagari", 1, 24)); // NOI18N
        jLabel1.setText("Selamat Datang Di SIPULsa");

        buttonpulsa.setText("Pulsa");
        buttonpulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpulsaActionPerformed(evt);
            }
        });

        buttonpaket.setText("Paket Data");
        buttonpaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonpaketActionPerformed(evt);
            }
        });

        buttonLpulsa.setText("Laporan Penjualan Pulsa");
        buttonLpulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLpulsaActionPerformed(evt);
            }
        });

        buttonLpaket.setText("Laporan Penjualan Paket Data");
        buttonLpaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLpaketActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/khalila/Downloads/Sipulsa.png")); // NOI18N

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jMenuBar1.add(Home);

        Pulsa.setText("Pulsa");
        Pulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PulsaActionPerformed(evt);
            }
        });
        jMenuBar1.add(Pulsa);

        Paket.setText("Paket Data");
        Paket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaketActionPerformed(evt);
            }
        });
        jMenuBar1.add(Paket);

        Laporan.setText("Laporan Penjualan");

        Lpulsa.setText("Laporan Pulsa");
        Lpulsa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LpulsaActionPerformed(evt);
            }
        });
        Laporan.add(Lpulsa);

        Lpaket.setText("Laporan Paket Data");
        Lpaket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LpaketActionPerformed(evt);
            }
        });
        Laporan.add(Lpaket);

        jMenuBar1.add(Laporan);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonLpaket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonpulsa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonpaket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLpulsa, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(buttonpulsa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonpaket)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLpulsa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonLpaket))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.show();
        this.hide();
    }//GEN-LAST:event_HomeActionPerformed

    private void LpulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LpulsaActionPerformed
        // TODO add your handling code here:
        Laporanpulsa lp = new Laporanpulsa();
        lp.show();
        this.hide();
    }//GEN-LAST:event_LpulsaActionPerformed

    private void LpaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LpaketActionPerformed
        // TODO add your handling code here:
        Laporanpaket lpa = new Laporanpaket();
        lpa.show();
        this.hide();
    }//GEN-LAST:event_LpaketActionPerformed

    private void buttonpulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpulsaActionPerformed
        // TODO add your handling code here:
        Appform pulsa = new Appform();
        pulsa.show();
        this.hide();
    }//GEN-LAST:event_buttonpulsaActionPerformed

    private void buttonpaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonpaketActionPerformed
        // TODO add your handling code here:
        Paket paket = new Paket();
        paket.show();
        this.hide();
    }//GEN-LAST:event_buttonpaketActionPerformed

    private void buttonLpulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLpulsaActionPerformed
        // TODO add your handling code here:
        Laporanpulsa lp = new Laporanpulsa();
        lp.show();
        this.hide();
    }//GEN-LAST:event_buttonLpulsaActionPerformed

    private void buttonLpaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLpaketActionPerformed
        // TODO add your handling code here:
        Laporanpaket lpa = new Laporanpaket();
        lpa.show();
        this.hide();
    }//GEN-LAST:event_buttonLpaketActionPerformed

    private void PaketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaketActionPerformed
        // TODO add your handling code here:
        Paket paket = new Paket();
        paket.show();
        this.hide();
    }//GEN-LAST:event_PaketActionPerformed

    private void PulsaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PulsaActionPerformed
        // TODO add your handling code here:
        Appform pulsa = new Appform();
        pulsa.show();
        this.hide();
    }//GEN-LAST:event_PulsaActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Home;
    private javax.swing.JMenu Laporan;
    private javax.swing.JMenuItem Lpaket;
    private javax.swing.JMenuItem Lpulsa;
    private javax.swing.JMenu Paket;
    private javax.swing.JMenu Pulsa;
    private javax.swing.JButton buttonLpaket;
    private javax.swing.JButton buttonLpulsa;
    private javax.swing.JButton buttonpaket;
    private javax.swing.JButton buttonpulsa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
