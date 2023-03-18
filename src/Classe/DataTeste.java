package Classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();
        //d1.dia = 11;
        //d1.mes = 06;
        //d1.ano = 1995;

        Data d2 = new Data(13,5,2002);


        System.out.printf("Data:%d-%d-%d\n",d1.dia,d1.mes,d1.ano);
        System.out.printf("Data:%d-%d-%d\n",d2.dia,d2.mes,d2.ano);

        System.out.println(d1.ObterdataFormatada());
        System.out.println(d2.ObterdataFormatada());
    }
}
