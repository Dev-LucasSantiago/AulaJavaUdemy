package Exercicio05;

import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = leitor.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = leitor.nextDouble();

        double imc = peso/(altura * altura);

        System.out.printf("Seu IMC é: %.2f",+ imc);
    }
}
