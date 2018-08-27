/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kikepola
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Dados> map = new HashMap<String, Dados>();
        map.put("aqui", new Dados(1, "Aqui"));
        map.put("bunda", new Dados(10, "Bunda"));
        map.put("aqui", new Dados(5, "Goku"));
        
        //System.out.println("Map:");
        //System.out.println(map);
        
        for(String chave : map.keySet()){
            Dados d = map.get(chave);
            System.out.println("Chave:" + chave);
            System.out.println("Valor:" + d + "\n");
        }
    }
    
}
