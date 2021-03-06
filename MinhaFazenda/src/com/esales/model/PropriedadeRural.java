package com.esales.model;
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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * PropriedadeRural generated by hbm2java
 */
@Entity
@Table(name="propriedade_rural"
    ,catalog="fazenda"
)
public class PropriedadeRural  implements java.io.Serializable {


     private Integer id;
     private Cidade cidade;
     private String descricao;
     private String endereco;
     private Integer tamanho;
     private String cep;
     private Set usuarios = new HashSet(0);
     private Set animals = new HashSet(0);

    public PropriedadeRural() {
    }

	
    public PropriedadeRural(Cidade cidade, String descricao) {
        this.cidade = cidade;
        this.descricao = descricao;
    }
    public PropriedadeRural(Cidade cidade, String descricao, String endereco, Integer tamanho, String cep, Set usuarios, Set animals) {
       this.cidade = cidade;
       this.descricao = descricao;
       this.endereco = endereco;
       this.tamanho = tamanho;
       this.cep = cep;
       this.usuarios = usuarios;
       this.animals = animals;
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
    @JoinColumn(name="cidades_id", nullable=false)
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    
    @Column(name="descricao", nullable=false, length=100)
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Column(name="endereco", length=100)
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    @Column(name="tamanho")
    public Integer getTamanho() {
        return this.tamanho;
    }
    
    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    
    @Column(name="cep", length=9)
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="usuario_propriedade_rural", catalog="fazenda", joinColumns = { 
        @JoinColumn(name="id_propriedade_rural", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="id_usuario", nullable=false, updatable=false) })
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="propriedadeRural")
    public Set getAnimals() {
        return this.animals;
    }
    
    public void setAnimals(Set animals) {
        this.animals = animals;
    }




}


