import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main (String [] args) {

        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Digite sua Agência");
        String Agencia = scanner.next();

        System.out.println("Digite sua conta");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ",conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
