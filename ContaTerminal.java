import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String agencia, nomeCliente;
        int numeroConta;
        double saldo;

        System.out.print("Por favor digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.print("Por favor digite o número da sua agencia: ");
        agencia = sc.nextLine();

        System.out.print("Por favor digite o número da sua conta: ");
        numeroConta = sc.nextInt();

        System.out.print("Por favor digite o valor que deseja inserir: ");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                    nomeCliente, agencia, numeroConta, saldo);
    }
}
