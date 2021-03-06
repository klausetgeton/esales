package com.esales.model;
// Generated Nov 9, 2015 8:59:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Entrada generated by hbm2java
 */
public class Entrada  implements java.io.Serializable {


     private int id;
     private Caixa caixa;
     private Date data;
     private String valor;
     private Set vendas = new HashSet(0);

    public Entrada() {
    }

	
    public Entrada(int id, Caixa caixa) {
        this.id = id;
        this.caixa = caixa;
    }
    public Entrada(int id, Caixa caixa, Date data, String valor, Set vendas) {
       this.id = id;
       this.caixa = caixa;
       this.data = data;
       this.valor = valor;
       this.vendas = vendas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Caixa getCaixa() {
        return this.caixa;
    }
    
    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }
    public Date getData() {
        return this.data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    public String getValor() {
        return this.valor;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Set getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set vendas) {
        this.vendas = vendas;
    }




}


