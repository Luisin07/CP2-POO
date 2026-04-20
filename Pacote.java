/**
 * Representa um pacote a ser entregue.
 */
public class Pacote {

    private String codigo;
    private double pesoKg;
    private String status;

    /**
     * @param codigo  Código identificador do pacote
     * @param pesoKg  Peso do pacote em kg
     * @param status  Status inicial (ex: "Pendente")
     */
    public Pacote(String codigo, double pesoKg, String status) {
        this.codigo = codigo;
        this.pesoKg = pesoKg;
        this.status = status;
    }

    public String getCodigo() { return codigo; }
    public double getPesoKg() { return pesoKg; }
    public String getStatus() { return status; }

    /**
     * Atualiza o status do pacote.
     * @param novoStatus Novo status (ex: "Em trânsito", "Entregue")
     */
    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }
}