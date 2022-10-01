/* Exercício 11
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/


/*
Classe PontosDoQuadrante. (Difícil) Fazer um programa para:
a) Ler um valor inteiro, positivo e menor ou igual a 20, para a variável N;
b) Ler dois arrays X e Y com N valores reais cada um, correspondentes às coordenadas
cartesianas de uma malha de pontos;
c) Construir um array Q com os valores:
1, se o ponto pertence ao 1º quadrante (Xi > 0 e Yi > 0);
2, se o ponto pertence ao 2º quadrante (Xi < 0 e Yi > 0);
3, se o ponto pertence ao 3º quadrante (Xi < 0 e Yi < 0);
4, se o ponto pertence ao 4º quadrante (Xi > 0 e Yi < 0);
0, se o ponto pertence a um dos eixos (Xi = 0 ou Yi = 0);
d) Imprimir as coordenadas dos pontos e o quadrante ao qual cada ponto pertence, ponto abaixo
de ponto.
*/

import java.util.Scanner;

class PontosDoQuadrante {
  private static int N;
  private static double[] X, Y;
  private static int[] Q;
  private static Scanner scan = new Scanner(System.in);

  public static void start() {
    try {
      System.out.println("Digite um valor inteiro, positivo e menor ou igual a 20: ");
      N = scan.nextInt();

      if (N < 0 || N > 20) {
        System.out.println("Valor inserido não é válido.");
        return;
      }

      X = new double[N];
      Y = new double[N];
      Q = new int[N];

      for (int i = 0; i < N; i++) {
        System.out.printf("%d° coordenada x:\n", i + 1);
        X[i] = scan.nextDouble();
        System.out.printf("%d° coordenada y:\n", i + 1);
        Y[i] = scan.nextDouble();

        if (X[i] * Y[i] > 0) {
          if (X[i] > 0) {
            Q[i] = 1;
          } else {
            Q[i] = 3;
          }
        } else if (X[i] * Y[i] < 0) {
          if (X[i] > 0) {
            Q[i] = 4;
          } else {
            Q[i] = 2;
          }
        } else {
          Q[i] = 0;
        }
      }
      scan.close();

      for (int i = 0; i < N; i++) {
        System.out.printf("%d° coordeanada:\n(%.2f, %.2f) -> %d;\n", i + 1, X[i], Y[i], Q[i]);
      }
    } catch (NumberFormatException e) {
      System.out.println("Por favor, insira um valor válido.");
    }
  }
}