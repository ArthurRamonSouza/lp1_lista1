/* Exercício 09
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/


/*

Classe RhEmpresa. (Difícil) Fazer um programa para:
a) Ler um número inteiro N correspondente ao número de funcionários de uma empresa, sendo
0 < N < 80;
b) Ler, em processo repetitivo, o nome e o salário dos N funcionários, colocando-os
respectivamente nos arrays NOME e SALARIO;
c) Calcular e imprimir o valor do maior salário, com duas casas decimais;
d) Imprimir o array de nomes de todos os funcionários que obtiveram o salário igual ao maior
salário observado

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class RhEmpresa {
  private static int qtdRicos;
  private static int funcionariosEmpresa;
  private static String[] nomes, nomesRicos;
  private static double salarios[], maiorSalario = 0;

  public static void start() {
    Scanner scan = new Scanner(System.in);

    try {
      System.out.println("Digite a quantidade de funcionários da empresa: ");
      funcionariosEmpresa = scan.nextInt();

      nomes = new String[funcionariosEmpresa];
      salarios = new double[funcionariosEmpresa];

      if (funcionariosEmpresa < 0 || funcionariosEmpresa > 80) {
        System.out.println("A quantidade de funcionários da empresa deve estar entre 0 e 80.");
      }

      for (int i = 0; i < funcionariosEmpresa; i++) {
        System.out.println("Nome do funcionário: ");
        nomes[i] = scan.next();
        System.out.println("Salário do funcionário: ");
        salarios[i] = scan.nextDouble();
        if (maiorSalario < salarios[i]) {
          maiorSalario = salarios[i];
          qtdRicos = 1;
        } else if (maiorSalario == salarios[i]) {
          qtdRicos++;

        }
      }
      System.out.printf("O valor do maior salário é R$%.2f\n", maiorSalario);

      // Receber o array de nomes de todos os funcionários que obtiveram o salário
      // igual ao maior salário observado
      nomesRicos = new String[qtdRicos];
      for (int i = 0, j = 0; i < funcionariosEmpresa; i++) {
        if (salarios[i] == maiorSalario) {
          nomesRicos[j] = nomes[i];
          j++;
        }
      }

      for (int i = 0; i < nomesRicos.length; i++) {
        if (i == 0) {
          System.out.print("[");
        }
        System.out.print(nomesRicos[i]);
        
        if (i != (nomesRicos.length - 1)) {
          System.out.print(", ");
        }
        
        if (i == (nomesRicos.length - 1)) {
          System.out.println("]");
        }
      }
      scan.close();

    } catch (InputMismatchException e) {
      System.out.println("Por favor, insira um valor válido.");
    }
  }
}