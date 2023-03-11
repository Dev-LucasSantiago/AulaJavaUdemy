package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int qtdNotas = 0;
        double nota = 0;
        double total = 0;

        while (!(nota == -1)){
            System.out.print("Digite a sua nota: ");
            nota = leitor.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                qtdNotas++;
            } else if (nota != -1) {
                System.out.println("Digite uma nota válida!");
            }
        }
        double media = total/qtdNotas;
        System.out.println("A média dos alunos é: "+media);
        leitor.close();
    }
}
