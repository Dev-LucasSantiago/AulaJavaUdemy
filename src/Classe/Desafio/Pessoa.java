package Classe.Desafio;

public class Pessoa {
    public String nome;
    public double peso;

    Pessoa (String nome, double peso){
        this.peso = peso;
        this.nome = nome;
    }

    public void comer(Comida comida){
        if(comida != null){
            this.peso += comida.pesoComida;
        }

    }
}
