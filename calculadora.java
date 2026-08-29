import java.util.Scanner;

public class calculadora
{
    public static void main(String[] args)
    {
        Scanner resp = new Scanner(System.in);

        int num1, num2, result; 
        char operacao, usu; //usu de usuario

        System.out.print("Digite um numero: ");
        num1 = resp.nextInt();

        System.out.print("Digite OUTRO numero: ");
        num2 = resp.nextInt();

        do
        {
           System.out.print("Qual Operacao voce deseja? (+) (-) (x) (/): ");
           operacao = resp.next().charAt(0);

           if(operacao != '+' && operacao != '-' && operacao != 'x' && operacao != '/')
           System.out.println("DIGITE UMA DAS OPCOES!!!");

        } while (operacao != '+' && operacao != '-' && operacao != 'x' && operacao != '/');

        if(operacao == '+')
        {
            result = num1 + num2;
            System.out.print("A resposta é " + result);
        }
        else if(operacao == '-')
        {
            result = num1 - num2;
            System.out.print("A resposta é " + result);
        }
        else if(operacao == 'x')
        {
            result = num1 * num2;
            System.out.print("A resposta é " + result);
        }
        else if(operacao == '/')
        {
            result = num1 / num2;
            System.out.print("A resposta é " + result);
        }


    }
} 