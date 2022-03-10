public class Produto {

    int codigoSerie;
    String codigoProduto;
    String nome;
    String categoria;
    int quantidade;


    void mostraInfo(){
        System.out.println("Codigo da serie eh " + codigoSerie);
        System.out.println("Codigo do produto eh " + codigoProduto);
        System.out.println("Nome do produto eh " + nome);
        System.out.println("Categoria " + categoria);
        System.out.println("Quantidade " + quantidade);

    }


}
