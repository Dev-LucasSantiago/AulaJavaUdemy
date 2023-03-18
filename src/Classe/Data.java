package Classe;

public class Data {
    int dia;
    int mes;
    int ano;

    String ObterdataFormatada (){
        return String.valueOf("Data:"+dia +"-"+ mes +"-"+ ano);
    }
}
