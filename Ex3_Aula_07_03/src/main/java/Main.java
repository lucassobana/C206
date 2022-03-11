public class Main {

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "presunto";
        p1.descricao = "frios";
        p1.fabricante = "seara";
        p1.preco = 2.5;

        p2.nome = "queijo";
        p2.descricao = "frios";
        p2.fabricante = "sadia";
        p2.preco = 3.5;


        carrinho.total = p1.preco + p2.preco;

        carrinho.adicionarProduto(p1);
        carrinho.adicionarProduto(p2);

        carrinho.mostraInfo();

        System.out.println("Valor total da compra: " + carrinho.calculaTotal());





    }
}
