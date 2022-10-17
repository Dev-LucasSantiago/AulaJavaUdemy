package Wrappers;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //Wrapper são a versão orientada a objetos dos tipos primitivos

        //Byte
        Byte    b = 100;

        //Short
        Short   s = 1000;

        //Integer
        //Integer i = Integer.parseInt(leitor.nextLine());
        Integer i = 10000;

        //Long
        Long    l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(i *3);
        System.out.println(l /3);

        //Float
        Float f = 123.10F;
        System.out.println(f);

        //Double
        Double d = 1234.5678;
        System.out.println(d);

        //Boolean
        Boolean bo = Boolean.parseBoolean("true"); //booleano
        System.out.println(bo);
        System.out.println(bo.toString().toUpperCase());

        //Character
        Character c = '#'; //char
        System.out.println(c+"...");


    }
}
