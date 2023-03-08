package Controle;

import java.util.Locale;
import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = leitor.next().toLowerCase(Locale.ROOT).trim();

        if(dia.equals("domingo")){
            System.out.println("Dia 1");
        } else if (dia.equals("segunda")) {
            System.out.println("Dia 2");
        } else if (dia.equals("terça")) {
            System.out.println("Dia 3");
        } else if (dia.equals("quarta")) {
            System.out.println("Dia 4");
        } else if (dia.equals("quinta")) {
            System.out.println("Dia 5");
        } else if (dia.equals("sexta")) {
            System.out.println("Dia 6");
        } else if (dia.equals("sábado")) {
            System.out.println("Dia 7");
        }else {
            System.out.println("Não existe esse dia!");
        }
        leitor.close();

    }
}
