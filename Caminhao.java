/**
 * Veículo de grande porte com múltiplos eixos.
 */
public class Caminhao extends Veiculo {

    private int numeroDeEixos;

    /**
     * @param placa          Placa do caminhão
     * @param capacidadeKg   Capacidade em kg
     * @param numeroDeEixos  Número de eixos do caminhão
     */
    public Caminhao(String placa, double capacidadeKg, int numeroDeEixos) {
        super(placa, capacidadeKg);
        this.numeroDeEixos = numeroDeEixos;
    }

    public int getNumeroDeEixos() { return numeroDeEixos; }
}