// SISTEMA DE VEÍCULOS - 4 pilares da POO em Java
// Uma locadora de veículos precisa calcular o valor da díaria
// de diferente tipos de veículos (Carro e Moto)
// Cada tipo tem seu próprio cálculo


// PILAR 1 - ABSTRAÇÃO
// MODELAR APENAS O IMPORTANTE: marca, modelo, ano, placa, preço base.
// MÉTODO calcularDiaria()
// abstrato pois cada veículo terá sua prípria díaria (calculo)

public abstract class Veiculo {

    // Atributos protegidos -> Encapsulamentos
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private double precoBase;

    public Veiculo(String marca, String modelo, int ano, String placa, double precoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.precoBase = precoBase;
    }

    /// método abstrato - CADA SUBTIPO DEFINE O CALCULO
    public abstract double calcularDiaria();

    // PILAR 2 - ENCAPSULAMENTO
    // MODIFICADORES VIA GETTERS E SETTERS
    // O SETTER DE PRECOBASE TEM VALIDAÇÃO: NÃO ACEITA VALORES NEGATIVOS

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        if(precoBase < 0) {
            System.out.println("Erro: preço não pode ser negativo.");
            return;
        }

        this.precoBase = precoBase;
    }

    public String exibirDados() {
        return marca + " " + modelo + " (" + ano + ")" + " " + placa + " " + "R$" + precoBase;
    }



}

// PILAR 3 - HERANÇA
// Carro e Moto herdam tudo de Veículo, mas cada um adiciona
// seus próprios atributos e implementa calcularDiaria() do seu jeito.

// CARRO -> quantidadePortas (atributo)
// método calculaDiaria -> se quantidadePortas >= 4 então acrécimo de 20%


