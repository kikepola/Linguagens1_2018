
package concessionaria;

public class Gerente extends Funcionario {
    
    private double comissao;
    private double valorVendas;
    private double salarioTotal;
    
    public Gerente(double salarioBase, String nome) {
        super(salarioBase, nome);
    }
    
    public void ralizarVedas(int valorVendas){
        this.valorVendas = this.valorVendas + valorVendas;
    }
    
    public void calcularComissao(){
        this.comissao = (this.valorVendas * 0.1 ) + (0.5 * this.salarioBase) + Funcionario.bonusExtra;
    }
    
    public double getComissao(){
        return this.comissao;
    }
    
    public void calculaSalario(){
        this.salarioTotal = this.comissao + this.salarioBase;
    }
    
    public double getSalario(){
        return this.salarioTotal;
    } 
    
    
}
