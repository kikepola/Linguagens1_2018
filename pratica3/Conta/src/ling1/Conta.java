
package ling1;


public class Conta {
    private String numero;
    private double saldo;
   
   
    
    public boolean  vizualizarSaldo(){
        if(this.saldo< 0){
            System.out.println("Valor negativo");
            return false;
        }
        else{
            System.out.println("Saldo: " + this.saldo);
            return true;
        }
    }
    public void  depositar(double valor){
        
        this.saldo = (float) (this.saldo + valor);
        
    }
    public boolean  sacar(double valor){
        
        if(this.saldo<valor){
            return false;
        }
        else{
           
            this.saldo = (float) (this.saldo - valor);
            return true;
        }
        
    }
    public boolean  trasferir(Conta destinatario, double valor){
        if(this.sacar(valor)){
            destinatario.depositar(valor);
              return true;
        }
        else{
            
            return false;
        }
    }
    
    public Conta(String nConta, double saldo){
        this.saldo = saldo;
        this.numero = nConta;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    public String getNumeroConta(){
        return this.numero;
    }
    
}
