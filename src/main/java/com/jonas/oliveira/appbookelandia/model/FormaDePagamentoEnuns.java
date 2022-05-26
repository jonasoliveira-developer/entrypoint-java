
package com.jonas.oliveira.appbookelandia.model;


public enum FormaDePagamentoEnuns {
    Boleto("boleto"),
    Pix("pix"),
    CartaoDeCredito("cartão de crédito");
    
    private final String descricao;
    
    FormaDePagamentoEnuns(String descricao){
        this.descricao = descricao;
    }
    
    public String descricao(){
        return descricao;
    }
}
