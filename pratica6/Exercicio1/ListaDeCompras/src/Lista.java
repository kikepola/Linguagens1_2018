import java.util.*;
public class Lista {
    private  String iten;
    private List<String> listaItens = new ArrayList<String>(5);


    public void setIten(String iten) {
        this.iten = iten;
        if(listaItens.indexOf(iten) < 0) {
            listaItens.add(iten);
        }
        else {
            System.out.println("Iten já existe na lista");
        }
    }

    public List<String> getLista(){
        return listaItens;
    }

    public void removeIten(String iten){
        this.iten = iten;
        if(listaItens.indexOf(iten) >= 0) {
            listaItens.remove(iten);
        }
        else{
            System.out.println("Iten não encontrado na lista");
        }
    }

    public void modificarLista(String itenAtual, String itenDesejado){
        if(listaItens.indexOf(itenAtual) >= 0 && listaItens.indexOf(itenDesejado)<0){
            listaItens.add(itenDesejado);
            listaItens.remove(itenAtual);
        }
        else if(listaItens.indexOf(itenAtual)<0){
            System.out.println("Iten atual não encontrado");
        }
        else if(listaItens.indexOf(itenDesejado)>=0){
            System.out.println("Iten desejado já existe na lista");
        }
        else{
            System.out.println("Erro");
        }

    }








}
