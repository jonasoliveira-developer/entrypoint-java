
package com.jonas.oliveira.appbookelandia.model;

import java.time.LocalDate;
import java.util.ArrayList;


public class Pedido {
    private int numeroDoPedido;
    private Cliente cliente;
    private FormaDePagamentoEnuns pagamento;
    private Boolean status;
    private LocalDate data;
    private String cupom;
    private double valorTotal;
    private ArrayList<ProdutoPedido> produto;
    
    public Pedido() {
        this.produto = new ArrayList<>();
        
    }
      public Pedido(int numeroDoPedido) {
       this.numeroDoPedido = numeroDoPedido;
       this.produto = new ArrayList<>();
        
    }
      
      public void adicionaProduto(Produto p, int quantidade) {
          ProdutoPedido produtoPedido = new ProdutoPedido(quantidade, p);
          this.produto.add(produtoPedido);
        
    }
      
      public double calcValorTotal(){
          double valotTotal = 0.0;
          for(ProdutoPedido pp: this.produto) {
              Produto p = pp.getProduto();
              int quantidade = pp.getQuantitade();
              valorTotal = valorTotal + (p.getPreco()* quantidade);           
                     
          }
          return valotTotal;
      }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public FormaDePagamentoEnuns getPagamento() {
        return pagamento;
    }

    public void setPagamento(FormaDePagamentoEnuns pagamento) {
        this.pagamento = pagamento;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getCupom() {
        return cupom;
    }

    public void setCupom(String cupom) {
        this.cupom = cupom;
    }


     
      
}
