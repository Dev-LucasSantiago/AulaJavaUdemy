package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double nota = 0;
        double media = 0;

        while (!(nota == -1)){
            if (nota >= 0 && nota <= 10){
                System.out.print("Digite a sua nota: ");
                nota = leitor.nextDouble();

            }
            media = nota++;
            System.out.println(media);
        }
        System.out.println(media);
    }
}
