/* Exercício 10 
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

/*

Classe ClubeDeCampo. (Difícil) Um clube de campo, com o intuito de conhecer o perfil de
seus frequentadores, criou um cadastro com as idades e alturas das pessoas que lá estiveram
num final de semana. Fazer um programa para:
a) Ler um inteiro N (1 <= N <= 10) correspondente ao número de pessoas cadastradas. Não
permita o usuário digitar um número inválido;
b) Ler para os arrays "ID" e "ALT" os dados correspondentes à idade e à altura das pessoas
cadastradas;
c) Calcular e imprimir os valores das alturas médias para as 4 faixas etárias que seguem:
Faixa 1: idade menor ou igual a 10 anos;
Faixa 2: idade maior que 10 e menor ou igual a 15 anos;
Faixa 3: idade maior que 15 e menor ou igual a 21 anos;
Faixa 4: idade maior que 21 anos.

*/

import java.util.Scanner;

public class ClubeDeCampo {

  private static int qtdMembros, qtdF1 = 0, qtdF2 = 0, qtdF3 = 0, qtdF4 = 0, ID[];
  private static double ALTF1 = 0, ALTF2 = 0, ALTF3 = 0, ALTF4 = 0, ALT[];

  public static void start() {
    try {
      System.out.println("Informe quantos membros estão sendo analisados:");
      Scanner scan = new Scanner(System.in);
      qtdMembros = scan.nextInt();

      if (qtdMembros > 10 || qtdMembros < 1) {
        System.out.println("Valor inválido");
        return;
      }

      ID = new int[qtdMembros];
      ALT = new double[qtdMembros];

      for (int i = 0; i < qtdMembros; i++) {
        System.out.println("Informe a idade do membro.");
        ID[i] = scan.nextInt();

        if (ID[i] < 0) {
          System.out.println("Valor inválido.");
          break;
        }

        System.out.println("Informe a altura do membro.");
        ALT[i] = scan.nextDouble();

        if (ID[i] <= 10) {
          ALTF1 += ALT[i];
          qtdF1++;
        } else if (ID[i] <= 15) {
          ALTF2 += ALT[i];
          qtdF2++;
        } else if (ID[i] <= 21) {
          ALTF3 += ALT[i];
          qtdF3++;
        } else {
          ALTF4 += ALT[i];
          qtdF4++;
        }
      }
      scan.close();

      System.out.printf("""
          Faixa 1: altura média (idade menor ou igual a 10 anos) -> %.2f;
          Faixa 2: altura média (idade maior que 10 e menor ou igual a 15 anos) -> %.2f;
          Faixa 3: altura média (idade maior que 15 e menor ou igual a 21 anos) -> %.2f;
          Faixa 4: altura média (idade maior que 21 anos) -> %.2f.
          """, ALTF1 / qtdF1, ALTF2 / qtdF2, ALTF3 / qtdF3, ALTF4 / qtdF4);
    } catch (NumberFormatException erNumberFormatException) {
      System.out.println("Insira um valor válido.");
    }
  }
}
