/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package botasperdidas;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kikepola
 */
public class BotasPerdidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Map> botas = new HashMap<String, Map>();
        String [] entradas = {"38 E", "39 E", "40 D", "38 D", "40 D", "37 E"};
        int N = 6;
        for (int i = 0; i < N; i++) {
            String[] dados = entradas[i].split(" ");
            if(botas.containsKey(dados[0])){
                Map<String, Integer> pe = botas.get(dados[0]);
                int x = pe.get(dados[1]);
                x++;
                pe.put(dados[1], x);
            }else{
                Map<String, Integer> par = new HashMap<String, Integer>();
                par.put("E", 0);
                par.put("D", 0);
                par.put(dados[1], 1);
                botas.put(dados[0], par);
            }
               
        }
        System.out.println(botas);
    }
}
        
