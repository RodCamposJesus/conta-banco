import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importa a classe Scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela classe Scanner os valores digitados no terminal
        //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double saldo = 237.48;
        String nomeCliente = "Mario Andrade";

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.\n" +
                   "Sua agência é " + agencia + " e o número da conta é " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque.");


    }
}
