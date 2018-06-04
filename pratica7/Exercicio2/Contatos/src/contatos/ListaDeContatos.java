
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
    
    public void deleteContato(String nome){
       Iterator<Contato> i = listacontatos.iterator();
        Contato c;
        int count = 0;
        while (i.hasNext()) {
            c = i.next();
            if(c.getNome().equals(nome)){
                listacontatos.remove(count);
            }
            count = count + 1;
        }
    }
    
    public void selecByName(String nome){
        Iterator<Contato> i = listacontatos.iterator();
        Contato c;
        while (i.hasNext()) {
            c = i.next();
            if(c.getNome().equals(nome)){
                System.out.println(c.getNome());
                System.out.println(c.getEmail());
                System.out.println(c.getTel());
            }
        }
    }
    
    public int getIndex(String nome){
        Iterator<Contato> i = listacontatos.iterator();
        Contato c;
        int q = 0;
        while (i.hasNext()) {
            c = i.next();
            if(c.getNome().equals(nome)){
                q = listacontatos.indexOf(c);
            }
        }
        return q;
    }

    public getTotalContatos(){
        Contato c;
        return c.getTotalContatos();
    }
    
}

    
    
    
    
    
    

