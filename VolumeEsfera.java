/* Exercício 04
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/


/*

Classe VolumeEsfera. (Fácil) Elaborar um programa que calcule e apresente o valor do volume
de uma esfera. Utilize a fórmula VOLUME ← (4/3) * PI * RAIO ** 3

*/

import javax.swing.JOptionPane;

public class VolumeEsfera {
  public static void start() {
    try {
      double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite valor do raio da esfera:"));

      System.out.printf("O valor do volume da esfera é de %.2f.", Math.PI * 4 * Math.pow(raio, 3) / 3);
    } catch (NumberFormatException erro) {
      System.out.println("Por favor, insira um valor válido.");
    }
  }
}
