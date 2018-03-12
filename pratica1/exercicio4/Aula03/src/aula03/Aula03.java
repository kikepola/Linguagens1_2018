/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import java.util.Scanner;

/**
 *
 * @author kikepola
 */
public class Aula03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        int q;
        System.out.println("Digite um valor: ");
        q = leitor.nextInt();
        int w;
        System.out.println("Digite outro valor: ");
        w = leitor.nextInt();
        int i = 0;
        for(i=0; i<10 ; i++){
            w = w + q;
            System.out.println(w);
        }
    }
    
}
