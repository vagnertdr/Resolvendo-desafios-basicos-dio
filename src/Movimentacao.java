import java.util.Scanner;

public class Movimentacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saldo Total: ");
        int saldoTotal = scanner.nextInt();

        System.out.println("Valor do Saque: ");
        int valorSaque = scanner.nextInt();

        // Criar as condiçoes necessarias para impressao da saída, vida tabela de exemplos
        if (saldoTotal >= valorSaque){
            int saldoDisponivel = saldoTotal - valorSaque;
            System.out.printf("Saque realizado com sucesso. Novo saldo: %d",saldoDisponivel);
        }else if (saldoTotal < valorSaque)
            System.out.println("Saldo Insuficiente. Saque nao realizado!");
    }
}
