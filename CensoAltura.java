/* Exercício 06 
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

/*
 * Classe CensoAltura. (Médio) Tem-se um conjunto de dados contendo a altura e o
 * sexo
 * (masculino, feminino) de 20 pessoas. Fazer um programa que calcule e escreva:
 * a) A maior e a menor altura do grupo;
 * b) A média das alturas das mulheres;
 * c) O número de homens.
 */

public class CensoAltura {
  private static int maiorAltura = 0;
  private static int menorAltura = 0;
  private static double mediaFeminina = 0;
  private static int qtdHomens = 0;

  public static void start(int[] alturas, String[] sexo) {
    menorAltura = alturas[0];
    for (int i = 0; i < alturas.length; i++) {
      if (alturas[i] > maiorAltura) {
        maiorAltura = alturas[i];
      } else if (alturas[i] < menorAltura) {
        menorAltura = alturas[i];
      }

      if (sexo[i] == "masculino") {
        qtdHomens++;
      } else {
        mediaFeminina += alturas[i];
      }
    }
    mediaFeminina /= (alturas.length - qtdHomens);

    System.out.printf("""
          A maior altura do grupo é: %d;
          A menor altura do grupo é: %d;
          A média das alturas das mulhere é: %.1fcm;
          O número de homens que participaram é: %d
        """, maiorAltura, menorAltura, mediaFeminina, qtdHomens);
  }
}