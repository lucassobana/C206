public class Motor {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.cor = "vermelho";
        carro.marca = "Bmw";
        carro.modelo = "320i";
        carro.velocidadeMax = 200.00;
        carro.velocidadeAtual = 120.00;

        carro.ligar();

        carro.acelerar();

        System.out.println(carro.toString());


    }

}
