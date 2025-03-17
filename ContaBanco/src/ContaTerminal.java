import java.util.Scanner;
        // 1 - conhecer e importar a clase Scaner
        // 2 - Exibir as mensagens para o nosso usuario
        // 3 - obter pela classe scaner os valores digitados no terminal
        // 4 - exibir a mensagem final
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.next(); // Usa next() para capturar texto

        scanner.nextLine();

        System.out.println("Por favor, digite o Nome do Cliente:");
        String nomeCliente = scanner.nextLine(); // Usa nextLine() para capturar texto completo

        System.out.println("Por favor, digite o Saldo:");
        double saldo = scanner.nextDouble();
       
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + numero +
                " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
