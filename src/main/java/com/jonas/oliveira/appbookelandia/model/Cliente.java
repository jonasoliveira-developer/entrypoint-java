
package com.jonas.oliveira.appbookelandia.model;

import java.time.LocalDate;

public class Cliente {
    private String cpf;
    private String nome;
    private String telefone;
    private String endereco;
    private LocalDate dataDeCadastro;

    public Cliente(String cpf, String nome, String telefone, String endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        
        this.dataDeCadastro = LocalDate.now();
    }
    
  
       
    
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String  getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public LocalDate getDataDeCadastro(){
        return this.dataDeCadastro;
    }
    
    public void setDataDeCadastro(LocalDate dataDeCadastro){
        this.dataDeCadastro =  dataDeCadastro;
    }
}
