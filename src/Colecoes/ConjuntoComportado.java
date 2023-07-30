package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        //Set<String> lista = new HashSet<>();
        SortedSet<String> lista = new TreeSet<>();
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Lucas");
        lista.add("Henrique");
        lista.add("Rafael");

        for (String candidatos : lista){
            System.out.println(candidatos);
        }

      Set<Integer> num = new HashSet<>();
        num.add(1);
        num.add(2);
        num.add(120);
        num.add(6);
        num.add(5);

        //num.get(0); Não é possível acessar pelo índice.

        for (int n:num){
            System.out.println(n);
        }


    }

}
