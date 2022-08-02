package com.trybe.acc.java.sistemadevotacao;

/**
 * Class PessoaCandidata.
 */

public class PessoaCandidata extends  Pessoa {

  private int number;
  private int votes;

  /**
   * Class PessoaCandidata.
   */
  public PessoaCandidata(String nome, int number) {
    super(nome);

    this.number = number;
    this.votes = 0; // start
  }

  @Override
  public  String getNome() {
    return super.nome;
  }

  @Override
  public void setNome(String nome) {
    super.nome = nome;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getVotes() {
    return votes;
  }

  public void setVotes(int votes) {
    this.votes = votes;
  }

  public void receiveVotes() {
    this.votes += 1;
  }
}
