package Controle;

import java.util.Scanner;

public class SwitchSemBreak {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua faixa: ");
        String faixa = leitor.nextLine();
        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan...");
            case "roxa":
                System.out.println("Sei o Heian Godan...");
            case "verde":
                System.out.println("Sei o Heian Yodan...");
            case "laranja":
                System.out.println("Sei o Heian Sandan...");
            case "vermelha":
                System.out.println("Sei o Heian Nidan...");
            case "amarela":
                System.out.println("Sei o Heian Shodan...");
                break;
            //default:
            //    System.out.println("Não sei nada...");
        }
        System.out.println("----------FIM!---------");
        int idade = 3;

        switch (idade){
            case 3:
                System.out.println("Sei falar");
            case 2:
                System.out.println("Sei andar");
            case 1:
                System.out.println("Sei respirar");
        }
    leitor.close();
    }
}
