package com.esales.model;
// Generated Nov 9, 2015 8:59:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Pessoa generated by hbm2java
 */
public class Pessoa  implements java.io.Serializable {


     private int id;
     private Cidade cidade;
     private String nome;
     private String telefone;
     private String email;
     private String endereco;
     private String numero;
     private String cep;
     private Set vendasForVendedorId = new HashSet(0);
     private Set vendasForCompradorId = new HashSet(0);
     private PessoaJuridica pessoaJuridica;
     private Set caixas = new HashSet(0);
     private Set comprasForVendedorId = new HashSet(0);
     private Set comprasForClienteId = new HashSet(0);
     private PessoaFisica pessoaFisica;

    public Pessoa() {
    }

	
    public Pessoa(int id, Cidade cidade) {
        this.id = id;
        this.cidade = cidade;
    }
    public Pessoa(int id, Cidade cidade, String nome, String telefone, String email, String endereco, String numero, String cep, Set vendasForVendedorId, Set vendasForCompradorId, PessoaJuridica pessoaJuridica, Set caixas, Set comprasForVendedorId, Set comprasForClienteId, PessoaFisica pessoaFisica) {
       this.id = id;
       this.cidade = cidade;
       this.nome = nome;
       this.telefone = telefone;
       this.email = email;
       this.endereco = endereco;
       this.numero = numero;
       this.cep = cep;
       this.vendasForVendedorId = vendasForVendedorId;
       this.vendasForCompradorId = vendasForCompradorId;
       this.pessoaJuridica = pessoaJuridica;
       this.caixas = caixas;
       this.comprasForVendedorId = comprasForVendedorId;
       this.comprasForClienteId = comprasForClienteId;
       this.pessoaFisica = pessoaFisica;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Cidade getCidade() {
        return this.cidade;
    }
    
    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getCep() {
        return this.cep;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
    }
    public Set getVendasForVendedorId() {
        return this.vendasForVendedorId;
    }
    
    public void setVendasForVendedorId(Set vendasForVendedorId) {
        this.vendasForVendedorId = vendasForVendedorId;
    }
    public Set getVendasForCompradorId() {
        return this.vendasForCompradorId;
    }
    
    public void setVendasForCompradorId(Set vendasForCompradorId) {
        this.vendasForCompradorId = vendasForCompradorId;
    }
    public PessoaJuridica getPessoaJuridica() {
        return this.pessoaJuridica;
    }
    
    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }
    public Set getCaixas() {
        return this.caixas;
    }
    
    public void setCaixas(Set caixas) {
        this.caixas = caixas;
    }
    public Set getComprasForVendedorId() {
        return this.comprasForVendedorId;
    }
    
    public void setComprasForVendedorId(Set comprasForVendedorId) {
        this.comprasForVendedorId = comprasForVendedorId;
    }
    public Set getComprasForClienteId() {
        return this.comprasForClienteId;
    }
    
    public void setComprasForClienteId(Set comprasForClienteId) {
        this.comprasForClienteId = comprasForClienteId;
    }
    public PessoaFisica getPessoaFisica() {
        return this.pessoaFisica;
    }
    
    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }




}


