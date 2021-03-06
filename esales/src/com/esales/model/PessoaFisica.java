package com.esales.model;
// Generated Nov 9, 2015 8:59:29 PM by Hibernate Tools 4.3.1



/**
 * PessoaFisica generated by hbm2java
 */
public class PessoaFisica  implements java.io.Serializable {


     private Integer pessoaId;
     private Pessoa pessoa;
     private String cpf;
     private String dataNascimento;
     private String sexo;

    public PessoaFisica() {
    }

	
    public PessoaFisica(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public PessoaFisica(Pessoa pessoa, String cpf, String dataNascimento, String sexo) {
       this.pessoa = pessoa;
       this.cpf = cpf;
       this.dataNascimento = dataNascimento;
       this.sexo = sexo;
    }
   
    public Integer getPessoaId() {
        return this.pessoaId;
    }
    
    public void setPessoaId(Integer pessoaId) {
        this.pessoaId = pessoaId;
    }
    public Pessoa getPessoa() {
        return this.pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }




}


