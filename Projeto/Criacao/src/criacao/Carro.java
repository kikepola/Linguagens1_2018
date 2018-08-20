/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criacao;

/**
 *
 * @author 16.00026-9
 */
public class Carro {
    private String modelo;
    private String marca;
    private String placa;
    private String ano;
    private String origem;
    
    //Constructor
    public Carro(String modelo){
        this.modelo = modelo;
    }
    
    public String toString(){
        String retorno;
        retorno = modelo + '\n';
        retorno += "Marca:" + this.marca + "\n" + "Placa:" + this.placa + "\n" + "Ano:" + this.ano + "\n" + "Origem:" + this.origem;
        return retorno;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setOrigem(String origem){
        this.origem = origem;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    
    public void setAno(String ano){
        this.ano = ano;
    }
    
    
}
