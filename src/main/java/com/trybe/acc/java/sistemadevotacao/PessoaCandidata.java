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
  public PessoaCandidata(String name, int number) {
    super(name);

    this.number = number;
    this.votes = 0; // start
  }

  @Override
  public  String getName() {
    return super.name;
  }

  @Override
  public void setName(String name) {
    super.name = name;
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
