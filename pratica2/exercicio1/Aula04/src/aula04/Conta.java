/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

public class Conta {
    
    String numeroConta; 
    String titular;
    String cpf;
    float saldo;
   
    
    boolean  vizualizarSaldo(){
        if(this.saldo< 0){
            System.out.println("Valor negativo");
            return false;
        }
        else{
            System.out.println("Saldo: " + this.saldo);
            return true;
        }
    }
    void  depositar(double valor){
        
        this.saldo = (float) (this.saldo + valor);
        
    }
    boolean  sacar(double valor){
        
        if(this.saldo<valor){
            return false;
        }
        else{
           
            this.saldo = (float) (this.saldo - valor);
            return true;
        }
        
    }
    boolean  trasferir(Conta destinatario, double valor){
        if(this.sacar(valor)){
            destinatario.depositar(valor);
              return true;
        }
        else{
            
            return false;
        }
    }
    
}
