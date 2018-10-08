
package tratamentoexecao;


public class TratamentoExecao {


    public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fim main");
    }
    
    static void metodo1(){
        System.out.println("Inicio metodo1");
        try{
            metodo2();
        }catch(Exception e){
            System.out.println("Tratamento de erro metodo 1: " + e);
        }
        System.out.println("Fim metodo1");
    }
    
    static void metodo2() throws ArrayIndexOutOfBoundsException{
        System.out.println("Inicio metodo2");
        int[] array = new int[10];
        try{
            for(int i = 0; i <= 15; i++){
                array[i] = i;
                System.out.println(i);
            }
        }catch(Exception e){
            System.out.println("Tratamento de erro metodo 2: " + e);
            throw (e);
        }
        System.out.println("Fim metodo2");
    }
    
}
