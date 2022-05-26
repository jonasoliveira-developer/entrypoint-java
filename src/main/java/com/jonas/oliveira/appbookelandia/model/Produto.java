
package com.jonas.oliveira.appbookelandia.model;


public class Produto {
    private Integer codigoDoProduto;
    private Integer codigoDaCategoria;
    private String nome;
    private String descricao;
    private double preco;

    public Produto( Integer codigoDaCategoria, String nome, String descricao, double preco) {
        this.codigoDaCategoria = codigoDaCategoria;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Integer getCodigoDoProduto() {
        return codigoDoProduto;
    }

    public void setCodigoDoProduto(Integer codigoDoProduto) {
        this.codigoDoProduto = codigoDoProduto;
    }

    public Integer getCodigoDaCategoria() {
        return codigoDaCategoria;
    }

    public void setCodigoDaCategoria(Integer codigoDaCategoria) {
        this.codigoDaCategoria = codigoDaCategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
   
    
    
    
    
    
}
