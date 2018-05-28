
package contatos;


public class Contato {
    private final String nome;
    private final String telefone;
    private final String email;
    
    public Contato(String nome, String telefone, String email){
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
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
    
}
