/* Exercício 01
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

//Classe MiniCalculadora. (Médio) Fazer um programa para ler dois números inteiros, calcular e
//        imprimir:
//        a) A soma dos dois números
//        b) A subtração do primeiro pelo segundo
//        c) A multiplicação dos dois números
//        d) O quociente inteiro da divisão do primeiro pelo segundo
//        e) O resto da divisão do primeiro pelo segundo
//        f) A raiz quadrada do segundo número
//        g) O primeiro número elevado ao quadrado

import javax.swing.JOptionPane;

public class MiniCalculadora {
  public static void start() {

  try{
    double num1 = Double.valueOf(JOptionPane.showInputDialog("Digite O primeiro número!"));
    double num2 = Double.valueOf(JOptionPane.showInputDialog("Digite O segundo número!"));

    String quociente = Double.toString(num1 / num2);
    String resto = Double.toString(num1 % num2);
    

    if (num2 == 0) {
      quociente = "Não é possível dividir por zero.";
      resto = "Não é possível dividir por zero.";
    }

    System.out.printf("As operações envolvendo os 2 números digitados são as seguintes:\n" +
        "Soma: %.2f\n" +
        "Subtração: %.2f\n" +
        "Multiplicação: %.2f\n" +
        "Divisão: %s\n" +
        "Resto: %s\n" +
        "Raiz quadrada do segundo número: %.2f\n" +
        "Quadrado do primeiro número: %.2f\n", num1 + num2, num1 - num2, num1 * num2, quociente, resto,
        Math.sqrt(num2), Math.pow(num1, 2));

  } catch(NumberFormatException erro) {
    System.out.println("Por favor, insira um valor válido.");
  }
}
}