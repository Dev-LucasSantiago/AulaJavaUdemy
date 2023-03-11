package Controle;

public class DesafioFor {
    public static void main(String[] args) {
        String valor= "#";

        //Desafio sem usar numéricos
        //Letra 'A' = 1 e 'E' = 5 e assim consecutivamente...'F'= 6
        for (int i='a';i <= 'e'; i++){
            System.out.println(valor);
            valor +="#";
        }

        //Apenas usando Strings
        for (String v = "#";!v.equals("######");v+="#"){
            System.out.println(v);
        }
    }
}
