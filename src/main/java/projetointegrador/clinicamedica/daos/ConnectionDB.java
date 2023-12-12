/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetointegrador.clinicamedica.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Phabi
 */
public class ConnectionDB {
    
    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(ClassNotFoundException e1){
            e1.printStackTrace();
        }
        
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/clinicaMedica?useSSL=false","root","phdr091103");
        }catch(SQLException e2){
            e2.printStackTrace();
        }
        return connection;
    }
    
}
