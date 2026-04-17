package Trabalho4;

public final class carroPasseio extends Veiculo {

    //criando atributos
    private final Integer quantidadePortas;

    //CONSTRUTOR COM A CLASSE
    public carroPasseio(String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao, Double precoFipe,Integer quantidadePortas){
        super(placa,marca,valorLocacaoDiaria,anoFabricacao,precoFipe);
        //LANÇAR ERRO THROW
        if (quantidadePortas <= 0) {throw new IllegalArgumentException("A quantidade de portas deve ser maior que zero.");}

        this.quantidadePortas = quantidadePortas;
    }
    //GET
    public Integer getQuantidadePortas() {return quantidadePortas;}

    //METODOS
    @Override
    public Double alugarVeiculo(Double pesoCarga, Integer dias) {
        if (pesoCarga < 0) {
            throw new IllegalArgumentException("O peso da carga não pode ser negativo.");
        }

        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }

        return getValorLocacaoDiaria() * dias;
    }
    @Override
    public Double calcularIpva() {
        int anoAtual = 2026;
        int idadeVeiculo = anoAtual - getAnoFabricacao();

        if (idadeVeiculo > 20) {
            return 0.0;
        }
        return getPrecoFipe() * 0.04;
    }
}
