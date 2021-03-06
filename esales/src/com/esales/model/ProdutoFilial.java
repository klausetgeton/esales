package com.esales.model;
// Generated Nov 9, 2015 8:59:29 PM by Hibernate Tools 4.3.1



/**
 * ProdutoFilial generated by hbm2java
 */
public class ProdutoFilial  implements java.io.Serializable {


     private ProdutoFilialId id;
     private Filial filial;
     private Produto produto;
     private String quantidade;

    public ProdutoFilial() {
    }

	
    public ProdutoFilial(ProdutoFilialId id, Filial filial, Produto produto) {
        this.id = id;
        this.filial = filial;
        this.produto = produto;
    }
    public ProdutoFilial(ProdutoFilialId id, Filial filial, Produto produto, String quantidade) {
       this.id = id;
       this.filial = filial;
       this.produto = produto;
       this.quantidade = quantidade;
    }
   
    public ProdutoFilialId getId() {
        return this.id;
    }
    
    public void setId(ProdutoFilialId id) {
        this.id = id;
    }
    public Filial getFilial() {
        return this.filial;
    }
    
    public void setFilial(Filial filial) {
        this.filial = filial;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public String getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }




}


