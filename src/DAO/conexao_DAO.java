/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author will
 */
public class conexao_DAO {
    
    public Connection conectaBD(){
        Connection conn = null;
        
        
        try {
               String url = "jdbc:mysql://localhost:3306/biblioteca?user=root&password=";
               conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            
            JOptionPane.showMessageDialog(null,"conexao_DAO"+ erro.getMessage());
            
        }
        return conn;
    }
    
    

    
}
