package Trabalho3;

import java.util.ArrayList;

public class Pedido {
    private String numeroPedido;
    private Cliente cliente;
    private ArrayList<ItemPedido> itens;

    public Pedido(String numeroPedido, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }
    // GETTERS
    public String getNumeroPedido() {return numeroPedido;}
    public Cliente getCliente() {return cliente;}
    public ArrayList<ItemPedido> getItens() {return itens;}

    // adicionar item no pedido
    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    // calcular total dos itens
    public Double getTotal() {
        Double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }
    // fechar pedido
    public Double fecharPedido() {
        Double total = getTotal();
        Double frete;
        Double totalFinal;

        System.out.println("========== RECIBO DO PEDIDO ==========");
        System.out.println("Número do pedido: " + numeroPedido);
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("--------------------------------------");

        for (ItemPedido item : itens) {
            System.out.println("Produto: " + item.getNomeProduto());
            System.out.println("Preço: R$" + item.getPrecoProduto());
            System.out.println("Quantidade: " + item.getQntProduto());
            System.out.println("Subtotal do item: R$" + item.getSubtotal());
            System.out.println("--------------------------------------");
        }
        if (total > 250.0) {
            frete = 0.0;
            System.out.println("Sua compra foi acima de R$250,00. Você ganhou FRETE GRÁTIS!");
        }
        else {
            frete = 25.0;
            System.out.println("Frete: R$25,00");
        }
        totalFinal = total + frete;
        System.out.println("Total dos itens: R$" + total);
        System.out.println("Frete: R$" + frete);
        System.out.println("Total final: R$" + totalFinal);
        System.out.println("======================================");
        return totalFinal;
    }
}