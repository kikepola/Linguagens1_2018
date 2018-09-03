/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosqlite;

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
public class animalDAO {
    private final String TABELA = "animais";
    
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
                    "nome VARCHAR(45),"+
                    "lat REAL,"+
                    "lon REAL,"+
                    "altura REAL,"+
                    "peso REAL,"+
                    "tipo VARCHAR(45));";
            
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
    
    public boolean InsertItem(animal animal){
        //Faz conexão como banco
        Connection conexao = null;
        //Aplica as queries 
        Statement stmt = null;
        
        try{
            //Estabelece a conexão com o banco usando o driver
            conexao = DriverManager.getConnection("jdbc:sqlite:mydb.db");
            conexao.setAutoCommit(false);
            stmt = conexao.createStatement();
            
            String sql = "INSERT INTO "+ TABELA + " VALUES(?, ?, ?, ?, ?, ?, ?);";
            
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1, animal.getId());
            ps.setString(2, animal.getNome());
            ps.setDouble(3, animal.getLat());
            ps.setDouble(4, animal.getLon());
            ps.setDouble(5, animal.getAltura());
            ps.setDouble(6, animal.getPeso());
            ps.setString(7, animal.getTipo());
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
    
    public ArrayList<animal> GetAll(){
        ArrayList<animal> items = new ArrayList<>();
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
                String nome = rs.getString("nome");
                double lat = rs.getDouble("lat");
                double lon = rs.getDouble("lon");
                double altura = rs.getDouble("altura");
                double peso = rs.getDouble("peso");
                String tipo = rs.getString("tipo");

                items.add(new animal(id, nome, lat, lon, altura, peso, tipo));
                
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
