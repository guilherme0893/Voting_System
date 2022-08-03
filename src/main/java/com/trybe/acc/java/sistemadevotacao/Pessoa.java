package com.trybe.acc.java.sistemadevotacao;

/**
 * Class Pessoa.
 */

public abstract class Pessoa {
  protected String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public abstract String getNome();

  public abstract void setNome(String nome);
}
