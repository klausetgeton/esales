package com.minhafazenda.model;
// Generated 18/08/2015 19:49:12 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Estado generated by hbm2java
 */
@Entity
@Table(name="estado"
    ,catalog="fazenda"
)
public class Estado  implements java.io.Serializable {


     private Integer id;
     private Pais pais;
     private String nome;
     private String sigla;
     private Set cidades = new HashSet(0);

    public Estado() {
    }

	
    public Estado(Pais pais, String nome) {
        this.pais = pais;
        this.nome = nome;
    }
    public Estado(Pais pais, String nome, String sigla, Set cidades) {
       this.pais = pais;
       this.nome = nome;
       this.sigla = sigla;
       this.cidades = cidades;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="pais_id", nullable=false)
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    
    @Column(name="nome", nullable=false, length=100)
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Column(name="sigla", length=2)
    public String getSigla() {
        return this.sigla;
    }
    
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estado")
    public Set getCidades() {
        return this.cidades;
    }
    
    public void setCidades(Set cidades) {
        this.cidades = cidades;
    }




}

