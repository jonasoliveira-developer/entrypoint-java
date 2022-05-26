
package com.jonas.oliveira.appbookelandia.model;

class CategoriaDeProdutos {
    private Integer codigo;
    private String nome;
    private String descricao;
    
    
    
    public CategoriaDeProdutos (Integer codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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
    
  
}
