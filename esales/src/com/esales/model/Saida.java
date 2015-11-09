package com.esales.model;
// Generated Nov 9, 2015 8:59:29 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Saida generated by hbm2java
 */
public class Saida  implements java.io.Serializable {


     private int id;
     private Caixa caixa;
     private Date data;
     private String valor;
     private Set compras = new HashSet(0);

    public Saida() {
    }

	
    public Saida(int id, Caixa caixa) {
        this.id = id;
        this.caixa = caixa;
    }
    public Saida(int id, Caixa caixa, Date data, String valor, Set compras) {
       this.id = id;
       this.caixa = caixa;
       this.data = data;
       this.valor = valor;
       this.compras = compras;
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
    public Set getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set compras) {
        this.compras = compras;
    }




}


