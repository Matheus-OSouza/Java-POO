import java.util.ArrayList;
import java.util.List;

public class Locadora {
    private List<Veiculo> frota;

    public Locadora() {
        this.frota = new ArrayList<>();
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        frota.add(veiculo);
    }

    public void listarVeiculo() {
        for (int i = 0; i < frota.size(); i++) {
            Veiculo v = frota.get(i);

            System.out.printf("[%d] %s %s| Diária: R$ %.2f\n", (i + 1), v.getMarca(), v.getModelo(), v.calcularDiaria() );
        }
    }

    public List<Veiculo> getFrota() {
        return frota;
    }

    public void aluguelVeiculos(int dias, int idVeiculo) {
        Veiculo v = frota.get(idVeiculo - 1);

        v.getPrecoBase();

        double total = v.calcularDiaria() * dias;

        System.out.println(" ==== Resumo do aluguel veiculo ====");
        System.out.println("Veículo: " + v.exibirDados());
        System.out.println("quantidade de dias: " + dias);
        System.out.printf("Valor diário: %.2f ", v.calcularDiaria());
        System.out.printf("\nTotal do período da regência: %.2f ", total);


    }
}
