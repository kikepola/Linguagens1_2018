
package contatos;


public class Contato {
    private final String nome;
    private final String telefone;
    private final String email;
    private final totalContatos;
    
    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.totalContatos = this.totalContatos + 1;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getTel(){
        return this.telefone;
    }

    public int getTotalContatos(){return totalContatos;}
    
}
