/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosqlite;

/**
 *
 * @author henriquepoladian
 */
public class animal {
    private String nome;
    private double lat;
    private double lon;
    private double altura;
    private double peso;
    private String tipo;
    private int id;
    
    public animal(int id, String nome, double lat, double lon, double altura, double peso, String tipo){
        setNome(nome);
        setLat(lat);
        setLon(lon);
        setAltura(altura);
        setPeso(peso);
        setTipo(tipo);
        setId(id);
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString(){
        String retorno = "Name: "+getNome()+ " " +"Tipo: " + getTipo();
        retorno += "\nLatitude: "+ getLat()+ " " + "Longitude: "+ getLon();
        retorno += "\nPeso: "+ getPeso()+ " " + "Altura: "+ getAltura();
        return retorno;
    } 

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the lat
     */
    public double getLat() {
        return lat;
    }

    /**
     * @param lat the lat to set
     */
    public void setLat(double lat) {
        this.lat = lat;
    }

    /**
     * @return the lon
     */
    public double getLon() {
        return lon;
    }

    /**
     * @param lon the lon to set
     */
    public void setLon(double lon) {
        this.lon = lon;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }
    
}
