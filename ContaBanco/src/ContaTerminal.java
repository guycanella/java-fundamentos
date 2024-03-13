import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\n");

        System.out.println("Por favor, digite o número da agência:");
        String agencia = sc.next();

        System.out.println("Por favor, digite o número da conta:");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = sc.nextDouble();

        String message = "Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(message);
    }
}
