/* Exercício 14
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

/*
Classe MiniProntuario. Numa enfermaria existem 4 pacientes. De hora a hora são medidas as
pulsações a cada paciente (ao longo de um dia = 24 leituras para cada paciente). Faça um programa
capaz de:
a) Armazenar as leituras de cada paciente em uma matriz de dimensão 24 x 4 dos valores das pulsações
dos 4 pacientes ao longo das 24 horas de um dia;
b) Calcular e apresentar a média das pulsações para cada um dos pacientes;
c) Identificar os pacientes que apresentaram o maior valor médio das pulsações.
*/

import java.util.Scanner;

public class MiniProntuario {

  private static double[][] prontuario = new double[4][2];
  private static double[] media = new double[2];
  private static int maioresMedias[] = new int[2];
  private static double maiorMedia = 0;
  private static int z = 0;

  public static void start() {
    Scanner scan = new Scanner(System.in);

    try {

      for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 4; j++) {
          System.out.printf("Informe a %d pulsação do paciente %d: ", j + 1, i + 1);
          prontuario[j][i] = scan.nextDouble();
          media[i] += prontuario[j][i];
        }
        if (media[i] == maiorMedia) {
          z++;
          maioresMedias[z] = i;
        } else if (maiorMedia < media[i]) {
          maiorMedia = media[i];
          z = 0;
          maioresMedias[0] = i;
        }

      }

      scan.close();

      System.out.printf("""
          Média paciente 1: %.2f;
          Média paciente 2: %.2f;
          """, media[0] / 4, media[1] / 4);

      System.out.println("Os pacientes com as maiores médias são os seguintes:");
      for (int i = 0; i < z + 1; i++) {
        System.out.println(maioresMedias[i] + 1);
      }

    } catch (NumberFormatException erNumberFormatException) {
        System.out.println("Insira um valor válido. Reinicie o programa.");
    }
  }
}
