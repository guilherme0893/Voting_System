package com.trybe.acc.java.sistemadevotacao;

/**
 * Class PessoaCandidata.
 */

public class PessoaEleitora extends  Pessoa {

  private String cpf;

  /**
   * Class PessoaCandidata.
   */

  public PessoaEleitora(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  @Override
  public String getNome() {
    return this.nome;
  }

  @Override
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
