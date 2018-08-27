/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapas;

import java.util.Comparator;

/**
 *
 * @author kikepola
 */
public class Dados implements Comparator, Comparable{
    private int id;
    private String nome;

    public Dados(int id, String nome) {
        this.setId(id);
        this.setNome(nome);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "ID:" + getId() + " Nome:" + getNome();
    }
    
    @Override
    public int compare(Object o1, Object o2) {
        Dados d1 = (Dados) o1;
        Dados d2 = (Dados) o2;
        if(d1.getId() > d2.getId()){
            return -1;
        }
        else if(d1.getId() == d2.getId()){
            return 0;
        }
        else{
            return 1;
        }
    }

    @Override
    public int compareTo(Object o) {
        return compare(this, o);
    }
}
