package Exercicio05;

import java.util.Scanner;

public class CelciusFahrenheit {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celcius: ");
        double n1 = leitor.nextDouble();
        double fahrenheit = (n1 * 1.8)+32;

        System.out.println("A temperatura em Fahrenheit é : "+fahrenheit);
    }
}
