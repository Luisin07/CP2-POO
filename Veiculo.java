/**
 * Classe abstrata que representa um veículo de entrega.
 */
public abstract class Veiculo {

    private String placa;
    private double capacidadeKg;

    /**
     * @param placa        Placa do veículo (ex: ABC1234)
     * @param capacidadeKg Capacidade máxima em kg (deve ser positiva)
     */
    public Veiculo(String placa, double capacidadeKg) {
        if (capacidadeKg <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva.");
        }
        this.placa = placa;
        this.capacidadeKg = capacidadeKg;
    }

    public String getPlaca() { return placa; }
    public double getCapacidadeKg() { return capacidadeKg; }
}