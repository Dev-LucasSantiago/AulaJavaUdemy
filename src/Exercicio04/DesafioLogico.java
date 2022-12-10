package Exercicio04;

import java.util.Scanner;

public class DesafioLogico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Trabalho de Terça-Feira feito ?");
        boolean trabalho01 = Boolean.parseBoolean(leitor.nextLine().replace("Sim","true"));

        System.out.println("Trabalho de Quinta-Feira feito ?");
        boolean trabalho02 = Boolean.parseBoolean(leitor.nextLine().replace("Sim","true"));

        boolean comprouTV50 = trabalho01 && trabalho02;
        boolean comprouTV32 = trabalho01 ^ trabalho02;
        boolean comprouSorvete =  trabalho01 || trabalho02;

        //Operador Unário!
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou TV50\" ? "+comprouTV50);
        System.out.println("Comprou TV32\" ? "+comprouTV32);
        System.out.println("Comprou Sorteve? "+comprouSorvete);
        System.out.println("Mais Saudável ? "+ maisSaudavel);


    }
}
