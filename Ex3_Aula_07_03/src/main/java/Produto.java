public class Produto {

    String nome;
    String descricao;
    String fabricante;
    double preco;

    void mostraInfo(){
        System.out.println("Nome: " + nome + "\nDescricao: " + descricao + "\nFabricante: " + fabricante);
        System.out.println("Preco: " + preco);
    }

}
