package Exercicio05;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor da base: ");
        float base = leitor.nextFloat();
        System.out.print("Valor da altura: ");
        float altura = leitor.nextFloat();

        float area = (altura*base)/2;

        System.out.println("Valor da Área do Triângulo: "+area);
    }
}
