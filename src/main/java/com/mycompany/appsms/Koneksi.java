/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appsms;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author khalila
 */
public class Koneksi {
    public static Connection koneksi;
    
    public static Connection getConnection() throws SQLException{
        if(koneksi == null){
            Driver driver = new Driver();
            
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/pulsa", "root", "");
        }
        return koneksi;
    }
}
