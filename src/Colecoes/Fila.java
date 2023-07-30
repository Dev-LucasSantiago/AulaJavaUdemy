package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila =  new LinkedList<String>();

        //  Offer e ADD --> Adicionam elementos na fila
        //  A diferença é o comportamento ocorre
        //  Quando a fila está cheia!
        fila.add("Ana"); // Retorna False
        fila.offer("Bia");// Lança uma exception
        fila.add("Lucas");
        fila.offer("Carlos");
        fila.add("Jean");
        fila.offer("Beatriz");
        fila.add("Jonas");
        fila.offer("Giovanna");

        //  Peek e Element -> Obter o próximo elemento
        //  da fila (sem remover)
        //  A diferença é o comportamento ocorre
        //  Quando a fila está vazia!
        System.out.println(fila.peek());    //Retorna Null
        System.out.println(fila.peek());
        System.out.println(fila.element()); //Lança uma Exception
        System.out.println(fila.element());

        //fila.size(); Tamanho da fila
        //fila.clear(); Limpar a fila
        //fila.isEmpty(); Saber se a fila está vazia

        //  Poll e Remove -> Obter o próximo elemento
        //  da fila (e remove)
        //  A diferença é o comportamento ocorre
        //  Quando a fila está vazia!
        System.out.println(fila.poll());//  Retorna Null
        System.out.println(fila.remove());//Lança uma Exception
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());


    }
}
