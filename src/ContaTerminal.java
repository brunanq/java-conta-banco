import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Insira seu nome: ");
        String nome_cliente = scanner.nextLine();

        System.out.println("Insira o número da conta [0000]: ");
        int numero_conta = scanner.nextInt();

        scanner.nextLine(); // \n desprezado

        System.out.println("Insira a agência [000-0]: ");
        String agencia = scanner.nextLine();

        System.out.println("Informe o saldo: ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá, "+ nome_cliente +"! Obrigado por criar uma conta em nosso banco. Sua agência é " +agencia +", sua conta é "+numero_conta+" e seu saldo de R$"+ saldo+ " já está disponível para saque.");

    }
}
