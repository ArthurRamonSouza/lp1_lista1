/* Exercício 03 
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

/*
Classe ConsumoCombustivel. (Médio) Efetuar o cálculo da quantidade de litros de combustível
        gasta em uma viagem, utilizando um automóvel que faz 12 kilômetros por litro. Para o cálculo, o
        usuário deve fornecer o tempo gasto e a velocidade média durante a viagem. Desta forma, será
        possível obter a distância percorrida com a fórmula DISTANCIA ← VELOCIDADE × TEMPO.
        A partir do valor da distância, basta calcular a quantidade em litros de combustível utilizada na
        viagem com a fórmula LITROS_USADOS ← DISTANCIA / 12. O programa deve apresentar os
        valores da velocidade média, tempo gasto na viagem, a distância percorrida e a quantidade de
        litros utilizadas na viagem.

*/

import javax.swing.JOptionPane;

public class ConsumoCombustivel {
  public static void start() {
    try {
      double tempo_gasto = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo gasto, em segundos:"));
      double vel_media = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade, em metros/segundo:"));

      System.out.printf("""
          Velocidade média: %.2f m/s.
          Tempo gasto: %.2f segundos.
          A distância percorrida na viagem foi de: %.2f metros.
          O consumo de gasolina total foi de %.2f litros.
          """, vel_media, tempo_gasto, vel_media * tempo_gasto, vel_media * tempo_gasto / 12);

    } catch (NumberFormatException erro) {
      System.out.println("Por favor, insira um valor válido.");
    }
  }
}
