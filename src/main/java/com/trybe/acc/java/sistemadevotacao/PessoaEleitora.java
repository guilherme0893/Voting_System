package com.trybe.acc.java.sistemadevotacao;

/**
 * Class PessoaCandidata.
 */

public class PessoaEleitora extends  Pessoa {

  private String cpf;

  /**
   * Class PessoaCandidata.
   */

  public PessoaEleitora(String cpf, String nome) {
    super(nome);

    this.cpf = cpf;
  }

  @Override
  public String getNome() {
    return super.nome;
  }

  @Override
  public void setNome(String nome) {
    super.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
