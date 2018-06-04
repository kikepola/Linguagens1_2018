package com.company;

public abstract class Funcionarios {
    private String name;
    private int cpf;
    private double salBase;

    public void setSlario(double salBase){
        this.salBase = salBase;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCpf(int cpf){
        this.cpf = cpf;
    }

    public String getName(){
        return this.name;
    }

    public int getCpf(){
        return this.cpf;
    }

    public double getSalBase(){
        return this.salBase;
    }












}
