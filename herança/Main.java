public class Main {
    public static void main(String[] args){

        Veiculo veiculoGenerico = new Veiculo("Ford", "Genérico");
        System.out.println(veiculoGenerico.descrever());

        Carro meuCarro = new Carro("Toyota", "Corolla", 4);
        System.out.println(meuCarro.descrever());

        Moto minhaMoto = new Moto("Honda", "CBR 600RR", 600);
        System.out.println(minhaMoto.descrever());
        
        Veiculo[] veiculos=new Veiculo[2];
        veiculos[0] = new Carro("Volkswagen", "Golf", 2);
        veiculos[1] = new Moto("Yamaha", "MT-07", 700);
        
        System.out.println("\n ---------- Polimorfismo com herança ----------");
        for (Veiculo i: veiculos){
            System.out.println(i.descrever());
        }
    }
}