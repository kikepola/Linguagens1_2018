
package concessionaria;

public class Funcionario {
    
    private String nome;
    protected static double bonusExtra;
    protected double salarioBase;
    
    public Funcionario(double salarioBase, String nome){
        
        this.nome = nome;
        this.salarioBase = salarioBase;
        
    }
    
    public static void calcularBonusExtra(double vendasTotais, double nFuncionarios){
        
        Funcionario.bonusExtra = (vendasTotais * 0.05)/nFuncionarios;           
        
    }
   
    public double getBonusExtra(){
        return Funcionario.bonusExtra;
    }  
   
} 
    
    
