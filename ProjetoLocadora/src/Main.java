import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Carro carro1 = new Carro("Porsche", "Cayanne", 2025, "ppp-8888",
                2350, 2);
        Carro carro2 = new Carro("Fiat", "Uno", 2005, "ggg-0000",
                150, 4);
        Carro carro3 = new Carro("Fiat", "Uno", 2005, "kkk-0000",
                100, 2);
        Carro carro4 = new Carro("Fiat", "Toro", 2025, "ttt-5555",
                450, 4);
        Carro carro5 = new Carro("Chevrolet", "Corsa", 1998, "ccc-9999",
                120, 4);
        Moto moto1 = new Moto("Suzuki", "Hayabusa", 2005, "mmm-1111",
                190, 1000);
        Moto moto2 = new Moto("Honda", "Elite", 2024, "eee-4444",
                75, 120);

//        carro1.setAno(2027);

//        System.out.println(carro1.exibirDados());
//        System.out.println(moto1.exibirDados());

        Locadora locadora = new Locadora();

//        locadora.adicionarVeiculo(new Carro ("Porsche", "Cayanne", 202,
//                "ppp-8888", 2350, 2));
//        locadora.adicionarVeiculo(new Moto ("Suzuki", "Hayabusa", 2005, "mmm-1111",
//                190, 1000));

        locadora.adicionarVeiculo(carro1);
        locadora.adicionarVeiculo(carro2);
        locadora.adicionarVeiculo(carro3);
        locadora.adicionarVeiculo(carro4);
        locadora.adicionarVeiculo(carro5);
        locadora.adicionarVeiculo(moto1);
        locadora.adicionarVeiculo(moto2);

        locadora.listarVeiculo();

        int tamanho = locadora.getFrota().size();

        System.out.printf("Escolha o veículo (1 a " + tamanho + "): ");
        int veiculoSelecionado = sc.nextInt();

        System.out.println("Quantos dias você deseja ficar com o veículo:");
        int dias = sc.nextInt();

        locadora.aluguelVeiculos(dias,veiculoSelecionado);



    }
}
