
package contatos;


import java.util.Iterator;
import java.util.LinkedList;


public class ListaDeContatos {
    private String nome;
    private String telefone;
    private String email;
    
    private final LinkedList<Contato> listacontatos = new LinkedList<Contato>();
    
    
    public void setContatos(String nome, String telefone, String email){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        Contato contato = new Contato(this.nome, this.telefone, this.email);
        listacontatos.add(contato);
    }
    
    public void getContatos(){
        Iterator<Contato> i = listacontatos.iterator();
        Contato c;
        while (i.hasNext()) {
            c = i.next();
            System.out.println(c.getNome());
            System.out.println(c.getEmail());
            System.out.println(c.getTel());

        }
    }
    
    
    
    
    
    
}
