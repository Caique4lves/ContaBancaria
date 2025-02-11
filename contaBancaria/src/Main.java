import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dadosCliente = "Dados do cliente:";

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Tipo de conta:");
        String tipoConta = scanner.nextLine();

        double saldoInicial = 1000;

        int opcao = 0;

        System.out.println("***************************");
        System.out.println("\n" + dadosCliente);
        System.out.println("\nNome:                 " + nome);
        System.out.println("Tipo de conta:        " + tipoConta);
        System.out.println("Saldo inicial:     R$ " + saldoInicial);
        System.out.println("\n***************************");

        String operacoes = """
                \nOperações
                
                1 - Consultar dados
                2 - Sacar valor
                3 - Transferir valor
                4 - Finalizar
                """;
        Scanner leitura = new Scanner(System.in);

        System.out.println(operacoes);

        while (opcao != 4) {
            int consultarDados = 1;
            String banco = "Itaú";
            String planoConta = "Personnalité";
            int anoConta = 2025;

            int receberValor = 2;

            int transferirValor = 3;

            int sair = 4;

            if (scanner.nextInt() == 1) {
                System.out.println("Banco: " + banco);
                System.out.println("Ano: " + anoConta);
                System.out.println("Plano: " + planoConta);
                break;
            }

            if (scanner.nextInt() == 2) {
                System.out.println("Digite o valor que deseja sacar (Limite de R$ 500): ");
                double valorSaque = scanner.nextDouble();
                if (valorSaque <= 500) {
                    System.out.println("\nTransferência recebida no valor de: R$ " + valorSaque);
                    saldoInicial += valorSaque;
                    System.out.println("\nVocê agora possui na conta corrente o valor total de: R$ " + saldoInicial);
                }else{
                    System.out.println("O seu limite para saque é de R$ 500");
                }
                break;
            }

            if (scanner.nextInt() == 3) {
                System.out.println("Digite o valor que deseja transferir (Saldo atual: R$ 1000): ");
                double valorEnvio = scanner.nextDouble();
                if (valorEnvio >= 1000) {
                    System.out.println("Você não possui a quantia necessária para realizar a transferência.");
                } else {
                    saldoInicial -= valorEnvio;
                    System.out.println("\nTransferência enviada no valor de: R$ " + valorEnvio);
                    System.out.println("\nVocê agora possui na conta corrente o valor total de: R$ " + saldoInicial);
                }
                break;
            }
            if (scanner.nextInt() == 4) {
                System.out.println("Operação finalizada.");
                opcao = leitura.nextInt();
                break;
            }

        }
    }
}















