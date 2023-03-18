package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto();

        p1.nome = "Notebook";
        p1.preco = 4500.52;
        p1.desconto = 0.25;

        var p2 = new Produto();

        p2.nome = "Caneta Preta";
        p2.preco = 2.50;
        p2.desconto = 0.50;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.preco * (1 - p1.desconto);
        double precoFinal2 = p2.preco * (1 - p2.desconto);
        double media = (precoFinal1 + precoFinal2) /2;

        System.out.printf("Valor médio  do carrinho deu: R$%.2f",media);
    }
}
