/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author patiz
 */
public class ConnectionBuidler {
    public static Connection getConnection() throws SQLException{
        Connection con = null;
        String url = "";
        String user= "";
        String password ="";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con  = (Connection) DriverManager.getConnection("jdbc:mysql://ap-cdbr-azure-southeast-b.cloudapp.net/shipping?useUnicode=true&characterEncoding=UTF-8","b7f4ece38e680c","414dd393");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionBuidler.class.getName()).log(Level.SEVERE, null, ex);
        }
       
           
        
        
        return con;
    }
    public static void main(String[] args) {
        try {
            Connection con = ConnectionBuidler.getConnection();
            System.out.println(con);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionBuidler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
