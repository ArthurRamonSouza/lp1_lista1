/* Exercício 08 
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

/*
Classe CensoEngenhariaUFCG. (Difícil) Foi feita uma pesquisa para determinar o perfil dos alunos que ingressaram na engenharia na UFCG num determinado semestre. Fazer um programa que:

• leia inicialmente o número total de alunos que prestaram vestibular para engenharia no semestre
• leia, em seguida, um número indeterminado de linhas com informações sobre os alunos que passaram no vestibular. Cada linha contém o sexo do aluno ('m' para masculino e 'f' para feminino) e o número de vezes que este aluno prestou vestibular. A última linha, que não entrará nos cálculos, contém no lugar do sexo a letra 'x'. Este é o "sinal" para parar de ler dados.
• determine e imprima;
  o a porcentagem de alunos que passaram no vestibular;
  o a porcentagem de alunos do sexo masculino que passaram no vestibular;
  o a porcentagem de alunos, independente de sexo, que prestou vestibular 3 ou mais vezes no período.
*/

import java.util.Scanner;

public class CensoEngenhariaUFCG {
  private static int totalAlunos = 0;
  private static int tentativasVestibular = 0;
  private static char sexo = ' ';
  private static int alunosAprovados = 0;
  private static int meninosAprovados = 0;
  private static int alunosComTresOuMaisTentativas = 0;

  public static void start() {
    Scanner scan = new Scanner(System.in);
    int contador = 0;
    System.out.println("Digite a quantidade de alunos que prestaram vestibular para engenharia: ");
    
    try{
      totalAlunos = scan.nextInt();
  
      while (contador < totalAlunos) {
        System.out.println("Digite as informações sobre os alunos que passaram no vestibular: ");
        sexo = scan.next().charAt(0);
        if (sexo == 'm') {
          meninosAprovados++;
        } else if (sexo == 'x') {
          break;
        }
  
        tentativasVestibular = scan.nextInt();
        if (tentativasVestibular >= 3) {
          alunosComTresOuMaisTentativas++;
        }
  
        alunosAprovados++;
        contador++;
      }
      scan.close();
  
      double porcentagemAprovados = (alunosAprovados * 100 / totalAlunos);
      double porcentagemMeninosAprovados = (meninosAprovados * 100 / alunosAprovados);
      double porcentagemTresOuMaisTGentativas = (alunosComTresOuMaisTentativas * 100 / totalAlunos);
  
      System.out.printf("""
          A porcentagem de alunos que passaram no vestibular: %.1f%%;
          A porcentagem de alunos do sexo masculino que passaram no vestibular: %.1f%%;
          A porcentagem de alunos, independente de sexo, que prestou vestibular 3 ou mais vezes no período: %.1f%%;
          """, porcentagemAprovados, porcentagemMeninosAprovados, porcentagemTresOuMaisTGentativas);
  
    } catch(NumberFormatException e){
      System.out.println("Por favor, insira um valor válido.");
    } 
  }
}
