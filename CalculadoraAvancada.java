/* Exercício 12
  * Aluno: Arthur Ramón – Matricula: 20210027186  
  * Aluno: Lucas Farias de Medeiros – Matricula: 20220054884  
*/
/*
Classe CalculadoraAvancada. (Médio) Faça um programa que mostre uma tela com as seguintes opções:
1 – Dobro, 2 – Triplo, 3 – Metade, 4 – Quadrado, 5 – Cubo, 6 – Raiz Quadrada, 7 – Raiz Cúbica, 8 –
Módulo, 9 – Inverso e 0 – Sair do Programa. Cada uma das opções chamará uma função com a devida
funcionalidade e estas devem ser impressas através de um procedimento. Para fins de cálculo, estes testes
se basearão em um número inteiro N informado pelo usuário.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

class CalculadoraAvancada {

  public static void start() {

    Scanner scan = new Scanner(System.in);

    try {
      while (true) {
        int ID;
        double num;
        String a = "Digite o número a ser trabalhado";

        System.out.printf("""
            Calculadora
            \t1 – Dobro
            \t2 – Triplo
            \t3 – Metade
            \t4 – Quadrado
            \t5 – Cubo
            \t6 – Raiz Quadrada
            \t7 – Raiz Cúbica
            \t8 – Módulo
            \t9 – Inverso
            \t0 – Sair do Programa
            """);
        ID = scan.nextInt();

        switch (ID) {
          case 0:
            System.out.println("Saindo...\n");
            scan.close();
            return;
          case 1:
            System.out.println(a);
            num = scan.nextDouble();
            System.out.printf("O dobro de %.2f é %.2f.\n", num, num * 2);
            break;
          case 2:
            System.out.println("Digite o número a ser trabalhado");
            num = scan.nextDouble();
            System.out.printf("O triplo de %.2f é %.2f.\n", num, num * 3);
            break;
          case 3:
            System.out.println("Digite o número a ser trabalhado");
            num = scan.nextDouble();
            System.out.printf("A metade de %.2f é %.2f.\n", num, num / 2);
            break;
          case 4:
            System.out.println("Digite o número a ser trabalhado");
            num = scan.nextDouble();
            System.out.printf("O quadrado de %.2f é %.2f.\n", num, Math.pow(num, 2));
            break;
          case 5:
            System.out.println("Digite o número a ser trabalhado");
            num = scan.nextDouble();
            System.out.printf("O cubo de %.2f é %.2f.\n", num, Math.pow(num, 3));
            break;
          case 6:
            System.out.println("Digite o número a ser trabalhado");
            num = scan.nextDouble();
            System.out.printf("A raiz quadrada de %.2f é %.2f.\n", num, Math.sqrt(num));
            break;
          case 7:
            System.out.println("Digite o número a ser trabalhado");
            num = scan.nextDouble();
            System.out.printf("A raiz cúbica de %.2f é %.2f.\n", num, Math.cbrt(num));
            break;
          case 8:
            System.out.println("Digite o número a ser trabalhado");
            num = scan.nextDouble();
            double aux = num;
            if (num < 0) {
              aux = -num;
            }
            System.out.printf("O módulo de %.2f é %.2f.\n", num, aux);
            break;
          case 9:
            System.out.println("Digite o número a ser trabalhado");
            num = scan.nextDouble();
            System.out.printf("O inverso de %.2f é 1/%.2f = %.2f.\n", num, num, 1 / num);
            break;
          default:
            System.out.println("Opção de operação inválida.");
        }
      }
    } catch (InputMismatchException e) {
      System.out.println("Opção de operação inválida. Reinicie o programa.");
    }
  }
}