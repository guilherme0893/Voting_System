package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**
 * GerenciamentoVotacao.
 **/

public class GerenciamentoVotacao {

  private void log(String str) {
    System.out.println(str);
  }

  private final ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private final ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private final ArrayList<String> cpfComputado = new ArrayList<>();
  public int totalVotos = 0;

  private boolean numeroCandidatoJaCadastrado(int numero) {
    return pessoasCandidatas.stream().anyMatch(candidato -> candidato.getNumero() == numero);
  }

  private boolean eleitorJaCadastrado(String cpf) {
    return pessoasEleitoras.stream().anyMatch(eleitor -> eleitor.getCpf().equals(cpf));
  }

  /**
   * Cadastrar pessoa candidata.
   **/
  public void cadastrarPessoaCandidata(String nome, int numero) {
    if (numeroCandidatoJaCadastrado(numero)) {
      log("Número pessoa candidata já utilizado!");
    } else {
      pessoasCandidatas.add(new PessoaCandidata(nome, numero));
    }
  }

  /**
   * Cadastrar pessoa eleitora.
   **/
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    if (eleitorJaCadastrado(cpf)) {
      log("Pessoa eleitora já cadastrada!");
    } else {
      pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
    }
  }

  private PessoaCandidata getCandidatoPorNumero(int numeroPessoaCandidata) {
    return pessoasCandidatas.stream()
            .filter(candidato -> candidato.getNumero() == numeroPessoaCandidata)
            .findFirst()
            .orElse(null);
  }

  /**
   * Votar.
   **/
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfComputado.contains(cpfPessoaEleitora)) {
      log("Pessoa eleitora já votou!");
    } else {
      PessoaCandidata candidatoVotado = getCandidatoPorNumero(numeroPessoaCandidata);
      candidatoVotado.receberVoto();
      cpfComputado.add(cpfPessoaEleitora);
      totalVotos += 1;
    }
  }

  private double calcularPorcentagemVotos(int indexCandidato) {
    int votosCandidato = pessoasCandidatas.get(indexCandidato).getVotos();
    return (((double) votosCandidato / totalVotos) * 100);
  }

  /**
   * Mostrar resultado.
   **/
  public void mostrarResultado() {

    if (totalVotos < 1) {
      log("É preciso ter pelo menos um voto para mostrar o resultado.");
    } else {
      for (PessoaCandidata candidato : pessoasCandidatas) {
        System.out.printf("Nome: %s - %d votos (%f%%)%n",
                candidato.getNome(),
                candidato.getVotos(),
                calcularPorcentagemVotos(pessoasCandidatas.indexOf(candidato)));

      }

      System.out.printf("Total de votos: %d%n", totalVotos);
    }

  }
}
