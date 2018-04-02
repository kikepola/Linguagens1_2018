
package testeentrada;

import java.util.Scanner;

public class TesteEntrada {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int a =  entrada.nextInt();
        
        System.out.println("idade informada: " + a);
    }
    
}
