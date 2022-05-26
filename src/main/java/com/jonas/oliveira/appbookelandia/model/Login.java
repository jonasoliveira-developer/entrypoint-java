
package com.jonas.oliveira.appbookelandia.model;


public class Login {
    private String email;
    private String senha;
    private NivelDeAcessoEnuns nivelDeAcesso;

    public Login(String email, String senha, NivelDeAcessoEnuns nivelDeAcesso) {
        this.email = email;
        this.senha = senha;
        this.nivelDeAcesso = nivelDeAcesso.Cliente;
    }
    
    
  
    
    
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getSenha() {
        return this.senha;
    }
    
    public NivelDeAcessoEnuns getNivelDeAcesso() {
        return this.nivelDeAcesso;
    }
}
