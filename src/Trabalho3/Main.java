package Trabalho3;

public class Main {
    public static void main(String[] args) {

        // criando clientes
        Cliente cliente1 = new Cliente("Phelipe", "123563567464", 20);
        Cliente cliente2 = new Cliente("Pitter", "344554345643", 19);
        Cliente cliente3 = new Cliente("Andraze", "234567543564", 57);
        // criando pedidos
        Pedido pedido1 = new Pedido("1", cliente1);
        Pedido pedido2 = new Pedido("2", cliente2);
        Pedido pedido3 = new Pedido("3", cliente3);

        // criando pedido
        ItemPedido item1 = new ItemPedido("Fogão", 2000.0, 1);
        ItemPedido item2 = new ItemPedido("Espelho", 100.0, 2);
        ItemPedido item3 = new ItemPedido("Geladeira", 4000.0, 1);
        ItemPedido item4 = new ItemPedido("Espelho", 100.0, 1);

        // adicionar itens aos pedidos
        //p1
        pedido1.adicionarItem(item1);
        pedido1.adicionarItem(item2);
        //p2
        pedido2.adicionarItem(item3);
        //p3
        pedido3.adicionarItem(item4);

        // fechar pedidos
        pedido1.fecharPedido();
        System.out.println();

        pedido2.fecharPedido();
        System.out.println();

        pedido3.fecharPedido();
    }
}