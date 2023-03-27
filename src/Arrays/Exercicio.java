package Arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        double[] notasAlunos = new double[4];
        System.out.println(Arrays.toString(notasAlunos));

        notasAlunos[0] = 7.9;
        notasAlunos[1] = 8;
        notasAlunos[2] = 6.7;
        notasAlunos[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunos));
        System.out.println(notasAlunos[0]);
        System.out.println(notasAlunos[notasAlunos.length-1]);

        double notaDoAlunoTotal1 = 0;
        for (int i = 0;i < notasAlunos.length;i++){
            notaDoAlunoTotal1 += notasAlunos[i];
        }
        System.out.println(notaDoAlunoTotal1 / notasAlunos.length);

        final double notaArmazenada = 5.9;
        double [] notasAlunos2 = {6.9,8.9, notaArmazenada,10};
        double notaAlunoTotal2 = 0;
        for (int i= 0;i < notasAlunos2.length;i++){
            notaAlunoTotal2 += notasAlunos2[i];
        }
        System.out.println(notaAlunoTotal2/notasAlunos2.length);
    }
}
