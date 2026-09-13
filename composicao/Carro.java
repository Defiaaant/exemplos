package composicao;

public class Carro implements Descritor {
    private Veiculo informacao;
    int qtdPortas;

     public Carro(String marca, String modelo, int qtdPortas){
        this.informacao = new Veiculo(marca, modelo);
        this.qtdPortas=qtdPortas;
    }

    @Override
    public String descrever(){
        return "Carro - "+informacao.descrever()+", Portas: "+ qtdPortas;
    }
    
}
