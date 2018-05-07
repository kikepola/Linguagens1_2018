
package concessionaria;

import java.util.Scanner;

public class Concessionaria {

    public static void main(String[] args) {
        
        int salBase = 3000;
        
        Funcionario f1 = new Funcionario(salBase, "Nome1");
        f1.calcularBonusExtra(100000, 5);
        System.out.println("Valor do bonus extra: ");
        System.out.println(f1.getBonusExtra());
    
        Gerente g1 = new Gerente(salBase, "Nome1");
        g1.ralizarVedas(30000);
        g1.calcularComissao();
        System.out.println("Comissao do gerente: ");
        System.out.println(g1.getComissao());
        g1.calculaSalario();
        System.out.println("Salario do gerente: ");
        System.out.println(g1.getSalario());
        
        Vendedor v1 = new Vendedor((salBase/2), "Nome Vendedor");
        v1.realizarVedas(50000);
        v1.realizarVedas(40000);
        v1.calcularComissao();
        System.out.println("Comissao do vendedor: ");
        System.out.println(v1.getComissao());
        v1.calcularSalariototal();
        System.out.println("Salario do vendedor: ");
        System.out.println(v1.getsalrio());
        
                
        
        
        
        
       
       
        
        
    }
    
}
