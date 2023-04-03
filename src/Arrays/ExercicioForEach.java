package Arrays;

import java.util.Arrays;

public class ExercicioForEach {

    public static void main(String[] args) {
        double[] notasAlunos = {7.9 , 8 , 6.7 , 9.7};

        System.out.println(Arrays.toString(notasAlunos));
        System.out.println("Primeira nota: "+notasAlunos[0]);
        System.out.println("Útima nota: "+notasAlunos[notasAlunos.length-1]);

        double notaDoAlunoTotal1 = 0;
        //for (int i = 0;i < notasAlunos.length;i++){
        //    notaDoAlunoTotal1 += notasAlunos[i];
        //}
        for ( double notaAluno: notasAlunos) {
            notaDoAlunoTotal1 += notaAluno;
            System.out.println(notaAluno);
        }

        System.out.println("Média: "+notaDoAlunoTotal1 / notasAlunos.length);

        final double notaArmazenada = 5.9;
        double [] notasAlunos2 = {6.9,8.9, notaArmazenada,10};
        double notaAlunoTotal2 = 0;
        for (double notaAluno2: notasAlunos2) {
            notaAlunoTotal2 += notaAluno2;
        }
        //for (int i= 0;i < notasAlunos2.length;i++){
        //    notaAlunoTotal2 += notasAlunos2[i];
        //}
        System.out.println("Média 2: "+notaAlunoTotal2/notasAlunos2.length);
    }
}
