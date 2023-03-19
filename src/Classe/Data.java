package Classe;

public class Data {
    int dia;
    int mes;
    int ano;
    Data(){
        //this.dia = 1;
        //this.mes = 1;
        //this.ano = 1970;
        this(1,1,1970);
    }

    Data(int dia,int mes,int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    String ObterdataFormatada (){
        final String formato = "Data:%d-%d-%d";
        return String.format(formato,this.dia,mes,ano);
    }

    void imprimirDataFormatada(){
        System.out.println(this.ObterdataFormatada());
    }
}
