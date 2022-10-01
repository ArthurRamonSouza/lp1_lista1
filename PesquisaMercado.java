/* Exercício  07
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/

/*


Classe PesquisaMercado. (Médio) Uma firma fez uma pesquisa de mercado para saber se as
pessoas gostaram ou não de um novo produto lançado no mercado. Para isto, forneceu o sexo do
entrevistado (M-masculino ou F-feminino) e sua resposta (S-sim ou N-não). Sabendo-se que
foram entrevistadas 2.000 pessoas, fazer um programa que calcule e escreva:
a) Número de pessoas que responderam sim (S);
b) Número de pessoas que responderam não (N);
c) A porcentagem de pessoas do sexo feminino (F);
d) A porcentagem de pessoas do sexo masculino (M).
*/

import java.util.Scanner;

public class PesquisaMercado {
  public static void start() {

    try{
      double M = 0, i;
      int S = 0;
    
      String sexo;
      String resposta;
      
      Scanner scan = new Scanner(System.in);


      //Trocar i < 5 por i < 2000;
      for (i = 0; i < 5; i++) {

        System.out.println("Digite o gênero do cliente.");
        
        sexo = scan.next();
        
        if (sexo.equals("M") || sexo.equals("m")) {
          M++;
        
        } else if (!sexo.equals("F") && !sexo.equals("f")) {
          System.out.println("Insira um valor válido: 'M','m','F' ou 'f'");
          return;
        }

        System.out.println("Digite a resposta do cliente.");
        resposta = scan.next();
  
        if (resposta.equals("S") || resposta.equals("s")) {
          S++;
          
        } else if (!resposta.equals("N") && !resposta.equals("n")) {
          System.out.println("Insira um valor válido: 'S','s','N' ou 'n'");
          return;
        }
        
      }
      scan.close();
      
      
      System.out.printf("""
a) Número de pessoas que responderam sim (S): %d;
b) Número de pessoas que responderam não (N): %d;
c) A porcentagem de pessoas do sexo feminino (F): %%%.2f;
d) A porcentagem de pessoas do sexo masculino (M): %%%.2f;
          """,S, (int)i - S, 100 - M * 100 / i, M * 100 / i);
  
  
    } catch(NumberFormatException erro) {
      System.out.println("Por favor, insira um valor válido.");
    }
  }
}