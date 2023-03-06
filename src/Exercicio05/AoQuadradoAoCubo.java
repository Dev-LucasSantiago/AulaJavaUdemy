package Exercicio05;

import java.util.Scanner;

public class AoQuadradoAoCubo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Valor: ");
        float n = leitor.nextFloat();

        float quadrado = n*n;
        float cubo = (n*(n*n));

        System.out.println("Valor ao Quadrado: "+quadrado);
        System.out.println("Valor ao Cubo: "+cubo);
    }
}
