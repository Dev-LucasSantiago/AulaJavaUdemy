package Classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;   //Atribuição por valor (Tipo Primitivo)

        a++;
        b--;

        System.out.println(a+" "+b);

        Data d1 = new Data();
        Data d2 = d1;   //Atribuição por referência (Objeto)

        d1.dia = 31;
        d2.mes = 12;
        d1.ano = 2024;

        System.out.println(d1.ObterdataFormatada());
        System.out.println(d2.ObterdataFormatada());

    }
}
