public class Funcionario {

    String nome,cpf;
    double salario;



    void tirarFerias(String mes){
        System.out.println(nome + "vai tirar ferias em " + mes);
    }

    double calculaSalarioAnual(){
        return salario * 12;
    }


}
