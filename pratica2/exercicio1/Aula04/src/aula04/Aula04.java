
package aula04;

import java.util.Scanner;

public class Aula04 {
       
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);  
        
        
        int i;
        float x;
        
        Cliente cliente1 =new Cliente();
        cliente1.numeroConta = "12345";
        cliente1.nome = "Henrique";
        cliente1.sobrenome = "Poladian";
        cliente1.cpf = "47018295874";
        
        Conta c1 = new Conta();
        c1.numero = Integer.parseInt(cliente1.numeroConta);
        //declara titular
        
        
        
        
        
        
        Conta c2 = new Conta();
        
        
        
        //recebe valor de c1
        System.out.println("c1 - R$: ");
        c1.saldo = scanner.nextFloat();
        
        //recebe valor de c1
        System.out.println("c2 - R$: ");
        c2.saldo = scanner.nextFloat();
        
        //mostrar opções 
        System.out.println("Sair = 0 ");
        System.out.println("Vizualizar Saldo = 1 ");
        System.out.println("Depositar = 2 ");
        System.out.println("Sacar = 3 ");
        System.out.println("Trasferir = 4 ");
        
        //valor de opção
        System.out.println("Digite a opção:  ");
        i = scanner.nextInt();
        
        while(i != 0){
            
            switch (i) {
                case 1:
                    //mostrar saldo c1
                    c1.vizualizarSaldo();
                    //valor de opção
                    System.out.println("Digite a opção:  ");
                    i = scanner.nextInt();
                    break;
                case 2:
                    //recebe valor a ser depositado
                    System.out.println("Valor a depositar:  ");
                    x = scanner.nextFloat();
                    //efetua deposito
                    c1.depositar(x);
                    //mostrar saldo c1
                    c1.vizualizarSaldo();
                    //valor de opção
                    System.out.println("Digite a opção:  ");
                    i = scanner.nextInt();
                    break;
                case 3:
                    //recebe valor a ser sacado
                    System.out.println("Valor a sacar:  ");
                    x = scanner.nextFloat();
                    //efetua saque
                    c1.sacar(x);
                    c1.vizualizarSaldo();
                    //valor de opção
                    System.out.println("Digite a opção:  ");
                    i = scanner.nextInt();
                    break;
                case 4:
                    //efetua trasferencia
                    System.out.println("Valor a trasferir:  ");
                    x = scanner.nextFloat();
                    c1.trasferir(c2, x);
                    //mostrar saldo c1
                    System.out.println("c1 - R$: ");
                    c1.vizualizarSaldo();
                    //mostrar saldo c2
                    System.out.println("c2 - R$: ");
                    c2.vizualizarSaldo();
                    //valor de opção
                    System.out.println("Digite a opção:  ");
                    i = scanner.nextInt();
                    break;
                default:
                    break;
            }
        }
        
        
        
        
  
        
      
        
        
        
        
        
        
                
    }
    
}
