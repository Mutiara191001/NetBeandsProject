/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemvis3;

/**
 *
 * @author ASUS
 */
public class Minggu4Tugas extends javax.swing.JFrame {

    /**
     * Creates new form Minggu4Tugas
     */
    String nim,nama,gender,hobby;
    
    public Minggu4Tugas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldNIM = new javax.swing.JTextField();
        jTextFieldNAMA = new javax.swing.JTextField();
        jRadioButtonLK = new javax.swing.JRadioButton();
        jRadioButtonPEREMPUAN = new javax.swing.JRadioButton();
        jCheckBoxPROGRAMMING = new javax.swing.JCheckBox();
        jCheckBoxBLOGING = new javax.swing.JCheckBox();
        jCheckBoxGRAFIS = new javax.swing.JCheckBox();
        jButtonCETAK = new javax.swing.JButton();
        jButtonHAPUS = new javax.swing.JButton();
        jButtonCLOSE = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaOUTPUT = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("NIM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NAMA");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("GENDER");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("HOBBY");

        buttonGroup1.add(jRadioButtonLK);
        jRadioButtonLK.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRadioButtonLK.setText("LAKI-LAKI");
        jRadioButtonLK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonLKMouseClicked(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPEREMPUAN);
        jRadioButtonPEREMPUAN.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jRadioButtonPEREMPUAN.setText("PEREMPUAN");
        jRadioButtonPEREMPUAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jRadioButtonPEREMPUANMouseClicked(evt);
            }
        });

        jCheckBoxPROGRAMMING.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jCheckBoxPROGRAMMING.setText("PROGRAMMING");
        jCheckBoxPROGRAMMING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxPROGRAMMINGMouseClicked(evt);
            }
        });

        jCheckBoxBLOGING.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jCheckBoxBLOGING.setText("BLOGING");
        jCheckBoxBLOGING.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBoxBLOGINGMouseClicked(evt);
            }
        });

        jCheckBoxGRAFIS.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jCheckBoxGRAFIS.setText("GRAFIS");

        jButtonCETAK.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCETAK.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonCETAK.setText("CETAK");
        jButtonCETAK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCETAKMouseClicked(evt);
            }
        });
        jButtonCETAK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCETAKActionPerformed(evt);
            }
        });

        jButtonHAPUS.setBackground(new java.awt.Color(204, 204, 255));
        jButtonHAPUS.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonHAPUS.setText("HAPUS");
        jButtonHAPUS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHAPUSActionPerformed(evt);
            }
        });

        jButtonCLOSE.setBackground(new java.awt.Color(204, 204, 255));
        jButtonCLOSE.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonCLOSE.setText("CLOSE");
        jButtonCLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCLOSEActionPerformed(evt);
            }
        });

        jTextAreaOUTPUT.setColumns(20);
        jTextAreaOUTPUT.setRows(5);
        jScrollPane2.setViewportView(jTextAreaOUTPUT);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\Pengurus Hima.JPG")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jCheckBoxPROGRAMMING)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxBLOGING)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBoxGRAFIS))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButtonLK)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButtonPEREMPUAN)
                                        .addGap(43, 43, 43))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNIM, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                            .addComponent(jTextFieldNAMA))
                                        .addGap(118, 118, 118)))
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jButtonCETAK)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonHAPUS)
                        .addGap(69, 69, 69)
                        .addComponent(jButtonCLOSE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextFieldNAMA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jRadioButtonLK)
                            .addComponent(jRadioButtonPEREMPUAN)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBoxPROGRAMMING)
                    .addComponent(jCheckBoxBLOGING)
                    .addComponent(jCheckBoxGRAFIS))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCETAK)
                    .addComponent(jButtonHAPUS)
                    .addComponent(jButtonCLOSE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCETAKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCETAKMouseClicked
        // TODO add your handling code here:
        nim= jTextFieldNIM.getText();
        nama= jTextFieldNAMA.getText();
        
        if(jRadioButtonLK.isSelected())
           gender = jRadioButtonLK.getText();
           else if (jRadioButtonPEREMPUAN.isSelected())
               gender = jRadioButtonPEREMPUAN.getText();
           
           if (jCheckBoxPROGRAMMING.isSelected())
           {hobby = jCheckBoxPROGRAMMING.getText() + ",";}
           if (jCheckBoxBLOGING.isSelected())
           {hobby += jCheckBoxBLOGING.getText() + ",";}
           if (jCheckBoxGRAFIS.isSelected())
           {hobby += jCheckBoxGRAFIS.getText() + ",";}
           
           jTextAreaOUTPUT.setText("NIM\t : " + nim +
                                   "\nNAMA\t : " + nama +
                                   "\nGENDER\t : " + gender +
                                   "\nHOBBY\t : " + hobby );
           
    }//GEN-LAST:event_jButtonCETAKMouseClicked

    private void jButtonCETAKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCETAKActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButtonCETAKActionPerformed

    private void jButtonHAPUSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHAPUSActionPerformed
        // TODO add your handling code here:
        jTextFieldNIM.setText("");
        jTextFieldNAMA.setText("");
        buttonGroup1.clearSelection();
        jCheckBoxPROGRAMMING.setSelected(false);
        jCheckBoxBLOGING.setSelected(false);
        jCheckBoxGRAFIS.setSelected(false);
        jTextAreaOUTPUT.setText("");
        
    }//GEN-LAST:event_jButtonHAPUSActionPerformed

    private void jButtonCLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCLOSEActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCLOSEActionPerformed

    private void jRadioButtonLKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonLKMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jRadioButtonLKMouseClicked

    private void jRadioButtonPEREMPUANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButtonPEREMPUANMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jRadioButtonPEREMPUANMouseClicked

    private void jCheckBoxPROGRAMMINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxPROGRAMMINGMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBoxPROGRAMMINGMouseClicked

    private void jCheckBoxBLOGINGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxBLOGINGMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jCheckBoxBLOGINGMouseClicked

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
            java.util.logging.Logger.getLogger(Minggu4Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Minggu4Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Minggu4Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Minggu4Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Minggu4Tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCETAK;
    private javax.swing.JButton jButtonCLOSE;
    private javax.swing.JButton jButtonHAPUS;
    private javax.swing.JCheckBox jCheckBoxBLOGING;
    private javax.swing.JCheckBox jCheckBoxGRAFIS;
    private javax.swing.JCheckBox jCheckBoxPROGRAMMING;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButtonLK;
    private javax.swing.JRadioButton jRadioButtonPEREMPUAN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextAreaOUTPUT;
    private javax.swing.JTextField jTextFieldNAMA;
    private javax.swing.JTextField jTextFieldNIM;
    // End of variables declaration//GEN-END:variables
}