package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        System.out.print("Quantos alunos? ");
        int qtdAlunos = entrada.nextInt();
        System.out.print("Quantas notas? ");
        int qtdNotas = entrada.nextInt();

        double [][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total = 0;
        for (int i = 0; i < notasDaTurma.length; i++){
            for (int j=0;j < notasDaTurma[i].length; j++){
                System.out.printf("Informe a %dª nota do aluno %d: ",j+1,i+1);
                    notasDaTurma[i][j] = entrada.nextDouble();
                    total += notasDaTurma[i][j];
            }
        }
        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("A média da turma é: "+media);

        for (double [] notasDaTurmas : notasDaTurma){
            System.out.println(Arrays.toString(notasDaTurmas));
        }

        entrada.close();
    }
}