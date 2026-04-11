public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Porsche", "Cayanne", 2025, "ppp-8888",
                2350, 2);
        Moto moto1 = new Moto("Suzuki", "Hayabusa", 2005, "mmm-1111",
                190, 1000);

//        carro1.setAno(2027);

        System.out.println(carro1.exibirDados());
        System.out.println(moto1.exibirDados());

        Locadora locadora = new Locadora();

        locadora.adicionarVeiculo(new Carro ("Porsche", "Cayanne", 202,
                "ppp-8888", 2350, 2));
        locadora.adicionarVeiculo(new Moto ("Suzuki", "Hayabusa", 2005, "mmm-1111",
                190, 1000));

        locadora.adicionarVeiculo(carro1);
        locadora.adicionarVeiculo(moto1);

        locadora.listarVeiculo();



    }
}
