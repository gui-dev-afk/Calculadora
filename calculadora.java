import java.util.Scanner;

public class calculadora
{
    public static void main(String[] args)
    {
        Scanner resp = new Scanner(System.in);

        int num1, num2, result;
        float num3;
        char operacao, an; //usu de usuario

        do {

            System.out.print("Digite um numero: ");
            num1 = resp.nextInt();

            System.out.print("Digite OUTRO numero: ");
            num2 = resp.nextInt();

            do {
                System.out.print("Qual Operacao voce deseja? (+) (-) (x) (/): ");
                operacao = resp.next().charAt(0);

                if (operacao != '+' && operacao != '-' && operacao != 'x' && operacao != '/')
                    System.out.println("DIGITE UMA DAS OPCOES!!!");

            } while (operacao != '+' && operacao != '-' && operacao != 'x' && operacao != 'X' && operacao != '/');


            if (operacao == '+') {

                result = num1 + num2;
                System.out.print("A resposta é " + result);

            }
            else if (operacao == '-')
            {

                result = num1 - num2;
                System.out.print("A resposta é " + result);

            }
            else if (operacao == 'x' || operacao == 'X')
            {

                result = num1 * num2;
                System.out.print("A resposta é " + result);

            }
            else
            {
                if(num2 == 0)
                {
                    System.out.println("Não é possivel dividir por 0");
                }
                else
                {
                    num3 = (float) num1 / num2;
                    System.out.print("A resposta é " + num3);
                }
            }

            System.out.println();

            do
            {
                System.out.println("Deseja faz outra operação? (S/N)");
                an = resp.next().charAt(0);

            }while(an != 'N' && an != 'n' && an != 's' && an != 'S');

        }while(an == 's' || an == 'S');

    }
} 