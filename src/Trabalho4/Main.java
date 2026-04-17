package Trabalho4;

public class Main {
    public static void main(String[] args) {

        try {
            Caminhao caminhao = new Caminhao("ABC1234", "Volvo", 500.0, 2018, 300000.0, 10.0);
            carroPasseio carro = new carroPasseio("XYZ9876", "Fiat", 150.0, 2020, 50000.0, 4);

            double aluguelCaminhao = caminhao.alugarVeiculo(12.0, 3);
            double aluguelCarro = carro.alugarVeiculo(0.0, 5);

            System.out.println("===== CAMINHÃO =====");
            System.out.println("Placa: " + caminhao.getPlaca());
            System.out.println("Marca: " + caminhao.getMarca());
            System.out.println("Aluguel: R$ " + aluguelCaminhao);
            System.out.println("IPVA: R$ " + caminhao.calcularIpva());

            System.out.println();

            System.out.println("===== CARRO DE PASSEIO =====");
            System.out.println("Placa: " + carro.getPlaca());
            System.out.println("Marca: " + carro.getMarca());
            System.out.println("Quantidade de portas: " + carro.getQuantidadePortas());
            System.out.println("Aluguel: R$ " + aluguelCarro);
            System.out.println("IPVA: R$ " + carro.calcularIpva());

        }
        catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
