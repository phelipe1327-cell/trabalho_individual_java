package Trabalho4;

public abstract sealed class Veiculo implements Fretavel, Tributavel permits Caminhao, carroPasseio{

    //criando atributos
    private final String placa;
    private final String marca;
    private Double valorLocacaoDiaria;
    private final Integer anoFabricacao;
    private Double precoFipe;

    //CONSTRUTOR
    public Veiculo(String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao, Double precoFipe) {

        //LANÇAR ERRO THROW
        if (placa == null) {throw new IllegalArgumentException("A placa não pode estar vazia.");}
        if (marca == null) {throw new IllegalArgumentException("A marca não pode estar vazia.");}
        if (valorLocacaoDiaria <= 0) {throw new IllegalArgumentException("O valor da locação diária deve ser maior que zero.");}
        if (anoFabricacao <= 0) {throw new IllegalArgumentException("O ano de fabricação é inválido.");}
        if (precoFipe <= 0) {throw new IllegalArgumentException("O preço FIPE deve ser maior que zero.");}

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
    }
    //GET
    public String getPlaca() {return placa;}
    public String getMarca() {return marca;}
    public Double getValorLocacaoDiaria() {return valorLocacaoDiaria;}
    public Integer getAnoFabricacao() {return anoFabricacao;}
    public Double getPrecoFipe() {return precoFipe;}


}
