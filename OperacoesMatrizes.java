/* Exercício 13
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

/*
Classe OperacoesMatrizes. (Difícil) Faça um programa que leia todos os elementos de uma matriz 3x3.
O programa principal deverá chamar e apresentar o resultado de cada uma das funções abaixo. A matriz
deverá ser passada como parâmetro de cada função.
a) a média aritmética dos elementos abaixo da diagonal principal.
b) a soma dos elementos acima da diagonal principal.
c) a média aritmética dos elementos da diagonal principal
d) o menor elemento da matriz
e) a soma dos elementos da matriz

*/

import java.util.Scanner;
import java.util.InputMismatchException;

public class OperacoesMatrizes {

  public static void start() {
    double[][] matriz = new double[3][3];
    Scanner scan = new Scanner(System.in);
    // lendo a matriz
    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        recebe_Valor(l, c, matriz, scan);
      }
    }

    System.out.println();

    // printando a matriz
    System.out.println("Sua matriz é esta: ");
    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        if (c == 0 && l != 0) {
          System.out.println();
        }
        System.out.print(matriz[l][c]);
        if (c != 2) {
          System.out.print(", ");
        }
      }
    }
    System.out.println();
    System.out.println();

    mediaAbaixoDaDiagonal(matriz);
    somaAcimaDaDiagonalPrincipal(matriz);
    mediaDaDiagonalPrincipal(matriz);
    menorElementoDaMatriz(matriz);
    somaDaMatriz(matriz);
    scan.close();
  }

  public static void mediaAbaixoDaDiagonal(double[][] matriz) {
    // a media dos elementos abaixo da diagonal principal
    double mediaAbaixoDiagonal = 0;
    int qtdElementos = 0;

    for (int l = 1; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        if (c >= l) {
          break;
        } else {
          mediaAbaixoDiagonal += matriz[l][c];
          qtdElementos++;
        }
      }
    }
    mediaAbaixoDiagonal /= qtdElementos;
    System.out.printf("A media dos elementos abaixo da diagonal principal é: %.2f\n\n", mediaAbaixoDiagonal);
  }

  public static void somaAcimaDaDiagonalPrincipal(double[][] matriz) {
    // a soma dos elementos acima da diagonal principal
    double somaAcimaDiagonal = 0;

    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        if (c > l) {
          somaAcimaDiagonal += matriz[l][c];
        }
      }
    }
    System.out.printf("A soma dos elementos acima da diagonal principal é: %.2f\n\n", somaAcimaDiagonal);
  }

  public static void mediaDaDiagonalPrincipal(double[][] matriz) {
    // a media dos elementos da diagonal principal
    double mediaDiagonal = 0;
    int qtdElementos = 0;

    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        if (c == l) {
          mediaDiagonal += matriz[l][c];
          qtdElementos++;
        }
      }
    }

    mediaDiagonal /= qtdElementos;
    System.out.printf("A media dos elementos da diagonal principal é: %.2f\n\n", mediaDiagonal);
  }

  public static void menorElementoDaMatriz(double[][] matriz) {
    // o menor elemento da matriz
    double menorElemento = matriz[0][0];

    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        if (matriz[l][c] < menorElemento) {
          menorElemento = matriz[l][c];
        }
      }
    }
    System.out.printf("O menor elemento da matriz é: %.2f\n\n", menorElemento);
  }

  public static void somaDaMatriz(double[][] matriz) {
    // a soma dos elementos da matriz
    double somaMatriz = 0;

    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        somaMatriz += matriz[l][c];
      }
    }
    System.out.printf("A soma de todos os elementos da matriz é: %.2f\n\n", somaMatriz);

  }

  public static void recebe_Valor(int line, int column, double[][] matriz, Scanner scan) {
    try {
      System.out.printf("Digite o elemento que estará na posição a(%d,%d); ", line + 1, column + 1);
      matriz[line][column] = scan.nextDouble();

    } catch (InputMismatchException erro) {
      scan.nextLine();
      System.out.println("Insira um valor adequado.");
      recebe_Valor(line, column, matriz, scan);
    }
  }

}