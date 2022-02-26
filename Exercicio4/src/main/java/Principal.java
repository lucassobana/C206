import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean b = false;

        while (b == false)
        {
            int x = sc.nextInt();
            if (x != 2002)
            {
                System.out.println("Senha Invalida");
            }
            else
            {
                System.out.println("Acesso permitido");
                b = true;
            }
        }


        sc.close();

    }


}
