package trabalho2;

import java.util.Scanner;

public class trabalho2_individual{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ponto = "***************";
        Integer acao;

        ContaBancaria conta1 = new ContaBancaria("12345", "Phelipe");
        System.out.println(ponto);
        System.out.println("CAIXA ELETRÔNICO");
        System.out.println(ponto);

        do {
            System.out.println("1-Ver Saldo");
            System.out.println("2-Depositar");
            System.out.println("3-Sacar");
            System.out.println("0-Sair");
            System.out.println("Escolha uma opção:");
            acao = scanner.nextInt();

            switch (acao) {
                case 1:
                    conta1.mostrarSaldo();
                    break;
                case 2:
                    System.out.println("Quanto você deseja depositar?");
                    double deposito = scanner.nextDouble();
                    conta1.depositar(deposito);
                    break;
                case 3:
                    System.out.println("*O valor máximo por saque é de R$ 1.000,00, por questões de segurança*");
                    System.out.println("Quanto você deseja sacar?");
                    double saque = scanner.nextDouble();
                    conta1.sacar(saque);
                    break;
                case 0:
                    break;
            }
        } while (acao != 0);
    }
}