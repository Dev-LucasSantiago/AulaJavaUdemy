package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    System.out.print("Quantidade de Notas: ");
    int qtdNotas = leitor.nextInt();

    double [] notas = new double[qtdNotas];

    for (int i= 0; i < notas.length;i++){
        System.out.print("informe a Nota "+(i+1)+": ");
        notas[i] = leitor.nextDouble();
    }

    double total = 0;
    for (double nota: notas){
        total += nota;
    }
    double media = total/ notas.length;
        System.out.println("A média é: "+media);
    leitor.close();
    }
}
