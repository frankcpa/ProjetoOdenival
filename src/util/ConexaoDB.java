/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Yuri
 */
public class ConexaoDB {
    private static String banco = "projetoodenival";
    private static String user = "homestead";
    private static String password = "secret";
    
    public Connection ConectaDB(){
        Connection conn = null;
        
        try{
            String url = "jdbc:mysql://localhost:3306/"+banco+"?user="+user+"&password="+password;
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "Conexão MySQL: "+erro.getMessage());
        }
        
        return conn;
    }
}
