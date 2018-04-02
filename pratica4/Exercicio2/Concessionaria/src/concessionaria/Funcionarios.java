
package concessionaria;

public class Funcionarios {
    private double comissao;
    private double salarioBase;
    private double salarioMes;
    private static double vendas;
    private static int numFunc;
    
    
    public Funcionarios(int numFunc, double salarioBase){
        this.salarioBase = salarioBase;
        Funcionarios.numFunc = numFunc;
    }
    public int getNumFunc(){
        
        return Funcionarios.numFunc;
    }
    public void realizarVenda(double vendas){
        
        Funcionarios.vendas = Funcionarios.vendas + vendas;
}
    public double getComissao(){
        
        this.comissao = (Funcionarios.vendas * 0.05)/Funcionarios.numFunc;
        return this.comissao;
}
    public double getSalBase(){
        
        return this.salarioBase;
}
    public double getSalMes(){
        this.comissao = (Funcionarios.vendas * 0.05)/Funcionarios.numFunc;
        this.salarioMes = this.salarioBase + comissao;
        return this.salarioMes;
    }
    
}
