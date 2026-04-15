package Trabalho3;

public class ItemPedido {
    private String nomeProduto;
    private Double precoProduto;
    private Integer qntProduto;

    public ItemPedido(String nomeProduto, Double precoProduto, Integer qntProduto){
        if(precoProduto == null){
            System.out.println("Produto Inválido");
        }
        if(nomeProduto == null || nomeProduto.isEmpty()){
            System.out.println("Nome Inválido");
        }
        if(qntProduto == null || qntProduto <= 0){
            System.out.println("Quantidade inválidade");
        }
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.qntProduto = qntProduto;
    }
//Nome
    public String getNomeProduto() {
        return nomeProduto;
    }

//Preco
    public Double getPrecoProduto() {
        return precoProduto;
    }
//Quantidade
    public Integer getQntProduto() {
        return qntProduto;
    }
//SUBTOTAL
    public Double getSubtotal() {
        return precoProduto*qntProduto;
    }
}