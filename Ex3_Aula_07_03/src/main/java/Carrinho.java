public class Carrinho {

    double total;
    double valor = 0;
    Produto[] produtos;

    public Carrinho() {
        produtos = new Produto[5];
    }


    void adicionarProduto(Produto produto){
        boolean flag = true;
        for (int i = 0;i< produtos.length;i++){
            if(produtos[i] == null && flag == true) {
                produtos[i] = produto;
                flag = false;
            }
        }
        if(flag == true)
            System.out.println("Sem espaço no carrinho");
    }


    void mostraInfo(){
        for (Produto produto : produtos)
        {
            if (produto != null)
            {
                produto.mostraInfo();
            }
        }
    }


    double calculaTotal(){
        valor += total;
        return valor;
    }



}
