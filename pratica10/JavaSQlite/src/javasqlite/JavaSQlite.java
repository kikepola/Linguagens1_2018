/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasqlite;

import java.util.ArrayList;


/**
 *
 * @author henriquepoladian
 */
public class JavaSQlite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ItemDAO itemDAO = new ItemDAO();
        if(itemDAO.CreateTable()) System.out.println("Tabela Criada");
        else System.out.println("Algo de errado aconteceu!");
        
        Item item = new Item(1, 23, "Teste", 50);
        itemDAO.InsertItem(item);
        
        ArrayList<Item> items = itemDAO.GetAll();
        System.out.println(items);
    }
        
}
