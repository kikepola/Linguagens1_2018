/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package contatos;

/**
 *
 * @author 16.00026-9
 */
public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private String facebook;
    private String instagram;
    private String foto;
    private String geo;
    
    //Construtor
    public Contato(String nome){
        this.nome = nome;
    }
    
    public String toString(){
        String retorno;
        retorno = nome + '\n';
        retorno += "Tel.:"+ this.telefone + "   " +  "Email :" + this.email;
        return retorno;
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

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the facebook
     */
    public String getFacebook() {
        return facebook;
    }

    /**
     * @param facebook the facebook to set
     */
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    /**
     * @return the instagram
     */
    public String getInstagram() {
        return instagram;
    }

    /**
     * @param instagram the instagram to set
     */
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    /**
     * @return the geo
     */
    public String getGeo() {
        return geo;
    }

    /**
     * @param geo the geo to set
     */
    public void setGeo(String geo) {
        this.geo = geo;
    }
    
}
