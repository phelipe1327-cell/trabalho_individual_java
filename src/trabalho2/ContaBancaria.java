package trabalho2;

public class ContaBancaria {

    String numero;
    String titular;
    Double saldo;
    Integer limiteSaque;

    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
        limiteSaque = 3;
        saldo = 50.00;
    }

    public void depositar(Double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido\n");
        } else {
            saldo += valor;
            System.out.println("DEPÓSITO EFETUADO!");
            System.out.println("Saldo atual: R$ " + saldo + "\n");
        }
    }
    public void sacar(Double valor){
        if (limiteSaque <= 0) {
                System.out.println("AÇÃO BLOQUEADA (Limite de saques diários atingido!)\n");
        } else if (valor > saldo) {
                System.out.println("Saldo insuficiente\n");
        } else if (valor <= 0) {
                System.out.println("Valor inválido\n");
        }
        else if(valor > 1000){
            System.out.println("Saque não autorizado (Limite de saque R$1000,00)");
        }
        else {
                limiteSaque--;
                saldo -= valor;
                System.out.println("SAQUE EFETUADO!");
                System.out.println("Saldo atual: R$ " + saldo);
                System.out.println("Saques restantes: " + limiteSaque + "\n");
        }
    }
    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo + "\n");
    }
}