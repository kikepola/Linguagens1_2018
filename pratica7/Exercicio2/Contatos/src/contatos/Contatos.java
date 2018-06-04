
package contatos;

import java.util.Scanner;


public class Contatos {

    
    public static void main(String[] args) {
        
       ListaDeContatos l1 = new ListaDeContatos();
       Scanner sc = new Scanner(System.in); 
       
       System.out.println("Digite 1 para adicionar contato ");
       System.out.println("Digite 2 para adicionar ver lista de contato ");
       System.out.println("Digite 3 para deletar contato ");
       
       System.out.println("Digite uma opção: ");
       int entrada = sc.nextInt();
       while(entrada != 0){
            switch(entrada){
                 case 1:
                     System.out.println("Digite o nome: ");
                     String nome = sc.next();
                     System.out.println("Digite o telefone: ");
                     String telefone = sc.next();
                     System.out.println("Digite o email: ");
                     String email = sc.next();
                     
                     l1.setContatos(nome, telefone, email);
                     
                     System.out.println("Digite uma opção: ");
                     entrada = sc.nextInt();
                     break;
                 case 2:
                     l1.getContatos();
                     
                     System.out.println("Digite uma opção: ");
                     entrada = sc.nextInt();
                     break;
                 case 3:
                     System.out.println("Digite o nome do contato a ser deletado: ");
                     String deletarNome = sc.next();
                
                     l1.deleteContato(deletarNome);
                     
                     System.out.println("Digite uma opção: ");
                     entrada = sc.nextInt();
                     break;
                 case 4:
                     System.out.println("Digite o nome do contato a ser procurado: ");
                     String nomeProcurar = sc.next();
                
                     l1.selecByName("teste");
                     
                     System.out.println("Digite uma opção: ");
                     entrada = sc.nextInt();
                     break;
                case 5:
                    System.out.println(l1.getTotalContatos());
                    break;
                 default:
                     System.out.println("FIM!");
                     entrada = 0;
            }
        }
    }
}
                      
    
    

