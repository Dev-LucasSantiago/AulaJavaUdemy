package Controle;

import java.util.Scanner;

public class SwitchComBreak {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a nota: ");
        int nota = leitor.nextInt();

        String conceito = "";

        switch (nota){
            case 10: case 9:
                conceito = "A";
                break;
            case 8: case 7:
                conceito = "B";
                break;
            case 6: case 5:
                conceito = "C";
                break;
            case 4: case 3:
                conceito = "D";
                break;
            case 2: case 1: case 0:
                conceito = "E";
                break;
            default:
                conceito = "Nota não existente!";
                break;

        }
        System.out.println("Conceito do aluno é: "+conceito);
        leitor.close();
    }
}
