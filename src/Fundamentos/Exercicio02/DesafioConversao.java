package Fundamentos.Exercicio02;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor 1:");
        String v1 = leitor.nextLine().replace(",",".");

        System.out.print("Digite o valor 2:");
        String v2 = leitor.nextLine().replace(",",".");

        System.out.print("Digite o valor 3:");
        String v3 = leitor.nextLine().replace(",",".");

        double s1 = Double.parseDouble(v1);
        double s2 = Double.parseDouble(v2);
        double s3 = Double.parseDouble(v3);
        double media = (s1 + s2 +s3)/3;
        System.out.println(media);

        leitor.close();
    }
}
