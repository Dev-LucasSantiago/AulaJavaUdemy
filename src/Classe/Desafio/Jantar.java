package Classe.Desafio;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Lucas",78);
        Comida c = new Comida("Arroz",0.100);
        Comida b = new Comida("Feijão",0.200);
        System.out.println("Nome: "+p.nome+"\nPesa: "+p.peso+" Kg\n-------------------------------------");

        p.comer(c);
        System.out.println("Nome: "+p.nome+"\nPesa: "+p.peso+" Kg\n-------------------------------------");
        p.comer(b);
        System.out.println("Nome: "+p.nome+"\nPesa: "+p.peso+" Kg\n-------------------------------------");
    }
}
