/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudoerros;

/**
 *
 * @author 16.00026-9
 */
public class EstudoErros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Chamada na Main:");
        metodo1();
        System.out.println("Fim da Main");
    }

    static void metodo1() {
        System.out.println("Chamada Metodo 1:");
        try{
            metodo2();
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Deu ruim");
        }
        System.out.println("Fim do Metodo 1");
    }

    private static void metodo2() {
        System.out.println("Chamada na Metodo 2:");
        int [] array = new int[10];
        try{
            for(int i = 0; i < 15; i++){
                array[i] = i;
                System.out.println(""+ i);
            }
        }
        catch(Exception e){
            System.out.println("Deu Ruim 2");
        }
        System.out.println("Fim do Metodo 2");
    }
    
}
