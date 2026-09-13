package composicao;

public class Main {
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Toyota", "Corolla", 4);
        System.out.println(meuCarro.descrever());
 
        Moto minhaMoto = new Moto("Honda", "CBR 600RR", 600);
        System.out.println(minhaMoto.descrever());
 
        Descritor[] veiculos = new Descritor[2];
        veiculos[0] = new Carro("Volkswagen", "Golf", 2);
        veiculos[1] = new Moto("Yamaha", "MT-07", 700);
 
        System.out.println("\n ---------- Polimorfismo com composição + interface ----------");
        for (Descritor v : veiculos) {
            System.out.println(v.descrever());
        }
    }
}