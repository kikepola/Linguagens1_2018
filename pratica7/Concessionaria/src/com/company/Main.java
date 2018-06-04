package com.company;

public class Main {

    public static void main(String[] args) {
	    Vendedor v1 = new Vendedor("Henrique", 4701923, 300);
        Gerente g1 = new Gerente("Teste", 4701923, 800);
        g1.darAumento(400);
	    v1.fazerVenda(400);
        v1.calcComissao();
        System.out.println(v1.getComissao());
	    v1.fazerVenda(800);
	    v1.calcComissao();
        System.out.println(v1.getComissao());
	    v1.calcSalMes();
        System.out.println(v1.getSalMes());

    }
}
