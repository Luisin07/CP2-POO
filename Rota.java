/**
 * Representa uma rota de entrega, associando um pacote a um veículo.
 */
public class Rota {

    private Pacote pacote;
    private Veiculo veiculo; // aceita Caminhao, Moto, ou qualquer futuro veículo

    /**
     * @param pacote  Pacote a ser entregue
     * @param veiculo Veículo responsável pela entrega
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    /**
     * Inicia a entrega, exibindo informações da rota.
     */
    public void iniciarEntrega() {
        System.out.println("Entregando pacote [" + pacote.getCodigo() +
                "] no veículo [" + veiculo.getPlaca() + "]");
        pacote.atualizarStatus("Em trânsito");
    }
}