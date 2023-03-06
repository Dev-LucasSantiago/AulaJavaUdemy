package Fundamentos.Exercicio05;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //Desafio calculadora sem Usar o IF
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número:");
        double num2 = entrada.nextDouble();

        System.out.println("Digite o a operação que deseja fazer: + - * / %");
        String operacao = entrada.next();
        //Lógica

        //Usando apernas Equals
        // ? = se
        // : = Se não
        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        //printf
        //%f = float ou double
        //%s = String
        //.2 é para casas decimais
        System.out.printf("%.2f %s %.2f = %.2f",num1, operacao, num2, resultado);

        entrada.close();
    }
}
