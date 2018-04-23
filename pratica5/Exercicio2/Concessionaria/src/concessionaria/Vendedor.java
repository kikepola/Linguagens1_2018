
package concessionaria;

public class Vendedor extends Funcionario {
    
    private double comissao;
    private double valorVendas;
    private double salarioTotal;
    
    public Vendedor(double salarioBase, String nome) {
        super(salarioBase, nome);
    }
    
    public void ralizarVedas(int valorVendas){
        this.valorVendas = this.valorVendas + valorVendas;
    }
    
    public void calcularComissao(){
        this.comissao = (this.valorVendas * 0.02 ) + Funcionario.bonusExtra;
    }
    
    public double getComissao(){
        return this.comissao;
    }
    
    public void calcularSalariototal(){
        this.salarioTotal = this.comissao + this.salarioBase;
    }
    
    public double getsalrio(){
        return this.salarioTotal;
    }
    
    
   
    
    
}
