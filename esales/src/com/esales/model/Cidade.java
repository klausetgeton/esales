package com.esales.model;
// Generated Nov 9, 2015 8:59:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cidade generated by hbm2java
 */
public class Cidade  implements java.io.Serializable {


     private int id;
     private String descricao;
     private Set pessoas = new HashSet(0);

    public Cidade() {
    }

	
    public Cidade(int id) {
        this.id = id;
    }
    public Cidade(int id, String descricao, Set pessoas) {
       this.id = id;
       this.descricao = descricao;
       this.pessoas = pessoas;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Set getPessoas() {
        return this.pessoas;
    }
    
    public void setPessoas(Set pessoas) {
        this.pessoas = pessoas;
    }




}


