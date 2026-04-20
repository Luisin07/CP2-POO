/**
 * Classe principal para demonstração do sistema FiapDelivery.
 */
public class Principal {

    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao("ABC1234", 5000.0, 4);
        Moto moto = new Moto("XYZ9876", 30.0, true);

        Pacote pacote1 = new Pacote("BR999", 10.5, "Pendente");
        Pacote pacote2 = new Pacote("BR000", 2.0, "Pendente");

        Rota rota1 = new Rota(pacote1, caminhao);
        Rota rota2 = new Rota(pacote2, moto);

        rota1.iniciarEntrega();
        rota2.iniciarEntrega();
    }
}