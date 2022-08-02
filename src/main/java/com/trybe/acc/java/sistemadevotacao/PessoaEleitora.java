package com.trybe.acc.java.sistemadevotacao;

/**
 * Class PessoaCandidata.
 */

public class PessoaEleitora extends  Pessoa {

  private String cpf;

  /**
   * Class PessoaCandidata.
   */

  public PessoaEleitora(String cpf, String name) {
    super(name);

    this.cpf = cpf;
  }

  @Override
  public String getName() {
    return super.name;
  }

  @Override
  public void setName(String name) {
    super.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
