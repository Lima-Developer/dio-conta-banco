import java.util.Scanner;

public class ContaTerminal {
        /*TODO: Conhecer e importar a classe Scanner
                Exibir as mensagens para o nosso usuário
                Obter pelo scanner os valores digitados no terminal
                Exibir a mensagem conta criada
        * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCliente, agencia;
        double saldo;
        int numero;

        System.out.print("Por favor, digite o número da Conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Por favor, digite a Agência: ");
        agencia = scanner.nextLine();

        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o seu saldo inicial: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " ja está disponível para saque.");

    }
}
