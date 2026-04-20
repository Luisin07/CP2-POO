/**
 * Veículo de pequeno porte, com ou sem baú.
 */
public class Moto extends Veiculo {

    private boolean possuiBau;

    /**
     * @param placa        Placa da moto
     * @param capacidadeKg Capacidade em kg
     * @param possuiBau    Indica se a moto possui baú
     */
    public Moto(String placa, double capacidadeKg, boolean possuiBau) {
        super(placa, capacidadeKg);
        this.possuiBau = possuiBau;
    }

    public boolean isPossuiBau() { return possuiBau; }
}