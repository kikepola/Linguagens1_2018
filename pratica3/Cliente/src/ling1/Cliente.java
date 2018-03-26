
package ling1;

public class Cliente {
    
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;
    
    
    public void mudarCPF(String cpf){
        if(validarCPF(cpf)) {
            this.cpf = cpf;
            System.out.println("CPF alterado");
        }
        else{
            System.out.println("Não foi possivel alterar o Cpf");
        }
    }
    
    private boolean validarCPF(String cpf){
        if (cpf.equals("00000000000") || cpf.equals("11111111111") ||
        cpf.equals("22222222222") || cpf.equals("33333333333") ||
        cpf.equals("44444444444") || cpf.equals("55555555555") ||
        cpf.equals("66666666666") || cpf.equals("77777777777") ||
        cpf.equals("88888888888") || cpf.equals("99999999999") ||
       (cpf.length() != 11)){
  
        return false;
    }
        else{
            return true;
        }
    }
    
    public Cliente(String nome, String endereco, String cpf, int idade){
        this.nome = nome; 
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getCpf(){
        return this.cpf;
    }
    public int getIdade(){
        return this.idade;
    }
}
    
    

