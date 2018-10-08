/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author henriquepoladian
 */
public class SQLite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection c = null;
        Statement stmt = null;
        
        try{
            c = DriverManager.getConnection("jdbc:sqlite:teste.db");
            
            System.out.println("Conexão realizada com sucesso!");
            
            stmt = c.createStatement();
            
            String sql = "teste";
            
            stmt.executeUpdate(sql);
            stmt.close();
            c.close();
            
        }catch (Exception e){
            
        }
    }
    
}
