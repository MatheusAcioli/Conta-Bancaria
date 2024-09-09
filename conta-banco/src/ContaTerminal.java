import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o Nome Completo:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoConta
                + " já está disponível para saque.");
    }
}
