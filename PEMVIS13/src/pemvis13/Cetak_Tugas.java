/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemvis13;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.EditorKit;
import javax.swing.text.html.HTMLEditorKit;
/**
 *
 * @author ASUS
 */
public class Cetak_Tugas extends javax.swing.JFrame {
    Connection koneksi;

    /**
     * Creates new form Cetak_Tugas
     */
    public void koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Sukses, Driver JDBC ditemukan...!!!");
            try{
                String url = "jdbc:mysql://localhost:3306/elka?user=root&password=";
                koneksi = (Connection) DriverManager.getConnection(url);
                System.out.println("Sukses Koneksi");
            } catch (SQLException se){
                System.out.println("Gagal Koneksi = "+se);
                System.exit(0);
        }
        } catch (ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null, "Class tidak ditemukan = "+cnfe);
            System.exit(0);
        }
    }
    
    public void cetak(){
         String html =
            "<H2<center> DATA SEWA TEMPAT </center></H2> "+"<table width='98%' border='0'  cellpadding='5' cellspacing='1'>"+
            "<tr>"
                +"<td bgcolor='#CCCCCC' align='center'><strong>kode_transaksi</strong></td>"
                +"<td bgcolor='#CCCCCC' align='center'><strong>tanggal_transaksi</strong></td>"
                +"<td bgcolor='#CCCCCC' align='center'><strong>jenis_pelanggan</strong></td>"
                +"<td bgcolor='#CCCCCC' align='center'><strong>tipe_pelanggan</strong></td>"
                +"<td bgcolor='#CCCCCC' align='center'><strong>sewa/jam</strong</td>"
                +"<td bgcolor='#CCCCCC' align='center'><strong>lama_sewa</strong></td>"
                +"<td bgcolor='#CCCCCC' align='center'><strong>jumlah_bayar</strong></td>"
                +"</tr>";
  try{
      koneksi();
      String sql = "Select *from tbtugas";
      com.mysql.jdbc.PreparedStatement stat = (com.mysql.jdbc.PreparedStatement) koneksi.prepareStatement(sql);
      ResultSet set = stat.executeQuery(sql);
      while(set.next()){
   html = html + "<tr>"
               + "<td bgcolor='#EEEEEE'>"+set.getString("kode_transaksi")+"</td>"
               +" <td bgcolor='#F8F8F8'>"+set.getString("tanggal_transaksi")+"</td>"
               +" <td bgcolor='#F8F8F8'>"+set.getString("jenis_pelanggan")+"</td>"
               +" <td bgcolor='#F8F8F8'>"+set.getString("tipe_pelanggan")+"</td>"
               +" <td bgcolor='#F8F8F8'>"+set.getString("sewa/jam")+"</td>"
               +" <td bgcolor='#F8F8F8'>"+set.getString("lama_sewa")+"</td>"
               +" <td bgcolor='#F8F8F8'>"+set.getString("jumlah_bayar")+"</td>"
               +"</tr>";
   }
       EditorKit x = new HTMLEditorKit();
       jEditorPane1.setEditorKit(x);
       jEditorPane1.setText(html);
       jEditorPane1.setText(html);
   } catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }
    public Cetak_Tugas() {
        initComponents();
        koneksi();
        cetak();
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
        jEditorPane1 = new javax.swing.JEditorPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jEditorPane1);

        jButton1.setText("HOME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CLOSE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Menu_Utama().show();
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
            jEditorPane1.print();
        }catch(PrinterException ex){
            Logger.getLogger(Cetak_Tugas.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Cetak_Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cetak_Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cetak_Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cetak_Tugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cetak_Tugas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}