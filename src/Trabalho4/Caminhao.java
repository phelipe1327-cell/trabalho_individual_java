package Trabalho4;

public final class Caminhao extends Veiculo{

    //criando atributos
    private final Double capacidadeCargaToneladas;

    //CONSTRUTOR
    public Caminhao(String placa, String marca, Double valorLocacaoDiaria, Integer anoFabricacao, Double precoFipe, Double capacidadeCargaToneladas){
        super(placa,marca,valorLocacaoDiaria,anoFabricacao,precoFipe);
        //LANÇAR ERRO THROW
        if (capacidadeCargaToneladas <= 0) {throw new IllegalArgumentException("A capacidade de carga deve ser maior que zero.");}

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;
    }
    //GET
    public Double getCapacidadeCarga() {return capacidadeCargaToneladas;}

    //METODOS

    @Override
    public Double alugarVeiculo(Double pesoCarga, Integer dias) {
        if (pesoCarga < 0) {
            throw new IllegalArgumentException("O peso da carga não pode ser negativo.");
        }
        if (dias <= 0) {
            throw new IllegalArgumentException("A quantidade de dias deve ser maior que zero.");
        }
        double total = getValorLocacaoDiaria() * dias;

        if (pesoCarga > capacidadeCargaToneladas) {
            total = total + (total * 0.10);
        }
            return total;
    }

    @Override
    public Double calcularIpva(){
        int anoAtual = 2026;
        int idadeVeiculo = anoAtual - getAnoFabricacao();

        if (idadeVeiculo > 20) {
            return 0.0;
        }
        return getPrecoFipe() * 0.015;
    }
}

