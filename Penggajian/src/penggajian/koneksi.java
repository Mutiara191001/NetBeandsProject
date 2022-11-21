/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penggajian;

import com.mysql.jdbc.Driver;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class koneksi {
    private static Connection koneksi;
    
     public static Connection getConnection(){
         if(koneksi == null){
             try {
                 String url = "jdbc:mysql://localhost:3306/penggajian";
                 String user="root";
                 String password="";
                 DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                 koneksi = DriverManager.getConnection(url, user, password);
                 System.out.println("Koneksi Berhasil....");
                } catch (SQLException se) {
                    System.out.println("Koneksi Gagal/Error = ");
                }
             }
         return koneksi;
     }
     public static void main (String args[]){
         getConnection();       
     }
}
