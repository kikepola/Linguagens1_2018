/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosqlite;

import java.util.ArrayList;

/**
 *
 * @author henriquepoladian
 */
public class ExercicioSQLite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        animalDAO animalDAO = new animalDAO();
        if(animalDAO.CreateTable()) System.out.println("Tabela Criada");
        else System.out.println("Algo de errado aconteceu!");
        
        animal ani = new animal(1, "Leão", 1.000, 2.333, 0.8, 200, "Mamifero");
        animalDAO.InsertItem(ani);
        ani = new animal(2, "Elefante", 1.500, 2.000, 2.5, 1000, "Mamifero");
        animalDAO.InsertItem(ani);
        
        ArrayList<animal> anim = animalDAO.GetAll();
        System.out.println(anim);
            
    }    
}
