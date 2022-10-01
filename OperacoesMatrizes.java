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

  private static double temp;
  static Scanner scan = new Scanner(System.in);
  
  //private static double[][] Matriz;
  
  public static void start() {
    for(int i = 0; i < 3; i++) {
      System.out.println(recebe_Valor() + "\n");
    }
  }

  public static double recebe_Valor() {
    try {
      temp = scan.nextDouble();
      return temp;
    } catch(InputMismatchException erro) {
      scan.nextLine();
      System.out.println("Insira um valor adequado.");
      
      return recebe_Valor();
    }
  }
}