
package contatos;


public class Contatos {

    
    public static void main(String[] args) {
        
       ListaDeContatos l1 = new ListaDeContatos();
       
       l1.setContatos("teste1", "12345678", "qwe@gmail.com");
       l1.setContatos("teste2", "87654321", "asd@gmail.com");
       
       
       l1.getContatos();
                   
    }
    
}
