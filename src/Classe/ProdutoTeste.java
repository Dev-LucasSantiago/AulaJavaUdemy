package Classe;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook",4500);

        var p2 = new Produto("Caneta Preta",12.50);

        System.out.println(p1.nome+" - "+p1.precoComDesconto());
        System.out.println(p2.nome+" - "+p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double media = (precoFinal1 + precoFinal2) /2;

        System.out.printf("Valor médio  do carrinho deu: R$%.2f\nCom deconto de %.2f",media,Produto.desconto);
    }
}
