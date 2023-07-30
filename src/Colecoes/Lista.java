package Colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Anna");
        lista.add(u1); //Adicionando a lista o objeto

        lista.add(new Usuario("Lucas"));//Adicionando normalmente a lista
        lista.add(new Usuario("Thalita"));
        lista.add(new Usuario("Thayna"));
        lista.add(new Usuario("Chaiane"));

        System.out.println(lista.get(0)); //Consegue acessar pelo índice.

        System.out.println("Removido >>>>>>>> "+lista.remove(3));//Removendo pelo índice

        System.out.println(lista.remove(new Usuario("Thalita")));//Removendo pelo nome

        System.out.println("Tem ? "+lista.contains(new Usuario("Thayna")));//Checando se tem ou não na lista
        System.out.println("Tem ? "+lista.contains(u1));

        for (Usuario u : lista){
            System.out.println(u.nome);
        }//For each para mostrar toda a lista
    }
}
