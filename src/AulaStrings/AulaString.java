package AulaStrings;


import java.io.PrintStream;

public class AulaString {
    public static void main(String[] args) {
        //Conta a partir de 0 os caracteceres e mostra que vc apontou no caso "0"
        System.out.println("Olá Pessoal!".charAt(0));

        String s = "Boa Tarde";

        //toUpperCase: Função que transforma toda a frase em maiúscula
        //s = s.toUpperCase();

        //concat: Função que irá concatenar sem usar o +
        System.out.println(s.concat("!!!"));
        System.out.println(s+"!!!");

        //startsWith: Função verifica se a fase está começando como você descreveu, retordando true or false
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.startsWith("boa"));
        //toLowerCase: Função que transforma toda a frase em minúscula, assim deixando true a condição do startsWith
        System.out.println(s.toLowerCase().startsWith("boa"));

        //endsWith: Mesma coisa que o starts, só que o final
        System.out.println(s.endsWith("Tarde"));

        //length: Retorna o tamanho da frase dentro da variável
        System.out.println(s.length());

        //equals: Função verifica se a variável está igual em questão a que vc irá descrever
        System.out.println(s.equals("boa tarde"));
        //equalsIgnoreCase: Irá verificar ignorando maiúsculo e minúsculo
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;



        System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalario: "+salario+"\n\n");

        PrintStream printf = System.out.printf("Nome Completo: %s %s", nome, sobrenome);

    }
}