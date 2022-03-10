import com.sun.jdi.connect.Connector;

public class Carro {

    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;

    void ligar(){
        System.out.println("O carro esta ligado");

    }
    void acelerar(){
        System.out.println("O carro esta acelerando " + velocidadeAtual + "km/h e sua velocidade maxima eh " + velocidadeMax + " km/h");

    }
    public String toString(){
        return "cor: " + this.cor + " \nmodelo: " + this.modelo +" \nmarca: " + this.marca;
    }

}
