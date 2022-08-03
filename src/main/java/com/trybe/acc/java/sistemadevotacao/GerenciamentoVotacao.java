package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * GerenciamentoVotacao.
 **/

public class GerenciamentoVotacao {
  private final ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private final ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private final ArrayList<String> cpfComputado = new ArrayList<String>();
  public int totalVotos;

  /**
   * Cadastrar pessoa candidata.
   **/
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (int i = 0; i < this.pessoasCandidatas.size(); i += 1) {
      if (this.pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
        break;
      }
    }

    this.pessoasCandidatas.add(new PessoaCandidata(nome, numero));
  }

  /**
   * Cadastrar pessoa candidata.
   **/
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (int i = 0; i < pessoasEleitoras.size(); i += 1) {
      if (pessoasEleitoras.get(i).getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        break;
      }
    }

    pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
  }

  /**
   * Votar.
   **/
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfComputado.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
      return;
    }
    for (int i = 0; i < this.pessoasCandidatas.size(); i += 1) {
      if (this.pessoasCandidatas.get(i).getNumero() == numeroPessoaCandidata) {
        this.pessoasCandidatas.get(i).receberVoto();
        cpfComputado.add(cpfPessoaEleitora);
        this.totalVotos += 1;
      }
    }
  }

  /**
   * Mostrar resultado.
   **/
  public void mostrarResultado() {
    if (this.totalVotos == 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }
    for (int i = 0; i < this.pessoasCandidatas.size(); i += 1) {
      System.out.println("Nome: "
              + this.pessoasCandidatas.get(i).getNome()
              + " - "
              + this.pessoasCandidatas.get(i).getVotos()
              + " votos  ( "
              + Math.round(this.calcularPorcentagemVotos(i) * 100)
              + "% )");
    }
    System.out.println("Total de votos: " + this.totalVotos);
  }

  /**
   * calcular %.
   **/
  private double calcularPorcentagemVotos(int index) {
    return (double) pessoasCandidatas.get(index).getVotos() / this.totalVotos;
  }
}
