public class Carro extends Veiculo {
    private int quantidadePortas;

    public Carro (String marca, String modelo, int ano, String placa, double precoBase, int quantidadePortas) {
        super (marca, modelo, ano, placa, precoBase);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public double calcularDiaria() {
        // carro com 4 portas terá acrescimo de 20%
        if (quantidadePortas >= 4) {
            return getPrecoBase() * 1.2;
        }

        return getPrecoBase();
    }

    @Override
    public String exibirDados() {
        return  super.exibirDados() + " " + quantidadePortas;
    }
}