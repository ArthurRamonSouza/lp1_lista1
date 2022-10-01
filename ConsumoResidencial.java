/* Exercício 02 
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

/*
Classe ConsumoResidencial. (Médio) Sabe-se que o quilowatt de energia custa um quinto do
        salário mínimo. Faça um programa que receba o valor do salário mínimo e a quantidade de
        quilowatts gasta por uma residência. Calcule e imprima:
        a) O valor, em reais, de cada quilowatt;
        b) O valor, em reais, a ser pago por essa residência;
        c) O valor a ser pago por essa residência com um desconto de 15%;
 */

import javax.swing.JOptionPane;

public class ConsumoResidencial {
  public static void start() {
    try {
      double sm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo:"));
      double energia = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de energia gasta:"));
      double preco_kw = sm / 5;


      System.out.printf("""
          O valor, em reais, de cada quilowatt é: R$%.2f.
          O valor, em reais, a ser pago pela residência determinada é: R$%.2f.
          O valor a ser pago por essa residência com um desconto de 15%% é: R$%.2f.""",
                        preco_kw, preco_kw * energia,(preco_kw * energia) * 85 / 100);

    } catch (NumberFormatException erro) {
      System.out.println("Por favor, insira valores válidos.");
    }
  }
}
