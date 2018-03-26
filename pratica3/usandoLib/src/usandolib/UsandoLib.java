
package usandolib;
import java.util.Scanner;
import ling1.Conta;
import ling1.Cliente;


public class UsandoLib {

    public static void main(String[] args) {
          
        Scanner scanner = new Scanner(System.in);  
        
        
        int i;
        float x;
        String numero, numero2;
        double saldo, saldo2;
        

        
        numero = "12345";
        String nome1 = "Henrique";
        String sobrenome1 = "Poladian";
        String cpf1 = "47018295874";
        String end1 = "R Balanca";
        int idade = 20;
        
        numero2 = "12345";
        String nome2 = "Poladian";
        String sobrenome2 = "Henrique";
        String cpf2 = "4345345374";
          
        
        //recebe valor de c1
        System.out.println("c1 - R$: ");
        saldo = scanner.nextFloat();     
        Conta c1 = new Conta(numero, saldo);
        Cliente cl1 = new Cliente(nome1, end1, cpf1, idade);
        //recebe valor de c1
        System.out.println("c2 - R$: ");
        saldo2 = scanner.nextFloat();
        Conta c2 = new Conta(numero2, saldo2);
        //mostrar opções 
        System.out.println("Sair = 0 ");
        System.out.println("Vizualizar Saldo = 1 ");
        System.out.println("Depositar = 2 ");
        System.out.println("Sacar = 3 ");
        System.out.println("Trasferir = 4 ");
        System.out.println("Informações do Cliente = 5 ");
        
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
                case 5:    
                    
                    System.out.println("CPF: ");
                    System.out.println(cl1.getCpf());
                    
                    System.out.println("Nome: ");
                    System.out.println(cl1.getNome());
                    
                    System.out.println("Endereço: ");
                    System.out.println(cl1.getEndereco());
                    
                    System.out.println("Idade: ");
                    System.out.println(cl1.getIdade());  
                    
                    break;
                    
                default:
                    break;
            }
        
        }
    }
}
    
    

