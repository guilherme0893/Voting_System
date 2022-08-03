package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/**
 * Principal.
 **/
public class Principal {

  /**
   * MainMethod.
   **/

  public static void main(String[] args) {

    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    short pickedValue;

    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      pickedValue = scanner.nextShort();

      if (pickedValue == 1) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String name = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:");
        int number = scanner.nextInt();

        gerenciamentoVotacao.cadastrarPessoaCandidata(name, number);
      }

      if (pickedValue != 1 && pickedValue != 2) {
        System.out.println("Opção inválida!");
      }
    } while (pickedValue != 2);

    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");

      pickedValue = scanner.nextShort();

      if (pickedValue == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String voterName = scanner.next();

        System.out.println("Entre com o cpf da pessoa eleitora:");
        String voterCpf = scanner.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(voterName, voterCpf);

      }
      if (pickedValue != 1 && pickedValue != 2) {
        System.out.println("Opção inválida!");
      }
    } while (pickedValue != 2);

    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      pickedValue = scanner.nextShort();

      if (pickedValue == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scanner.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int number = scanner.nextInt();

        gerenciamentoVotacao.votar(cpf, number);
      }

      if (pickedValue == 2) {
        gerenciamentoVotacao.mostrarResultado();
      }

      if (pickedValue == 3) {
        gerenciamentoVotacao.mostrarResultado();
      }

      if (pickedValue != 1 && pickedValue != 2 && pickedValue != 3) {
        System.out.println("Opção inválida!");
      }
    } while (pickedValue != 3);

    scanner.close();
  }
}
