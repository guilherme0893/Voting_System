package com.trybe.acc.java.sistemadevotacao;

/**
 * Class Pessoa.
 */

public abstract class Pessoa {

  protected String name;


  public Pessoa(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
