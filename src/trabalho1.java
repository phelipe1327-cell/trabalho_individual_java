import java.util.Scanner;

public class trabalho1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ponto = "***************";
        Double saldo = 2000.00;
        Integer acao;
        Integer limiteSaque = 3;

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
                    System.out.println("Saldo atual: R$" + saldo+"\n");
                    break;
                case 2:
                    System.out.println("Quanto você deseja depositar?");
                    Double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("DEPÓSITO EFETUADO!\nSaldo atual: R$" + saldo+"\n");
                    break;
                case 3:
                    if (limiteSaque<=0) {
                        System.out.println("AÇÃO BLOQUEADA(Limites de saques diários atingido!)\n");
                    }
                    else {
                        System.out.println("*O valor máximo por saque é de R$ 1.000,00, por questões de segurança*");
                        System.out.println("Quanto você deseja sacar? (saques disponíveis:" + limiteSaque + ")");
                        Double saque = scanner.nextDouble();
                        if (saque > saldo || saque > 1000) {
                            System.out.println("Saque inválido\n");
                            break;
                        } else if (saque < 0) {
                            System.out.println("Saque inválido\n");
                            break;
                        } else {
                            limiteSaque--;
                            saldo -= saque;
                            System.out.println("SAQUE EFETUADO!\nSaldo atual: R$" + saldo+"\n");
                            break;
                        }
                    }
                case 0:
                    break;
            }
        }while(acao!=0);
    }
}

