
package concessionaria;
import java.util.Scanner;
public class Concessionaria {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
        Funcionarios func = new Funcionarios(4, 200);
        
        System.out.println("Sair = 0 ");
        System.out.println("Vizualizar numero de funcionarios = 1 ");
        System.out.println("Adicionar venda = 2 ");
        System.out.println("Vizualizar comissão = 3 ");
        System.out.println("Vizualizar salario base = 4 ");
        System.out.println("Vizualizar salario mensal = 5 ");
        
        System.out.println("Digite a opção:  ");
        int n = scan.nextInt();
        
        while(n != 0){
        switch(n){
            case 1:            
                System.out.println("Quantiedade de Funcionarios: ");
                System.out.println(func.getNumFunc());
                
                System.out.println("Digite a opção:  ");
                n = scan.nextInt();
                break;
                
            case 2:
                System.out.println("Quantiedade de vendas(R$): ");
                double vend = scan.nextDouble();
                func.realizarVenda(vend);
                
                System.out.println("Digite a opção:  ");
                n = scan.nextInt();
                break;
            case 3:
                System.out.println("Comissao: " + func.getComissao());
                
                System.out.println("Digite a opção:  ");
                n = scan.nextInt();
                break;
            case 4:
                
                System.out.println("Quantiedade do salaro base: ");
                System.out.println(func.getSalBase());
                
                
                System.out.println("Digite a opção:  ");
                n = scan.nextInt();
                break;
            case 5:
                System.out.println("Salario total: " + func.getSalMes());
                
                System.out.println("Digite a opção:  ");
                n = scan.nextInt();
                break;
            default:
                System.out.println("Digite uma opção valida:  ");
                n = scan.nextInt();
                break;
                
            }
        }
    }
}
