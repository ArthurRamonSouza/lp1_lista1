/* Exercício 05
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/
/*
Classe EleicaoSindical. (Difícil) Em uma eleição sindical concorreram aos cargos de presidente
        três candidatos (representados pelas variáveis A, B e C). Durante a apuração dos votos foram
        computados votos nulos e em branco, além dos votos válidos para cada candidato. Deve ser criado
        um programa para fazer a leitura da quantidade de votos válidos para cada candidato, além de ler
        também a quantidade de votos nulos e em branco.
        Ao final, o programa deve apresentar:
        o número total de eleitores, considerando votos válidos, nulos e em branco;
        o percentual correspondente aos votos válidos em relação à quantidade de eleitores;
        o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores;
        o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores;
        o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores;
        o percentual correspondente de votos nulos em relação à quantidade de eleitores;
        e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.
*/

import javax.swing.JOptionPane;

public class EleicaoSindical {
  public static void start() {
    try {
      double A = Double.parseDouble(JOptionPane.showInputDialog("Votos no candidato A:"));
      if (!valida(A)) {
        return;
      }
      double B = Double.parseDouble(JOptionPane.showInputDialog("Votos no candidato B:"));
      if (!valida(B)) {
        return;
      }
      double C = Double.parseDouble(JOptionPane.showInputDialog("Votos no candidato C:"));
      if (!valida(C)) {
        return;
      }
      double nulos = Double.parseDouble(JOptionPane.showInputDialog("Votos no candidato nulos:"));
      if (!valida(nulos)) {
        return;
      }
      double brancos = Double.parseDouble(JOptionPane.showInputDialog("Votos no candidato brancos:"));
      if (!valida(brancos)) {
        return;
      }

  
      double total = A + B + C + nulos + brancos;
      double pct_voto_valido = (A + B + C) / total * 100;
      double pct_voto_A = A / total * 100;
      double pct_voto_B = B / total * 100;
      double pct_voto_C = C / total * 100;
      double pct_nulos = nulos / total * 100;
      double pct_brancos = brancos / total * 100;

      System.out.printf("""
          o número total de eleitores, considerando votos válidos, nulos e em branco: %.0f;
          o percentual correspondente aos votos válidos em relação à quantidade de eleitores: %.2f%%;
          o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores: %.2f%%;
          o percentual correspondente de votos válidos do candidato B em relação à quantidade de eleitores: %.2f%%;
          o percentual correspondente de votos válidos do candidato C em relação à quantidade de eleitores: %.2f%%;
          o percentual correspondente de votos nulos em relação à quantidade de eleitores: %.2f%%;
          e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores: %.2f%%.
          """, total, pct_voto_valido, pct_voto_A, pct_voto_B, pct_voto_C, pct_nulos, pct_brancos);

    } catch (NumberFormatException erro) {
      System.out.println("Por favor, insira um valor válido.");
    }
  }

  public static boolean valida(double votos){
    if (votos % 1 != 0 || votos < 0) {
      System.out.println("Valor inválido para votos: Precisa ser um valor inteiro positivo.");
      return false;
    }
    return true;
  }
  
}
