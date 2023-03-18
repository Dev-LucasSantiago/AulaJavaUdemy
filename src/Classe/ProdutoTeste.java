package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",1600,0.5);

        var p2 = new Produto("Caneta Preta",2.50,0.1);

        System.out.println(p1.nome);
        System.out.println(p2.nome);

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double media = (precoFinal1 + precoFinal2) /2;

        System.out.printf("Valor médio  do carrinho deu: R$%.2f",media);
    }
}
