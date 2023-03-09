package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")){
            System.out.print("Você diz: ");
            valor = leitor.next();
        }

        leitor.close();
    }
}
