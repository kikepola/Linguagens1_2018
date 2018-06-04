package com.company;

public class Vendedor extends Funcionarios implements Vender{
    private double comissao;
    private double salMes;
    private double precoVenda;

    public Vendedor(String name, int cpf, double salBase){
        this.setName(name);
        this.setCpf(cpf);
        this.setSlario(salBase);
    }
    public void fazerVenda(double precoVenda){
        this.precoVenda = this.precoVenda + precoVenda;
    }

    public void calcComissao(){
        this.comissao = (0.05 * this.precoVenda) +  this.comissao;
        this.precoVenda = 0;
    }

    public double getComissao(){
        return this.comissao;
    }

    public void calcSalMes(){
        this.salMes = this.comissao + this.getSalBase();
    }

    public double getSalMes(){
        return this.salMes;
    }

}
