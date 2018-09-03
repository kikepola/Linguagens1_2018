/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author henriquepoladian
 */
public class ItemDAO {
    
    private final String TABELA = "estoque";
    
    public boolean CreateTable(){
        //Faz conexão como banco
        Connection conexao = null;
        //Aplica as queries 
        Statement stmt = null;
        
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:sqlite:mydb.db");
            System.out.println("Conexao realizada com sucesso");
            
            stmt = conexao.createStatement();
            
            String sql = "CREATE TABLE IF NOT EXISTS "+ TABELA + "(" + 
                    "id INT PRIMARY_KEY NOT NULL,"+
                    "name VARCHAR(45),"+
                    "price REAL,"+
                    "count INT);";
            
            stmt.executeUpdate(sql);
            stmt.close();
            conexao.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean InsertItem(Item item){
        //Faz conexão como banco
        Connection conexao = null;
        //Aplica as queries 
        Statement stmt = null;
        
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:sqlite:mydb.db");
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();
            
            String sql = "INSERT INTO "+ TABELA + " VALUES(?, ?, ?, ?);";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, item.getId());
            ps.setString(2, item.getName());
            ps.setDouble(3, item.getPrice());
            ps.setInt(4, item.getCount());
            ps.executeUpdate();
            
            conexao.commit();
            conexao.close();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public ArrayList<Item> GetAll(){
        ArrayList<Item> items = new ArrayList<>();
        //Faz conexão como banco
        Connection conexao = null;
        //Aplica as queries 
        Statement stmt = null;
        
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:sqlite:mydb.db");
          
            stmt = conexao.createStatement();
            
            String sql = "SELECT * FROM "+ TABELA + ";";
            //Tabela de resposta com os dados do banco - retorno da query
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                int count = rs.getInt("count");
                double price = rs.getDouble("price");
                String name = rs.getString("name");
                items.add(new Item(id, count, name, price));
                
            }
            rs.close();
            conexao.commit();
            conexao.close();
     
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        } 
        return items;
    }
}
