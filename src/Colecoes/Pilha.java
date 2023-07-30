package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();
        //Sistema LIFO "last in first out"
         livros.add("O pequeno príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll()); // Exibe "Null" caso não tenha
        //System.out.println(livros.pop()); Lança Exception
        //System.out.println(livros.remove()); Lança Exception

        //livros.size();
        //livros.contains("");
        //livros.clear();
        //livros.isEmpty();
    }
}
